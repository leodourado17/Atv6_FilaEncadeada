package ed.tad;

public class ListaLigada {

    private No inicio;
    private No fim;

    public boolean isEmpty() {
        return inicio == null;
    }

    public boolean enqueue(No e) {
        if (e == null) return false;
        e.setProximo(null);
        if (isEmpty()) {
            inicio = fim = e;
        } else {
            fim.setProximo(e);
            fim = e;
        }
        return true;
    }

    public No dequeue() {
        if (isEmpty()) return null;
        No e = inicio;
        inicio = e.getProximo();
        e.setProximo(null);
        if (inicio == null) fim = null;
        return e;
    }

    public No getInicio() { return inicio; }
    public No getFim() { return fim; }

    // compatibilidade com código antigo
    public boolean push(No e) { return enqueue(e); }
    public No pop() { return dequeue(); }
}
