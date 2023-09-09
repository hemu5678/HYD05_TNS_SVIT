package com.svit.daythree.functionexample;

public class FunctionExample {
	public int max(int x, int y)
    {
        if(x>y){
            return x;
        }
        else  {
        return y;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FunctionExample obj = new FunctionExample();
        int num = obj.max(5, 6); // FUNCTION CALL
        System.out.println("Max value is: "+num);
    }
    
}
//user-defined methods
