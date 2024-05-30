# INSERT some subject

INSERT INTO makaut_successpath.subject
(branch, name, semester)
VALUES('CSE', 'Mathematics-I', 1);

INSERT INTO makaut_successpath.subject
(branch, name, semester)
VALUES('CSE', 'Physics-I', 1);

INSERT INTO makaut_successpath.subject
(branch, name, semester)
VALUES('CSE', 'Chemistry-I', 1);

INSERT INTO makaut_successpath.subject
(branch, name, semester)
VALUES('CSE', 'Basic Electrical Engineering', 1);


# Insert Question Paper of Mathematics

INSERT INTO makaut_successpath.question_paper
(file_name, `year`, subject_id)
VALUES('Mathematics', 2020, 1);

INSERT INTO makaut_successpath.question_paper
(file_name, `year`, subject_id)
VALUES('Mathematics', 2023, 1);