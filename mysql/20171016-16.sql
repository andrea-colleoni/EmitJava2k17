-- 16. elencare i film della categoria 'Documentary' con titolo e nome/cognome degli attori del cast prodotti prima del 2005 o dopo il 2010 pi� lunghi di 100 minuti
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
    -- AND (f.release_year < 2005
    -- OR f.release_year > 2010)
    AND f.release_year not between 2005 and 2010
    and f.length > 100