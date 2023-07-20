-- 1- Mostrar todos los registros de la tabla movies
SELECT *
FROM movies;

-- 2- Mostrar el nombre, apellido y rating de todos los actores
SELECT first_name, last_name, rating
FROM actors;

-- 3- Mostrar el título de todas las series
SELECT title
FROM series;

-- 4- Mostrar el nombre y apellido de los actores cuyo rating sea mayor a 7.5
SELECT first_name, last_name, rating
FROM actors
WHERE rating > 7.5
ORDER BY rating ASC;

-- 5- Mostrar el título de las películas, el rating y los premios de las películas con un rating mayor a 7.5 y con más de dos premios
SELECT title, rating, awards
FROM movies
WHERE rating > 7.5 AND awards >= 2
ORDER BY awards ASC;

-- 6- Mostrar el título de las películas y el rating ordenadas por rating en forma ascendente
SELECT title, rating
FROM movies
ORDER BY rating ASC;

-- 7- Mostrar el título y el rating de todas las películas cuyo título incluya Toy Story
SELECT title, rating
FROM movies
WHERE title LIKE '%Toy Story%';

-- 8- Mostrar a todos los actores cuyos nombres empiecen con Sam
SELECT *
FROM actors
WHERE first_name LIKE 'Sam%';

-- 9- Mostrar el título de las películas que salieron entre "2004-01-01" y "2008-01-01"
SELECT title, release_date
FROM movies
WHERE release_date BETWEEN '2004-01-01' AND '2008-01-01';

-- 10- Utilizando la base de datos de movies, queremos conocer, por un lado, los títulos y el nombre del género de todas las series de la base de datos
SELECT series.title, genres.name
FROM series
JOIN genres ON series.genre_id = genres.id;

-- 11- Por otro lado, necesitamos listar los títulos de los episodios junto con el nombre y apellido de los actores que trabajan en cada uno de ellos
SELECT episodes.title, actors.first_name, actors.last_name
FROM episodes
JOIN actor_episode ON episodes.id = actor_episode.episode_id
JOIN actors ON actor_episode.actor_id = actors.id;

-- 12- Para nuestro próximo desafío, necesitamos obtener a todos los actores o actrices cuya película favorita sea cualquiera de la saga de La Guerra de las Galaxias
SELECT actors.first_name, actors.last_name, movies.title
FROM actors
JOIN movies ON actors.favorite_movie_id = movies.id
WHERE movies.title LIKE '%Guerra%';

-- 13- Para nuestro próximo desafío, necesitamos obtener a todos los actores o actrices que han trabajado en cualquier película de la saga de La Guerra de las Galaxias
SELECT DISTINCT actors.first_name, actors.last_name, movies.title
FROM actor_movie AS a
JOIN actors ON a.actor_id = actors.id
JOIN movies ON a.movie_id = movies.id
WHERE movies.title LIKE '%La Guerra de las galaxias%';

-- 14- Crear un listado a partir de la tabla de películas, mostrar un reporte de la cantidad de películas por nombre de género
SELECT genre_id, COUNT(genre_id) AS cantidad_peliculas, genres.name
FROM movies
JOIN genres ON genres.id = movies.genre_id
GROUP BY genre_id, genres.name;

-- 15- Crear una vista para poder organizar los envíos de las facturas. Indicar número de factura, fecha de la factura y fecha de envío, ambas en formato dd/mm/yyyy, valor del transporte formateado con dos decimales, y la información del domicilio del destino incluyendo dirección, ciudad, código postal y país, en una columna llamada Destino


-- 16- Realizar una consulta con todos los correos y el detalle de las facturas que usaron ese correo. Utilizar la vista creada


-- 17- Crear una vista con un detalle de los productos en stock. Indicar código, nombre del producto, nombre de la categoría (product_line) y precio unitario


-- 18- Escribir una consulta que liste el nombre y la categoría de todos los productos vendidos. Utilizar la vista creada

