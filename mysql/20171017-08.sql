-- 8. calcolare i minuti totali (durata dei film) in cui ciascun attore ha recitato e mostrarli in ordine decrescente
SELECT
	a.first_name,
    a.last_name,
    sum(f.length)
FROM
	film f inner join film_actor fa 
    on f.film_id = fa.film_id
    inner join actor a
    on fa.actor_id = a.actor_id
group BY
	a.actor_id,
    a.first_name,
    a.last_name
order by
	3 desc