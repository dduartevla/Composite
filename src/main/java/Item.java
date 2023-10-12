public abstract class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor){
        this.nome= nome;
        this.valor=valor;
    }

    public String getNome(){
        return this.nome;
    }

    public double getValor(){
        return this.valor;
    }

    public abstract String getConteudoInventario();
}
