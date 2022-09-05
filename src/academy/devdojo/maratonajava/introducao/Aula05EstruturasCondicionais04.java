package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salario = 33791;
        double taxa1 = 36.55 / 100;
        double taxa2 = 40.80 / 100;
        double taxa4 = 52.00 / 100;

        String taxaAnual = "";
        if (salario >= 19982){
            taxaAnual = String.valueOf(salario * taxa1);
        } else if (salario > 19982 && salario < 33791) {
            salario *= taxa2; // salario = salario * taxa4;
        }else {
            salario *= taxa4; // salario = salario * taxa4;
        }
        System.out.println("Valor da taxa anual: "+taxaAnual);

    }
}
