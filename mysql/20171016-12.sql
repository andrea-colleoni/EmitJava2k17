-- 12. elencare i film con title, description e categoria
SELECT
	f.title,
    f.description,
    c.name
FROM
	film f inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c 
    on fc.category_id = c.category_id