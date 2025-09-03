/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo_media;

/**
 *
 * @author Karllus
 */
public class Calculo_media {

   
     
    public static void main(String[] args) {
        calucloMedia();
    }
    
    public static void calucloMedia(){
        long Nota1 = 10;
        long Nota2 = 8;
        double Nota3 = 6.5;
        long Nota4 = 9;
        
        
        double Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
        
        System.out.println(Media);
        
    }
}
