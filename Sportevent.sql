CREATE DATABASE Sportevent;
USE Sportevent;

CREATE TABLE Federation (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    year_of_creation INT NOT NULL,
    president_name VARCHAR(128),
    boardmembers_number INT NOT NULL,
    funding DECIMAL(12,2)
);

CREATE TABLE Club (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    address VARCHAR(128) NOT NULL,
    phonenumber VARCHAR(128),
    manager_name VARCHAR(128),
    federation_id INT,
    FOREIGN KEY (federation_id) REFERENCES Federation(id)
);

CREATE TABLE Contest (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128),
    location VARCHAR(128),
    startingdate DATE,
    entryfee DECIMAL(10,2),
    duration INT,
    club_id INT,
    federation_id INT,
    FOREIGN KEY (federation_id) REFERENCES Federation(id)
);
Create Table Type(
id INT PRIMARY KEY AUTO_INCREMENT,
name varchar(128),
contest_id int,
FOREIGN KEY (contest_id) REFERENCES Contest (id)
);

Create Table Category(
id INT PRIMARY KEY AUTO_INCREMENT,
name varchar(128),
contest_id int,
FOREIGN KEY (contest_id) REFERENCES Contest (id)
);

Create Table Prize(
id INT PRIMARY KEY AUTO_INCREMENT,
place int,
money_prize decimal(10,2),
contest_id int,
FOREIGN KEY (contest_id) REFERENCES Contest (id)
);

CREATE TABLE Player (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    age INT,
    nationality VARCHAR(128),
    win_rate DECIMAL(5,2),
    highest_ranking INT,
    club_id INT,
    FOREIGN KEY (club_id) REFERENCES Club(id)
);

CREATE TABLE Contest_Player (
    player_id INT NOT NULL, 
    contest_id INT NOT NULL, 
    FOREIGN KEY (player_id) REFERENCES Player(id),
    FOREIGN KEY (contest_id) REFERENCES Contest(id),
    PRIMARY KEY (player_id, contest_id)
);

USE Sportevent;


INSERT INTO Federation (name, year_of_creation, president_name, boardmembers_number, funding) VALUES
('Albanian', 1990, 'Arben Domi', 10, 100000.00),
('Bulgarian', 1985, 'Ivan Petrov', 12, 120000.00),
('Serbian', 1975, 'Marko Jovanovic', 15, 150000.00),
('Spanish', 1960, 'Carlos Martinez', 20, 200000.00),
('Italian', 1955, 'Giuseppe Rossi', 18, 180000.00),
('German', 1945, 'Hans Mueller', 22, 220000.00),
('English', 1930, 'John Smith', 25, 250000.00),
('Welsh', 1980, 'Dafydd Evans', 11, 110000.00),
('French', 1920, 'Jean Dupont', 17, 170000.00);

INSERT INTO Club (name, address, phonenumber, manager_name, federation_id) VALUES
('Tirana Club', 'Tirana, Albania', '355-1234567', 'Erion Hoxha', 1),
('Sofia Club', 'Sofia, Bulgaria', '359-9876543', 'Georgi Georgiev', 2),
('Belgrade Club', 'Belgrade, Serbia', '381-1112223', 'Nikola Simic', 3),
('Madrid Club', 'Madrid, Spain', '34-5556667', 'Javier Garcia', 4),
('Rome Club', 'Rome, Italy', '39-4445556', 'Luca Bianchi', 5),
('Berlin Club', 'Berlin, Germany', '49-3332221', 'Anna Schmitt', 6),
('London Club', 'London, UK', '44-7778889', 'David Brown', 7),
('Cardiff Club', 'Cardiff, Wales', '44-6665554', 'Owain Jones', 8),
('Paris Club', 'Paris, France', '33-2223334', 'Pierre Moreau', 9);


INSERT INTO Contest (name, location, startingdate, entryfee, duration, club_id, federation_id) VALUES
('Tirana Open', 'Tirana', '2024-06-01', 50.00, 3, 1, 1),
('Sofia Invitational', 'Sofia', '2024-07-10', 75.00, 2, 2, 2),
('Belgrade Masters', 'Belgrade', '2024-08-15', 100.00, 4, 3, 3),
('Madrid Challenge', 'Madrid', '2024-05-20', 80.00, 5, 4, 4),
('Rome Championship', 'Rome', '2024-09-05', 90.00, 3, 5, 5),
('Berlin Cup', 'Berlin', '2024-10-12', 60.00, 3, 6, 6),
('London Classic', 'London', '2024-06-18', 70.00, 3, 7, 7),
('Cardiff Cup', 'Cardiff', '2024-07-22', 55.00, 2, 8, 8),
('Paris Invitational', 'Paris', '2024-08-30', 85.00, 3, 2, 9);

INSERT INTO Type (name, contest_id) VALUES
('Open-Entry', 2),
('Invitational', 6),
('Top 16', 4),
('Ranking', 1),
('Open-Entry', 3),
('Ranking', 5),
('Top 32', 7),
('Top 4', 9),
('Ranking', 8);


INSERT INTO Category (name, contest_id) VALUES
('Men', 1),
('Women', 2),
('Under 18', 4),
('Seniors', 5),
('Men', 3),
('Women', 6),
('Under 18', 7),
('Men', 9),
('Men', 8);

INSERT INTO Prize (place, money_prize, contest_id) VALUES
(1, 5000.00, 1),
(2, 3000.00, 1),
(3, 1000.00, 1),
(1, 6000.00, 2),
(1, 7000.00, 3),
(2, 4000.00, 3),
(3, 2000.00, 3),
(1, 5500.00, 4),
(1, 4500.00, 5);


INSERT INTO Player (name, age, nationality, win_rate, highest_ranking, club_id) VALUES
('Arjan Kola', 25, 'Albanian', 75.5, 12, 1),
('Ivan Dimitrov', 22, 'Bulgarian', 80.3, 10, 2),
('Nikola Milic', 30, 'Serbian', 68.2, 15, 3),
('Carlos Ruiz', 27, 'Spanish', 85.4, 5, 4),
('Luca Romano', 24, 'Italian', 78.6, 8, 5),
('Hans Becker', 28, 'German', 82.1, 7, 6),
('James Taylor', 23, 'English', 77.0, 9, 7),
('Dafydd Price', 21, 'Welsh', 72.8, 14, 8),
('Pierre Laurent', 26, 'French', 79.5, 11, 9);


INSERT INTO Contest_Player (player_id, contest_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9);
