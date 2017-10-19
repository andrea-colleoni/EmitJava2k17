-- 13. elencare gli attori che non hanno recitato in alcun film
SELECT
	a.first_name,
    a.last_name
FROM
	film_actor fa
    right outer join actor a
    on fa.actor_id = a.actor_id
WHERE
	fa.actor_id is null