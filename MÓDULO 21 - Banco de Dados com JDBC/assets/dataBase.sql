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
('Computers'),          -- 1
('Eletronics'),         -- 2
('Fashion'),            -- 3
('Books'),              -- 4
('Sports'),             -- 5
('Books'),              -- 6
('Sports'),             -- 7
('Automative'),         -- 8
('peripherals'),        -- 9
('Othres');             -- 10



INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES
('Malu','Malu@gmail.com', '2019-05-20 19:00:02', 3100, 1),
('Snoopy','Snoopy@gmail.com', '2018-06-17 20:00:03', 2730, 1),
('Nina','Nina@gmail.com', '2009-05-27 21:00:04', 12860, 3),
('Maggie','Maggie@gmail.com', '2017-09-07 22:00:05', 3350, 3),
('Frederico','Fred@gmail.com', '2021-11-11 23:00:06', 2050, 5),
('Athila','Athila@gmail.com', '1992-02-10 17:00:07', 8830, 5),
('Margoth','Margoth@gmail.com', '2016-02-08 16:00:08', 4500, 7),
('Miguel','Miguel@gmail.com', '2015-10-19 15:00:09', 7360, 7),
('Ralfh','ralfh@gmail.com', '2002-08-12 16:00:10', 5260, 9),
('Dick','Dick@gmail.com', '2001-08-18 17:00:11', 6970, 9),
('Lola Kurinma','Lola@gmail.com', '2019-05-20 19:00:12', 3780, 2),
('Maria DatBat','Maria@gmail.com', '2000-06-13 20:00:13', 2930, 2),
('Lando Landin','Lando@gmail.com', '1988-05-27 21:00:14', 11560, 4),
('Margareth Nancin','Margareth@gmail.com', '2019-09-07 22:00:15', 7250, 4),
('Gabriel Venceslau','Gabriel@gmail.com', '2021-11-14 23:00:16', 3450, 6),
('Amaral Amarildo','Amaral@gmail.com', '1992-02-18 17:00:77', 8760, 6),
('Key Andrade','Key@gmail.com', '2016-02-28 16:00:88', 1720, 8),
('Brunno Camilo','Bruno@gmail.com', '2015-10-29 15:00:19', 2360, 8),
('Antenor Cavalcante','Antenor@gmail.com', '2002-08-15 16:00:20', 7830, 10),
('Hugo Moura','HugoNoga@gmail.com', '2001-08-11 17:00:21', 4380, 10);






