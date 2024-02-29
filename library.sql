create database librarysysytem;
use librarysysytem;
show tables;
drop table  borrowing;
select * from book;
select * from member;
select * from  borrowing;
CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(50) NOT NULL,
    isbn VARCHAR(20) NOT NULL,
    publishedDate DATE,
    availableCopies INT NOT NULL
);

INSERT INTO book (id, title, author, isbn, publishedDate, availableCopies) 
VALUES (1, 'Java basic concept', 'Mahesh', '2313', '2019-05-21', 20);

INSERT INTO book (id, title, author, isbn, publishedDate, availableCopies) 
VALUES (2, 'Python basic concept', 'Rishmma', '0483', '2021-8-04', 10);

CREATE TABLE Member (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone BIGINT NOT NULL,
    registeredDate DATE
);
INSERT INTO Member (id, name, phone, registeredDate)
VALUES (1, 'kumar', 8072032698, '2022-10-30');

INSERT INTO Member (id, name, phone, registeredDate)
VALUES (2, 'Fathima', 7358929091, '2023-07-12');

CREATE TABLE Borrowing (
    id INT PRIMARY KEY AUTO_INCREMENT,
    memberId INT NOT NULL,
    bookId INT NOT NULL,
    borrowedDate DATE NOT NULL,
    dueDate DATE NOT NULL
   
);

INSERT INTO Borrowing (id, memberId, bookId, borrowedDate, dueDate)
VALUES (1, 1, 3234134, '2023-01-01', '2023-01-15');

INSERT INTO Borrowing (id, memberId, bookId, borrowedDate, dueDate)
VALUES (2, 1, 0495632, '2023-01-30', '2023-02-15');