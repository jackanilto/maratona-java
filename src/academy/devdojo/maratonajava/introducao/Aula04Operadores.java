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
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // Operadores Lógicos |  && (AND)  |  || (OR)   |   ! (NOT)
        int idade = 47;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 40 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade > 40 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        // || operador OR ( ou )
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupaca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupaca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // Operadores de atribuiçao  =  +=  -=  *=  /=   %=

        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println(bonus);

    }
}
