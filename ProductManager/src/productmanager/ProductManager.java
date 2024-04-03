/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productmanager;

/**
 *
 * @author huytr
 */
public class ProductManager {
    public static void main(String[] args) {
        // Tạo danh sách sản phẩm
        ProductList productList = new ProductList();

        // Thêm sản phẩm vào danh sách
        productList.themSanPham(new Product(1, "iPhone 9", "An apple mobile which is nothing like apple", 549, 12.96, 4.69, 94, "Apple", "smartphones"));
        productList.themSanPham(new Product(2, "iPhone X", "SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...", 899, 17.94, 4.44, 34, "Apple", "smartphones"));
        productList.themSanPham(new Product(3, "Samsung Universe 9", "Samsung's new variant which goes beyond Galaxy to the Universe", 1249, 15.46, 4.09, 36, "Samsung", "smartphones"));
        productList.themSanPham(new Product(4, "OPPOF19", "OPPO F19 is officially announced on April 2021.", 280, 17.91, 4.3, 123, "OPPO", "smartphones"));
        productList.themSanPham(new Product(5, "Huawei P30", "Huawei’s re-badged P30 Pro New Edition was officially unveiled yesterday in Germany and now the device has made its way to the UK.", 499, 10.58, 4.09, 32, "Huawei", "smartphones"));
        productList.themSanPham(new Product(6, "MacBook Pro", "MacBook Pro 2021 with mini-LED display may launch between September, November", 1749, 11.02, 4.57, 83, "Apple", "laptops"));
        productList.themSanPham(new Product(7, "Samsung Galaxy Book", "Samsung Galaxy Book S (2020) Laptop With Intel Lakefield Chip, 8GB of RAM Launched", 1499, 4.15, 4.25, 50, "Samsung", "laptops"));
        productList.themSanPham(new Product(8, "Microsoft Surface Laptop 4", "Style and speed. Stand out on HD video calls backed by Studio Mics. Capture ideas on the vibrant touchscreen.", 1499, 10.23, 4.43, 68, "Microsoft Surface", "laptops"));
        productList.themSanPham(new Product(9, "Infinix INBOOK", "Infinix Inbook X1 Ci3 10th 8GB 256GB 14 Win10 Grey – 1 Year Warranty", 1099, 11.83, 4.54, 96, "Infinix", "laptops"));
        productList.themSanPham(new Product(10, "HP Pavilion 15-DK1056WM", "HP Pavilion 15-DK1056WM Gaming Laptop 10th Gen Core i5, 8GB, 256GB SSD, GTX 1650 4GB, Windows 10", 1099, 6.18, 4.43, 89, "HP Pavilion", "laptops"));
        productList.themSanPham(new Product(11, "perfume Oil", "Mega Discount, Impression of Acqua Di Gio by GiorgioArmani concentrated attar perfume Oil", 13, 8.4, 4.26, 65, "Impression of Acqua Di Gio", "fragrances"));
        productList.themSanPham(new Product(12, "Brown Perfume", "Royal_Mirage Sport Brown Perfume for Men & Women - 120ml", 40, 15.66, 4, 52, "Royal_Mirage", "fragrances"));
        productList.themSanPham(new Product(13, "Fog Scent Xpressio Perfume", "Product details of Best Fog Scent Xpressio Perfume 100ml For Men cool long lasting perfumes for Men", 13, 8.14, 4.59, 61, "Fog Scent Xpressio", "fragrances"));
        productList.themSanPham(new Product(14, "Non-Alcoholic Concentrated Perfume Oil", "Original Al Munakh® by Mahal Al Musk | Our Impression of Climate | 6ml Non-Alcoholic Concentrated Perfume Oil", 120, 15.6, 4.21, 114, "Al Munakh", "fragrances"));
        productList.themSanPham(new Product(15, "Eau De Perfume Spray", "Genuine Al-Rehab spray perfume from UAE/Saudi Arabia/Yemen High Quality", 30, 10.99, 4.7, 105, "Lord - Al-Rehab", "fragrances"));
        productList.themSanPham(new Product(16, "Hyaluronic Acid Serum", "L'Oréal Paris introduces Hyaluron Expert Replumping Serum formulated with 1.5% Hyaluronic Acid", 19, 13.31, 4.83, 110, "L'Oreal Paris", "skincare"));
        productList.themSanPham(new Product(17, "Tree Oil 30ml", "Tea tree oil contains a number of compounds, including terpinen-4-ol, that have been shown to kill certain bacteria,", 12, 4.09, 4.52, 78, "Hemani Tea", "skincare"));
        productList.themSanPham(new Product(18, "Oil Free Moisturizer 100ml", "Dermive Oil Free Moisturizer with SPF 20 is specifically formulated with ceramides, hyaluronic acid & sunscreen.", 40, 13.1, 4.56, 88, "Dermive", "skincare"));
        productList.themSanPham(new Product(19, "Skin Beauty Serum.", "Product name: rorec collagen hyaluronic acid white face serum riceNet weight: 15 m", 46, 10.68, 4.42, 54, "ROREC White Rice", "skincare"));
        productList.themSanPham(new Product(20, "Freckle Treatment Cream- 15gm", "Fair & Clear is Pakistan's only pure Freckle cream which helpsfade Freckles, Darkspots and pigments. Mercury level is 0%, so there are no side effects.", 70, 16.99, 4.06, 140, "Fair & Clear", "skincare"));
        productList.themSanPham(new Product(21, "- Daal Masoor 500 grams", "Fine quality Branded Product Keep in a cool and dry place", 20, 4.81, 4.44, 133, "Saaf & Khaas", "groceries"));
        productList.themSanPham(new Product(22, "Elbow Macaroni - 400 gm", "Product details of Bake Parlor Big Elbow Macaroni - 400 gm", 14, 15.58, 4.57, 146, "Bake Parlor Big", "groceries"));
        productList.themSanPham(new Product(23, "Orange Essence Food Flavou", "Specifications of Orange Essence Food Flavour For Cakes and Baking Food Item", 14, 8.04, 4.85, 26, "Baking Food Items", "groceries"));
        productList.themSanPham(new Product(24, "cereals muesli fruit nuts", "original fauji cereal muesli 250gm box pack original fauji cereals muesli fruit nuts flakes breakfast cereal break fast faujicereals cerels cerel foji fouji", 46, 16.8, 4.94, 113, "fauji", "groceries"));
        productList.themSanPham(new Product(25, "Gulab Powder 50 Gram", "Dry Rose Flower Powder Gulab Powder 50 Gram • Treats Wounds", 70, 13.58, 4.87, 47, "Dry Rose", "groceries"));
        productList.themSanPham(new Product(26, "Plant Hanger For Home", "Boho Decor Plant Hanger For Home Wall Decoration Macrame Wall Hanging Shelf", 41, 17.86, 4.08, 131, "Boho Decor", "home-decoration"));
        productList.themSanPham(new Product(27, "Flying Wooden Bird", "Package Include 6 Birds with Adhesive Tape Shape: 3D Shaped Wooden Birds Material: Wooden MDF, Laminated 3.5mm", 51, 15.58, 4.41, 17, "Flying Wooden", "home-decoration"));
        productList.themSanPham(new Product(28, "3D Embellishment Art Lamp", "3D led lamp sticker Wall sticker 3d wall art light on/off button cell operated (included)", 20, 16.49, 4.82, 54, "LED Lights", "home-decoration"));
        productList.themSanPham(new Product(29, "Handcraft Chinese style", "Handcraft Chinese style art luxury palace hotel villa mansion home decor ceramic vase with brass fruit plate", 60, 15.34, 4.44, 7, "luxury palace", "home-decoration"));
        productList.themSanPham(new Product(30, "Key Holder", "Attractive DesignMetallic materialFour key hooksReliable & DurablePremium Quality", 30, 2.92, 4.92, 54, "Golden", "home-decoration"));

        // In thông tin sản phẩm
        productList.hienThiSanPham();
    }
}
   