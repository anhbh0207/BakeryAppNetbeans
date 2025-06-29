/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bakery.app.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author WIN 10
 */
public class PanelBanHang extends javax.swing.JPanel {
    private CardLayout cardLayout;
    private JPanel panelSlotContainer;
    private JLabel lblSlot;
    private ArrayList<SlotPanel> slotPanels = new ArrayList<>();
    /**
     * Creates new form PanelBanHang
     */
    public PanelBanHang() {
        initComponents();
        
        setLayout(new BorderLayout());
        setBackground(Color.WHITE); // nền trắng

        // Header chứa nút chọn Slot
        JPanel pnlHeader = new JPanel(new BorderLayout());
        pnlHeader.setBackground(Color.WHITE);
        lblSlot = new JLabel("Slot 1", SwingConstants.CENTER);
        lblSlot.setFont(new Font("Arial", Font.BOLD, 18));
        pnlHeader.add(lblSlot, BorderLayout.NORTH);

        JPanel pnlSlotButtons = new JPanel(new GridLayout(1, 5, 10, 10));
        pnlSlotButtons.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlSlotButtons.setBackground(Color.WHITE);

        cardLayout = new CardLayout();
        panelSlotContainer = new JPanel(cardLayout);
        panelSlotContainer.setBackground(Color.WHITE);

        // Tạo 5 slot
        for (int i = 1; i <= 5; i++) {
            int index = i;
            JButton btnSlot = new JButton("Slot " + i);
            btnSlot.setBackground(new Color(200, 220, 240));
            btnSlot.setFont(new Font("Arial", Font.PLAIN, 14));
            pnlSlotButtons.add(btnSlot);

            SlotPanel slotPanel = new SlotPanel(index);
            panelSlotContainer.add(slotPanel, "slot" + i);
            slotPanels.add(slotPanel);

            btnSlot.addActionListener(e -> {
                cardLayout.show(panelSlotContainer, "slot" + index);
                lblSlot.setText("Slot " + index);
            });
        }

        pnlHeader.add(pnlSlotButtons, BorderLayout.CENTER);
        add(pnlHeader, BorderLayout.NORTH);
        add(panelSlotContainer, BorderLayout.CENTER);

        cardLayout.show(panelSlotContainer, "slot1");
    }

    // SlotPanel đại diện cho 1 slot bán hàng
    private static class SlotPanel extends JPanel {
        JTextField txtTen, txtSDT, txtDiaChi;
        JTable table;
        DefaultTableModel model;

        public SlotPanel(int slotNumber) {
            setLayout(new BorderLayout(10, 10));
            setBackground(Color.WHITE);
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            // Panel nhập thông tin khách hàng
            JPanel panelInfo = new JPanel(new GridLayout(1, 6, 10, 10));
            panelInfo.setBackground(Color.WHITE);
            txtTen = new JTextField();
            txtSDT = new JTextField();
            txtDiaChi = new JTextField();

            panelInfo.add(new JLabel("Tên khách hàng"));
            panelInfo.add(txtTen);
            panelInfo.add(new JLabel("SĐT"));
            panelInfo.add(txtSDT);
            panelInfo.add(new JLabel("Địa chỉ"));
            panelInfo.add(txtDiaChi);

            // Bảng giỏ hàng
            model = new DefaultTableModel(new Object[]{"Mã phiếu", "Bánh", "Đơn giá", "Giảm giá", "Số lượng", "Thành tiền"}, 0);
            table = new JTable(model);
            JScrollPane scroll = new JScrollPane(table);
            scroll.setPreferredSize(new Dimension(800, 300));

            // Nút Thêm bánh và Thanh toán
            JPanel panelButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            panelButtons.setBackground(Color.WHITE);
            JButton btnAdd = new JButton("➕ Thêm bánh");
            JButton btnPay = new JButton("✅ Thanh toán");
            panelButtons.add(btnAdd);
            panelButtons.add(btnPay);

            // Hành động nút
            btnAdd.addActionListener(e -> {
                model.addRow(new Object[]{"HD" + (model.getRowCount() + 1), "Bánh mì", 30000, 0, 1, 30000});
            });

            btnPay.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Thanh toán thành công cho Slot " + slotNumber);
                model.setRowCount(0);
                txtTen.setText("");
                txtSDT.setText("");
                txtDiaChi.setText("");
            });

            // Thêm vào layout
            add(panelInfo, BorderLayout.NORTH);
            add(scroll, BorderLayout.CENTER);
            add(panelButtons, BorderLayout.SOUTH);
        }
    }
public static void main(String[] args) {
        JFrame frame = new JFrame("Bán Hàng");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PanelBanHang());
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSlot1 = new javax.swing.JButton();
        btnSlot2 = new javax.swing.JButton();
        btnSlot3 = new javax.swing.JButton();
        btnSlot4 = new javax.swing.JButton();
        btnSlot5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelSlotCards = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSlot1.setText("Slot 1");
        btnSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlot1ActionPerformed(evt);
            }
        });

        btnSlot2.setText("Slot 2");

        btnSlot3.setText("Slot 3");
        btnSlot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlot3ActionPerformed(evt);
            }
        });

        btnSlot4.setText("Slot 4");

        btnSlot5.setText("Slot 5");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Slot");

        jLabel3.setText("SĐT");

        jLabel4.setText("Địa chỉ");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên khách hàng");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Bánh", "Đơn giá", "Giảm giá", "Số lượng", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelSlotCardsLayout = new javax.swing.GroupLayout(panelSlotCards);
        panelSlotCards.setLayout(panelSlotCardsLayout);
        panelSlotCardsLayout.setHorizontalGroup(
            panelSlotCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSlotCardsLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(panelSlotCardsLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSlotCardsLayout.setVerticalGroup(
            panelSlotCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSlotCardsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelSlotCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelSlotCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSlot3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSlot4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSlot5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelSlotCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSlot1ActionPerformed

    private void btnSlot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlot3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSlot3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSlot1;
    private javax.swing.JButton btnSlot2;
    private javax.swing.JButton btnSlot3;
    private javax.swing.JButton btnSlot4;
    private javax.swing.JButton btnSlot5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelSlotCards;
    // End of variables declaration//GEN-END:variables
}
