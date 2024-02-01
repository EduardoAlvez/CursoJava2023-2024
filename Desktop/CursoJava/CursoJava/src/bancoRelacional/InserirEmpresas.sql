ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas(nome, cnpj)
    VALUES
        ('Bradesco', 29831296733131),
        ('Vale', 39831296733123),
        ('Cielo', 19831296733131),
        ('honda', 69831296733213);


SELECT * FROM cidades;
SELECT * FROM empresas;

INSERT INTO empresas_unidades(empresa_id, cidade_id,sede)
    VALUES
        (1,1,1),
        (1,2,0),
        (2,1,0),
        (2,2,1);

SELECT * FROM empresas_unidades