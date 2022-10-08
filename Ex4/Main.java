import java.util.List;

public class Main {

    public static void testaEx4(){
        List<Integer> listaCabos = List.of(1,2,3,5,11,9,4,7);
        int distancia = 45;

        Cabos cabos = new Cabos(listaCabos);

        Integer valor = cabos.menorCustoDeConexao(distancia);

        System.out.println("O menor custo de conexão é: " + valor);
    }

    public static void main(String[] args) {
        Main.testaEx4();
    }
}