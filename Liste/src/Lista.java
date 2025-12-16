public class Lista {

    private Nodo root;

    public Lista() {
        root = null;
    }
public void addHead(Nodo n){
    Nodo tmp= root;
    root = n;
    n.setNext(tmp);
}
public void remove(String s) {
    if (root == null) return;

    if (root.getValue().equals(s)) {
        root = root.getNext();
        return;
    }
public boolean exists(String s) {
    Nodo temp = root;
    while (temp != null) {
        if (temp.getValue().equals(s)) {
            return true;
        }
        temp = temp.getNext();
    }
    return false;
}
public void addAdd(String s){
    Nodo n= new Nodo(s);
    addTail(n);
}
    public void addTail(Nodo n) {
        if (root == null) {
            root = n;
        } else {
            Nodo temp = root;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
    }

    @Override
    public String toString() {
        String s = "la lista contiene: ";
        Nodo temp = root;
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s + "\n";

    }

}
