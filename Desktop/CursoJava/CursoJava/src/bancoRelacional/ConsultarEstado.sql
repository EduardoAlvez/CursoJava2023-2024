select * from estados

select Sigla,nome as 'Nome do Estado' from `estados`
    where regiao = "sul"

select Nome, Regiao, Populacao from `estados`
    where populacao>= 10
        order by populacao DESC