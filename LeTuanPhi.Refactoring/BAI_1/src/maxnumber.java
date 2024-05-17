/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
//public class maxnumber {
//public maxnumber() {
// TODO Auto-generated constructor stub
//}
//public int max2(int a, int b) {
//if (a >= b)
//return a;
//else
//return b;
//}
//public int max3(int a, int b, int c) {
//if (a >= b)
//if (a >= c)
//return a;
//else
//return c;
//else if (b >= c)
//return b;
//else
//return c;
//}
//}
public class maxnumber {
    public int max(int a, int b) {
        return a >= b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
