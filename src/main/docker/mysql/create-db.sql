CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';
CREATE USER 'demo'@'%' IDENTIFIED BY 'demo';

CREATE DATABASE volunteering;

GRANT ALL PRIVILEGES ON * . * TO 'volunteering'@'localhost';
GRANT ALL PRIVILEGES ON * . * TO 'volunteering'@'%';
FLUSH PRIVILEGES;