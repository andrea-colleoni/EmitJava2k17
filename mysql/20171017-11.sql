-- 11. ipotizzando di applicare uno sconto casuale tra il 10% e il 20% sul prezzo di noleggio di ciascun film, determinare il totale complessivo del costo di noleggio dei film con rating 'G' suddiviso per categoria
SELECT
	-- f.title,
    -- f.rental_rate,
    -- round(f.rental_rate * (round(rand() * 10) + 10)  / 100, 2) sconto,
    c.name,
    sum(f.rental_rate - round(f.rental_rate * (round(rand() * 10) + 10)  / 100, 2)) totale_prezzo_scontato
FROM
	film f
    inner join film_category fc
    on f.film_id = fc.film_id
    inner join category c
    on fc.category_id = c.category_id
WHERE
	f.rating = 'G'
group BY
	fc.category_id,
    c.name