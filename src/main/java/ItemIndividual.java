public class ItemIndividual extends Item{

    private double peso;

    public ItemIndividual(String nome, double valor, double peso){
        super(nome,valor);
        this.peso=peso;
    }


    @Override
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getConteudoInventario(){
        return "Item: " + this.getNome()
                + "Valor: " + this.getValor()
                + "Peso: " + this.peso + "\n";
    }
}
