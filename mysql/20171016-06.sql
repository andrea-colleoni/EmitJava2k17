-- 6. elencare i film pi� lunghi di 90 minuti
SELECT
	f.*
FROM
	film f
WHERE
	f.length > 90