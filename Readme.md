Implementa una simulación de la fábula que cuenta la carrera entre la liebre y la tortuga.
Para hacerlo más interesante, la carrera será cuesta arriba por una pista resbaladiza, de
modo que a veces podrán deslizarse y retroceder algunas posiciones. Habrá un hilo que
implementará a la tortuga y otro a la liebre. Cada uno se suspenderá durante un segundo y
luego evaluará lo que ocurrió según unas probabilidades:
Animal Suceso Probabilidad Movimiento
Tortuga Avance rápido 50% 3 casillas hacia adelante
Resbalón 20% 6 casillas hacia atrás
Avance lento 30% 1 casilla hacia adelante
Liebre Duerme 20%
Gran salto 20% 9 casillas hacia adelante
Resbalón grande 10% 12 casillas hacia atrás
Pequeño salto 30% 1 casilla hacia adelante
Resbalón pequeño 20% 2 casillas hacia atrás
Calcula la probabilidad usando random, con un número entre 1 y 100, y determina con dicho
número qué hizo cada animal. Considera que hay 70 casillas, desde la 1 hasta la 70, con la
1 como punto de partida y la 70 como la meta.
Si un animal resbala al principio, vuelve a la casilla 1, sin ir más atrás. Tras cada segundo y
después de calcular su nueva posición, imprime una línea por cada animal con su posición
seguida de una letra: T para la tortuga y L para la liebre.
Imprime al comienzo de la carrera un mensaje inicial. Después de imprimir las líneas,
determina si alguno de los animales llegó a la meta y ganó, imprimiendo un mensaje. Si
ambos llegan al mismo tiempo, declara un empate.