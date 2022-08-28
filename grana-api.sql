show databases;
use granapi;
show tables;

describe categoria;
describe pessoa;

select * from flyway_schema_history;
select * from categoria;
select * from pessoa;
select * from lancamento;

delete from flyway_schema_history where version = 03;
drop table lancamento; 

