create table users(
    id int auto_increment primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255),
    user_role varchar(255),
    password varchar(255),
    number_of_requests int
);

create table requests(
    id int auto_increment primary key,
    name_of_requester varchar(255),
    id_of_requester int,
    name_of_requestee varchar(255),
    id_of_requestee int,
    request_status varchar(255),
    date datetime,
    meeting_purpose varchar(255),
    additional_meeting_info varchar(255)
);