// Gera um número aleatório entre 1 e 10
const numeroSecreto = Math.floor(Math.random() * 10) + 1;

function verificarPalpite() {
    const palpite = document.getElementById("palpite").value;
    const resultado = document.getElementById("resultado");

    if (palpite == numeroSecreto) {
        resultado.innerHTML = "🎉 Parabéns! Você acertou!";
        resultado.style.color = "green";
    } else if (palpite < numeroSecreto) {
        resultado.innerHTML = "O número é maior. Tente novamente!";
        resultado.style.color = "red";
    } else {
        resultado.innerHTML = "O número é menor. Tente novamente!";
        resultado.style.color = "red";
    }
}