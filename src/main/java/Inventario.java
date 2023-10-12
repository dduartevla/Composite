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

    public double getPesoInventario(){
        if(this.item ==null){
            return 0.0f;
        }
        return this.item.getPesoInventario();
    }
}
