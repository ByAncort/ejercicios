 
const zap1 = {type:"nike", model:"air force 1", color:"white", precio:109000};
const zap2 = {type:"nike", model:"air max plus", color:"black and white", precio:194990};
const zap3 = {type:"nike", model:"Go FlyEase", color:"black", precio:139990};
const zap4 = {type:"nike", model:"Air Jordan Xxxvii Rui", color:"red", precio:158990};
const zap5 = {type:"nike", model:"retro 11", color:"white and red", precio:226990};

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
  console.log(`El precio con descuento para el modelo ${zap.model} es de ${des} pesos.`);
}
function calcularCostoEnvio(distancia) {
  const costoPorKm = 1000; // costo por kilómetro
  const distanciaKm = distancia / 1000; // convertir la distancia de metros a kilómetros
  const costoEnvio = costoPorKm * distanciaKm;
  
  return costoEnvio;
}
const distanciaEnvio = 10000; // 10 km en metros
const costoTotalEnvio = calcularCostoEnvio(distanciaEnvio);
console.log("el costo de envio es de : "+costoTotalEnvio); // debería imprimir 10000



retail_C(zap1, "efectivo");
retail_C(zap2, "credito");
retail_C(zap3, "debito");
retail_C(zap4, "cheque");
