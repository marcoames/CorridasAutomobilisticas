INSERT INTO piloto (nome, idade, nacionalidade) VALUES
('Lewis Hamilton', 37, 'British'),
('Max Verstappen', 24, 'Dutch'),
('Charles Leclerc', 24, 'Monegasque');

INSERT INTO carro (modelo, marca, ano) VALUES ('Ferrari F8 Tributo', 'Ferrari', 2019);
INSERT INTO carro (modelo, marca, ano) VALUES ('Lamborghini Huracan Performante', 'Lamborghini', 2019);
INSERT INTO carro (modelo, marca, ano) VALUES ('Mercedes-AMG GT', 'Mercedes-AMG', 2014);

INSERT INTO corrida (data, local) VALUES ('2023-05-15', 'Monaco');
INSERT INTO corrida (data, local) VALUES ('2023-06-20', 'Silverstone');

INSERT INTO carro_piloto (carro_id, piloto_id) VALUES (1, 1);
INSERT INTO carro_piloto (carro_id, piloto_id) VALUES (2, 2);
INSERT INTO carro_piloto (carro_id, piloto_id) VALUES (3, 3); 

INSERT INTO corrida_piloto (corrida_id, piloto_id) VALUES (1, 1); -- Lewis Hamilton for corrida 1
INSERT INTO corrida_piloto (corrida_id, piloto_id) VALUES (1, 2); -- Max Verstappen for corrida 1
INSERT INTO corrida_piloto (corrida_id, piloto_id) VALUES (1, 3); -- Charles Leclerc for corrida 1

INSERT INTO corrida_piloto (corrida_id, piloto_id) VALUES (2, 2); -- Max Verstappen for corrida 2