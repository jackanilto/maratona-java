package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;                                 /* Se idade = ou maior que 18 AUTORIZADO / se menor que 18 NAO*/
        boolean isAutorizadoCompraBebida = idade >=18;
        // !
        if (isAutorizadoCompraBebida){                                          /*   usando            */
            System.out.println("Autorizado a comprar");                         /*    IF               */
        }else {                                                                 /*    e ELSE           */
            System.out.println("Sem autorização para comprar bebida alcólica"); /*    Conseguimos o mesmo resultado*/
        }
        //if(isAutorizadoCompraBebida == false)   ESTA FORMA TBM ESTÁ CORRETA
        if(!isAutorizadoCompraBebida) {
            System.out.println("Sem autorização");
        }
    }
}
