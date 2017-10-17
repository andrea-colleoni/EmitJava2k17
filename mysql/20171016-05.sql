-- 5. elencare tutti i film con title, description e durata in ore (1 ora = 60 minuti)
SELECT
	f.title,
    f.description,
    f.length / 60 durata_ore
FROM
	film f