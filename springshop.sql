create database springshop;
use homework30;
create table Products(
id int  PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(128),
price double
);
create table Orders(
id int  PRIMARY KEY AUTO_INCREMENT,
product varchar(128),
data datetime,
Product_id int,
FOREIGN KEY (Product_id) REFERENCES Products(id)
);