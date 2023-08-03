// Definición de un array multidimensional con 3 sub-arrays dentro
var array = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];

// Bucle exterior que itera a través de los sub-arrays en 'array'
for (var y = 0; y < array.length; y++) {
  console.log("> Nueva instancia"); // Imprime un mensaje para indicar una nueva iteración
  var arrayani = array[y]; // Almacena el sub-array actual en la variable 'arrayani'

  // Imprime un mensaje junto con el contenido del sub-array actual
  console.log("Arreglo " + arrayani);

  // Bucle interior que itera a través de los elementos dentro del sub-array actual
  for (var x = 0; x < arrayani.length; x++) {
    console.log(">>> Anidado"); // Imprime un mensaje para indicar un nivel anidado
    console.log("Elemento"); // Imprime un mensaje genérico de "elemento"
    console.log(arrayani[x]); // Imprime el valor del elemento actual del sub-array
  }
}
