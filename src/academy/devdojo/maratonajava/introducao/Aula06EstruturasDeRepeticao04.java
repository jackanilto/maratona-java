package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double ValorDoCarro = 30000.00;
        for (int numeroDeParcelas = 1; numeroDeParcelas <= ValorDoCarro ; numeroDeParcelas++) {
            double valorDaParcela = ValorDoCarro / numeroDeParcelas;
            if (valorDaParcela < 1000){
                break;
            }
                System.out.println("Você irá pagar: "+numeroDeParcelas+ " de R$: "+valorDaParcela);
            }
        }
     //   double valorDoCarro = 23500;
     //   for (int numeroParcelas = 1; numeroParcelas <= valorDoCarro; numeroParcelas++) {
     //       double valorParcela = valorDoCarro / valorParcela;
     //       if (valorParcela >= 1000) ;
     //       {
     //           System.out.println(valorParcela);
//
     //       }
//
     //   }
    }

