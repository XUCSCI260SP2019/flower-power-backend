create table users(
    id int auto_increment primary key,
    email varchar(255),
    firstname varchar(255),
    lastname varchar(255),
    password varchar(255)
);

create table times(
    id int auto_increment primary key,
    date datetime,
    meetingpurpose varchar(255)
);