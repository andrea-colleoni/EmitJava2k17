-- 7. contare quanti in quanti film ciascun attore ha recitato
SELECT
	a.first_name,
    a.last_name,
    count(*)
FROM
	film f inner join film_actor fa 
    on f.film_id = fa.film_id
    inner join actor a
    on fa.actor_id = a.actor_id
group BY
	a.actor_id,
    a.first_name,
    a.last_name