package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nomne> morando no <endereço>,
confirmo que recebi o salário de <salario> na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Janilto Oliveira da Silva";
        String endereco = "Rua Sucena Chaia Sardela, 156 - Cehab - Itaperuna-RJ";
        double salarioDouble = 5000.25;
        String dateRecebeu = "16/08/2020";

        String relatorio = "Eu "+nome+" morando no endereço: "+endereco+" confirmo que recebi o salário de R$ "+salarioDouble+" na data: "+dateRecebeu+".";

        System.out.println(relatorio);
    }
}
