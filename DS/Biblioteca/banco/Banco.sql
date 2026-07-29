create database IF NOT EXISTS Biblioteca;
use Biblioteca;

# drop database Biblioteca;

CREATE TABLE IF NOT EXISTS Livro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    genero VARCHAR(100) NOT NULL,
    idioma VARCHAR(100) NOT NULL,
    quantidade Int NOT NULL,
    preco DECIMAL(10, 2) NOT NULL
);



