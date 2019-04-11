create table requests(
    id int auto_increment primary key,
    name_of_requester varchar(255),
    id_of_requester int,
    name_of_requestee varchar(255),
    id_of_requestee int,
    request_status varchar(255),
    date date,
    start_time time,
    end_time time,
    meeting_purpose varchar(255),
    additional_meeting_info varchar(255)
);