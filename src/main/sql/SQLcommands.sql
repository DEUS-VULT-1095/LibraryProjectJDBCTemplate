CREATE TABLE Person(
                       person_id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                       full_name VARCHAR(100) NOT NULL UNIQUE,
                       year_of_birth INT CHECK (year_of_birth > 1899)
);

CREATE TABLE Book(
                     book_id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                     person_id INT REFERENCES Person(person_id) ON DELETE SET NULL,
                     title VARCHAR (100) NOT NULL,
                     author VARCHAR (100),
                     year INT
);

DROP TABLE Book;
DROP TABLE Person;

INSERT INTO Person(full_name, year_of_birth) VALUES ('Тимчук Федор Олегович', 2000);
INSERT INTO Person(full_name, year_of_birth) VALUES ('Борисенко Степан Александрович', 1998);
INSERT INTO Person(full_name, year_of_birth) VALUES ('Давыдова Валерия Геннадьевна', 2001);
INSERT INTO Person(full_name, year_of_birth) VALUES ('Сорокина Юлия Борисовна', 2005);
INSERT INTO Person(full_name, year_of_birth) VALUES ('Бересчук Антон Юрьевич', 1995);

INSERT INTO Book(title, author, year) VALUES ('Над пропастью во ржи', 'Джером Сэлинджер', 1951);
INSERT INTO Book(title, author, year) VALUES ('День опричника', 'Владимир Сорокин', 2006);
INSERT INTO Book(title, author, year) VALUES ('Тайные виджы на гору Фудзи', 'Владимир Пелевин', 2018);
INSERT INTO Book(title, author, year) VALUES ('Философия Java', 'Брюс Эккель', 2018);
INSERT INTO Book(title, author, year) VALUES ('Психология обыденной жизним', 'Фрейд Зигмунд', 1904);
INSERT INTO Book(title, author, year) VALUES ('Игра в бисер', 'Герман Гессе', 1943);
INSERT INTO Book(title, author, year) VALUES ('Бытие и время', 'Мартин Хайдеггер', 1927);


