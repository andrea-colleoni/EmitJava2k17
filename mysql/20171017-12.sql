-- 12. elencare gli attori che hanno recitato in più di 3 film della categoria 'Action'
SELECT
	a.first_name,
    a.last_name
FROM
	film f
    inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c
    on fc.category_id = c.category_id
    inner join film_actor fa
    on f.film_id = fa.film_id
    inner join actor a
    on fa.actor_id = a.actor_id
where
	c.name = 'Action'
group by
	a.actor_id,
    a.first_name,
    a.last_name
HAVING	
	count(*) > 3