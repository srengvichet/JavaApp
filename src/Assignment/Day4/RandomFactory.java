/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day4;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class RandomFactory {
    private static Random rand;
    public static int getRandomShape(int start, int end){
        return rand.nextInt(start)+end;
    }
}
