package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //While, do while, for
        // MINHA SOLUÇÃO
           int count = 1; // Iniciando com 0 irá contar os pares / com 1 irá contar os impares
           while (count < 1000000) {
               System.out.println(count += 2);
           }


        //   //SOLUÇÃO DO PROFESSOR
        //   for (int i = 0; i <= 1000000; i += 2) {
        //       System.out.println(i);
        //   }

        // MAIS UMA SOLUÇÃO
        //    for (int i=0; i <= 1000000 && i % 2 == 0; i++) {
        //        System.out.println(i++);
        //    }

        // MAIS UMA SOLUÇÃO
        //   for (int i = 0; i < 1000000; i++) {
        //       System.out.println(i++);
        //   }


        // MAIS UMA SOLUÇÃO
        //int i = 0;
        //while (i <= 1000000) {
        //    if (i % 2 == 0) {
        //        System.out.println(i++);
        //    } else {
        //        i++;
        //     }
        // }

    }
}


