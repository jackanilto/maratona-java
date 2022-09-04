package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar =" Eu vou daor 500 pro DevDojo";
        String mensagemNaoVouDoar ="Ainda nao posso doar";
        String resultado;
      if (salario > 5000){
          resultado = mensagemDoar;
      }else {
          resultado = mensagemNaoVouDoar;
      }

        System.out.println(resultado);
    }
}
