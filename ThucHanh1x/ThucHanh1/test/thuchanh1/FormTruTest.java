package thuchanh1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FormTruTest {
    private FormTru formTru;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel ketQua;

    @BeforeEach
    public void setUp() {
        formTru = new FormTru();
        jTextField1 = formTru.jTextField1;
        jTextField2 = formTru.jTextField2;
        ketQua = formTru.ketQua;
    }

    @Test
    public void testValidInput() {
        jTextField1.setText("5");
        jTextField2.setText("3");
        formTru.jButton1ActionPerformed(null);
        assertEquals("2.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }


    @Test
    public void testValidRealNumberInput() {
        jTextField1.setText("4.5");
        jTextField2.setText("2.5");
        formTru.jButton1ActionPerformed(null);
        assertEquals("2.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }


    @Test
    public void testInvalidInputNonNumeric() {
        jTextField1.setText("abc");
        jTextField2.setText("2");
        formTru.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void testBothInputsNonNumeric() {
        jTextField1.setText("abc");
        jTextField2.setText("xyz");
        formTru.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void testEmptyInput() {
        jTextField1.setText("");
        jTextField2.setText("5");
        formTru.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void testWhitespaceInput() {
        jTextField1.setText(" ");
        jTextField2.setText("5");
        formTru.jButton1ActionPerformed(null);
        assertEquals("Nhập sai! ", ketQua.getText());
        assertEquals(Color.RED, ketQua.getForeground()); // Kiểm tra màu sắc vì kết quả là sai
    }

    @Test
    public void testNegativeInput() {
        jTextField1.setText("-3");
        jTextField2.setText("2");
        formTru.jButton1ActionPerformed(null);
        assertEquals("-5.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void testBothNegativeInputs() {
        jTextField1.setText("-2");
        jTextField2.setText("-4");
        formTru.jButton1ActionPerformed(null);
        assertEquals("2.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void testZeroInput() {
        jTextField1.setText("0");
        jTextField2.setText("5");
        formTru.jButton1ActionPerformed(null);
        assertEquals("-5.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }

    @Test
    public void testBothZeroInputs() {
        jTextField1.setText("0");
        jTextField2.setText("0");
        formTru.jButton1ActionPerformed(null);
        assertEquals("0.0", ketQua.getText());
        // Không cần kiểm tra màu sắc ở đây vì kết quả là đúng
    }
}
