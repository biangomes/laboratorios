INSERT INTO Conselho (id, nome)
VALUES (1, 'CRM'), (2, 'CRP'), (3, 'CREFITO'), (4, 'CREF');


INSERT INTO Especialidade (id, nome, conselho_id)
VALUES (1, 'Obstetrícia', 1), (2, 'Pediatria', 1),
        (3, 'Incologia', 1), (4, 'Psicanalise', 2),
        (5, 'Pilates', 3), (6, 'Neurologia', 1);


INSERT INTO Profissional (nome, conselho_id)
VALUES ('Ademar', 2), ('Carlos Manoel', 1),
        ('Juçara', 1), ('Maria Albuquerque', 1),
        ('Ariel', 1), ('Marcos', 1);


