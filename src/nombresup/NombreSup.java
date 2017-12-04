/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombresup;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class NombreSup
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Ce programme vous Permez d’entrer un nombre \n"+
                "et le programme trouve le nombre supérieur suivant en utilisant seulement les chiffres du nombre donné\n"
                + "Veuillez saisir un nombre : ");
        int j;
        try{
            j=input.nextInt();
            while(true){
                System.out.println("Entrer "+j);
                break; 
            }
            System.out.println("Bye Bye");
        }
        catch(InputMismatchException e){
            System.out.println("il faut entre un nombre entier");
        }   
    }
}
