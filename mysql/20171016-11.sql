-- 11. elencare i film con title, description e lingua (colonna language_id)
SELECT
	f.title,
    f.description,
    l.name
FROM
	film f inner join language l
    on f.language_id = l.language_id