SELECT * FROM estados where id= 52

INSERT INTO cidades(nome, area, estado_id)
    VALUES ('Campinas', 795, 52)

INSERT INTO cidades(nome, area, estado_id)
    VALUES ('Niterói', 795, 46)

INSERT INTO cidades(nome,area,estado_id)
    VALUES('Caruaru',920.6,(SELECT id from estados where sigla = 'PE'))

INSERT INTO cidades (nome,area,estado_id)
    VALUES ('juazeiro do Norte', 248.2,
        (SELECT id FROM estados where sigla = 'CE'))

SELECT * FROM cidades