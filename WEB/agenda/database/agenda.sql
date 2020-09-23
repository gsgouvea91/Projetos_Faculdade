CREATE DATABASE
USE agenda;
CREATE TABLE agenda(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome varchar(50) not NULL,
	fone_res varchar(15),
	fone_cel varchar(15) not NULL,
	email VARCHAR(50) NOT NULL,
	dt_nasc DATE,
	endereco varchar(60),
	bairro varchar(40),
	cep varchar(9),
	uf char(2),
	foto varchar(200),
	facebook varchar(200),
	twitter varchar(200),
	instagram varchar(200)
);