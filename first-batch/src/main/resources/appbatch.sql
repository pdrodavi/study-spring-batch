-- Database: app_batch

-- DROP DATABASE app_batch;

CREATE DATABASE app_batch
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
select * from public.cliente

CREATE TABLE public.cliente
(
  nome character varying(150),
  sobrenome character varying(150),
  idade character varying(2),
  email character varying(150)
);

insert into public.cliente (nome, sobrenome, idade, email) values ('Pedro', 'Davi', '24', 'pedro@davi.com');
insert into public.cliente (nome, sobrenome, idade, email) values ('Davi', 'Pedro', '24', 'davi@davi.com');
insert into public.cliente (nome, sobrenome, idade, email) values ('Dantas', 'Silva', '24', 'davi@davi.com');
insert into public.cliente (nome, sobrenome, idade, email) values ('Silva', 'Dantas', '24', 'davi@davi.com');
insert into public.cliente (nome, sobrenome, idade, email) values ('Dantas', 'Dantas', '24', 'dantas@davi.com');

