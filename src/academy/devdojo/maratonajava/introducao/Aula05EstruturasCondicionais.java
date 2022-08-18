package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
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
