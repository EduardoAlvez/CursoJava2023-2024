SELECT e.nome AS Empresa, c.nome AS Cidade from empresas e, empresas_unidades eu, cidades c
    where e.id = eu.empresa_id
        and c.id = eu.cidade_id
            and sede;