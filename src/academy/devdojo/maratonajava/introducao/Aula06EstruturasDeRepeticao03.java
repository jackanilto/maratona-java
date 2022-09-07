package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numero de um dado valor ex: 50
    public static void main(String[] args) {
        int countMax = 50;
        for (int i = 0; i <= countMax ; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}

