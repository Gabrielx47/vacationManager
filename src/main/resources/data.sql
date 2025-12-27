insert into SERVIDOR (id, nome) values (1, 'Elena Souza');
insert into SERVIDOR (id, nome) values (2, 'João Silva');
insert into SERVIDOR (id, nome) values (3, 'Maria Santos');
insert into SERVIDOR (id, nome) values (4, 'Pedro Oliveira');
insert into SERVIDOR (id, nome) values (5, 'Ana Costa');

alter sequence servidor_id_seq restart with 6;

insert into PAGAMENTO (id, valor, data, servidor_id) values (1, 1500.00, '2023-01-15', 1);
insert into PAGAMENTO (id, valor, data, servidor_id) values (2, 2000.00, '2023-02-10', 2);
insert into PAGAMENTO (id, valor, data, servidor_id) values (3, 1800.00, '2023-03-05', 3);
insert into PAGAMENTO (id, valor, data, servidor_id) values (4, 2200.00, '2023-04-20', 4);
insert into PAGAMENTO (id, valor, data, servidor_id) values (5, 1600.00, '2023-05-12', 5);
insert into PAGAMENTO (id, valor, data, servidor_id) values (6, 1900.00, '2023-06-08', 1);
insert into PAGAMENTO (id, valor, data, servidor_id) values (7, 2100.00, '2023-07-22', 2);
insert into PAGAMENTO (id, valor, data, servidor_id) values (8, 1700.00, '2023-08-10', 1);
insert into PAGAMENTO (id, valor, data, servidor_id) values (9, 2300.00, '2023-11-20', 2);
insert into PAGAMENTO (id, valor, data, servidor_id) values (10, 1950.00, '2024-02-20', 3);
insert into PAGAMENTO (id, valor, data, servidor_id) values (11, 2400.00, '2024-05-25', 4);
insert into PAGAMENTO (id, valor, data, servidor_id) values (12, 1750.00, '2024-08-20', 5);

insert into FERIAS (id, inicio, fim, status, servidor_id) values (1, '2023-08-01', '2023-08-15', 'APROVADA', 1);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (2, '2023-09-10', '2023-09-20', 'EMANALISE', 1);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (3, '2023-10-05', '2023-10-12', 'REPROVADA', 1);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (4, '2023-11-15', '2023-11-30', 'APROVADA', 2);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (5, '2023-12-01', '2023-12-10', 'EMANALISE', 2);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (6, '2024-01-05', '2024-01-20', 'REPROVADA', 2);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (7, '2024-02-15', '2024-02-28', 'APROVADA', 3);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (8, '2024-03-10', '2024-03-20', 'EMANALISE', 3);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (9, '2024-04-05', '2024-04-15', 'REPROVADA', 3);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (10, '2024-05-20', '2024-05-30', 'APROVADA', 4);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (11, '2024-06-10', '2024-06-20', 'EMANALISE', 4);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (12, '2024-07-01', '2024-07-10', 'REPROVADA', 4);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (13, '2024-08-15', '2024-08-25', 'APROVADA', 5);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (14, '2024-09-05', '2024-09-15', 'EMANALISE', 5);
insert into FERIAS (id, inicio, fim, status, servidor_id) values (15, '2024-10-10', '2024-10-20', 'REPROVADA', 5);