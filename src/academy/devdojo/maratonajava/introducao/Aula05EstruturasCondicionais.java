package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoCompraBebida = idade >=18;
        // !
        if (isAutorizadoCompraBebida){
            System.out.println("Autorizado a comprar");
        }
        if(isAutorizadoCompraBebida == false) {
            System.out.println("Sem autorização");
        }
    }
}
