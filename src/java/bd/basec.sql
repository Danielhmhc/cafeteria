create database cafeteria;
#drop database cafeteria;
use cafeteria;
#Tabla usuario
create table usuario(
	#Id del usuario generado por nosotros
    idusuario int primary key auto_increment,
    #Nombre del usuario que se puede poner él mismo pero no se pueden repetir
    nombreusuario nvarchar(20) not null unique,
    #Email del usuario
    email nvarchar(100) not null unique,
    #Contraseña del usuario, sql no acepta ñ
    contra nvarchar(20) not null,
    #Estado o numero que indica que clae de usario es : 0 cliente 1 cocinero 2 administrador
    estado int not null default 0    
);

create table platillo(
    #Id de platillousuario
	idplatillo int primary key auto_increment,
    #Nombre de platillo
    nomplatillo varchar(30) not null unique,
    costo float(4,2) not null,
    #Disponibilidad, 0 no disponible 1 si disponible
    disponible bool not null default 1
);

create table inventario(
	#idinsumo
    idinsumo int primary key auto_increment,
    nominsumo varchar(30) not null unique,
    #Cantidad existencias
    cantexis int not null,
    #Indica si hay o no el insumo, pero no sabemos la cantidad
    existente bool not null default 1    
);

create table orden(
	numorden int primary key auto_increment,
    idusuario int not null,
    fecha date not null,
    metpago varchar(20) not null,
    foreign key (idusuario) references usuario(idusuario)
);

create table pedido(
    numorden int not null,
	numpedido int not null, 
	idplatillo int not null,
    cantidad int not null,
    
    foreign key(idplatillo) references platillo(idplatillo),
    foreign key(numorden) references orden(numorden),
    primary key(numorden,numpedido)
);

delimiter $
#Proedimientos para la apliaion create procedure Login(in email varchar(100), in contra varchar(20)) 
create procedure Login(in email varchar(100), in contra varchar(20)) 
begin 
	declare existe int;
    select count(*) into existe from usuario where usuario.email=email and usuario.contra=contra;
    if existe=1 then
		select idusuario,estado,nombreusuario from usuario where usuario.email=email and usuario.contra=contra;
	else
		select -1 as idusuario;
	end if;
end $ 


#Datos insertados para prueba direccionamiento (usuarios)
insert into usuario values(default,'Daniel','danielhmh@gmail.com','1234',2);
insert into usuario values(default,'Andres','andres@gmail.com','1234',1);
insert into usuario values(default,'Elena','elena@gmail.com','1234',0);

#Datos insertados para prueba de carga de menu (platillos)
insert into platillo values(default,'Chilaquiles', 18.20 , default);
insert into platillo values(default,'Torta Jamon', 15.00 , 0);
insert into platillo values(default,'Torta Milanesa', 20.00 , default);
insert into platillo values(default,'Alambre de res', 40.00 , 0);
insert into platillo values(default,'Ensalada ', 15.10 , default);

insert into platillo values(default,'Tacos Dorados', 22.00 , 0);
insert into platillo values(default,'Rebanada pizza', 16.50 , default);
insert into platillo values(default,'Papas a la francesa', 12 , 0);
insert into platillo values(default,'Fruta picada', 15 , default);
insert into platillo values(default,'aire', 5.1 , 0);

call Login('danielhmh@gmail.com','1234');
call Login()
select * from usuario;
select * from platillo where disponible=1;
