import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveRetornarConteudoInventario(){

        Conteiner receitas = new Conteiner("Receitas",0);

        Conteiner ingredientesForja = new Conteiner("Ingredientes Forja",0);
        ItemIndividual itemF1 = new ItemIndividual("Ferro",25.0f,0.5f);
        ingredientesForja.addItem(itemF1);
        ItemIndividual itemF2 = new ItemIndividual("Aço",50.0f,1.5f);
        ingredientesForja.addItem(itemF2);

        Conteiner itensConsumiveis = new Conteiner("Consumíveis",0);
        ItemIndividual itemC1 = new ItemIndividual("Poção de Cura",10.0f,1.0f);
        itensConsumiveis.addItem(itemC1);
        ItemIndividual itemC2 = new ItemIndividual("Poção de Mana",10.0f,1.0f);
        itensConsumiveis.addItem(itemC2);
        ItemIndividual itemC3 = new ItemIndividual("Poção de Vigor",10.0f,1.0f);
        itensConsumiveis.addItem(itemC3);

        Conteiner itensCraft = new Conteiner("Craft",0);
        itensCraft.addItem(receitas);
        itensCraft.addItem(ingredientesForja);
        itensCraft.addItem(itensConsumiveis);

        Inventario inventario = new Inventario();
        inventario.setConteudoInventario(itensCraft);

        assertEquals(
                "Craft\n" +
                "Receitas\n" +
                "Ingredientes Forja\n" +
                "   Ferro ->  Valor:25.0 Peso:0.5\n" +
                "   Aço ->  Valor:50.0 Peso:1.5\n" +
                "Consumíveis\n" +
                "   Poção de Cura ->  Valor:10.0 Peso:1.0\n" +
                "   Poção de Mana ->  Valor:10.0 Peso:1.0\n" +
                "   Poção de Vigor ->  Valor:10.0 Peso:1.0\n"
                ,inventario.getConteudoDoInventario());
    }

    @Test
    void deveRetornarPesoInventario(){
        Conteiner receitas = new Conteiner("Receitas",0);

        Conteiner ingredientesForja = new Conteiner("Ingredientes Forja",0);
        ItemIndividual itemF1 = new ItemIndividual("Ferro",25.0f,0.5f);
        ingredientesForja.addItem(itemF1);
        ItemIndividual itemF2 = new ItemIndividual("Aço",50.0f,1.5f);
        ingredientesForja.addItem(itemF2);

        Conteiner itensConsumiveis = new Conteiner("Consumíveis",0);
        ItemIndividual itemC1 = new ItemIndividual("Poção de Cura",10.0f,1.0f);
        itensConsumiveis.addItem(itemC1);
        ItemIndividual itemC2 = new ItemIndividual("Poção de Mana",10.0f,1.0f);
        itensConsumiveis.addItem(itemC2);
        ItemIndividual itemC3 = new ItemIndividual("Poção de Vigor",10.0f,1.0f);
        itensConsumiveis.addItem(itemC3);

        Conteiner itensCraft = new Conteiner("Craft",0);
        itensCraft.addItem(receitas);
        itensCraft.addItem(ingredientesForja);
        itensCraft.addItem(itensConsumiveis);

        Inventario inventario = new Inventario();
        inventario.setConteudoInventario(itensCraft);
        assertEquals(5.0,inventario.getPesoInventario());
    }

    @Test
    void deveRetornarExcecaoInventarioVazio(){
        try{
            Inventario inventario = new Inventario();
            inventario.getConteudoDoInventario();
            fail();
        } catch (NullPointerException e){
            assertEquals("Inventário está vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarIventarioVazioPeso(){
        Inventario inventario = new Inventario();
        assertEquals(0, inventario.getPesoInventario());
    }

}