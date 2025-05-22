const rollDiceButton = document.getElementById('rollDice');
const winnerText = document.getElementById('winner');

rollDiceButton.addEventListener('click', () => {
    let maxScore = 0;
    let winner = '';
    const playerElements = document.querySelectorAll('.player');

    playerElements.forEach((player, index) => {
        const diceRoll = Math.floor(Math.random() * 6) + 1;
        const diceElement = player.querySelector('.dice');

        // Add a small animation
        diceElement.classList.add('rolling');
        setTimeout(() => {
            diceElement.textContent = `🎲 ${diceRoll}`;
            diceElement.classList.remove('rolling');
        }, 300);

        if (diceRoll > maxScore) {
            maxScore = diceRoll;
            winner = `Player ${index + 1}`;
        } else if (diceRoll === maxScore) {
            winner = 'It’s a tie!';
        }
    });

    // Delay showing the winner
    setTimeout(() => {
        winnerText.textContent = winner === 'It’s a tie!' ? winner : `${winner} Wins!`;
    }, 400);
});
