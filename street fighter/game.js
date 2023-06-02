const canvas = document.getElementById("gameCanvas");
const ctx = canvas.getContext("2d");

// Personaje
const player1 = {
    x: 100,
    y: 400,
    width: 100,
    height: 200,
    color: "blue",
    speed: 5,
    health: 100
};

// Ataque
const attack = {
    name: "Punch",
    damage: 10
};

// Botón de ataque
const attackButton = document.getElementById("attackButton");
attackButton.addEventListener("click", () => {
    player1.health -= attack.damage;
    updateHealthBar();
    console.log(`Player 1 recibió un ataque de ${attack.name} y ahora tiene ${player1.health} de vida.`);
});

// Actualizar barra de vida
function updateHealthBar() {
    const healthBar = document.getElementById("healthBar");
    const healthPercentage = (player1.health / 100) * 100;
    healthBar.style.width = `${healthPercentage}%`;
}

// Bucle de juego
function gameLoop() {
    draw();
    requestAnimationFrame(gameLoop);
}

// Dibujar jugador
function draw() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    // Dibujar personaje
    
    // Dibujar barra de vida
    updateHealthBar();
}

gameLoop();
