/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */


import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Đe bai: Viet chuong trinh java nhap mot mang so nguyen a0, a1, a2, …, an-1. Hay sap xep chung theo thu tu tang dan");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // khởi tạo arr
        int[] arr = new int[n];

        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        // sắp xếp dãy số theo thứ tự tăng dần
        sort(arr);

        System.out.println("Dãy số được sắp xếp tăng dần: ");
        print(arr);
    }

    public static void sort(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
