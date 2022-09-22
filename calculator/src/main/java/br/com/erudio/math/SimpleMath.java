package br.com.erudio.math;

public class SimpleMath {

    public Double average(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo)/2;
    }

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double difference(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double multiply(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double squaredRoot(Double numberOne){
        return Math.pow(numberOne,0.5);
    }
}
