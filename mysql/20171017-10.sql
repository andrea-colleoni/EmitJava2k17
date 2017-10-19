-- 10. determinare il prezzo medio di noleggio dei film per categoria
SELECT
    c.name,
    avg(f.rental_rate)
FROM
	film f 
    inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c
    on fc.category_id = c.category_id
group BY
    fc.category_id,
    c.name