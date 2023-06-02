// Definir una lista de productos con sus respectivos precios
const productos = {
    'manzanas': 2.50,
    'platanos': 1.75,
    'naranjas': 3.00,
    'peras': 2.00,
    'sandias': 8.50
  };
  
  // Solicitar al usuario el nombre del producto a consultar
  const nombreProducto = prompt('Ingrese el nombre del producto que desea consultar:');
  
  // Verificar si el producto ingresado existe en la lista
  if (productos.hasOwnProperty(nombreProducto)) {
    // Mostrar el precio del producto consultado
    alert(`El precio de ${nombreProducto} es $${productos[nombreProducto]}`);
  } else {
    // Si el producto no existe, mostrar un mensaje de error
    alert(`Lo siento, ${nombreProducto} no se encuentra disponible en este momento.`);
  }
  