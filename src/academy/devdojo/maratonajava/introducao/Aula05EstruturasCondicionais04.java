package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    //  € 0 - 19.982	    36,55%*	€ 7.303
    //  € 33.792 - 67.072	40,80%	€ 13.578
    //  € 67.073+       	52%

    public static void main(String[] args) {

        double salario = 19.992;
        double taxa1 = 36.55 / 100;
        double taxa2 = 40.80 / 100;
        double taxa3 = 52.00 / 100;
        double taxaAnual;

        //   String taxaAnual = "";
        if (salario <= 19982) {
            taxaAnual = salario * taxa1;
        } else if (salario >= 19982 && salario <= 33791) {
            taxaAnual = salario * taxa2; // salario = salario * taxa3;
        } else {
            taxaAnual = salario * taxa3; // salario = salario * taxa3;
        }
        System.out.println("Valor da taxa anual: " + taxaAnual);

    }
}
