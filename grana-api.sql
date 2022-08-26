show databases;
use granapi;
show tables;

describe categoria;
describe pessoa;

select * from flyway_schema_history;
select * from categoria;
select * from pessoa;

delete from categoria where codigo = 15;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Alimentação');
INSERT INTO categoria (nome) values ('Supermercado');
INSERT INTO categoria (nome) values ('Farmácia');
INSERT INTO categoria (nome) values ('Outros');