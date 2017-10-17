CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';
CREATE USER 'demo'@'%' IDENTIFIED BY 'demo';

GRANT ALL PRIVILEGES ON * . * TO 'demo'@'localhost';
GRANT ALL PRIVILEGES ON * . * TO 'demo'@'%';
FLUSH PRIVILEGES;

CREATE DATABASE demo;