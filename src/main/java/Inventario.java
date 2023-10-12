public class Inventario {

    private Item item;

    public void setConteudoInventario(Item item){
        this.item=item;
    }

    public String getConteudoDoInventario(){
        if (this.item == null){
            throw new NullPointerException("Inventário está vazio");
        }
        return this.item.getConteudoInventario();
    }
}
