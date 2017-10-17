-- 8. elencare i film pubblicati tra il 2006 e il 2010
SELECT
	f.*
FROM
	film f 
WHERE
	-- f.release_year >= 2006 and f.release_year <= 2010
    -- f.release_year > 2005 and f.release_year < 2011
    f.release_year between 2006 and 2010   -- ricordare che gli estremi sono compresi