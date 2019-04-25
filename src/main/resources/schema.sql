create table if not exists reservation(
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
    additional_meeting_info varchar(255),
    cancelled bool,
    cancellation_reason text
);

create table if not exists professors(
    id int auto_increment primary key,
    first_name varchar(255),
    last_name varchar(255)
);



