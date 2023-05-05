
//vectores
const vector1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const vector2 = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];
const vector5 = [1, 223, 33, 4, 5, 66, 768, 96, 160];
const vector6 = [106, 9, 68, 7, 6, 5, 46, 63, 62, 61];
const vector3 = [12, 22, 32, 4, 25, 26, 27, 8, 9, 10];
const vector4 = [10, 9, 823, 7, 26, 25, 42, 3, 22, 1];

//guardar resultados

const resultado = [];
const resultado2 = [];
const resultado3 = [];

//primera suma

for (let i = 0; i < 10; i++) {
  resultado.push(vector1[i] + vector2[i]);
}

//segunda suma

for (let i = 0; i < 10; i++) {
  resultado2.push(vector3[i] + vector4[i]);
}

//tecera summa

for (let i = 0; i < 10; i++) {
  resultado3.push(vector5[i] + vector6[i]);

}

//imprimir los valores
console.log(resultado);
console.log(resultado2);
console.log(resultado3);