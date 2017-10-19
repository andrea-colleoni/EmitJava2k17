-- 6. determinare la durata massima, minima, media e totale dei film suddividendoli per categoria
SELECT
	c.name,
	max(f.length),
    min(f.length),
    avg(f.length),
    sum(f.length),
    count(*)
FROM
	film f inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c
    on fc.category_id = c.category_id
group BY
	c.name