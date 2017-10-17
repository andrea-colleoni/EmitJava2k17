-- 13. elencare i film con titolo e nome/cognome degli attori del cast
SELECT
	f.title,
    concat(a.first_name, ' ', a.last_name) full_name
FROM
	film f inner join film_actor fa 
    on f.film_id = fa.film_id
    inner join actor a 
    on fa.actor_id = a.actor_id