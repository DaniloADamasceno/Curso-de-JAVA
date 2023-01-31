--    ---------------------   Criação das Tabelas Department(Departamento) e  Seller(Vendedor)

CREATE TABLE Department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE Seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(100) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (id)
);


--    -------------------   Inserção de Valores nas tabelas criadas 

insert into Department (Name) values 
('Computers'),
('Eletronics'),
('Fashion'),
('Books');


INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES
('Malu','Malu@gmail.com', '2019-05-20 19:00:02', 3100, 1),
('Snoopy','Snoopy@gmail.com', '2018-06-17 20:00:03', 2730, 2),
('Nina','Nina@gmail.com', '2009-05-27 21:00:04', 12860, 1),
('Maggie','Maggie@gmail.com', '2017-09-07 22:00:05', 3350, 4),
('Frederico','Fred@gmail.com', '2021-11-11 23:00:06', 2050, 3),
('Athila','Athila@gmail.com', '1992-02-10 17:00:07', 8830, 2),
('Margoth','Margoth@gmail.com', '2016-02-08 16:00:08', 4500, 1),
('Miguel','Miguel@gmail.com', '2015-10-19 15:00:09', 7360, 3);



