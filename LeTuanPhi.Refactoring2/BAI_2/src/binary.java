/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
public class binary {
    public binary() {
        // TODO Auto-generated constructor stub
    }

    public void fourNumber() {
        int decimal = 0;
        for (int i = 0; i < 16; i++) {
            System.out.println(Integer.toBinaryString(i) + "\t" + decimal);
            decimal++;
        }
    }

    public static void main(String a[]) {
        binary oc = new binary();
        System.out.println("Binary\tDecimal");
        oc.fourNumber();
    }
}
