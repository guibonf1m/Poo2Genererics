import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Pedido <K, V> {
    private Map<K, List<V>> pedidos;

    public Pedido() {
        this.pedidos = new HashMap<>();
    }

    public void adicionarPedido(K id, V item){
        pedidos.computeIfAbsent(id, k -> new ArrayList<>()).add(item);
    }

    public void removerPedido(K id){
        pedidos.remove(id);
    }

    public List<V> getItensDoPedido(K id) {
        return pedidos.getOrDefault(id, new ArrayList<>());
    }

    public int getQuantidadeTotalPedidos() {
        return pedidos.size();
    }

}
