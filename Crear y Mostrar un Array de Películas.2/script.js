const peliculas = [
  { "titulo": "El Rey León", "genero": "Animación" },
    { "titulo": "Avengers: Endgame", "genero": "Acción" },
    { "titulo": "Titanic", "genero": "Romance" },
    { "titulo": "El Conjuro", "genero": "Terror" },
    { "titulo": "Shrek", "genero": "Animación" },
    { "titulo": "John Wick", "genero": "Acción" },
    { "titulo": "The Matrix", "genero": "Ciencia Ficción" },
    { "titulo": "Forrest Gump", "genero": "Drama" },
    { "titulo": "Star Wars: A New Hope", "genero": "Ciencia Ficción" },
    { "titulo": "Harry Potter and the Sorcerer's Stone", "genero": "Fantástico" },
    { "titulo": "The Lion King", "genero": "Animación" },
    { "titulo": "Gladiator", "genero": "Drama" },
    { "titulo": "El Padrino", "genero": "Crimen" },
    { "titulo": "La lista de Schindler", "genero": "Drama" },
    { "titulo": "Inception", "genero": "Ciencia Ficción" },
    { "titulo": "The Dark Knight", "genero": "Acción" },
    { "titulo": "Pulp Fiction", "genero": "Crimen" },
    { "titulo": "The Shawshank Redemption", "genero": "Drama" },
    { "titulo": "Fight Club", "genero": "Drama" },
    { "titulo": "The Godfather: Part II", "genero": "Crimen" },
    { "titulo": "Interstellar", "genero": "Ciencia Ficción" }
];

// Referencias al DOM
const listadoPeliculas = document.getElementById("peliculas");
const generoSelect = document.getElementById("genero");
const accesosRapidos = document.getElementById("accesos-rapidos");

// Inicializar la página
function inicializar() {
  cargarGeneros();
  mostrarPeliculas(peliculas);
  generarBotonesAcceso();
}

// Cargar géneros en el desplegable
function cargarGeneros() {
  const generos = [...new Set(peliculas.map(p => p.genero))];
  generos.forEach(genero => {
      const option = document.createElement("option");
      option.value = genero;
      option.textContent = genero;
      generoSelect.appendChild(option);
  });

  generoSelect.addEventListener("change", filtrarPeliculas);
}

// Generar botones de acceso rápido
function generarBotonesAcceso() {
  const generos = [...new Set(peliculas.map(p => p.genero))];
  generos.forEach(genero => {
      const button = document.createElement("button");
      button.textContent = genero;
      button.addEventListener("click", () => filtrarPeliculasPorGenero(genero));
      accesosRapidos.appendChild(button);
  });
}

// Mostrar películas en la página
function mostrarPeliculas(lista) {
  listadoPeliculas.innerHTML = "";
  lista.forEach(pelicula => {
      const li = document.createElement("li");
      li.textContent = `${pelicula.titulo} - ${pelicula.genero}`;
      listadoPeliculas.appendChild(li);
  });
}

// Filtrar películas por género desde el desplegable
function filtrarPeliculas() {
  const generoSeleccionado = generoSelect.value;
  if (generoSeleccionado === "todos") {
      mostrarPeliculas(peliculas);
  } else {
      const filtradas = peliculas.filter(p => p.genero === generoSeleccionado);
      mostrarPeliculas(filtradas);
  }
}

// Filtrar películas por género usando botones
function filtrarPeliculasPorGenero(genero) {
  const filtradas = peliculas.filter(p => p.genero === genero);
  mostrarPeliculas(filtradas);
}

// Inicializar la aplicación
inicializar();
