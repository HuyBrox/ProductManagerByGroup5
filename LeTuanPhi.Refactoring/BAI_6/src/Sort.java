/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
public class Sort {
    int a;
    int b;
    int c;

    public void ascSort() {
        if (a > b) {
            swap(a, b);
        }
        if (a > c) {
            swap(a, c);
        }
        if (b > c) {
            swap(b, c);
        }
    }

    private void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
