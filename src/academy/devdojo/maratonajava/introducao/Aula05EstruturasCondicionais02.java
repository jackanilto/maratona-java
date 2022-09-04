package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // if
        // idade for <15 categoria Juvenil
        // idade >= 15 Infantil
        // idade >= 18 && idade < 18 categoria Juvenil
        // idade >= 18 categoria adulto
        int idade = 17;  // aqui eu poderia criar uma query consulta em uma table para extrair o valor
        if(idade< 15){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria adulto");
        }

    }
}
