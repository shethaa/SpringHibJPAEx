CREATE DATABASE Prac;

USE Prac;

/*CREATE TABLE Stock (
	Stock_Id INT PRIMARY KEY AUTO_INCREMENT,
	Stock_Code VARCHAR(50) NOT NULL,
	Stock_Name VARCHAR(50) NOT NULL,
	UNIQUE KEY UNI_STOCK_NAME (STOCK_NAME),
	UNIQUE KEY UNI_STOCK_ID (STOCK_CODE) USING BTREE
)ENGINE = INNODB;*/

DROP TABLE IF EXISTS Stock;

CREATE TABLE Stock (
	Stock_Id INT PRIMARY KEY AUTO_INCREMENT,
	Stock_Code VARCHAR(50),
	Stock_Name VARCHAR(50)
)ENGINE = INNODB;

SELECT * FROM Stock;