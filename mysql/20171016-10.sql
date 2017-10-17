-- 10. elencare i film pubblicati tra il 2006 e il 2010 più brevi di 1,5 ore
SELECT
	f.*
FROM
	film f
WHERE
	f.release_year between 2006 and 2010
    -- and f.length < 90
    and f.length / 60 < 1.5