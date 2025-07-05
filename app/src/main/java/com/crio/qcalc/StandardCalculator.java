package com.crio.qcalc;

public class StandardCalculator {
    private int result;
public int getResult(){
    return result;
}    
private void setResult(int result) {

    this.result = result;

 }

    //nfkdshfk
public  void  add(int num1, int num2){
    int n=num1+num2;
    setResult(n);
    System.out.println(n);

}


public  void  subtract(int num1, int num2){
    int n=num1-num2;
    setResult(n);
    System.out.println(n);


}


public  void  multiply(int num1, int num2){
    int n=num1*num2;
    setResult(n);
    System.out.println(n);


}


public void  divide(int num1, int num2){
    int n=num1/num2;
    setResult(n);
    System.out.println(n);


}


    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    
public void clearResult(){
    result=0;
}

public void printResult()
{
System.out.print(getResult());
}





}