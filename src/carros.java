import static java.lang.IO.*;

void main() {

    String[] selecoes = {"Brasil" , "Alemanha" , "Espanha" , "Italia", "Congo"};
    println(selecoes[0]); // imprimir um elemento do Array
    println(selecoes[1]);
    println(selecoes[2]);
    println(selecoes[3]);
    println(selecoes[4]);

    println("------------");
    selecoes[0] = "França"; // alterando o primeiro elemento do Array
    println(selecoes[0]); // imprimir um elemento do Array

    selecoes[4] = "Russia";
    println(selecoes[4]);

    // criando um Array vazio, é necessario especificar o numero de elementos!!
    String[] carros = new String[4];

    // ========================================================
    // DESAFIO RESOLVIDO ABAIXO
    // ========================================================

    println("------------");
    println("Por favor, digite o nome de 4 carros:");

    // Preenchendo o Array com a entrada do usuário usando readln()
    print("Digite o 1º carro: ");
    carros[0] = readln();

    print("Digite o 2º carro: ");
    carros[1] = readln();

    print("Digite o 3º carro: ");
    carros[2] = readln();

    print("Digite o 4º carro: ");
    carros[3] = readln();

    println("------------");
    println("Lista de carros cadastrados:");

    // Imprimindo a lista com a numeração de 1 a 4
    println("1. " + carros[0]);
    println("2. " + carros[1]);
    println("3. " + carros[2]);
    println("4. " + carros[3]);
}