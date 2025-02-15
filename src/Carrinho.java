import java.util.ArrayList;
import java.util.List;

public class Carrinho<T> {
    private List<T> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void removerItem(T item) {
        itens.remove(item);
    }

    public int getQuantidadeTotal() {
        return itens.size();
    }
}