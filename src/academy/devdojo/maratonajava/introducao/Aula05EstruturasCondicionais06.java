package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7 imprima se é o dia útil ou final de semana
        // Considerando 1 como fim de semana


        byte dia = 2;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }


        //FORMA QUE FIZ <<<<<<<<======

        // int dia = 2;
        //switch (dia) {
        //    case 1:
        //        System.out.println("Fim de Semana");
        //        break;
        //    case 2:
        //        System.out.println("Dia Útil");
        //        break;
        //    case 3:
        //        System.out.println("Dia Útil");
        //        break;
        //    case 4:
        //        System.out.println("Dia Útil");
        //        break;
        //    case 5:
        //        System.out.println("Dia Útil");
        //        break;
        //    case 6:
        //        System.out.println("Dia Útil");
        //        break;
        //    case 7:
        //        System.out.println("Fim de Semana");
        //        break;
        //    default: // cai nesta opção caso nao exista um case
        //        System.out.println("Opção dia Inválida");
        //        break;
    }
}



