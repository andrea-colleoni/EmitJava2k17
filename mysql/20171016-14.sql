-- 14. elencare i film della categoria 'Documentary' con titolo e nome/cognome degli attori del cast
SELECT
	f.title,
    concat(a.first_name, ' ', a.last_name) full_name
FROM
	film f left outer join film_actor fa 
    on f.film_id = fa.film_id
    left outer join actor a 
    on fa.actor_id = a.actor_id
    inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c 
    on fc.category_id = c.category_id
WHERE	
	-- fc.category_id = 6
    c.name = 'Documentary'