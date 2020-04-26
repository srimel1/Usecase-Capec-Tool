DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT  PRIMARY KEY,
                       email VARCHAR(250) DEFAULT  NULL,
                       password VARCHAR(250) NOT NULL,
                       fullname VARCHAR(250) NOT NULL,
                       enabled boolean  NULL
);

insert INTO users (id, email, password, fullname, enabled) VALUES
(1, 'email@gmail.com', '123', 'blah', 1);

drop table if exists role;
create table role(
                     id bigint auto_increment primary key,
                     role varchar(250) default null

);
insert INTO role (id, role) values
                                   (1,'ADMIN');


