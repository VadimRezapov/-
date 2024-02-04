/**
7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
**/
SET SQL_SAFE_UPDATES = 0;

drop database if exists HumanFriends;
create database HumanFriends;
use HumanFriends;

drop table if exists Animals;
create table Animals(
	id int auto_increment primary key,
    classAnimal varchar(45) not null);
    
insert into Animals (classAnimal) values
('Pets'),
('PackAnimals');

drop table if exists Pets;
create table Pets(
	id int auto_increment primary key,
    classAnimal varchar(45) not null,
    typeAnimal varchar(45) not null);
    
insert into Pets (classAnimal, typeAnimal) values
('Pets', 'Dog'),
('Pets', 'Cat'),
('Pets', 'Hamster');

drop table if exists PackAnimals;
create table PackAnimals(
	id int auto_increment primary key,
    classAnimal varchar(45) not null,
    typeAnimal varchar(45) not null);
    
insert into PackAnimals (classAnimal, typeAnimal) values
('PackAnimals', 'Horse'),
('PackAnimals', 'Camel'),
('PackAnimals', 'Donkey');

drop table if exists Dog;
create table Dog(
	id int auto_increment primary key,
    typeAnimal varchar(45) not null,
    nameAnimal varchar(45) not null,
    BirthDate date not null,
    Commands text);
    
insert into Dog (typeAnimal, nameAnimal, BirthDate, Commands) values
('Dog', 'Fido', '2022-01-02', 'Лежать, Сидеть, Голос'),
('Dog', 'Buddy', '2020-02-03', 'Лежать, Сидеть'),
('Dog', 'Bella', '2018-03-04', 'Голос');

drop table if exists Cat;
create table Cat(
	id int auto_increment primary key,
    typeAnimal varchar(45) not null,
    nameAnimal varchar(45) not null,
    BirthDate date not null,
    Commands text);
    
insert into Cat (typeAnimal, nameAnimal, BirthDate, Commands) values
('Cat', 'Whiskers', '2016-10-15', 'Мяукать'),
('Cat', 'Smudge', '2018-01-13', 'Кусать'),
('Cat', 'Oliver', '2021-04-04', 'Мурлыкать');

drop table if exists Hamster;
create table Hamster(
	id int auto_increment primary key,
    typeAnimal varchar(45) not null,
    nameAnimal varchar(45) not null,
    BirthDate date not null,
    Commands text);
    
insert into Hamster (typeAnimal, nameAnimal, BirthDate, Commands) values
('Hamster', 'Hammy', '2021-03-03', 'Грызть'),
('Hamster', 'Peanut', '2023-02-08', 'Замирать');

drop table if exists Horse;
create table Horse(
	id int auto_increment primary key,
    typeAnimal varchar(45) not null,
    nameAnimal varchar(45) not null,
    BirthDate date not null,
    Commands text);
    
insert into Horse (typeAnimal, nameAnimal, BirthDate, Commands) values
('Horse', 'Thunder', '2014-03-07', 'Рысь, Галоп'),
('Horse', 'Storm', '2021-04-06', 'Рысь'),
('Horse', 'Blaze', '2017-02-01', 'Галоп');

drop table if exists Camel;
create table Camel(
	id int auto_increment primary key,
    typeAnimal varchar(45) not null,
    nameAnimal varchar(45) not null,
    BirthDate date not null,
    Commands text);
    
insert into Camel (typeAnimal, nameAnimal, BirthDate, Commands) values
('Camel', 'Sandy', '2010-06-06', 'Идти, Плевать'),
('Camel', 'Dune', '2020-04-08', 'Бежать'),
('Camel', 'Sahara', '2015-11-11', 'Бежать, Плевать');

drop table if exists Donkey;
create table Donkey(
	id int auto_increment primary key,
    typeAnimal varchar(45) not null,
    nameAnimal varchar(45) not null,
    BirthDate date not null,
    Commands text);
    
insert into Donkey (typeAnimal, nameAnimal, BirthDate, Commands) values
('Donkey', 'Eeyore', '2014-05-05', 'Идти, Стоять'),
('Donkey', 'Burro', '2022-01-06', 'Стоять, Бежать');

/** 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу. **/

delete from Camel
where typeAnimal = 'Camel';

create table HorseAndDonkey
select * from Horse
union
select * from Donkey;

/** 11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице **/

create table YoungAnimals
select * from Dog
where TIMESTAMPDIFF(month, BirthDate, now()) > 12 and TIMESTAMPDIFF(month, BirthDate, now()) < 36
union select * from Cat
where TIMESTAMPDIFF(month, BirthDate, now()) > 12 and TIMESTAMPDIFF(month, BirthDate, now()) < 36
union select * from Hamster
where TIMESTAMPDIFF(month, BirthDate, now()) > 12 and TIMESTAMPDIFF(month, BirthDate, now()) < 36
union select * from Horse
where TIMESTAMPDIFF(month, BirthDate, now()) > 12 and TIMESTAMPDIFF(month, BirthDate, now()) < 36
union select * from Camel
where TIMESTAMPDIFF(month, BirthDate, now()) > 12 and TIMESTAMPDIFF(month, BirthDate, now()) < 36
union select * from Donkey
where TIMESTAMPDIFF(month, BirthDate, now()) > 12 and TIMESTAMPDIFF(month, BirthDate, now()) < 36;

select *, TIMESTAMPDIFF(month, BirthDate, now()) as AgeMonth from YoungAnimals;

/** 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам. **/

create table AllTypes
select * from Pets
union
select * from PackAnimals;

select * from AllTypes;

create table AllAnimals
select * from Dog
union select * from Cat
union select * from Hamster
union select * from Horse
union select * from Camel
union select * from Donkey;

select * from AllAnimals
right join AllTypes
on AllAnimals.typeAnimal = AllTypes.typeAnimal;