/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package productmanager;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> danhSachSanPham;

    public ProductList() {
        this.danhSachSanPham = new ArrayList<>();
    }

    public void themSanPham(Product sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public void xoaSanPham(Product sanPham) {
        danhSachSanPham.remove(sanPham);
    }

    public List<Product> layDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void hienThiSanPham() {
        for (Product sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }
}

