package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        // char '\u0000' ' '
        // boolean false
        //String null

        String [] nomes = new String[4];
        nomes[0] = "Antonio";
        nomes[1] = "Jose";
        nomes[2] = "Ailton";

        for (int i = 0; i < 4 ; i++) {
            System.out.println(nomes[i]);

        }
    }
}
