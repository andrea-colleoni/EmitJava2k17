-- 9. contare in quante diverse categorie di film ciascun attore ha recitato
SELECT
	a.first_name,
    a.last_name,
    -- c.name,
    a.actor_id,
    -- c.category_id,
    -- f.title
    count(distinct fc.category_id)
    -- count(*)
FROM
	film f inner join film_actor fa 
    on f.film_id = fa.film_id
    inner join actor a
    on fa.actor_id = a.actor_id
    inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c
    on fc.category_id = c.category_id
group BY
	a.actor_id,
    a.first_name,
    a.last_name
    -- fc.category_id,
    -- c.name