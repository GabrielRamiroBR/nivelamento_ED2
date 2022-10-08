public class Main {

    public static void testaEx6(){
        ListaCircularDuplamente lista = new ListaCircularDuplamente();
        lista.insere(1);
        lista.insere(2);
        lista.insere(3);
        lista.insere(4);
        lista.insere(5);
        lista.insere(6);
        lista.insere(7);
        System.out.println(lista.noDOMeio());
    }

    public static void main(String[] args) {
        Main.testaEx6();
    }
}