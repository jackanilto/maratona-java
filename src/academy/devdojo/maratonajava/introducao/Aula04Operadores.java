package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +    -    /   *
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero2 / numero1;
        System.out.println(resultado);

        //Resto  %
        int resto = 21 % 7;
        System.out.println(resto);

        /*operadores lógicos
        < menor     >  maior   <= menor igual
        >= maior igual    == giaul   != diferente
         */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);
    }
}
