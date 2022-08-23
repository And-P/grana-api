show databases;
use granapi;
show tables;
select * from flyway_schema_history;
select * from categoria;
delete from categoria where codigo = 15;
describe categoria;
describe pessoa;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Alimentação');
INSERT INTO categoria (nome) values ('Supermercado');
INSERT INTO categoria (nome) values ('Farmácia');
INSERT INTO categoria (nome) values ('Outros');