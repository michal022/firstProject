package com.company;

public class Main {

    public static void main(String[] args) {
        Main result = new Main();
        result.multiply(2,3);
        System.out.println(result.multiply(-2,-6));
        Main result3 = new Main();
        System.out.println(result3.main(-4,-6));



    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int main(int x, int y) {
        Main result2 = new Main();
        return result2.multiply(x, y);
    }








}
