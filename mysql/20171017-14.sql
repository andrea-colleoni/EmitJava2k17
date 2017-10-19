-- 14. elencare le categorie inutilizzate (che non hanno alcun film nel catalogo)
SELECT
	c.name
FROM
	category c
    inner join film_category fc
    on c.category_id = fc.category_id
WHERE
	fc.category_id is null