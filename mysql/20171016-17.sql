-- 17. elencare i film con titolo e nome/cognome degli attori del cast prodotti prima del 2005 e più brevi di 100 minuti o dopo il 2010 ma più lunghi di 100 minuti
SELECT	
	f.title,
    concat(a.first_name, ' ', a.last_name) full_name
FROM
	film f left outer join film_actor fa 
    on f.film_id = fa.film_id
    left outer join actor a 
    on fa.actor_id = a.actor_id
WHERE	
	(f.release_year < 2005 
    and f.length < 100)
    OR
    (f.release_year > 2010
     and f.length > 100)