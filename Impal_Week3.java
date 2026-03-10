/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impal_week3;

import java.util.Scanner;

/**
 *
 * @author fakhrinurramdhani
 */
public class Impal_Week3 {

    public static void main(String[] args) {
        int addFee,computerAmount;
        int peripheral;
        double baseFee;
        boolean businessHour,pickup;
        
        
        Scanner input = new Scanner(System.in);
        
        computerAmount = input.nextInt();
        peripheral = input.nextInt();
        businessHour = input.nextBoolean();
        pickup = input.nextBoolean();
        
        baseFee = 0;
        if (computerAmount == 1 || computerAmount == 2){
            baseFee = 50;
            addFee = 0;
        }else if (computerAmount >= 3 && computerAmount <= 10){
            baseFee = 100;
            addFee = 10 * peripheral;
        }else if (computerAmount > 10){
            baseFee = 500;
            addFee = 10 * peripheral;
        }
        
        if(!businessHour){
            baseFee = 2 * baseFee;
        }
        
        if (pickup){
            baseFee = baseFee / 2;
        }
    }
}
