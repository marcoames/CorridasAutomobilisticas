-- Insert additional pilotos
INSERT INTO piloto (nome, idade, nacionalidade) VALUES
('George Russell', 24, 'British'),
('Esteban Ocon', 25, 'French'),
('Pierre Gasly', 26, 'French'),
('Fernando Alonso', 40, 'Spanish'),
('Mick Schumacher', 23, 'German');

-- Insert additional carros
INSERT INTO carro (modelo, marca, ano) VALUES
('Mercedes W12', 'Mercedes', 2021),
('Alpine A521', 'Alpine', 2021),
('AlphaTauri AT02', 'AlphaTauri', 2021),
('Alpine A522', 'Alpine', 2022),
('Haas VF-21', 'Haas', 2021);

-- Insert additional corridas
INSERT INTO corrida (data, local) VALUES
('2023-10-02', 'Austin'),
('2023-11-12', 'Interlagos'),
('2023-12-05', 'Yas Marina'),
('2024-03-10', 'Bahrain'),
('2024-04-07', 'Melbourne');

-- Assign additional carros to pilotos
INSERT INTO carro_piloto (carro_id, piloto_id) VALUES 
(9, 9),  -- George Russell driving Mercedes W12
(10, 10), -- Esteban Ocon driving Alpine A521
(11, 11), -- Pierre Gasly driving AlphaTauri AT02
(12, 12), -- Fernando Alonso driving Alpine A522
(13, 13); -- Mick Schumacher driving Haas VF-21

-- Assign additional pilotos to corridas
INSERT INTO corrida_piloto (corrida_id, piloto_id) VALUES
(6, 9),  -- George Russell for corrida 6 (Austin)
(6, 4),  -- Sergio Perez for corrida 6 (Austin)
(7, 10), -- Esteban Ocon for corrida 7 (Interlagos)
(7, 11), -- Pierre Gasly for corrida 7 (Interlagos)
(8, 12), -- Fernando Alonso for corrida 8 (Yas Marina)
(8, 5),  -- Valtteri Bottas for corrida 8 (Yas Marina)
(9, 13), -- Mick Schumacher for corrida 9 (Bahrain)
(9, 6),  -- Sebastian Vettel for corrida 9 (Bahrain)
(10, 1), -- Lewis Hamilton for corrida 10 (Melbourne)
(10, 7); -- Lando Norris for corrida 10 (Melbourne)
