const zap1 = {type:"nike", model:"air force 1", color:"white", precio:109000};
const zap2 = {type:"nike", model:"air max plus", color:"black and white", precio:194990};
const zap3 = {type:"nike", model:"Go FlyEase", color:"black", precio:139990};
const zap4 = {type:"nike", model:"Air Jordan Xxxvii Rui", color:"red", precio:158990};
const zap5 = {type:"nike", model:"retro 11", color:"white and red", precio:226990};
const catalogo = [zap1,zap2,zap3,zap4,zap5];

catalogo.forEach(zap => {
  console.log(`Type: ${zap.type}`);
  console.log(`Model: ${zap.model}`);
  console.log(`Color: ${zap.color}`);
  console.log(`Precio: ${zap.precio}`);
  console.log('----------------------');
});

function retail_C(zap, f_pago) {
  var des = 0;
  if (f_pago === "efectivo") {
    des = zap.precio*0.95;
  } else if (f_pago === "credito") {
    des = zap.precio*0.85;
  } else if (f_pago === "debito") {
    des = zap.precio*0.90;
  } else {
    console.log("no hay descuento: "+ zap.precio);
    return;
  }
  // console.log(`El precio con descuento para el modelo ${zap.model} es de ${des} pesos.`);
}


function calcularCostoEnvio(distancia) {
  const costoPorKm = 1500; // costo por kilómetro
  const distanciaKm = distancia / 1000; // convertir la distancia de metros a kilómetros
  const costoEnvio = costoPorKm * distanciaKm;
  
  return costoEnvio;
}

const comuna=["lo prado","la deesa","cerro navia","vitacura","maipu","pudahuel"]

console.log("listado de comunas disponibles para envio");

comuna.forEach(comuna =>{
  console.log([comuna]);
})

const distanciaEnvio="lo prado";
// const distanciaEnvio = prompt("¿A qué comuna lo quieres enviar?"); // 10 km en metros
switch (distanciaEnvio) {
  case 'lo prado':
    const km1 = 1000;
    const costoTotalEnvio1 = calcularCostoEnvio(km1);
    console.log("El costo de envío es de: " + costoTotalEnvio1 +" a lo prado"); // debería imprimir el costo correspondiente
    break;
  case 'la deesa':
    const km2 = 8600;
    const costoTotalEnvio2 = calcularCostoEnvio(km2);
    console.log("El costo de envío es de: " + costoTotalEnvio2+" a la deesa"); // debería imprimir el costo correspondiente
    break;
  case 'cerro navia':
    const km3 = 5200;
    const costoTotalEnvio3 = calcularCostoEnvio(km3);
    console.log("El costo de envío es de: " + costoTotalEnvio3+" a cerro navia"); // debería imprimir el costo correspondiente
    break;
  case 'vitacura':
    const km4 = 5600;
    const costoTotalEnvio4 = calcularCostoEnvio(km4);
    console.log("El costo de envío es de: " + costoTotalEnvio4+" a vitacura"); // debería imprimir el costo correspondiente
    break;
  case 'maipu':
    const km5 = 2300;
    const costoTotalEnvio5 = calcularCostoEnvio(km5);
    console.log("El costo de envío es de: " + costoTotalEnvio5+" a maipu"); // debería imprimir el costo correspondiente
    break;
  case 'pudahuel':
    const km6 = 1200;
    const costoTotalEnvio6 = calcularCostoEnvio(km6);
    console.log("El costo de envío es de: " + costoTotalEnvio6+" a pudahuel"); // debería imprimir el costo correspondiente
    break;
  default:
    console.log("Comuna no válida.");
}


retail_C(zap1, "efectivo");
retail_C(zap2, "credito");
retail_C(zap3, "debito");
retail_C(zap4, "cheque");
