CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';
CREATE USER 'demo'@'%' IDENTIFIED BY 'demo';

CREATE DATABASE volunteering;

GRANT ALL PRIVILEGES ON * . * TO 'demo'@'localhost';
GRANT ALL PRIVILEGES ON * . * TO 'demo'@'%';
FLUSH PRIVILEGES;