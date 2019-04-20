create database login;

use login;

create table registros(
id int primary key auto_increment,
usuario varchar(20),
contraseña varchar(20),
nivel int
);

insert into registros value(1, 'sergiolona', 'admin', 1);
insert into registros value(2, 'javierlona', 'normal', 2);
insert into registros value(3, 'jesusgonzales', 'invitado',3); 

select * from registros;

 