package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double ValorDoCarro = 30000.00;
        for (int numeroDeParcelas = (int) ValorDoCarro; numeroDeParcelas >= 1; numeroDeParcelas--) {
            double valorDaParcela = ValorDoCarro / numeroDeParcelas;
            if (valorDaParcela < 1000) {
                continue;
            }
            System.out.println("Você irá pagar: " + numeroDeParcelas + " de R$: " + valorDaParcela);
        }

    }
}

