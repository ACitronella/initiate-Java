/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author User
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {5, 15, 486, 4842, 11471};//Binary Search can be use with sorted array only!
        
        System.out.println("index that you wanted : " + Search(array, 41842, array.length));
        
    }
    
    public static int Search(int[] array, int target, int length){//output -1 if there is no target in array
        int left = 0, right = length-1, index = -1, mid ;//middle of array
        while(left < right){
            mid = (int) Math.floor((left+right)/2);
            if(target < array[mid]){          
                right = mid-1;
            }
            else if(target > array[mid]){
                 left = mid+1;
            }
            else{
                index = mid;
            }
        }
        return index;
    }
    
}
