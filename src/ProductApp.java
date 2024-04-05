/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package productmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huytr
 */
public class ProductApp extends javax.swing.JFrame {

    private ProductList productList, productList2; // Khai báo biến productList ở đây
    
    public ProductApp() throws CloneNotSupportedException {
        initComponents();
        
        productList = new ProductList(); // Khởi tạo biến productList ở đây
        productList2 = new ProductList();
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
        
        productList2.copyFrom(productList);
        
        setTitle("Product manager");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        search2 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        search1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textId = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        texTtitle = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        textDiscountPercentage = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        textPrice = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        textRating = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        textBrand = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        textStock = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        textCategory = new javax.swing.JTextPane();
        loi1 = new javax.swing.JLabel();
        loi3 = new javax.swing.JLabel();
        loi4 = new javax.swing.JLabel();
        loi2 = new javax.swing.JLabel();
        loi5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        thongBao = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        searchDelete = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        thongBaoDelete = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        searchIdSua = new javax.swing.JTextPane();
        dataSua = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        thongBaoSua = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách sản phẩm");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Product name", "Description", "Price", "Discount Percentage", "Rating", "Stock", "Brand", "Category"
            }
        ));
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(table);

        jComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(255, 102, 0));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Thấp đến cao", "Cao đén thấp" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        btnSort.setText("Sắp xếp theo giá");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSort)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hiển thị danh sách sản phẩm", jPanel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tìm kiếm sản phẩm");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane2.setViewportView(search2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Tìm kiếm theo tên:");

        jScrollPane4.setViewportView(search1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Tìm kiếm theo ID:");

        btn2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 153, 0));
        btn2.setText("Tìm");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 153, 0));
        btn1.setText("Tìm");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        text1.setColumns(20);
        text1.setRows(5);
        jScrollPane3.setViewportView(text1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn2)
                            .addComponent(btn1))))
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(396, 396, 396))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tìm kiếm sản phẩm", jPanel2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thêm sản phẩm");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Title");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        textId.setBackground(new java.awt.Color(250, 255, 255));
        textId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(textId);

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("ID");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Description");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setBackground(new java.awt.Color(204, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Price");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel10.setBackground(new java.awt.Color(204, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("DiscountPercentage");
        jLabel10.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel11.setBackground(new java.awt.Color(204, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Rating");
        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel12.setBackground(new java.awt.Color(204, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("Stock");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setBackground(new java.awt.Color(204, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("Brand");
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel14.setBackground(new java.awt.Color(204, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("Category");
        jLabel14.setBorder(new javax.swing.border.MatteBorder(null));

        textDescription.setBackground(new java.awt.Color(250, 255, 255));
        textDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane5.setViewportView(textDescription);

        texTtitle.setBackground(new java.awt.Color(250, 255, 255));
        texTtitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane7.setViewportView(texTtitle);

        textDiscountPercentage.setBackground(new java.awt.Color(250, 255, 255));
        textDiscountPercentage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane10.setViewportView(textDiscountPercentage);

        textPrice.setBackground(new java.awt.Color(250, 255, 255));
        textPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane11.setViewportView(textPrice);

        textRating.setBackground(new java.awt.Color(250, 255, 255));
        textRating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane12.setViewportView(textRating);

        textBrand.setBackground(new java.awt.Color(250, 255, 255));
        textBrand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane13.setViewportView(textBrand);

        textStock.setBackground(new java.awt.Color(250, 255, 255));
        textStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane14.setViewportView(textStock);

        textCategory.setBackground(new java.awt.Color(250, 255, 255));
        textCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane15.setViewportView(textCategory);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        thongBao.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        thongBao.setForeground(new java.awt.Color(51, 204, 0));
        thongBao.setText("Thông báo: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(thongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(107, 107, 107)))
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                                .addComponent(jScrollPane7)
                                .addComponent(jScrollPane5)
                                .addComponent(jScrollPane11)
                                .addComponent(jScrollPane10)
                                .addComponent(jScrollPane12)
                                .addComponent(jScrollPane14)
                                .addComponent(jScrollPane13)
                                .addComponent(jScrollPane15)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loi1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loi3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loi4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loi2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loi5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loi1))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loi2)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(loi3))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loi4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(loi5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thongBao)))
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Thêm sản phẩm", jPanel3);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Xóa sản phẩm ");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane8.setViewportView(searchDelete);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nhập ID : ");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 102, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        thongBaoDelete.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        thongBaoDelete.setForeground(new java.awt.Color(51, 204, 0));
        thongBaoDelete.setText("Thông báo: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thongBaoDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jScrollPane8))
                        .addGap(44, 44, 44)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel16)
                .addGap(153, 153, 153)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jScrollPane8)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60)
                .addComponent(thongBaoDelete)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xóa Sản phẩm", jPanel4);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Title", "Description", "Price", "Discount Percentage", "Rating", "Stock", "Brand", "Category" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Sửa thông tin sản phẩm");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        jLabel19.setText("Chọn mục cần sửa");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 0));
        jLabel20.setText("Nhập ID:");

        searchIdSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane9.setViewportView(searchIdSua);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 0));
        jLabel21.setText("Nhập dữ liệu mới");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        thongBaoSua.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        thongBaoSua.setForeground(new java.awt.Color(51, 204, 0));
        thongBaoSua.setText("Thông báo: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(thongBaoSua, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dataSua, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(148, 148, 148))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataSua, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(27, 27, 27)
                .addComponent(thongBaoSua)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sửa thông tin sản phẩm", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String name = search2.getText();
        List<Product> ketQuaTimKiem = productList.timSanPhamTheoTen(name);

    if (!ketQuaTimKiem.isEmpty()) {
        // Nếu có sản phẩm được tìm thấy
        StringBuilder sb = new StringBuilder(); 

        for (Product product : ketQuaTimKiem) {

            sb.append(product.chuoiDep()).append("\n"); // Thêm dòng mới sau mỗi sản phẩm
        }

        text1.setText(sb.toString());
    } else {
        // Nếu không tìm thấy sản phẩm
        text1.setText("Không tìm thấy sản phẩm có tên: " + name); 
    }
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int id = Integer.parseInt(search1.getText());
        Product product = productList.timSanPhamTheoID(id);
        text1.setText(product.chuoiDep());
    }//GEN-LAST:event_btn1ActionPerformed

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
    List<Product> danhSachSanPham = productList.getDanhSachSanPham();
    
    // Thiết lập số hàng cho bảng
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(danhSachSanPham.size());

    // Lặp qua danh sách sản phẩm và thêm từng sản phẩm vào bảng
    for (int i = 0; i < danhSachSanPham.size(); i++) {
        Product product = danhSachSanPham.get(i);
        model.setValueAt(product.getId(), i, 0);
        model.setValueAt(product.getTitle(), i, 1);
        model.setValueAt(product.getDescription(), i, 2);
        model.setValueAt(product.getPrice(), i, 3);
        model.setValueAt(product.getDiscountPercentage(), i, 4);
        model.setValueAt(product.getRating(), i, 5);
        model.setValueAt(product.getStock(), i, 6);
        model.setValueAt(product.getBrand(), i, 7);
        model.setValueAt(product.getCategory(), i, 8);
    }
    }//GEN-LAST:event_tableAncestorAdded

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // Lấy danh sách sản phẩm từ ProductList
    List<Product> danhSachSP = productList2.getDanhSachSanPham();
    
    // Lấy chỉ mục của lựa chọn sắp xếp trong JComboBox
    int selectedIndex = jComboBox.getSelectedIndex();

    // Sắp xếp danh sách sản phẩm tùy theo lựa chọn
    switch (selectedIndex) {
        case 0 -> // Mặc định
            danhSachSP = productList.getDanhSachSanPham();
        case 1 -> // Thấp đến cao
            Collections.sort(danhSachSP, Comparator.comparing(Product::getPrice));
        case 2 -> // Cao đến thấp
            Collections.sort(danhSachSP, Comparator.comparing(Product::getPrice).reversed());
    }

    // Cập nhật bảng với danh sách sản phẩm đã được sắp xếp
        updateTable(danhSachSP);
    }

    // Phương thức để cập nhật bảng với danh sách sản phẩm đã được sắp xếp
    private void updateTable(List<Product> productList) {
        // Lấy mô hình của bảng
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Xóa hết các dòng hiện tại trong bảng
        model.setRowCount(0);

        // Thêm từng sản phẩm vào bảng
        for (Product product : productList) {
            Object[] rowData = {product.getId(), product.getTitle(), product.getDescription(),
                                product.getPrice(), product.getDiscountPercentage(), product.getRating(),
                                product.getStock(), product.getBrand(), product.getCategory()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int idMoi = Integer.parseInt(textId.getText());
        loi1.setText("");
        loi3.setText("");
        loi4.setText("");
        loi2.setText("");
        loi5.setText("");
        boolean kiemTraId = true;
        boolean kiemTraPrice = true;
        boolean kiemTraDiscountPercentage = true;
        boolean kiemTraRating = true;
        boolean kiemTraStock = true;
        for (Product product : productList.getDanhSachSanPham()) {
            if (product.getId() == idMoi) {
                // Nếu ID mới trùng với ID của một sản phẩm đã tồn tại trong danh sách
                kiemTraId = false;
                break; // Thoát khỏi vòng lặp ngay khi tìm thấy ID trùng
            }
        }
        if(!kiemTraId){
            loi1.setText("Erros! Id đã tồn tại");
        }
        String priceMoi = textPrice.getText();
        String discountPercentageMoi = textDiscountPercentage.getText();
        String ratingMoi = textRating.getText();
        String stockMoi = textStock.getText();
        double price = 0;
        double discountPercentage = 0;
        double rating = 0;
        int stock = 0;
        try {
            price = Double.parseDouble(priceMoi);
            
        } catch (NumberFormatException e) {
            kiemTraPrice = false;
            loi2.setText("Erros!");
        }
        try {
            discountPercentage = Double.parseDouble(discountPercentageMoi);
        } catch (NumberFormatException e) {
            kiemTraDiscountPercentage = false;
            loi3.setText("Erros!");
        }

        try {
            rating = Double.parseDouble(ratingMoi);
        } catch (NumberFormatException e) {
            kiemTraRating = false;
            loi4.setText("Erros!");
        }

        try {
            stock = Integer.parseInt(stockMoi);
        } catch (NumberFormatException e) {
            kiemTraStock = false;
            loi5.setText("Erros!");
        }
        if (kiemTraId && kiemTraPrice && kiemTraDiscountPercentage && kiemTraRating && kiemTraStock) {
            // Tạo sản phẩm mới và thêm vào danh sách
            Product product = new Product( idMoi, texTtitle.getText(), textDescription.getText(), price, discountPercentage, rating, stock, textBrand.getText(), textCategory.getText() );
            productList.themSanPham(product);
            productList2.themSanPham(product);
            thongBao.setText("Thông báo: Thêm sản phẩm thành công!");
        }else{
            thongBao.setText("Thông báo: Thêm sản phẩm thất bại!!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed
//Xóa sản phẩm
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String idStr = searchDelete.getText();
        boolean kiemTraIdHopLe = false;
        boolean kiemTraIdTimThay = false;

        // Kiểm tra xem id có hợp lệ không
        try {
            int id = Integer.parseInt(idStr);
            kiemTraIdHopLe = true;

            for(Product product : productList.getDanhSachSanPham()){
                if(id == product.getId()){
                    productList.xoaSanPham(product);
                    productList2.xoaSanPham(product);
                    kiemTraIdTimThay = true;
                    thongBaoDelete.setText("Thông báo: Xóa sản phẩm có ID " + id + " thành công!");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            thongBaoDelete.setText("Lỗi: ID không hợp lệ!");
        }
        
        if(!kiemTraIdTimThay && kiemTraIdHopLe){
            thongBaoDelete.setText("Thông báo: Không tìm thấy sản phẩm có ID " + idStr + " trong kho!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
//Sửa sản phẩm
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int id = Integer.parseInt(searchIdSua.getText());

            boolean timThaySanPham = false;

            for(Product product : productList.getDanhSachSanPham()){
                if(id == product.getId()){
                    timThaySanPham = true;

                    String selectedField = (String) jComboBox1.getSelectedItem();
                    double newValue = 0.0; 
                    String newInfo = ""; 
                    int newValue2 = 0;

                    switch(selectedField) {
                        case "ID" -> {
                            try {
                                newValue2 = Integer.parseInt(dataSua.getText());
                                product.setId(newValue2);
                                thongBaoSua.setText("Sửa ID thành công!");
                            } catch(NumberFormatException e) {
                                thongBaoSua.setText("ID nhập ở text không hợp lệ!");
                            }
                        }
                        case "Title" -> {
                            newInfo = dataSua.getText(); 
                            product.setTitle(newInfo);
                            thongBaoSua.setText("Sửa Title thành công!");
                        }
                        case "Description" -> {
                            newInfo = dataSua.getText(); 
                            product.setDescription(newInfo);
                            thongBaoSua.setText("Sửa Description thành công!");
                        }
                        case "Price" -> {
                            try {
                                newValue = Double.parseDouble(dataSua.getText());
                                product.setPrice(newValue);
                                thongBaoSua.setText("Sửa Price thành công!");
                            } catch(NumberFormatException e) {
                                thongBaoSua.setText("Giá nhập không hợp lệ!");
                            }
                        }
                        case "Discount Percentage" -> {
                            try {
                                newValue = Double.parseDouble(dataSua.getText());
                                product.setDiscountPercentage(newValue);
                                thongBaoSua.setText("Sửa Discount Percentage thành công!");
                            } catch(NumberFormatException e) {
                                thongBaoSua.setText("Discount Percentage nhập không hợp lệ!");
                            }
                        }
                        case "Rating" -> {
                            try {
                                newValue = Double.parseDouble(dataSua.getText());
                                product.setRating(newValue);
                                thongBaoSua.setText("Sửa Rating thành công!");
                            } catch(NumberFormatException e) {
                                thongBaoSua.setText("Rating Percentage nhập không hợp lệ!");
                            }
                        }
                        case "Stock" -> {
                            try {
                                newValue2 = Integer.parseInt(dataSua.getText());
                                product.setStock(newValue2);
                                thongBaoSua.setText("Sửa Stock thành công!");
                            } catch(NumberFormatException e) {
                                thongBaoSua.setText("Stock nhập không hợp lệ!");
                            }
                        }
                        case "Brand" -> {
                            newInfo = dataSua.getText(); 
                            product.setBrand(newInfo);
                            thongBaoSua.setText("Sửa Brand thành công!");
                        }
                        case "Category" -> {
                            newInfo = dataSua.getText(); 
                            product.setCategory(newInfo);
                            thongBaoSua.setText("Sửa Category thành công!");
                        }
                        // Thêm các case cho các trường khác tương tự như trên
                    }
                    break; // Kết thúc vòng lặp sau khi tìm thấy sản phẩm
                }
            }

            // Kiểm tra xem sản phẩm có ID đã nhập có tồn tại không
            if(!timThaySanPham){
                thongBaoSua.setText("Thông báo: Không tìm thấy sản phẩm có ID " + id + " trong kho!");
            }
        } catch (NumberFormatException e) {
            thongBaoSua.setText("Lỗi: ID không hợp lệ!");
        }

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ProductApp().setVisible(true);
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(ProductApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSort;
    private javax.swing.JTextField dataSua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel loi1;
    private javax.swing.JLabel loi2;
    private javax.swing.JLabel loi3;
    private javax.swing.JLabel loi4;
    private javax.swing.JLabel loi5;
    private javax.swing.JTextPane search1;
    private javax.swing.JTextPane search2;
    private javax.swing.JTextPane searchDelete;
    private javax.swing.JTextPane searchIdSua;
    private javax.swing.JTable table;
    private javax.swing.JTextPane texTtitle;
    private javax.swing.JTextArea text1;
    private javax.swing.JTextPane textBrand;
    private javax.swing.JTextPane textCategory;
    private javax.swing.JTextPane textDescription;
    private javax.swing.JTextPane textDiscountPercentage;
    private javax.swing.JTextPane textId;
    private javax.swing.JTextPane textPrice;
    private javax.swing.JTextPane textRating;
    private javax.swing.JTextPane textStock;
    private javax.swing.JLabel thongBao;
    private javax.swing.JLabel thongBaoDelete;
    private javax.swing.JLabel thongBaoSua;
    // End of variables declaration//GEN-END:variables
}
