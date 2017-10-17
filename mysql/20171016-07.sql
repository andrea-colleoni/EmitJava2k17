-- 7. elencare i film pubblicati nell'anno 2006
SELECT
	f.*
FROM
	film f
WHERE
	f.release_year = 2006