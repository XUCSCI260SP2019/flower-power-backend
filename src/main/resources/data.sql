INSERT INTO professor (email, password, full_name) VALUES
('pEmail_@email.com', 'pPassword', 'bob tim'),
('pEmail_2@email.com.com', 'pPassword2', 'tim bob'),
('pEmail_3@email.com', 'pPassword3', 'not tim');

INSERT INTO student (email, password, full_name) VALUES
('sEmail_@email.com', 'password', 'jim bob'),
('sEmail_2@email.com', 'password2', 'bob jim'),
('sEmail_3@email.com', 'sPassword3', 'not bob');


INSERT INTO professor_student_link (professor_id, student_id) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 2),
(2, 3),
(3, 3),
(3, 1);