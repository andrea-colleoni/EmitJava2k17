-- 15. stilare una classifica degli attori in base al prezzo medio di noleggio dei film in cui hanno recitato
SELECT
	a.first_name,
    a.last_name,
    avg(f.rental_rate)
FROM
	actor a 
    inner join film_actor fa 
    on a.actor_id = fa.actor_id
    inner join film f
    on fa.film_id = f.film_id
group BY
	fa.actor_id,
    a.first_name,
    a.last_name
order by 
	3 desc