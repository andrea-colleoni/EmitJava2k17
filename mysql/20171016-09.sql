-- 9. elencare i film pubblicati tra il 2006 e il 2010 pi� brevi di 100 minuti
SELECT
	f.*
from
	film f
WHERE
	f.release_year between 2006 and 2010
    and f.length < 100