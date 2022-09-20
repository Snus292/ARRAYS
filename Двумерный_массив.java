/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package двумерный_массив;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author georgy
 */
public class Двумерный_массив {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------- Demo arrays -----------------");
            int sum=0;
            int min=0;
            int max=0;
            int[][] arr2 =new int[10][10];
            Random random =new Random();
            for(int i = 0; i < arr2.length; i++){
                for(int j=0;j<arr2[i].length;j++){
                    arr2[i][j]=random.nextInt(100);
                    sum += arr2[i][j];
                    if(min>arr2[i][j]) min =arr2[i][j];
                    if(max<arr2[i][j]) max =arr2[i][j];
                    System.out.print(arr2[i][j]+"\t");
                    
                }
                System.out.println();
                
            }
            System.out.println("sum="+sum);
            System.out.println("max="+max);
            System.out.println("min="+min);
    }
    
}
