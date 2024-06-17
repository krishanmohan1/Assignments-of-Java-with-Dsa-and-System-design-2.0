/*    1. Write a program to demonstrate method overloading with 3 different parameters.

 */

public class Problem_1 {

    static int add(int n1 , int n2){
       int res =  n1+n2;
       return res;


    }
    static int add(int n1 , int n2, int n3){
        int res =  n1+n2+n3;
        return res;


    }
    static char  add(char  n1 , char n2){
        int  res = (char) n1+n2;
        return(char) res;


    }
    static byte add(byte  n1 , byte n2){
        int res =  n1+n2;
        return (byte) res;


    }

    public static void main(String[] args) {
      int res =  add(2,6);
        System.out.println(res);
        int res1=add('A','B');
        System.out.println(res1);


    }

}
