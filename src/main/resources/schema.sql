
create table if not exists professor(
    id int auto_increment primary key,
    email varchar(255),
    fullname varchar(255),
    officebuilding varchar(255),
    officeroom int,
    officehourstart varchar(255),
    officehourend varchar(255)
);

create table if not exists student(
    id int auto_increment primary key,
    email varchar(255),
    password varchar(255),
    fullname varchar(255)
);

create table if not exists reservation(
    id int auto_increment primary key,
    fullname varchar(255),
    approved bool,
    starttime varchar(255),
    endtime varchar(255),
    cancelled bool,
    cancellationreason text,
    professorid int,
    FOREIGN KEY (professorid) REFERENCES professor(id) ON DELETE CASCADE
);
