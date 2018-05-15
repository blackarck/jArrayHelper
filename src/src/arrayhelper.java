/*
 * Array helper is the class to assist with ararys manupulation.
 * It extends Java Array functionality to support in array processing.
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Vivek Sharma 16-Apr-2018
 */
public class arrayhelper {

    String[] arrayh;

    public arrayhelper(String[] arrayin) {
        this.arrayh = arrayin;
    }//end of arrayhelper

    public arrayhelper() {
        //blank initialize
    }//end of arrayhelper

    //print this array
    public void printArray() {
        for (int i = 0; i < this.arrayh.length; i++) {
            System.out.println("Array out " + arrayh[i]);
        }
    }

    //print string array
    public void printsArrayIn(String[] arrayin) {
        for (int i = 0; i < arrayin.length; i++) {
            System.out.println("Array out " + arrayin[i]);
        }
    }

    //print integer array
    public void printiArrayIn(int[] arrayin) {
        for (int i = 0; i < arrayin.length; i++) {
            System.out.println("Array out " + arrayin[i]);
        }
    }

    //convert string array to int array
    public int[] stringAtointA() {
        int[] intarray = new int[this.arrayh.length];
        for (int i = 0; i < this.arrayh.length; i++) {
            intarray[i] = Integer.parseInt(arrayh[i]);
        }

        return intarray;
    }//end of stringAtointA

    //string to a string array
    public String[] stringtostringA(String inpString) {
        String[] stringout = new String[inpString.length()];
        for (int i = 0; i < inpString.length(); i++) {
            stringout[i] = inpString.substring(i + 1, 1);
        }
        return stringout;
    }

    //get the count of unique elements in the array
    public int getcountUniqueElements(String[] arrayin) {
        int count = 0;
        //System.out.println("Input array length " + arrayin.length);
        String[] uniquearray = new String[arrayin.length];

        for (int i = 0; i < arrayin.length; i++) {
            boolean find = false;
            for (int k = 0; k < arrayin.length; k++) {
                if (arrayin[i].equals(uniquearray[k])) {
                    find = true;
                    break;
                }//end of if
            }//end of loop k
            if (find) {
                //already exists do nothing
            } else {
                uniquearray[count] = arrayin[i];
                count++;

            }
        }

        return count;
    }//end of countUniqueElements

    //return occurange of an element in the string array
    public int getCountofElement(String[] arrayin, String s) {
        int count = 0;
        for (int i = 0; i < arrayin.length; i++) {
            if (s.equals(arrayin[i])) {
                count++;
            }
        }
        return count;
    }//end of getCountofElement

    //swap index of two arrays
    public void swapIndex(int i, int k, String[] arr1) {

        String tmpi1, tmpk1;
        //transfer values of i & k to temp variables
        tmpi1 = arr1[i];
        //transfer value of k to i 
        arr1[i] = arr1[k];
        //transfer value of i to k
        arr1[k] = tmpi1;
    }
}//end of class
