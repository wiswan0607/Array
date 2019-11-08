/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author apit
 */
public class Array2D {
    public static void main(String[] args){
        String[][] family = {{"Kartono", "Kepala Keluarga"}, {"Sriati","Istri"}, {"Ida Lutfiati", "Anak"}, {"Wahyu Iswanudin", "Anak"}};
        for(int x=0; x < family.length; x++){
            System.out.println("Nama: " + family [x][0]);
            System.out.println("Status: " + family [x][1]);
            System.out.println("--------------------------");
        }
    }    
}
