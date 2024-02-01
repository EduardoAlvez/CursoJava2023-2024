update `estados`
set nome = 'Maranhão'
where sigla = 'MA'

SELECT nome from `estados` WHERE  sigla = 'MA'

update `estados`
    set nome = 'Paraná', populacao = 11.32
        where sigla = 'PR'

select est.nome, sigla, populacao
    from estados est where sigla = 'PR'