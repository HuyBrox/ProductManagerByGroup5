/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
public class OctanNumber {
    public OctanNumber() {
        // TODO Auto-generated constructor stub
    }

    public void fourNumber() {
        int decimal = 0;
        for (int i = 0; i < 4096; i++) {
            System.out.println(Integer.toOctalString(i) + "\t" + decimal);
            decimal++;
        }
    }

    public static void main(String a[]) {
        OctanNumber oc = new OctanNumber();
        System.out.println("Octan\tDecimal");
        oc.fourNumber();
    }
}