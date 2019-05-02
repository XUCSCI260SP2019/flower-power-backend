create table if not exists reservation(
    id int auto_increment primary key,
    nameofrequester varchar(255),
    idofrequester int,
    nameofrequestee varchar(255),
    idofrequestee int,
    requeststatus varchar(255),
    date date,
    starttime time,
    endtime time,
    meetingpurpose varchar(255),
    additionalmeetinginfo varchar(255),
    cancelled bool,
    cancellationreason text
);

create table if not exists professor(
    id int auto_increment primary key,
    email varchar(255),
    password varchar(255),
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

create table if not exists professorstudentlink(
    professorid int,
    studentid int
);
