import readline from 'node:readline/promises';
const rl = readline.createInterface({ input: process.stdin, output: process.stdout });
async function pedirPositivo(msg){
  while(true){
    const v = Number(await rl.question(msg));
    if(!Number.isNaN(v) && v > 0) return v;
    console.log('Introduce un número positivo');
  }
}
const base = await pedirPositivo('Base: ');
const altura = await pedirPositivo('Altura: ');
console.log('Área =', base*altura);
rl.close();