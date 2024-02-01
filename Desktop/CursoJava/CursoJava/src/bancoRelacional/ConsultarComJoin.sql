select e.nome AS ESTADO, c.nome AS CIDADE, e.regiao AS REGIÃO
    from estados e, cidades c
        where e.id = c.estado_id;

SELECT
    c.nome AS Cidade,
    e.nome AS Estado,
    regiao AS Região
        from estados e
            inner join cidades c on e.id = c.estado_id