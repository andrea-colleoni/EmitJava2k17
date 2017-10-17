-- 18. elencare gli attori con nome/cognome e nome della categoria di film in cui appaiono nel cast
SELECT
	concat(a.first_name, ' ', a.last_name) full_name,
    c.name
FROM
	film f left outer join film_actor fa 
    on f.film_id = fa.film_id
    left outer join actor a 
    on fa.actor_id = a.actor_id
    inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c 
    on fc.category_id = c.category_id