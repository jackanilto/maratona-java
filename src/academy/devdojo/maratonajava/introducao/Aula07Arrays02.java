package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        // char '\u0000' ' '
        // boolean false
        //String null

        System.out.println("++++++++++++++Exercicio 01 +++++++++++++++++");

        String[] nomes = new String[4];
        nomes[0] = "Antonio";
        nomes[1] = "Jose";
        nomes[2] = "Ailton";
        //  nomes[3] = "Ailto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("++++++++++++++Exercicio 02 +++++++++++++++++");


        int[] idadeCadastrados = {100, 200, 300, 400};
        int[] idades = new int[4];
        int i;
        for (i = 0; i < idades.length; i++) {
            idades[i] = idadeCadastrados[i];
            System.out.println(idades[i]);
        }

    }
}
