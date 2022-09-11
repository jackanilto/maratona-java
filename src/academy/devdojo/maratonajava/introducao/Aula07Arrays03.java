package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        int [] numeros2 = {1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println("========  SEGUNDA FORMA DE FAZER COM O MESMO RESULTADO  ========");

        int [] numeros3 = new int []{5,4,3,2,1};
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);

        }
        System.out.println("===  TERCEIRA FORMA DE FAZER COM O MESMO RESULTADO  imrime ( num )===");
        for (int num: numeros3){
            System.out.println(num);
        }
        System.out.println("========  RESULTADO DA TERCEIRA FORMA, EXEMPLO ========");

        int num = numeros3[0];
        System.out.println("Imprime a variavel na posicao 0, ou seja o numero: " + (num));
        num = numeros3[1];
        System.out.println("Imprime a variavel na posicao 0, ou seja o numero: " + (num));
    }
}
