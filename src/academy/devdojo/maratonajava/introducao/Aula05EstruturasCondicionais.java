package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoCompraBebida = idade >=18;
        // !
        if (isAutorizadoCompraBebida){
            System.out.println("Autorizado a comprar");
        }else {
            System.out.println("Sem autorização para comprar bebida alcólica");
        }
        //if(isAutorizadoCompraBebida == false)   ESTA FORMA TBM ESTÁ CORRETA
        if(!isAutorizadoCompraBebida) {
            System.out.println("Sem autorização");
        }
    }
}
