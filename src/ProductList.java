/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package productmanager;

import java.util.ArrayList;
import java.util.List;

public class ProductList{
    private List<Product> danhSachSanPham;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product product : danhSachSanPham) {
            result.append(product.toString()).append("\n");
        }
        return result.toString();
    }
    // Phương thức copy
    public void copyFrom(ProductList productList) {
        List<Product> copiedProducts = new ArrayList<>();

        // Sao chép danh sách sản phẩm từ productList được truyền vào
        for (Product product : productList.getDanhSachSanPham()) {
            copiedProducts.add(product.copy2()); // Sử dụng phương thức copy() của lớp Product
        }

        // Gán danh sách sao chép vào đối tượng hiện tại
        this.danhSachSanPham = copiedProducts;
    }
    public ProductList() {
        this.danhSachSanPham = new ArrayList<>();
    }
    //tìm theo ID
    public Product timSanPhamTheoID(int id) {
        for (Product product : danhSachSanPham) {
            if (product.getId() == id) {
                return product; // Trả về sản phẩm nếu tìm thấy ID tương ứng
            }
        }
        return null; // Trả về null nếu không tìm thấy sản phẩm với ID tương ứng
    }
    //Tìm theo tên
    public List<Product> timSanPhamTheoTen(String ten) {
        List<Product> ketQua = new ArrayList<>();

        for (Product product : danhSachSanPham) {
            if (product.getTitle().equalsIgnoreCase(ten)) {
                ketQua.add(product);
            }
        }

        return ketQua;
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
    //getter
    public List<Product> getDanhSachSanPham() {
        return danhSachSanPham;
    }
    public void setDanhSachSanPham(List<Product> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}

