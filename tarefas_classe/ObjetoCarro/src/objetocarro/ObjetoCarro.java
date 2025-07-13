
package objetocarro;

/**
 *
 * @author Karllus
 */

//Classe que representa um carro, contendo atribudos e métodos.
public class ObjetoCarro {
    private String marca;
    private String modelo;
    private Boolean ligado;

    /*public static void main(String[] args) {
        
    }*/
    public ObjetoCarro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }
    
    
    public void ligar(){
        ligado = true;
        System.out.println(marca + " " + modelo + "esta ligado.");
    }
    
    public void desligar(){
        ligado = false;
        System.out.println(marca + " " + modelo + "esta desligado.");
    }
}
