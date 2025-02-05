// Array de películas
const peliculas = [
    { titulo: "El Rey León", genero: "Animación", anio: 1994 },
    { titulo: "Inception", genero: "Ciencia Ficción", anio: 2010 },
    { titulo: "Titanic", genero: "Drama", anio: 1997 },
    { titulo: "Matrix", genero: "Acción", anio: 1999 },
    { titulo: "Gradiator", genero:"Drama", anio: 2005}
];

// Referencia al botón y al contenedor de la lista
const botonMostrar = document.getElementById("mostrarPeliculas");
const listaPeliculas = document.getElementById("listaPeliculas");

// Función para pintar las películas en el DOM
function pintarPeliculas() {
    listaPeliculas.innerHTML = ""; // Limpiar la lista
    for (let i = 0; i < peliculas.length; i++) {
        const pelicula = peliculas[i];
        const li = document.createElement("li");
        li.textContent = `${pelicula.titulo} - ${pelicula.genero} (${pelicula.anio})`;
        listaPeliculas.appendChild(li);
    }
}

// Asociar el evento click al botón
botonMostrar.addEventListener("click", pintarPeliculas);
