/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
public class Hexa {
    public void fourNumber() {
        char[] d = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        for (int i = 0; i < 16 * 16 * 16 * 16; i++) {
            int decimal = convertToDecimal(i, d);
            System.out.println(i + "\t" + decimal);
        }
    }

    private int convertToDecimal(int number, char[] hexValues) {
        int decimal = 0;
        int power = 0;

        while (number > 0) {
            int digit = number % 16;
            decimal += digit * Math.pow(16, power);
            power++;
            number /= 16;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Hexa oc = new Hexa();
        System.out.println("Hexa\tDecimal");
        oc.fourNumber();
    }
}
