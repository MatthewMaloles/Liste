public class App {
    public static void main(String[] args) throws Exception {
        Lista l= new Lista();
        l.addTail(new Nodo("Mario"));
        l.addTail(new Nodo("luigi"));
        l.addHead(new Nodo("Pedro"));

        System.out.println(l);
    }
}
