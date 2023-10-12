import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Item{

    private List<Item> itens;

    public Conteiner(String nome, double valor){
        super(nome,valor);
        this.itens = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public String getConteudoInventario(){
        String saida = "";
        saida = this.getNome() + "\n";
        for (Item item:itens){
            saida += item.getConteudoInventario();
        }
        return saida;
    }

    public double getPesoInventario(){
        double peso = 0.0;
        for (Item item:itens){
            peso += item.getPesoInventario();
        }
        return peso;
    }

}
