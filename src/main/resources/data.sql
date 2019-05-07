INSERT INTO professor (email, fullname, officebuilding, officeroom, officehourstart, officehourend) VALUES
('pEmail_@email.com', 'bob tim', 'Alter', 101, '9:00', '10:00'),
('pEmail_2@email.com.com', 'tim bob', 'Alter', 103, '8:00', '10:00'),
('pEmail_3@email.com', 'not tim', 'Hinkle', 420, '12:00', '13:00');

INSERT INTO student (email, password, fullname) VALUES
('sEmail_@email.com', 'password', 'jim bob'),
('sEmail_2@email.com', 'password2', 'bob jim'),
('sEmail_3@email.com', 'sPassword3', 'not bob');

INSERT INTO reservation (fullname, professorid, approved, starttime, endtime, cancelled, cancellationreason) VALUES
('testFullName', 1, 'false', '0500', 'never', 'false', 'noCancel'),
('testFullName2', 1, 'false', '0500', 'never', 'true', 'noCancel');
