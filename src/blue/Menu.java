/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blue;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Button;
import java.util.AbstractList;
import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.ComponentOrientation;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import static java.lang.constant.ConstantDescs.NULL;
import javax.swing.Icon;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    public Menu() {

        initComponents();

        USERS_JP0.setVisible(true);

        SHOWJP1.setVisible(false);
        SKHNOTHETHS_JP2.setVisible(false);
        KANALI_JP3.setVisible(false);
        PROGRAMMA_JP4.setVisible(false);
        RATINGS_JP5.setVisible(false);

        USERSJP.setBackground(Color.white);
        SHOWJP.setBackground(new Color(204, 204, 204));
        KANALIJP.setBackground(new Color(204, 204, 204));
        SKHNOTHETHSJP.setBackground(new Color(204, 204, 204));
        PROGRAMMAJP.setBackground(new Color(204, 204, 204));
        RATINGSJP.setBackground(new Color(204, 204, 204));
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        menu = new javax.swing.JPanel();
        USERSJP = new javax.swing.JPanel();
        USERSJL1 = new javax.swing.JLabel();
        SHOWJP = new javax.swing.JPanel();
        SHOWJL = new javax.swing.JLabel();
        SKHNOTHETHSJP = new javax.swing.JPanel();
        SKHNOTHETHSJL = new javax.swing.JLabel();
        KANALIJP = new javax.swing.JPanel();
        KANALIJL = new javax.swing.JLabel();
        PROGRAMMAJP = new javax.swing.JPanel();
        PROGRAMMAJL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RATINGSJP = new javax.swing.JPanel();
        RATINGSJL = new javax.swing.JLabel();
        subject = new javax.swing.JPanel();
        USERS_JP0 = new javax.swing.JPanel();
        usersjp1 = new javax.swing.JPanel();
        KANALI_Label4 = new javax.swing.JLabel();
        usersjp = new javax.swing.JPanel();
        users_ScrollPane = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();
        users_button = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        user_name = new javax.swing.JTextField();
        insert_users_button = new javax.swing.JButton();
        update_users_button = new javax.swing.JButton();
        delete_users_button = new javax.swing.JButton();
        reset_users_button = new javax.swing.JButton();
        SKHNOTHETHS_JP2 = new javax.swing.JPanel();
        KANALI_Panel1 = new javax.swing.JPanel();
        KANALI_Label1 = new javax.swing.JLabel();
        cbkanali1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        skhn = new javax.swing.JPanel();
        SKHNOTHETHS_ScrollPane = new javax.swing.JScrollPane();
        skhnotheths_table = new javax.swing.JTable();
        skhnotheths_button = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        skhnotheths_name = new javax.swing.JTextField();
        insert_skhnotheths_button = new javax.swing.JButton();
        update_skhnotheths_button = new javax.swing.JButton();
        delete_skhnotheths_button = new javax.swing.JButton();
        reset_skhnotheths_button = new javax.swing.JButton();
        skhnotheths_id = new javax.swing.JTextField();
        KANALI_JP3 = new javax.swing.JPanel();
        KANALI_Panel = new javax.swing.JPanel();
        KANALI_Label = new javax.swing.JLabel();
        cbkanali = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        KANALI_ScrollPane = new javax.swing.JScrollPane();
        KANALI_Table = new javax.swing.JTable();
        KANALI_Button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kanali_id = new javax.swing.JTextField();
        kanali_title = new javax.swing.JTextField();
        kanali_insert_Button = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        update_kanali_update = new javax.swing.JButton();
        delete_kanali_update = new javax.swing.JButton();
        digital_button = new javax.swing.JRadioButton();
        analog_button = new javax.swing.JRadioButton();
        reset_kanali_button = new javax.swing.JButton();
        PROGRAMMA_JP4 = new javax.swing.JPanel();
        usersjp3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        progr_time = new javax.swing.JTextField();
        PROGRAMMA_ScrollPane1 = new javax.swing.JScrollPane();
        PROGRAMMA_Table = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        k_id = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cbshow1 = new javax.swing.JComboBox<>();
        PROGRAMMA_Label3 = new javax.swing.JLabel();
        insert_programma_button = new javax.swing.JButton();
        update_programma_button = new javax.swing.JButton();
        delete_programma_button = new javax.swing.JButton();
        PROGRAMMA_Label5 = new javax.swing.JLabel();
        cbkanali2 = new javax.swing.JComboBox<>();
        programma_button = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        PROGRAMMA_Label1 = new javax.swing.JLabel();
        PROGRAMMA_Panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RATINGS_JP5 = new javax.swing.JPanel();
        ratings_Panel = new javax.swing.JPanel();
        KANALI_Label3 = new javax.swing.JLabel();
        cbshow = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ratings_ScrollPane = new javax.swing.JScrollPane();
        rating_Table = new javax.swing.JTable();
        ratings_Button = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        users = new javax.swing.JTextField();
        review = new javax.swing.JTextField();
        ratings_insert_Button = new javax.swing.JButton();
        update_ratings_update = new javax.swing.JButton();
        delete_ratings_update1 = new javax.swing.JButton();
        reset_ratings_button = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        rating = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        show = new javax.swing.JTextField();
        SHOWJP1 = new javax.swing.JPanel();
        SHOW_jPanel = new javax.swing.JPanel();
        KANALI_Label2 = new javax.swing.JLabel();
        cb_shows_type = new javax.swing.JComboBox<>();
        SHOW_ScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SHOW_Panel = new javax.swing.JPanel();
        pg1 = new javax.swing.JScrollPane();
        show_table = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ShowButton = new javax.swing.JButton();
        insert_show_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        update_show_button = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        show_id = new javax.swing.JTextField();
        show_title = new javax.swing.JTextField();
        show_type = new javax.swing.JTextField();
        show_skhnotheths = new javax.swing.JTextField();
        show_kanali = new javax.swing.JTextField();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        menu.setBackground(new java.awt.Color(153, 153, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                menuComponentShown(evt);
            }
        });

        USERSJP.setBackground(new java.awt.Color(204, 204, 255));
        USERSJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        USERSJP.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        USERSJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USERSJPMouseClicked(evt);
            }
        });

        USERSJL1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        USERSJL1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        USERSJL1.setText("users");

        javax.swing.GroupLayout USERSJPLayout = new javax.swing.GroupLayout(USERSJP);
        USERSJP.setLayout(USERSJPLayout);
        USERSJPLayout.setHorizontalGroup(
            USERSJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, USERSJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USERSJL1)
                .addGap(52, 52, 52))
        );
        USERSJPLayout.setVerticalGroup(
            USERSJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERSJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(USERSJL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SHOWJP.setBackground(new java.awt.Color(204, 204, 255));
        SHOWJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SHOWJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHOWJPMouseClicked(evt);
            }
        });

        SHOWJL.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        SHOWJL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SHOWJL.setText("SHOWS");

        javax.swing.GroupLayout SHOWJPLayout = new javax.swing.GroupLayout(SHOWJP);
        SHOWJP.setLayout(SHOWJPLayout);
        SHOWJPLayout.setHorizontalGroup(
            SHOWJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOWJPLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(SHOWJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SHOWJPLayout.setVerticalGroup(
            SHOWJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOWJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SHOWJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SKHNOTHETHSJP.setBackground(new java.awt.Color(204, 204, 255));
        SKHNOTHETHSJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SKHNOTHETHSJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKHNOTHETHSJPMouseClicked(evt);
            }
        });

        SKHNOTHETHSJL.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        SKHNOTHETHSJL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SKHNOTHETHSJL.setText("Creator");

        javax.swing.GroupLayout SKHNOTHETHSJPLayout = new javax.swing.GroupLayout(SKHNOTHETHSJP);
        SKHNOTHETHSJP.setLayout(SKHNOTHETHSJPLayout);
        SKHNOTHETHSJPLayout.setHorizontalGroup(
            SKHNOTHETHSJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKHNOTHETHSJPLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(SKHNOTHETHSJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SKHNOTHETHSJPLayout.setVerticalGroup(
            SKHNOTHETHSJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKHNOTHETHSJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SKHNOTHETHSJL))
        );

        KANALIJP.setBackground(new java.awt.Color(204, 204, 255));
        KANALIJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KANALIJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KANALIJPMouseClicked(evt);
            }
        });

        KANALIJL.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        KANALIJL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        KANALIJL.setText("CHANNELS");

        javax.swing.GroupLayout KANALIJPLayout = new javax.swing.GroupLayout(KANALIJP);
        KANALIJP.setLayout(KANALIJPLayout);
        KANALIJPLayout.setHorizontalGroup(
            KANALIJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KANALIJPLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(KANALIJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KANALIJPLayout.setVerticalGroup(
            KANALIJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KANALIJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KANALIJL))
        );

        PROGRAMMAJP.setBackground(new java.awt.Color(204, 204, 255));
        PROGRAMMAJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PROGRAMMAJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROGRAMMAJPMouseClicked(evt);
            }
        });

        PROGRAMMAJL.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        PROGRAMMAJL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PROGRAMMAJL.setText("DAY&TIME");

        javax.swing.GroupLayout PROGRAMMAJPLayout = new javax.swing.GroupLayout(PROGRAMMAJP);
        PROGRAMMAJP.setLayout(PROGRAMMAJPLayout);
        PROGRAMMAJPLayout.setHorizontalGroup(
            PROGRAMMAJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PROGRAMMAJPLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(PROGRAMMAJL)
                .addGap(37, 37, 37))
        );
        PROGRAMMAJPLayout.setVerticalGroup(
            PROGRAMMAJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROGRAMMAJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PROGRAMMAJL))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BLUE");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RATINGSJP.setBackground(new java.awt.Color(204, 204, 255));
        RATINGSJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RATINGSJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RATINGSJPMouseClicked(evt);
            }
        });

        RATINGSJL.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        RATINGSJL.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        RATINGSJL.setText("ratings");

        javax.swing.GroupLayout RATINGSJPLayout = new javax.swing.GroupLayout(RATINGSJP);
        RATINGSJP.setLayout(RATINGSJPLayout);
        RATINGSJPLayout.setHorizontalGroup(
            RATINGSJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RATINGSJPLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(RATINGSJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RATINGSJPLayout.setVerticalGroup(
            RATINGSJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RATINGSJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RATINGSJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PROGRAMMAJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SHOWJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SKHNOTHETHSJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RATINGSJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KANALIJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(USERSJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jSeparator1});

        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(USERSJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KANALIJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SKHNOTHETHSJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SHOWJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PROGRAMMAJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RATINGSJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {KANALIJP, PROGRAMMAJP, RATINGSJP, SHOWJP, SKHNOTHETHSJP, USERSJP});

        subject.setBackground(new java.awt.Color(102, 0, 0));
        subject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subject.setFocusable(false);
        subject.setNextFocusableComponent(USERS_JP0);
        subject.setRequestFocusEnabled(false);
        subject.setVerifyInputWhenFocusTarget(false);
        subject.setLayout(new javax.swing.OverlayLayout(subject));

        USERS_JP0.setBackground(new java.awt.Color(51, 51, 51));
        USERS_JP0.setFocusable(false);

        usersjp1.setBackground(new java.awt.Color(178, 178, 178));

        KANALI_Label4.setBackground(new java.awt.Color(52, 47, 128));
        KANALI_Label4.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        KANALI_Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KANALI_Label4.setText("W E L C O M E");
        KANALI_Label4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout usersjp1Layout = new javax.swing.GroupLayout(usersjp1);
        usersjp1.setLayout(usersjp1Layout);
        usersjp1Layout.setHorizontalGroup(
            usersjp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KANALI_Label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        usersjp1Layout.setVerticalGroup(
            usersjp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersjp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KANALI_Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        usersjp.setBackground(new java.awt.Color(178, 178, 178));
        usersjp.setBorder(KANALI_ScrollPane.getBorder());

        users_ScrollPane.setBackground(new java.awt.Color(54, 0, 0));
        users_ScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        users_ScrollPane.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        users_ScrollPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        users_ScrollPane.setFocusTraversalPolicyProvider(true);
        users_ScrollPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        users_ScrollPane.setMaximumSize(new java.awt.Dimension(55, 55));
        users_ScrollPane.setOpaque(false);

        users_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        users_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        users_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        users_table.setDragEnabled(true);
        users_table.setGridColor(new java.awt.Color(93, 137, 205));
        users_table.setRowHeight(30);
        users_table.setRowMargin(5);
        users_table.setShowGrid(false);
        users_ScrollPane.setViewportView(users_table);

        users_button.setBackground(new java.awt.Color(51, 51, 51));
        users_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        users_button.setForeground(new java.awt.Color(255, 255, 255));
        users_button.setText("VIEW ALL");
        users_button.setBorderPainted(false);
        users_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        users_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_buttonActionPerformed(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(181, 202, 204));
        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("user ID :");

        jLabel34.setBackground(new java.awt.Color(181, 202, 204));
        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("username :");

        user_id.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        user_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_id.setToolTipText("type..");
        user_id.setDragEnabled(true);

        user_name.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        user_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_name.setToolTipText("type..");
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });

        insert_users_button.setBackground(new java.awt.Color(51, 51, 51));
        insert_users_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        insert_users_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_users_button.setText("INSERT");
        insert_users_button.setToolTipText("INSERT");
        insert_users_button.setBorderPainted(false);
        insert_users_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert_users_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        insert_users_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_users_buttonActionPerformed(evt);
            }
        });

        update_users_button.setBackground(new java.awt.Color(51, 51, 51));
        update_users_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        update_users_button.setForeground(new java.awt.Color(255, 255, 255));
        update_users_button.setText("UPDATE");
        update_users_button.setBorderPainted(false);
        update_users_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        update_users_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_users_buttonActionPerformed(evt);
            }
        });

        delete_users_button.setBackground(new java.awt.Color(51, 51, 51));
        delete_users_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        delete_users_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_users_button.setText(" DELETE");
        delete_users_button.setBorderPainted(false);
        delete_users_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        delete_users_button.setFocusPainted(false);
        delete_users_button.setFocusable(false);
        delete_users_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_users_buttonActionPerformed(evt);
            }
        });

        reset_users_button.setBackground(new java.awt.Color(51, 51, 51));
        reset_users_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        reset_users_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_users_button.setText("RESET USERS");
        reset_users_button.setBorderPainted(false);
        reset_users_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        reset_users_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_users_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usersjpLayout = new javax.swing.GroupLayout(usersjp);
        usersjp.setLayout(usersjpLayout);
        usersjpLayout.setHorizontalGroup(
            usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersjpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(users_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset_users_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(usersjpLayout.createSequentialGroup()
                        .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_name)
                            .addComponent(user_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersjpLayout.createSequentialGroup()
                        .addComponent(insert_users_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_users_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_users_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(users_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        usersjpLayout.setVerticalGroup(
            usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersjpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersjpLayout.createSequentialGroup()
                        .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update_users_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insert_users_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete_users_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(users_button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(users_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usersjpLayout.createSequentialGroup()
                        .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(usersjpLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(usersjpLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(usersjpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset_users_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        usersjpLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {reset_users_button, users_button});

        javax.swing.GroupLayout USERS_JP0Layout = new javax.swing.GroupLayout(USERS_JP0);
        USERS_JP0.setLayout(USERS_JP0Layout);
        USERS_JP0Layout.setHorizontalGroup(
            USERS_JP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, USERS_JP0Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(USERS_JP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersjp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersjp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        USERS_JP0Layout.setVerticalGroup(
            USERS_JP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERS_JP0Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(usersjp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usersjp, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subject.add(USERS_JP0);

        SKHNOTHETHS_JP2.setBackground(new java.awt.Color(234, 104, 97));

        KANALI_Panel1.setBackground(new java.awt.Color(117, 21, 21));

        KANALI_Label1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        KANALI_Label1.setForeground(new java.awt.Color(255, 255, 255));
        KANALI_Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KANALI_Label1.setText("ΔΙΑΛΕΞΕ ΚΑΝΑΛΙ ΓΙΑ ΝΑ ΜΑΘΕΙΣ ΤΟΝ ΚΩΔΙΚΟ ΤΟΥ :");
        KANALI_Label1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cbkanali1.setBackground(new java.awt.Color(228, 47, 56));
        cbkanali1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cbkanali1.setName("kanalia"); // NOI18N
        cbkanali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkanali1ActionPerformed(evt);
            }
        });

        jLabel23.setText("  ");

        jTextField3.setBackground(new java.awt.Color(255, 153, 153));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.setDragEnabled(true);
        jTextField3.setFocusable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KANALI_Panel1Layout = new javax.swing.GroupLayout(KANALI_Panel1);
        KANALI_Panel1.setLayout(KANALI_Panel1Layout);
        KANALI_Panel1Layout.setHorizontalGroup(
            KANALI_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KANALI_Panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(KANALI_Label1)
                .addGap(18, 18, 18)
                .addComponent(cbkanali1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel23)
                .addContainerGap())
        );
        KANALI_Panel1Layout.setVerticalGroup(
            KANALI_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KANALI_Panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(KANALI_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel23)
                    .addComponent(cbkanali1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KANALI_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        skhn.setBackground(new java.awt.Color(117, 21, 21));
        skhn.setBorder(KANALI_ScrollPane.getBorder());

        SKHNOTHETHS_ScrollPane.setBackground(new java.awt.Color(54, 0, 0));
        SKHNOTHETHS_ScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SKHNOTHETHS_ScrollPane.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SKHNOTHETHS_ScrollPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        SKHNOTHETHS_ScrollPane.setFocusTraversalPolicyProvider(true);
        SKHNOTHETHS_ScrollPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SKHNOTHETHS_ScrollPane.setMaximumSize(new java.awt.Dimension(55, 55));
        SKHNOTHETHS_ScrollPane.setOpaque(false);

        skhnotheths_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        skhnotheths_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        skhnotheths_table.setAutoscrolls(false);
        skhnotheths_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        skhnotheths_table.setDragEnabled(true);
        skhnotheths_table.setGridColor(new java.awt.Color(93, 137, 205));
        skhnotheths_table.setRowHeight(20);
        skhnotheths_table.setRowMargin(5);
        skhnotheths_table.setShowGrid(false);
        SKHNOTHETHS_ScrollPane.setViewportView(skhnotheths_table);

        skhnotheths_button.setBackground(new java.awt.Color(180, 41, 41));
        skhnotheths_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        skhnotheths_button.setForeground(new java.awt.Color(255, 255, 255));
        skhnotheths_button.setText("SHOW ALL");
        skhnotheths_button.setBorderPainted(false);
        skhnotheths_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        skhnotheths_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skhnotheths_buttonActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(181, 202, 204));
        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("ID Σκηνοθέτη :");

        jLabel22.setBackground(new java.awt.Color(181, 202, 204));
        jLabel22.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Ονοματεπώνυμο :");

        skhnotheths_name.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        skhnotheths_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skhnotheths_name.setToolTipText("type..");
        skhnotheths_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skhnotheths_nameActionPerformed(evt);
            }
        });

        insert_skhnotheths_button.setBackground(new java.awt.Color(180, 41, 41));
        insert_skhnotheths_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        insert_skhnotheths_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_skhnotheths_button.setText("INSERT");
        insert_skhnotheths_button.setToolTipText("INSERT");
        insert_skhnotheths_button.setBorderPainted(false);
        insert_skhnotheths_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert_skhnotheths_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        insert_skhnotheths_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_skhnotheths_buttonActionPerformed(evt);
            }
        });

        update_skhnotheths_button.setBackground(new java.awt.Color(180, 41, 41));
        update_skhnotheths_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        update_skhnotheths_button.setForeground(new java.awt.Color(255, 255, 255));
        update_skhnotheths_button.setText("UPDATE");
        update_skhnotheths_button.setBorderPainted(false);
        update_skhnotheths_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        update_skhnotheths_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_skhnotheths_buttonActionPerformed(evt);
            }
        });

        delete_skhnotheths_button.setBackground(new java.awt.Color(180, 41, 41));
        delete_skhnotheths_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        delete_skhnotheths_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_skhnotheths_button.setText("DELETE");
        delete_skhnotheths_button.setBorderPainted(false);
        delete_skhnotheths_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        delete_skhnotheths_button.setFocusPainted(false);
        delete_skhnotheths_button.setFocusable(false);
        delete_skhnotheths_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_skhnotheths_buttonActionPerformed(evt);
            }
        });

        reset_skhnotheths_button.setBackground(new java.awt.Color(180, 41, 41));
        reset_skhnotheths_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        reset_skhnotheths_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_skhnotheths_button.setText("RESET");
        reset_skhnotheths_button.setBorderPainted(false);
        reset_skhnotheths_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        reset_skhnotheths_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_skhnotheths_buttonActionPerformed(evt);
            }
        });

        skhnotheths_id.setToolTipText("type..");
        skhnotheths_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skhnotheths_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout skhnLayout = new javax.swing.GroupLayout(skhn);
        skhn.setLayout(skhnLayout);
        skhnLayout.setHorizontalGroup(
            skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skhnLayout.createSequentialGroup()
                .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skhnLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(skhnLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(skhnotheths_name, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, skhnLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(skhnotheths_id, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(skhnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(skhnotheths_button, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skhnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reset_skhnotheths_button, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skhnLayout.createSequentialGroup()
                        .addComponent(insert_skhnotheths_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_skhnotheths_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_skhnotheths_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SKHNOTHETHS_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        skhnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel21, jLabel22});

        skhnLayout.setVerticalGroup(
            skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skhnLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skhnotheths_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delete_skhnotheths_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update_skhnotheths_button, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(insert_skhnotheths_button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(skhnLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(skhnotheths_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(skhnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(skhnotheths_name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset_skhnotheths_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(skhnLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SKHNOTHETHS_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        skhnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel21, jLabel22, skhnotheths_id, skhnotheths_name});

        skhnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delete_skhnotheths_button, insert_skhnotheths_button, update_skhnotheths_button});

        javax.swing.GroupLayout SKHNOTHETHS_JP2Layout = new javax.swing.GroupLayout(SKHNOTHETHS_JP2);
        SKHNOTHETHS_JP2.setLayout(SKHNOTHETHS_JP2Layout);
        SKHNOTHETHS_JP2Layout.setHorizontalGroup(
            SKHNOTHETHS_JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKHNOTHETHS_JP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SKHNOTHETHS_JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skhn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KANALI_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        SKHNOTHETHS_JP2Layout.setVerticalGroup(
            SKHNOTHETHS_JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKHNOTHETHS_JP2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(KANALI_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        subject.add(SKHNOTHETHS_JP2);

        KANALI_JP3.setBackground(new java.awt.Color(24, 164, 197));

        KANALI_Panel.setBackground(new java.awt.Color(22, 105, 111));

        KANALI_Label.setBackground(new java.awt.Color(22, 105, 111));
        KANALI_Label.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        KANALI_Label.setForeground(new java.awt.Color(255, 255, 255));
        KANALI_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KANALI_Label.setText("ΔΙΑΛΕΞΕ ΚΑΝΑΛΙ ΓΙΑ ΝΑ ΜΑΘΕΙΣ ΤΟΝ ΚΩΔΙΚΟ ΤΟΥ :");

        cbkanali.setBackground(new java.awt.Color(0, 204, 204));
        cbkanali.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cbkanali.setName("kanalia"); // NOI18N
        cbkanali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkanaliActionPerformed(evt);
            }
        });

        jLabel20.setText("  ");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 153, 153));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KANALI_PanelLayout = new javax.swing.GroupLayout(KANALI_Panel);
        KANALI_Panel.setLayout(KANALI_PanelLayout);
        KANALI_PanelLayout.setHorizontalGroup(
            KANALI_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KANALI_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KANALI_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KANALI_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KANALI_PanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(KANALI_PanelLayout.createSequentialGroup()
                        .addComponent(cbkanali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)))
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        KANALI_PanelLayout.setVerticalGroup(
            KANALI_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KANALI_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KANALI_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KANALI_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KANALI_PanelLayout.createSequentialGroup()
                        .addComponent(cbkanali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KANALI_PanelLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1.setBackground(new java.awt.Color(22, 105, 111));
        jPanel1.setBorder(KANALI_ScrollPane.getBorder());

        KANALI_ScrollPane.setBackground(new java.awt.Color(0, 107, 165));
        KANALI_ScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        KANALI_ScrollPane.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        KANALI_ScrollPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        KANALI_ScrollPane.setFocusTraversalPolicyProvider(true);
        KANALI_ScrollPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        KANALI_ScrollPane.setMaximumSize(new java.awt.Dimension(55, 55));
        KANALI_ScrollPane.setOpaque(false);

        KANALI_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        KANALI_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        KANALI_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        KANALI_Table.setDragEnabled(true);
        KANALI_Table.setGridColor(new java.awt.Color(93, 137, 205));
        KANALI_Table.setRowHeight(30);
        KANALI_Table.setRowMargin(10);
        KANALI_ScrollPane.setViewportView(KANALI_Table);

        KANALI_Button.setBackground(new java.awt.Color(22, 105, 111));
        KANALI_Button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        KANALI_Button.setForeground(new java.awt.Color(255, 255, 255));
        KANALI_Button.setText("VIEW");
        KANALI_Button.setBorderPainted(false);
        KANALI_Button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        KANALI_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        KANALI_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KANALI_ButtonActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(181, 202, 204));
        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Καταχώρησε το id καναλιού:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel10.setBackground(new java.awt.Color(181, 202, 204));
        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Καταχώρησε όνομα καναλιού:");

        kanali_id.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        kanali_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kanali_id.setToolTipText("type..");
        kanali_id.setDragEnabled(true);
        kanali_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kanali_idActionPerformed(evt);
            }
        });

        kanali_title.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        kanali_title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kanali_title.setToolTipText("type..");

        kanali_insert_Button.setBackground(new java.awt.Color(22, 105, 111));
        kanali_insert_Button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        kanali_insert_Button.setForeground(new java.awt.Color(255, 255, 255));
        kanali_insert_Button.setText("INSERT");
        kanali_insert_Button.setToolTipText("INSERT");
        kanali_insert_Button.setBorderPainted(false);
        kanali_insert_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kanali_insert_Button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        kanali_insert_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kanali_insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kanali_insert_ButtonActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(181, 202, 204));
        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Διαλέξτε τον τύπο :");

        update_kanali_update.setBackground(new java.awt.Color(22, 105, 111));
        update_kanali_update.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        update_kanali_update.setForeground(new java.awt.Color(255, 255, 255));
        update_kanali_update.setText("UPDATE");
        update_kanali_update.setToolTipText("Update");
        update_kanali_update.setBorderPainted(false);
        update_kanali_update.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        update_kanali_update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        update_kanali_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_kanali_updateActionPerformed(evt);
            }
        });

        delete_kanali_update.setBackground(new java.awt.Color(22, 105, 111));
        delete_kanali_update.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        delete_kanali_update.setForeground(new java.awt.Color(255, 255, 255));
        delete_kanali_update.setText("DELETE");
        delete_kanali_update.setToolTipText("Delete");
        delete_kanali_update.setBorderPainted(false);
        delete_kanali_update.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        delete_kanali_update.setFocusPainted(false);
        delete_kanali_update.setFocusable(false);
        delete_kanali_update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete_kanali_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_kanali_updateActionPerformed(evt);
            }
        });

        digital_button.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(digital_button);
        digital_button.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        digital_button.setForeground(new java.awt.Color(255, 255, 255));
        digital_button.setText("DIGITAL");
        digital_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        digital_button.setBorderPainted(true);
        digital_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        digital_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        analog_button.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(analog_button);
        analog_button.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        analog_button.setForeground(new java.awt.Color(255, 255, 255));
        analog_button.setText("ANALOG");
        analog_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        analog_button.setBorderPainted(true);
        analog_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        analog_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        reset_kanali_button.setBackground(new java.awt.Color(22, 105, 111));
        reset_kanali_button.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        reset_kanali_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_kanali_button.setText("RESET ");
        reset_kanali_button.setBorderPainted(false);
        reset_kanali_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset_kanali_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_kanali_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(KANALI_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(kanali_id, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(analog_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kanali_title))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(digital_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(reset_kanali_button, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kanali_insert_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(update_kanali_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_kanali_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(KANALI_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kanali_insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_kanali_update, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_kanali_update)
                    .addComponent(KANALI_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kanali_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kanali_title))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(analog_button)
                            .addComponent(digital_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(reset_kanali_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(KANALI_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {KANALI_Button, delete_kanali_update, kanali_insert_Button, update_kanali_update});

        javax.swing.GroupLayout KANALI_JP3Layout = new javax.swing.GroupLayout(KANALI_JP3);
        KANALI_JP3.setLayout(KANALI_JP3Layout);
        KANALI_JP3Layout.setHorizontalGroup(
            KANALI_JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KANALI_JP3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(KANALI_JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KANALI_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        KANALI_JP3Layout.setVerticalGroup(
            KANALI_JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KANALI_JP3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KANALI_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        subject.add(KANALI_JP3);

        PROGRAMMA_JP4.setBackground(new java.awt.Color(38, 64, 2));

        usersjp3.setBackground(new java.awt.Color(199, 197, 134));

        jLabel35.setBackground(new java.awt.Color(181, 202, 204));
        jLabel35.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("SHOW ID");

        jLabel36.setBackground(new java.awt.Color(181, 202, 204));
        jLabel36.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("TIME");

        s_id.setEditable(false);
        s_id.setBackground(new java.awt.Color(204, 204, 204));
        s_id.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        s_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        s_id.setToolTipText("type..");
        s_id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s_id.setDisabledTextColor(new java.awt.Color(81, 81, 81));
        s_id.setDragEnabled(true);
        s_id.setEnabled(false);

        progr_time.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        progr_time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        progr_time.setToolTipText("type..");
        progr_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progr_timeActionPerformed(evt);
            }
        });

        PROGRAMMA_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PROGRAMMA_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "SHOW", "ΩΡΑ ΕΝΑΡΞΗΣ", "ΗΜΕΡ/ΝΙΑ", "ΚΑΝΑΛΙ"
            }
        ));
        PROGRAMMA_Table.setColumnSelectionAllowed(true);
        PROGRAMMA_Table.setIntercellSpacing(new java.awt.Dimension(1, 5));
        PROGRAMMA_Table.setRowHeight(20);
        PROGRAMMA_ScrollPane1.setViewportView(PROGRAMMA_Table);

        jLabel37.setBackground(new java.awt.Color(181, 202, 204));
        jLabel37.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("DATE ");

        k_id.setEditable(false);
        k_id.setBackground(new java.awt.Color(204, 204, 204));
        k_id.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        k_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k_id.setToolTipText("type..");
        k_id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        k_id.setDisabledTextColor(new java.awt.Color(81, 81, 81));
        k_id.setDragEnabled(true);
        k_id.setEnabled(false);
        k_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_idActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(181, 202, 204));
        jLabel38.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("ΚΑΝΑΛΙ ID:");

        cbshow1.setBackground(new java.awt.Color(153, 153, 0));
        cbshow1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cbshow1.setLightWeightPopupEnabled(false);
        cbshow1.setName("kanalia"); // NOI18N
        cbshow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbshow1ActionPerformed(evt);
            }
        });

        PROGRAMMA_Label3.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        PROGRAMMA_Label3.setText("SHOW");

        insert_programma_button.setBackground(new java.awt.Color(85, 107, 47));
        insert_programma_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        insert_programma_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_programma_button.setText("INSERT");
        insert_programma_button.setToolTipText("INSERT");
        insert_programma_button.setBorderPainted(false);
        insert_programma_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert_programma_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        insert_programma_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_programma_buttonActionPerformed(evt);
            }
        });

        update_programma_button.setBackground(new java.awt.Color(85, 107, 47));
        update_programma_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        update_programma_button.setForeground(new java.awt.Color(255, 255, 255));
        update_programma_button.setText("UPDATE");
        update_programma_button.setBorderPainted(false);
        update_programma_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        update_programma_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_programma_buttonActionPerformed(evt);
            }
        });

        delete_programma_button.setBackground(new java.awt.Color(85, 107, 47));
        delete_programma_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        delete_programma_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_programma_button.setText("DELETE");
        delete_programma_button.setBorderPainted(false);
        delete_programma_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        delete_programma_button.setFocusPainted(false);
        delete_programma_button.setFocusable(false);
        delete_programma_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_programma_buttonActionPerformed(evt);
            }
        });

        PROGRAMMA_Label5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        PROGRAMMA_Label5.setText("Πρόγραμμα Καναλιού :");

        cbkanali2.setBackground(new java.awt.Color(51, 51, 0));
        cbkanali2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cbkanali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkanali2ActionPerformed(evt);
            }
        });

        programma_button.setBackground(new java.awt.Color(39, 61, 5));
        programma_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        programma_button.setForeground(new java.awt.Color(255, 255, 255));
        programma_button.setText("VIEW ALL");
        programma_button.setBorderPainted(false);
        programma_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        programma_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programma_buttonActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusLost(evt);
            }
        });
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseExited(evt);
            }
        });

        PROGRAMMA_Label1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 10)); // NOI18N
        PROGRAMMA_Label1.setText("(ΑΥΤΟΜΑΤΗ ΣΥΜΠΛΗΡΩΣΗ ΤΩΝ ID) ");

        javax.swing.GroupLayout usersjp3Layout = new javax.swing.GroupLayout(usersjp3);
        usersjp3.setLayout(usersjp3Layout);
        usersjp3Layout.setHorizontalGroup(
            usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersjp3Layout.createSequentialGroup()
                .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersjp3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(programma_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(insert_programma_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(update_programma_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(delete_programma_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(usersjp3Layout.createSequentialGroup()
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(usersjp3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersjp3Layout.createSequentialGroup()
                                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(usersjp3Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel37)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(usersjp3Layout.createSequentialGroup()
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(progr_time, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersjp3Layout.createSequentialGroup()
                                        .addComponent(PROGRAMMA_Label3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))
                            .addGroup(usersjp3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PROGRAMMA_Label1)
                                    .addGroup(usersjp3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(usersjp3Layout.createSequentialGroup()
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(usersjp3Layout.createSequentialGroup()
                                                .addComponent(jLabel38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(k_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(usersjp3Layout.createSequentialGroup()
                                .addComponent(PROGRAMMA_Label5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbkanali2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PROGRAMMA_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        usersjp3Layout.setVerticalGroup(
            usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersjp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insert_programma_button, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(update_programma_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_programma_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(programma_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersjp3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PROGRAMMA_Label5)
                            .addComponent(cbkanali2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PROGRAMMA_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(usersjp3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(PROGRAMMA_Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(k_id)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PROGRAMMA_Label3)
                            .addComponent(cbshow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(usersjp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(progr_time, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(67, 67, 67))))
        );

        usersjp3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delete_programma_button, insert_programma_button, programma_button, update_programma_button});

        PROGRAMMA_Panel1.setBackground(new java.awt.Color(199, 197, 134));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATE&TIME");

        javax.swing.GroupLayout PROGRAMMA_Panel1Layout = new javax.swing.GroupLayout(PROGRAMMA_Panel1);
        PROGRAMMA_Panel1.setLayout(PROGRAMMA_Panel1Layout);
        PROGRAMMA_Panel1Layout.setHorizontalGroup(
            PROGRAMMA_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROGRAMMA_Panel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PROGRAMMA_Panel1Layout.setVerticalGroup(
            PROGRAMMA_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PROGRAMMA_Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout PROGRAMMA_JP4Layout = new javax.swing.GroupLayout(PROGRAMMA_JP4);
        PROGRAMMA_JP4.setLayout(PROGRAMMA_JP4Layout);
        PROGRAMMA_JP4Layout.setHorizontalGroup(
            PROGRAMMA_JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PROGRAMMA_JP4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PROGRAMMA_JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usersjp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PROGRAMMA_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        PROGRAMMA_JP4Layout.setVerticalGroup(
            PROGRAMMA_JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROGRAMMA_JP4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PROGRAMMA_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usersjp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );

        subject.add(PROGRAMMA_JP4);

        RATINGS_JP5.setBackground(new java.awt.Color(78, 70, 72));

        ratings_Panel.setBackground(new java.awt.Color(255, 204, 102));

        KANALI_Label3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        KANALI_Label3.setForeground(new java.awt.Color(51, 0, 0));
        KANALI_Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KANALI_Label3.setText("ΔΙΑΛΕΞΕ SHOW ΓΙΑ ΝΑ ΔΕΙΣ TO ID:");
        KANALI_Label3.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        KANALI_Label3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        cbshow.setBackground(new java.awt.Color(153, 102, 0));
        cbshow.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cbshow.setName("kanalia"); // NOI18N
        cbshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbshowActionPerformed(evt);
            }
        });

        jLabel24.setText("  ");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(175, 125, 23));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ratings_PanelLayout = new javax.swing.GroupLayout(ratings_Panel);
        ratings_Panel.setLayout(ratings_PanelLayout);
        ratings_PanelLayout.setHorizontalGroup(
            ratings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratings_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KANALI_Label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(cbshow, 0, 114, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        ratings_PanelLayout.setVerticalGroup(
            ratings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratings_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ratings_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ratings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ratings_PanelLayout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ratings_PanelLayout.createSequentialGroup()
                        .addGroup(ratings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KANALI_Label3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(cbshow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(KANALI_ScrollPane.getBorder());

        ratings_ScrollPane.setBackground(new java.awt.Color(0, 0, 0));
        ratings_ScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ratings_ScrollPane.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ratings_ScrollPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ratings_ScrollPane.setFocusTraversalPolicyProvider(true);
        ratings_ScrollPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ratings_ScrollPane.setMaximumSize(new java.awt.Dimension(55, 55));
        ratings_ScrollPane.setOpaque(false);

        rating_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rating_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        rating_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        rating_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rating_Table.setDragEnabled(true);
        rating_Table.setGridColor(new java.awt.Color(93, 137, 205));
        rating_Table.setRowHeight(30);
        rating_Table.setRowMargin(5);
        rating_Table.setShowGrid(false);
        ratings_ScrollPane.setViewportView(rating_Table);

        ratings_Button.setBackground(new java.awt.Color(175, 125, 23));
        ratings_Button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ratings_Button.setForeground(new java.awt.Color(255, 255, 255));
        ratings_Button.setText("VIEW");
        ratings_Button.setBorderPainted(false);
        ratings_Button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ratings_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratings_ButtonActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(181, 202, 204));
        jLabel26.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel26.setText("User ID:");

        jLabel27.setBackground(new java.awt.Color(181, 202, 204));
        jLabel27.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel27.setText("Σχόλιο:");

        users.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        users.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        users.setToolTipText("....");
        users.setDragEnabled(true);

        review.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        review.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        review.setToolTipText("....");
        review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewActionPerformed(evt);
            }
        });

        ratings_insert_Button.setBackground(new java.awt.Color(175, 125, 23));
        ratings_insert_Button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ratings_insert_Button.setForeground(new java.awt.Color(255, 255, 255));
        ratings_insert_Button.setText("INSERT");
        ratings_insert_Button.setToolTipText("INSERT");
        ratings_insert_Button.setBorderPainted(false);
        ratings_insert_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ratings_insert_Button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ratings_insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratings_insert_ButtonActionPerformed(evt);
            }
        });

        update_ratings_update.setBackground(new java.awt.Color(175, 125, 23));
        update_ratings_update.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        update_ratings_update.setForeground(new java.awt.Color(255, 255, 255));
        update_ratings_update.setText("UPDATE");
        update_ratings_update.setBorderPainted(false);
        update_ratings_update.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        update_ratings_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ratings_updateActionPerformed(evt);
            }
        });

        delete_ratings_update1.setBackground(new java.awt.Color(175, 125, 23));
        delete_ratings_update1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        delete_ratings_update1.setForeground(new java.awt.Color(255, 255, 255));
        delete_ratings_update1.setText("DELETE");
        delete_ratings_update1.setBorderPainted(false);
        delete_ratings_update1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        delete_ratings_update1.setFocusPainted(false);
        delete_ratings_update1.setFocusable(false);
        delete_ratings_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ratings_update1ActionPerformed(evt);
            }
        });

        reset_ratings_button.setBackground(new java.awt.Color(175, 125, 23));
        reset_ratings_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        reset_ratings_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_ratings_button.setText("RESET");
        reset_ratings_button.setBorderPainted(false);
        reset_ratings_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        reset_ratings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_ratings_buttonActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(181, 202, 204));
        jLabel28.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel28.setText("Bαθμός:");

        rating.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        rating.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rating.setToolTipText("....");
        rating.setDragEnabled(true);

        jLabel29.setBackground(new java.awt.Color(181, 202, 204));
        jLabel29.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel29.setText("Show id:");

        show.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        show.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show.setToolTipText("....");
        show.setDragEnabled(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(review, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(ratings_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset_ratings_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ratings_insert_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_ratings_update, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_ratings_update1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ratings_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel26, jLabel27, jLabel28, jLabel29});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rating, show, users});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(ratings_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update_ratings_update)
                        .addComponent(ratings_insert_Button))
                    .addComponent(delete_ratings_update1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 39, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(review)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(reset_ratings_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                        .addComponent(ratings_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delete_ratings_update1, ratings_Button, ratings_insert_Button, update_ratings_update});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel26, jLabel28, jLabel29, rating, show, users});

        javax.swing.GroupLayout RATINGS_JP5Layout = new javax.swing.GroupLayout(RATINGS_JP5);
        RATINGS_JP5.setLayout(RATINGS_JP5Layout);
        RATINGS_JP5Layout.setHorizontalGroup(
            RATINGS_JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RATINGS_JP5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(RATINGS_JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ratings_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        RATINGS_JP5Layout.setVerticalGroup(
            RATINGS_JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RATINGS_JP5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ratings_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(577, Short.MAX_VALUE))
        );

        subject.add(RATINGS_JP5);

        SHOWJP1.setBackground(new java.awt.Color(51, 0, 0));

        SHOW_jPanel.setBackground(new java.awt.Color(151, 64, 16));

        KANALI_Label2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        KANALI_Label2.setForeground(new java.awt.Color(255, 255, 255));
        KANALI_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KANALI_Label2.setText("Διάλεξε κατηγορία :");

        cb_shows_type.setBackground(new java.awt.Color(233, 112, 24));
        cb_shows_type.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cb_shows_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_shows_typeActionPerformed(evt);
            }
        });
        cb_shows_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cb_shows_typeKeyPressed(evt);
            }
        });

        SHOW_ScrollPane.setBackground(new java.awt.Color(255, 204, 204));
        SHOW_ScrollPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SHOW_ScrollPane.setColumnHeaderView(null);
        SHOW_ScrollPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ΣΕΙΡΕΣ/ΕΚΠΟΜΠΕΣ"
            }
        ));
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(5);
        jTable1.getTableHeader().setReorderingAllowed(false);
        SHOW_ScrollPane.setViewportView(jTable1);

        javax.swing.GroupLayout SHOW_jPanelLayout = new javax.swing.GroupLayout(SHOW_jPanel);
        SHOW_jPanel.setLayout(SHOW_jPanelLayout);
        SHOW_jPanelLayout.setHorizontalGroup(
            SHOW_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SHOW_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KANALI_Label2)
                .addGap(71, 71, 71)
                .addComponent(cb_shows_type, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SHOW_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
        SHOW_jPanelLayout.setVerticalGroup(
            SHOW_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOW_jPanelLayout.createSequentialGroup()
                .addGroup(SHOW_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SHOW_jPanelLayout.createSequentialGroup()
                        .addContainerGap(444, Short.MAX_VALUE)
                        .addComponent(SHOW_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SHOW_jPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(SHOW_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KANALI_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_shows_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SHOW_Panel.setBackground(new java.awt.Color(124, 50, 12));

        pg1.setBackground(new java.awt.Color(102, 0, 0));
        pg1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pg1.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pg1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        pg1.setFocusTraversalPolicyProvider(true);
        pg1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pg1.setMaximumSize(new java.awt.Dimension(55, 55));
        pg1.setOpaque(false);

        show_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        show_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        show_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        show_table.setDragEnabled(true);
        show_table.setFillsViewportHeight(true);
        show_table.setRequestFocusEnabled(false);
        show_table.setRowHeight(30);
        pg1.setViewportView(show_table);

        jLabel12.setBackground(new java.awt.Color(181, 202, 204));
        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Show ID:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel25.setBackground(new java.awt.Color(181, 202, 204));
        jLabel25.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Όνομα Show :");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Έτος Παραγωγής :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Κατηγορία :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID Σκηνοθέτη :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ID Kαναλιού:");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        ShowButton.setBackground(new java.awt.Color(178, 72, 22));
        ShowButton.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ShowButton.setForeground(new java.awt.Color(255, 255, 255));
        ShowButton.setText("VIEW");
        ShowButton.setBorderPainted(false);
        ShowButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        insert_show_button.setBackground(new java.awt.Color(178, 72, 22));
        insert_show_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        insert_show_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_show_button.setText("INSERT");
        insert_show_button.setBorderPainted(false);
        insert_show_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        insert_show_button.setFocusCycleRoot(true);
        insert_show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_show_buttonActionPerformed(evt);
            }
        });

        reset_button.setBackground(new java.awt.Color(178, 72, 22));
        reset_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        reset_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_button.setText("RESET");
        reset_button.setBorderPainted(false);
        reset_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        update_show_button.setBackground(new java.awt.Color(178, 72, 22));
        update_show_button.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        update_show_button.setForeground(new java.awt.Color(255, 255, 255));
        update_show_button.setText("UPDATE");
        update_show_button.setBorder(insert_show_button.getBorder());
        update_show_button.setBorderPainted(false);
        update_show_button.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        update_show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_show_buttonActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(178, 72, 22));
        jButton4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE");
        jButton4.setBorder(insert_show_button.getBorder());
        jButton4.setBorderPainted(false);
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        show_id.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        show_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_id.setToolTipText("type...");

        show_title.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        show_title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_title.setToolTipText("type...");

        show_type.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        show_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_type.setToolTipText("type...");

        show_skhnotheths.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        show_skhnotheths.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_skhnotheths.setToolTipText("type...");
        show_skhnotheths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_skhnothethsActionPerformed(evt);
            }
        });

        show_kanali.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        show_kanali.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        show_kanali.setToolTipText("type...");

        javax.swing.GroupLayout SHOW_PanelLayout = new javax.swing.GroupLayout(SHOW_Panel);
        SHOW_Panel.setLayout(SHOW_PanelLayout);
        SHOW_PanelLayout.setHorizontalGroup(
            SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOW_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SHOW_PanelLayout.createSequentialGroup()
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(show_id)
                            .addComponent(show_title)
                            .addComponent(show_skhnotheths, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SHOW_PanelLayout.createSequentialGroup()
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(show_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(show_kanali, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(reset_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pg1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addGroup(SHOW_PanelLayout.createSequentialGroup()
                        .addComponent(insert_show_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(update_show_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        SHOW_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {show_id, show_kanali, show_skhnotheths, show_title, show_type});

        SHOW_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel12, jLabel13, jLabel25, jLabel5, jLabel6, jLabel7});

        SHOW_PanelLayout.setVerticalGroup(
            SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOW_PanelLayout.createSequentialGroup()
                .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SHOW_PanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SHOW_PanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(show_title))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(show_type))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(show_skhnotheths))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_kanali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SHOW_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SHOW_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insert_show_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update_show_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(pg1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        SHOW_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel12, jLabel13, jLabel25, jLabel5, jLabel6, jLabel7});

        SHOW_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {show_id, show_kanali, show_skhnotheths, show_title, show_type});

        javax.swing.GroupLayout SHOWJP1Layout = new javax.swing.GroupLayout(SHOWJP1);
        SHOWJP1.setLayout(SHOWJP1Layout);
        SHOWJP1Layout.setHorizontalGroup(
            SHOWJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOWJP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SHOWJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SHOW_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SHOW_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        SHOWJP1Layout.setVerticalGroup(
            SHOWJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOWJP1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SHOW_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SHOW_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        subject.add(SHOWJP1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//methodos me tin opoia gemizw ton pinaka mykanali me ta dedomena tis stilis kanali_title toy table kanali

    private void SHOWJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOWJPMouseClicked

        mylist_show_type();

        SHOWJP1.setVisible(true);
        USERS_JP0.setVisible(false);
        SKHNOTHETHS_JP2.setVisible(false);
        KANALI_JP3.setVisible(false);
        PROGRAMMA_JP4.setVisible(false);
        RATINGS_JP5.setVisible(false);

        SHOWJP.setBackground(Color.white);
        USERSJP.setBackground(new Color(204, 204, 204));
        KANALIJP.setBackground(new Color(204, 204, 204));
        SKHNOTHETHSJP.setBackground(new Color(204, 204, 204));
        PROGRAMMAJP.setBackground(new Color(204, 204, 204));
        RATINGSJP.setBackground(new Color(204, 204, 204));
        // TODO add your handling code here:
    }//GEN-LAST:event_SHOWJPMouseClicked

    private void SKHNOTHETHSJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKHNOTHETHSJPMouseClicked
        // TODO add your handling code here:

        mylist_kanali();

        SKHNOTHETHS_JP2.setVisible(true);

        USERS_JP0.setVisible(false);

        SHOWJP1.setVisible(false);
        KANALI_JP3.setVisible(false);
        PROGRAMMA_JP4.setVisible(false);
        RATINGS_JP5.setVisible(false);

        SKHNOTHETHSJP.setBackground(Color.white);
        USERSJP.setBackground(new Color(204, 204, 204));

        SHOWJP.setBackground(new Color(204, 204, 204));
        KANALIJP.setBackground(new Color(204, 204, 204));
        PROGRAMMAJP.setBackground(new Color(204, 204, 204));
        RATINGSJP.setBackground(new Color(204, 204, 204));


    }//GEN-LAST:event_SKHNOTHETHSJPMouseClicked

    private void KANALIJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KANALIJPMouseClicked
        // TODO add your handling code here:

        KANALI_JP3.setVisible(true);

        mylist_kanali();
        //    Kanali_inJTable();
        USERS_JP0.setVisible(false);

        SHOWJP1.setVisible(false);
        SKHNOTHETHS_JP2.setVisible(false);
        PROGRAMMA_JP4.setVisible(false);
        RATINGS_JP5.setVisible(false);

        KANALIJP.setBackground(Color.white);
        USERSJP.setBackground(new Color(204, 204, 204));

        SHOWJP.setBackground(new Color(204, 204, 204));
        SKHNOTHETHSJP.setBackground(new Color(204, 204, 204));
        PROGRAMMAJP.setBackground(new Color(204, 204, 204));
        RATINGSJP.setBackground(new Color(204, 204, 204));

    }//GEN-LAST:event_KANALIJPMouseClicked

    private void PROGRAMMAJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROGRAMMAJPMouseClicked

        PROGRAMMA_JP4.setVisible(true);
        mylist_kanali();

        mylist_show();
        USERS_JP0.setVisible(false);

        SHOWJP1.setVisible(false);
        SKHNOTHETHS_JP2.setVisible(false);
        KANALI_JP3.setVisible(false);
        RATINGS_JP5.setVisible(false);

        PROGRAMMAJP.setBackground(Color.white);
        USERSJP.setBackground(new Color(204, 204, 204));

        KANALIJP.setBackground(new Color(204, 204, 204));
        SHOWJP.setBackground(new Color(204, 204, 204));
        SKHNOTHETHSJP.setBackground(new Color(204, 204, 204));
        RATINGSJP.setBackground(new Color(204, 204, 204));


    }//GEN-LAST:event_PROGRAMMAJPMouseClicked

    void insert_skhnotheths() {
        int id = Integer.valueOf(skhnotheths_id.getText());

        String name = skhnotheths_name.getText();

        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String insertString = " SELECT add_skhnotheths( ? , ? ) ; ";
            insertSkhnotheths = dbConnection.prepareStatement(insertString);
            insertSkhnotheths.setInt(1, id);
            insertSkhnotheths.setString(2, name);

            insertSkhnotheths.executeQuery();

        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void update_show() {
        int id = Integer.valueOf(skhnotheths_id.getText());

        String name = skhnotheths_name.getText();

        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);

            String updateString = " SELECT update_skhnotheths( ? , ? ) ; ";
            updateSkhnotheths = dbConnection.prepareStatement(updateString);

            updateSkhnotheths.setInt(2, id);

            updateSkhnotheths.setString(1, name);

            updateSkhnotheths.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void update_skhnotheths() {
        int id = Integer.valueOf(skhnotheths_id.getText());

        String name = skhnotheths_name.getText();

        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);

            String updateString = " SELECT update_skhnotheths( ? , ? ) ; ";
            updateSkhnotheths = dbConnection.prepareStatement(updateString);

            updateSkhnotheths.setInt(2, id);

            updateSkhnotheths.setString(1, name);

            updateSkhnotheths.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void insert_kanali() {
        int id = Integer.valueOf(kanali_id.getText());

        String title = kanali_title.getText();

        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            dbConnection = DriverManager.getConnection(url, username, passwd);

            String insertString = " SELECT add_kanali( ? , ? , ? ) ; ";

            insertKanali = dbConnection.prepareStatement(insertString);
            insertKanali.setInt(2, id);
            if (digital_button.isSelected()) {
                String type = digital_button.getText();
                insertKanali.setString(3, type);

            }
            if (analog_button.isSelected()) {
                String type = analog_button.getText();
                insertKanali.setString(3, type);

            }

            insertKanali.setString(1, title);

            insertKanali.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, " void insert_kanali() Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void delete_show() {
        int id = Integer.valueOf(show_id.getText());

        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String deleteString = " SELECT delete_show( ? ) ; ";
            deleteShow = dbConnection.prepareStatement(deleteString);

            deleteShow.setInt(1, id);
            deleteShow.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void delete_programma() {
        int response = JOptionPane.showConfirmDialog(this, "Είσαι σίγουρος; \n" + " Θα διαγραφτεί απο το πρόγραμμα \n" + " το : " + cbshow1.getSelectedItem() + ", με id καναλιού : " + k_id.getText() + " που προβάλεται \n ΩΡΑ : " + progr_time.getText() + " ,και ΗΜ/ΝΙΑ:" + jDateChooser1.getDate() + ".", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            int showid = Integer.valueOf(s_id.getText());

            Date date = jDateChooser1.getDate();
            java.sql.Date sqldate = new java.sql.Date(date.getTime());

            try {
                dbConnection = DriverManager.getConnection(url, username, passwd);

                String deleteString = " SELECT delete_programma( ? , ? ) ; ";
                deleteProgramma = dbConnection.prepareStatement(deleteString);

                deleteProgramma.setInt(1, showid);
                //   deleteProgramma.setTime(2, jtime);
                deleteProgramma.setDate(2, sqldate);
                //  deleteProgramma.setInt(4, kanaliid);

                deleteProgramma.executeQuery();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n");
                while (ex != null) {
                    JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                    ex = ex.getNextException();
                }
            }
        }
    }

    void delete_kanali() {
        int response = JOptionPane.showConfirmDialog(this, "Είσαι σίγουρος; \n" + "Διαγραφή καναλιου ?: " + kanali_title.getText(), "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            int id = Integer.valueOf(kanali_id.getText());

            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                dbConnection = DriverManager.getConnection(url, username, passwd);
                String deleteString = " SELECT delete_kanali( ?  ) ; ";
                deleteKanali = dbConnection.prepareStatement(deleteString);
                deleteKanali.setInt(1, id);

                deleteKanali.executeQuery();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n");
                while (ex != null) {
                    JOptionPane.showMessageDialog(null, "testMessage: " + ex.getMessage());
                    ex = ex.getNextException();
                }
            }

        }
    }

    void delete_skhnotheths() {
        int id = Integer.valueOf(skhnotheths_id.getText());

        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String deleteString = " SELECT * FROM delete_skhnotheths( ?  ) ; ";

            deleteSkhnotheths = dbConnection.prepareStatement(deleteString);
            deleteSkhnotheths.setInt(1, id);
            deleteSkhnotheths.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void delete_ratings() {
        int userid = Integer.valueOf(users.getText());
        int showid = Integer.valueOf(show.getText());
        try {

            dbConnection = DriverManager.getConnection(url, username, passwd);

            String deleteString = " SELECT delete_rating( ? , ?  ) ; ";
            deleteRating = dbConnection.prepareStatement(deleteString);
            deleteRating.setInt(1, userid);
            deleteRating.setInt(2, showid);

            deleteRating.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void delete_users() {
        int response = JOptionPane.showConfirmDialog(this, "Είσαι σίγουρος; \n" + " Διαγράφοντας τον user : " + user_name.getText() + " AΥΤΟΜΑΤΑ διαγράφονται και τα RATINGS που καταχώρησε ", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            int id = Integer.valueOf(user_id.getText());

            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                dbConnection = DriverManager.getConnection(url, username, passwd);

                String deleteString = " SELECT delete_user( ?  ) ; ";
                deleteUsers = dbConnection.prepareStatement(deleteString);
                deleteUsers.setInt(1, id);

                deleteUsers.executeQuery();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n");
                while (ex != null) {
                    JOptionPane.showMessageDialog(null, "testMessage: " + ex.getMessage());
                    ex = ex.getNextException();
                }
            }

        }
    }

    void update_users() {
        //VALUES FROM JTEXTFIELDS
        int id = Integer.valueOf(user_id.getText());

        String name = user_name.getText();
        try {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            dbConnection = DriverManager.getConnection(url, username, passwd);

            String updateString = " SELECT * FROM up_us( ? , ? ) ; ";
            updateUsers = dbConnection.prepareStatement(updateString);
            updateUsers.setInt(2, id);
            updateUsers.setString(1, name);
            updateUsers.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "testMessage: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void update_kanali() {
        int id = Integer.valueOf(kanali_id.getText());

        String title = kanali_title.getText();

        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String updateString = " SELECT update_kanali(?, ? , ? ) ; ";

            updateKanali = dbConnection.prepareStatement(updateString);

            updateKanali.setString(1, title);

            if (digital_button.isSelected()) {
                String type = digital_button.getText();
                updateKanali.setString(2, type);
            }
            if (analog_button.isSelected()) {
                String type = analog_button.getText();
                updateKanali.setString(2, type);
            }
            updateKanali.setInt(3, id);
            updateKanali.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void insert_users() {
        int id = Integer.valueOf(user_id.getText());
        String name = user_name.getText();
        try {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String insertString = " SELECT add_user( ? , ? ) ; ";
            insertUsers = dbConnection.prepareStatement(insertString);
            insertUsers.setInt(2, id);
            insertUsers.setString(1, name);
            insertUsers.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "testMessage: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }

    }

    void insert_rating() {
        int usersid = Integer.valueOf(users.getText());
        int showid = Integer.valueOf(show.getText());
        int ratingnum = Integer.valueOf(rating.getText());

        String reviewStr = review.getText();

        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String insertString = " SELECT add_rating( ? , ? , ?, ? ) ; ";
            insertRating = dbConnection.prepareStatement(insertString);
            insertRating.setInt(1, usersid);
            insertRating.setInt(2, showid);
            insertRating.setInt(3, ratingnum);
            insertRating.setString(4, reviewStr);

            insertRating.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }

    }

    void update_rating() {
        int usersid = Integer.valueOf(users.getText());
        int showid = Integer.valueOf(show.getText());
        int ratingnum = Integer.valueOf(rating.getText());

        String reviewStr = review.getText();

        try {

            dbConnection = DriverManager.getConnection(url, username, passwd);
            String updateString = " SELECT * FROM update_rating(?, ? , ?, ? ) ; ";
            updateRating = dbConnection.prepareStatement(updateString);

            updateRating.setInt(3, usersid);
            updateRating.setInt(4, showid);
            updateRating.setInt(1, ratingnum);
            updateRating.setString(2, reviewStr);

            updateRating.executeQuery();
            //   Show_inJTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }

    }

    void update_programma() {
        int showid = Integer.valueOf(s_id.getText());

 
        Date date = jDateChooser1.getDate();
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
 

        Time jtime = Time.valueOf(progr_time.getText());
        int kanaliid = Integer.valueOf(k_id.getText());

        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);

            String updateString = " SELECT update_programma( ? , ? , ?, ? ) ; ";
            updateProgramma = dbConnection.prepareStatement(updateString);
            updateProgramma.setTime(1, jtime);
            updateProgramma.setDate(2, sqldate);
            updateProgramma.setInt(3, kanaliid);

            updateProgramma.setInt(4, showid);

            updateProgramma.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }

        }
    }

    void insert_show() {
        int id = Integer.valueOf(show_id.getText());

        String title = show_title.getText();
        int year = Integer.valueOf(jYearChooser1.getValue());
        String type = show_type.getText();
        int skhnotheths = Integer.valueOf(show_skhnotheths.getText());
        int kanali = Integer.valueOf(show_kanali.getText());
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String insertString = " SELECT add_show( ? , ? , ? , ? , ?, ? ) ; ";

            insertShow = dbConnection.prepareStatement(insertString);

            insertShow.setInt(1, id);
            insertShow.setString(2, title);
            insertShow.setInt(3, year);
            insertShow.setString(4, type);
            insertShow.setInt(5, skhnotheths);
            insertShow.setInt(6, kanali);

            insertShow.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }

    }

    void update_show1() {
        int id = Integer.valueOf(show_id.getText());

        String title = show_title.getText();
        int year = Integer.valueOf(jYearChooser1.getValue());
        String type = show_type.getText();
        int skhnotheths = Integer.valueOf(show_skhnotheths.getText());
        int kanali = Integer.valueOf(show_kanali.getText());
        try {

            dbConnection = DriverManager.getConnection(url, username, passwd);

            String updateString = " SELECT update_show1(?, ? , ?, ? , ? , ? ) ; ";

            updateShow = dbConnection.prepareStatement(updateString);
            updateShow.setInt(6, id);
            updateShow.setString(1, title);
            updateShow.setInt(2, year);
            updateShow.setString(3, type);
            updateShow.setInt(4, skhnotheths);
            updateShow.setInt(5, kanali);

            updateShow.executeQuery();
            //   Show_inJTable();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());

                ex = ex.getNextException();
            }
        }

    }

    private void cbkanaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkanaliActionPerformed

        String selectedKanali = String.valueOf(cbkanali.getSelectedItem());
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String selectString = " SELECT DISTINCT kanali_id( ? ) as id; ";
            selectKanali = dbConnection.prepareStatement(selectString);

            selectKanali.setString(1, selectedKanali);
            rs = selectKanali.executeQuery();

            while (rs.next()) {
                jTextField2.setText(rs.getString("id"));

            }

        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }//GEN-LAST:event_cbkanaliActionPerformed

    private void KANALI_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KANALI_ButtonActionPerformed

        Kanali_inJTable();

    }//GEN-LAST:event_KANALI_ButtonActionPerformed

    private void kanali_insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kanali_insert_ButtonActionPerformed
        insert_kanali();

        //  cbkanali.addItem(kanali_title.getText());
        mylist_kanali();

        Kanali_inJTable();


    }//GEN-LAST:event_kanali_insert_ButtonActionPerformed

    private void reset_kanali_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_kanali_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                final_reset.main(new String[0]);

            } catch (Exception ex) {

            }
        }
        KANALI_Table.setAutoCreateColumnsFromModel(true);
        mylist_kanali();
        Kanali_inJTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_reset_kanali_buttonActionPerformed

    private void RATINGSJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RATINGSJPMouseClicked

        mylist_show();

        USERS_JP0.setVisible(false);
        SHOWJP1.setVisible(false);

        SKHNOTHETHS_JP2.setVisible(false);
        KANALI_JP3.setVisible(false);
        PROGRAMMA_JP4.setVisible(false);
        RATINGS_JP5.setVisible(true);

        RATINGSJP.setBackground(Color.white);

        KANALIJP.setBackground(new Color(204, 204, 204));
        SKHNOTHETHSJP.setBackground(new Color(204, 204, 204));
        PROGRAMMAJP.setBackground(new Color(204, 204, 204));
        SHOWJP.setBackground(new Color(204, 204, 204));

        // TODO add your handling code here:
    }//GEN-LAST:event_RATINGSJPMouseClicked

    private void update_kanali_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_kanali_updateActionPerformed
        update_kanali();
        KANALI_Table.setAutoCreateColumnsFromModel(true);

        mylist_kanali();
        Kanali_inJTable();

    }//GEN-LAST:event_update_kanali_updateActionPerformed

    private void delete_kanali_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_kanali_updateActionPerformed
        delete_kanali();
        KANALI_Table.setAutoCreateColumnsFromModel(true);

        mylist_kanali();
        Kanali_inJTable();
        kanali_id.setText("");
        kanali_title.setText("");

    }//GEN-LAST:event_delete_kanali_updateActionPerformed

    private void USERSJPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERSJPMouseClicked

        USERS_JP0.setVisible(true);

        SHOWJP1.setVisible(false);
        SKHNOTHETHS_JP2.setVisible(false);
        KANALI_JP3.setVisible(false);
        PROGRAMMA_JP4.setVisible(false);
        RATINGS_JP5.setVisible(false);

        USERSJP.setBackground(Color.white);
        SHOWJP.setBackground(new Color(204, 204, 204));
        KANALIJP.setBackground(new Color(204, 204, 204));
        SKHNOTHETHSJP.setBackground(new Color(204, 204, 204));
        PROGRAMMAJP.setBackground(new Color(204, 204, 204));
        RATINGSJP.setBackground(new Color(204, 204, 204));        // TODO add your handling code here:
    }//GEN-LAST:event_USERSJPMouseClicked

    private void menuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_menuComponentShown
    }//GEN-LAST:event_menuComponentShown

    private void skhnotheths_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skhnotheths_buttonActionPerformed
        skhnotheths_table.setAutoCreateColumnsFromModel(true);
        Show_Skhnotheths_inJTable();        // TODO add your handling code here:
    }//GEN-LAST:event_skhnotheths_buttonActionPerformed

    private void insert_skhnotheths_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_skhnotheths_buttonActionPerformed

        insert_skhnotheths();
        skhnotheths_table.setAutoCreateColumnsFromModel(true);

        Show_Skhnotheths_inJTable();
    }//GEN-LAST:event_insert_skhnotheths_buttonActionPerformed

    private void update_skhnotheths_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_skhnotheths_buttonActionPerformed
        update_skhnotheths();
        skhnotheths_table.setAutoCreateColumnsFromModel(true);

        Show_Skhnotheths_inJTable();          // TODO add your handling code here:
    }//GEN-LAST:event_update_skhnotheths_buttonActionPerformed

    private void delete_skhnotheths_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_skhnotheths_buttonActionPerformed
        delete_skhnotheths();
        skhnotheths_table.setAutoCreateColumnsFromModel(true);

        Show_Skhnotheths_inJTable();
    }//GEN-LAST:event_delete_skhnotheths_buttonActionPerformed

    private void reset_skhnotheths_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_skhnotheths_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                final_reset.main(new String[0]);

            } catch (Exception ex) {
            }
            skhnotheths_table.setAutoCreateColumnsFromModel(true);
            Show_Skhnotheths_inJTable();
        }
    }//GEN-LAST:event_reset_skhnotheths_buttonActionPerformed

    private void cbkanali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkanali1ActionPerformed

        String selectedKanali = String.valueOf(cbkanali1.getSelectedItem());
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String selectString = " SELECT kanali_id( ? ) as id; ";
            selectKanali = dbConnection.prepareStatement(selectString);

            selectKanali.setString(1, selectedKanali);
            rs = selectKanali.executeQuery();

            while (rs.next()) {
                jTextField3.setText(rs.getString("id"));

            }

        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }//GEN-LAST:event_cbkanali1ActionPerformed

    private void skhnotheths_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skhnotheths_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skhnotheths_nameActionPerformed

    private void cb_shows_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_shows_typeActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        String selected_Show_type = String.valueOf(cb_shows_type.getSelectedItem());
        try {
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM select_show_type( ? ) as titlos ");
            pstm.setString(1, selected_Show_type);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                String name = rs.getString("titlos");
                Object[] row = {name};
                model.addRow(row);
            }
            if (model.getRowCount() == 0 && rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "no data",
                        "Ενημέρωση", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("no data");
            }
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cb_shows_typeActionPerformed

    private void cb_shows_typeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_shows_typeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_shows_typeKeyPressed

    private void insert_show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_show_buttonActionPerformed
        insert_show();
        jTable1.setAutoCreateColumnsFromModel(true);
        Show_inJTable();
        mylist_show_type();

    }//GEN-LAST:event_insert_show_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                final_reset.main(new String[0]);

            } catch (Exception ex) {

            }
        }
        jTable1.setAutoCreateColumnsFromModel(true);
        mylist_show_type();

        Show_inJTable();
        System.out.println("KALISPERA");
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed

        Show_inJTable();
        show_table.setAutoCreateColumnsFromModel(true);

    }//GEN-LAST:event_ShowButtonActionPerformed

    private void cbshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbshowActionPerformed

        String selectedShow = String.valueOf(cbshow.getSelectedItem());
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String selectString1 = "SELECT  * FROM    s_id(?)  as shows ; ";
            selectShow = dbConnection.prepareStatement(selectString1);

            selectShow.setString(1, selectedShow);
            selectShow.executeQuery();
            rs = selectShow.executeQuery();

            while (rs.next()) {
                //    String name = rs.getString("show_id");
                jTextField4.setText(rs.getString("shows")); // Set your DB values.

            }

        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbshowActionPerformed

    private void ratings_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratings_ButtonActionPerformed
        Rating_inJTable();        // TODO add your handling code here:
    }//GEN-LAST:event_ratings_ButtonActionPerformed

    private void ratings_insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratings_insert_ButtonActionPerformed
        insert_rating();

        Rating_inJTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_ratings_insert_ButtonActionPerformed

    private void update_ratings_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ratings_updateActionPerformed
        update_rating();

        Rating_inJTable();         // TODO add your handling code here:
    }//GEN-LAST:event_update_ratings_updateActionPerformed

    private void delete_ratings_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ratings_update1ActionPerformed
        delete_ratings();

        Rating_inJTable();   
        users.setText("");review.setText(""); rating.setText(""); show.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_delete_ratings_update1ActionPerformed

    private void reset_ratings_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_ratings_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                final_reset.main(new String[0]);

            } catch (Exception ex) {

            }
        }
        rating_Table.setAutoCreateColumnsFromModel(true);

        Rating_inJTable();
        System.out.println("KALISPERA");        // TODO add your handling code here:
    }//GEN-LAST:event_reset_ratings_buttonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void update_show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_show_buttonActionPerformed
        update_show1();
        mylist_show_type();

        // TODO add your handling code here:
        show_table.setAutoCreateColumnsFromModel(true);
//  Icon icon = new ImageIcon("C:\\Users\\user\\Documents\\blue1.6\\blue1.6\\src\\blue\\icons8-enter-key-40.png");
        //  JButton jButton1 = new JButton(icon);
        //  mylist_show_type();
        Show_inJTable();             // TODO add your handling code here:
    }//GEN-LAST:event_update_show_buttonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Είσαι σίγουρος; \n" + " Διαγράφοντας το show : " + show_title.getText() + " , με show id = " + show_id.getText() + "\n" + "AΥΤΟΜΑΤΑ διαγράφονται και τα RATINGS για αυτό το show!", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {

                delete_show();
                show_table.setAutoCreateColumnsFromModel(true);
                mylist_show_type();
                Show_inJTable();
                Rating_inJTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Message: " + e.getMessage());

            }
        }

        show_table.setAutoCreateColumnsFromModel(true);

        Show_Skhnotheths_inJTable();

        Kanali_inJTable();
        //   ιδ τιτλε υεαρ τυπε σκηνοτηετησ
        show_id.setText("");
        show_title.setText("");
        jYearChooser1.setValue(0);
        show_type.setText("");
        show_skhnotheths.setText("");
        show_kanali.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_buttonActionPerformed
        Users_inJTable();        // TODO add your handling code here:
    }//GEN-LAST:event_users_buttonActionPerformed

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void insert_users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_users_buttonActionPerformed
        insert_users();
        Users_inJTable();        // TODO add your handling code here:
    }//GEN-LAST:event_insert_users_buttonActionPerformed

    private void update_users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_users_buttonActionPerformed
        update_users();

        users_table.setAutoCreateColumnsFromModel(true);

        Users_inJTable();          // TODO add your handling code here:
    }//GEN-LAST:event_update_users_buttonActionPerformed

    private void delete_users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_users_buttonActionPerformed
        delete_users();
        Users_inJTable();


    }//GEN-LAST:event_delete_users_buttonActionPerformed

    private void reset_users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_users_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, " Είσαι σίγουρος; \n" + " Πατώντας RESET, ΑΥΤΟΜΑΤΑ διαγράφονται τα ratings ολων των χρηστών. ", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                users_reset.main(new String[0]);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Message: " + e.getMessage());

            }
        }
        users_table.setAutoCreateColumnsFromModel(true);
        //  mylist_kanali();
        Users_inJTable();
        Rating_inJTable();

    }//GEN-LAST:event_reset_users_buttonActionPerformed

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reviewActionPerformed

    private void skhnotheths_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skhnotheths_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skhnotheths_idActionPerformed

    private void progr_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progr_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progr_timeActionPerformed

    private void cbshow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbshow1ActionPerformed
        String selectedShowP = String.valueOf(cbshow1.getSelectedItem());
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String selectString = " SELECT * FROM  k_id( ? )  as k ; ";
            kid = dbConnection.prepareStatement(selectString);
            kid.setString(1, String.valueOf(cbshow1.getSelectedItem()));
            kid.executeQuery();
            rs = kid.executeQuery();
            while (rs.next()) {

                k_id.setText(rs.getString("k"));

            }
            String selectString1 = "SELECT  * FROM    s_id(?)  as s ; ";
            sid = dbConnection.prepareStatement(selectString1);
            sid.setString(1, String.valueOf(cbshow1.getSelectedItem()));
            sid.executeQuery();
            rs = sid.executeQuery();

            while (rs.next()) {

                s_id.setText(rs.getString("s"));

            }
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }


    }//GEN-LAST:event_cbshow1ActionPerformed

    void Kanali_inJTable() {
        DefaultTableModel model = (DefaultTableModel) KANALI_Table.getModel();
        //  Container cnt = this.getContentPane();
        JTable jtbl = new JTable(model);

//KANALI_Table.setTableHeader(Y);
        if (model.getRowCount() == 0) {

            model.addColumn(" I D ");
            model.addColumn(" Κ Α Ν Α Λ Ι ");
            model.addColumn(" Τ Υ Π Ο Σ ");
        }
        while (model.getRowCount() > 0) {
            {
                model.removeRow(0);
            }
        }
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
        }
        try {
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM   all_kanalia(); ");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2), Rs.getString(3)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "void Kanali_inJTable() Message: " + e.getMessage());
        }
        KANALI_Table.getColumnModel().getColumn(0).setMaxWidth(60);

        JScrollPane KANALI_ScrollPane = new JScrollPane(jtbl);
    }

    void insert_proramma() {
        int showid = Integer.valueOf(s_id.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = jDateChooser1.getDate();
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        System.out.println("jdate:" + date);
        System.out.println("sqldate:" + sqldate);

        Time jtime = Time.valueOf(progr_time.getText());

        int kanaliid = Integer.valueOf(k_id.getText());

        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String insertString = " SELECT add_programma( ? , ? , ?, ? ) ; ";
            insertProgramma = dbConnection.prepareStatement(insertString);

            insertProgramma.setInt(1, showid);
            insertProgramma.setTime(2, jtime);
            insertProgramma.setDate(3, sqldate);
            insertProgramma.setInt(4, kanaliid);

            insertProgramma.executeQuery();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }


    private void insert_programma_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_programma_buttonActionPerformed
        insert_proramma();
        Show_Programma_ALL_inJTable();

    }//GEN-LAST:event_insert_programma_buttonActionPerformed

    private void update_programma_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_programma_buttonActionPerformed
        update_programma();

         Show_Programma_ALL_inJTable();

        Users_inJTable();          // TODO add your handling code here:
    }//GEN-LAST:event_update_programma_buttonActionPerformed

    private void delete_programma_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_programma_buttonActionPerformed
        delete_programma();
        Show_Programma_ALL_inJTable();
        PROGRAMMA_Table.setAutoCreateColumnsFromModel(true);
        progr_time.setText("");
  

    }//GEN-LAST:event_delete_programma_buttonActionPerformed

    void Show_Programma_ALL_inJTable() {

        DefaultTableModel model = (DefaultTableModel) PROGRAMMA_Table.getModel();
        JTable jtbl = new JTable(model);
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            Class.forName(driverClassName);

        } catch (ClassNotFoundException ex) {
        }

        try {

            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("   select * FROM all_programmatv()  ;");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getTime(2), rs.getDate(3), rs.getString(4)});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
        }
        //   jtbl.setRowSorter(new TableRowSorter(model));
        //jtbl.setColumnControlVisible(true); 
        JScrollPane PROGRAMMA_ScrollPane = new JScrollPane(jtbl);
//
    }

    void Show_Programma_inJTable() {

        DefaultTableModel model = (DefaultTableModel) PROGRAMMA_Table.getModel();
        JTable jtbl = new JTable(model);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            Class.forName(driverClassName);

        } catch (ClassNotFoundException ex) {
        }

        String selectedKanaliP = String.valueOf(cbkanali2.getSelectedItem());
        try {
            dbConnection = DriverManager.getConnection(url, username, passwd);
            String selectString = "SELECT * FROM kanali_programmatv(?)  ";

            selectShow = dbConnection.prepareStatement(selectString);
            selectShow.setString(1, selectedKanaliP);

            rs = selectShow.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getTime(2), rs.getDate(3), rs.getString(4)});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
        }
        JScrollPane PROGRAMMA_ScrollPane = new JScrollPane(jtbl);

    }
    private void programma_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programma_buttonActionPerformed

        Show_Programma_ALL_inJTable();
        PROGRAMMA_Table.setAutoCreateColumnsFromModel(true);
    }//GEN-LAST:event_programma_buttonActionPerformed

    private void cbkanali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkanali2ActionPerformed
        String epilogi = String.valueOf(cbkanali2.getSelectedItem());
        PROGRAMMA_Table.setAutoCreateColumnsFromModel(true);
        Show_Programma_inJTable();
    }//GEN-LAST:event_cbkanali2ActionPerformed

    private void k_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k_idActionPerformed

    private void kanali_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kanali_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kanali_idActionPerformed

    private void show_skhnothethsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_skhnothethsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_show_skhnothethsActionPerformed

    private void jDateChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseExited
     }//GEN-LAST:event_jDateChooser1MouseExited

    private void jDateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1FocusLost

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    void Users_inJTable() {
        DefaultTableModel model = (DefaultTableModel) users_table.getModel();
        JTable jtbl = new JTable(model);

        if (model.getRowCount() == 0) {
            model.addColumn("U S E R  I D");
            model.addColumn("U S E R N A M E ");
        }
        while (model.getRowCount() > 0) {
            {
                model.removeRow(0);
            }
        }
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
        }
        try {

            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM all_users() AS t1; ");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getInt(2), Rs.getString(1)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Message: " + e.getMessage());
        }
        JScrollPane users_ScrollPane = new JScrollPane(jtbl);
    }

    void Rating_inJTable() {
        DefaultTableModel model = (DefaultTableModel) rating_Table.getModel();
        JTable jtbl = new JTable(model);

        if (model.getRowCount() == 0) {
            model.addColumn("ΟΝΟΜΑ");
            model.addColumn("ΤΙΤΛΟΣ");
            model.addColumn("ΒΑΘΜΟΣ");
            model.addColumn("ΣΧΟΛΙΟ");

        }
        while (model.getRowCount() > 0) {
            {
                model.removeRow(0);
            }
        }
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
        }
        try {
            Connection con = DriverManager.getConnection(url, username, passwd);

            PreparedStatement pstm = con.prepareStatement("  select * FROM all_ratings(); ");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString(1), Rs.getString(2), Rs.getInt(3), Rs.getString(4)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Message: " + e.getMessage());
        }
        rating_Table.getColumnModel().getColumn(0).setMaxWidth(50);
        rating_Table.getColumnModel().getColumn(1).setMinWidth(100);
        rating_Table.getColumnModel().getColumn(2).setMaxWidth(65);
        rating_Table.getColumnModel().getColumn(3).setPreferredWidth(200);
        rating_Table.setAutoResizeMode(rating_Table.AUTO_RESIZE_LAST_COLUMN);

        JScrollPane ratings_ScrollPane = new JScrollPane(jtbl);
    }

    void Show_inJTable() {
        DefaultTableModel model = (DefaultTableModel) show_table.getModel();
        JTable jtbl = new JTable(model);
        if (model.getRowCount() == 0) {
            model.addColumn(" ID ");
            model.addColumn(" ΟΝΟΜΑ SHOW ");
            model.addColumn(" ΕΤΟΣ ");
            model.addColumn(" ΕΙΔΟΣ ");
            model.addColumn(" ΣΚΗΝΟΘΕΤΗΣ ");
            model.addColumn(" ΚΑΝΑΛΙ ");

        }
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
        }
        try {
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM all_shows() ");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2), Rs.getInt(3), Rs.getString(4), Rs.getString(5), Rs.getString(6)});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Message: " + e.getMessage());
        }
        show_table.getColumnModel().getColumn(0).setMaxWidth(50);
        show_table.getColumnModel().getColumn(1).setMinWidth(125);

        show_table.getColumnModel().getColumn(2).setMaxWidth(50);
        show_table.getColumnModel().getColumn(3).setMinWidth(50);
        show_table.getColumnModel().getColumn(4).setMinWidth(100);

        show_table.getColumnModel().getColumn(5).setMaxWidth(60);

        JScrollPane pg1 = new JScrollPane(jtbl);
    }

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
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    void Show_Skhnotheths_inJTable() {
        DefaultTableModel model = (DefaultTableModel) skhnotheths_table.getModel();
        JTable jtbl = new JTable(model);

        if (model.getRowCount() == 0) {
            model.addColumn(" ID");
            model.addColumn("ΟΝΟΜΑ ΣΚΗΝΟΘΕΤΗ");

        }
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
        }
        try {
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM all_skhnothetes() ;");
            ResultSet Rs = pstm.executeQuery();
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getInt(1), Rs.getString(2)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Message: " + e.getMessage());
        }
        skhnotheths_table.getColumnModel().getColumn(0).setMaxWidth(50);
        skhnotheths_table.getColumnModel().getColumn(1).setPreferredWidth(200);
        skhnotheths_table.setAutoResizeMode(rating_Table.AUTO_RESIZE_LAST_COLUMN);

        JScrollPane SKHNOTHETHS_ScrollPane = new JScrollPane(jtbl);

    }

    void mylist_show() {
        int i = 0;

        try {
            cbshow.removeAllItems();
            cbshow1.removeAllItems();
            cbshow.addItem("");

            cbshow1.addItem("");
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM cb_show() as shows ; ");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                cbshow.addItem(rs.getString("shows"));

                cbshow1.addItem(rs.getString("shows"));
            }

        } catch (SQLException ex) {
            while (ex != null) {
                ex = ex.getNextException();
            }
        }
    }

    void mylist_kanali() {
        int i = 0;

        try {

            cbkanali.removeAllItems();

            cbkanali.addItem("");
            cbkanali1.removeAllItems();

            cbkanali1.addItem("");
            cbkanali2.removeAllItems();

            cbkanali2.addItem("");
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM cb_kanali() as kanalia ; ");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                cbkanali.addItem(rs.getString("kanalia"));
                cbkanali1.addItem(rs.getString("kanalia"));
                cbkanali2.addItem(rs.getString("kanalia"));

            }

        } catch (SQLException ex) {
            while (ex != null) {
                ex = ex.getNextException();
            }
        }
        /*     cbkanali.removeAllItems();
    //   cbkanali.addItem("");
        for (int y = 0; y < i; y++) {
            cbkanali.addItem(myKanali[y]);
        }
       // cbkanali.repaint();
        cbkanali.setSelectedItem("MEGA");
        cbkanali1.removeAllItems();
      //  cbkanali1.addItem("");
        for (int y = 0; y < i; y++) {
            cbkanali1.addItem(myKanali[y]);
        }
        cbkanali2.removeAllItems();
      //  cbkanali2.addItem("");
        for (int y = 0; y < i; y++) {
            cbkanali2.addItem(myKanali[y]);
        }*/
    }

    void mylist_show_type() {
        int i = 0;

        try {

            cb_shows_type.removeAllItems();

            cb_shows_type.addItem("");
            Connection con = DriverManager.getConnection(url, username, passwd);
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM cb_showtype() as type ; ");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                cb_shows_type.addItem(rs.getString("type"));
            }

        } catch (SQLException ex) {
            while (ex != null) {
                ex = ex.getNextException();
            }
        }
    }

    static String driverClassName = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it174948";
    static Connection dbConnection = null;
    static String username = "it174948";
    static String passwd = "Kwdikos98!";
    static Statement statement = null;
    static PreparedStatement login = null;
    static PreparedStatement deleteRating = null;
    static PreparedStatement deleteShow = null;
    static PreparedStatement deleteUsers = null;
    static PreparedStatement deleteSkhnotheths = null;
    static PreparedStatement deleteKanali = null;
    static PreparedStatement deleteProgramma = null;

    static PreparedStatement updateSkhnotheths = null;
    static PreparedStatement updateRating = null;
    static PreparedStatement updateProgramma = null;

    static PreparedStatement updateShow = null;
    static PreparedStatement updateUsers = null;
    static PreparedStatement updateKanali = null;
    static PreparedStatement insertUsers = null;
    static PreparedStatement insertKanali = null;
    static PreparedStatement insertShow = null;
    static PreparedStatement insertSkhnotheths = null;
    static PreparedStatement insertRating = null;
    static PreparedStatement selectUsers = null;
    static PreparedStatement select_skhnotheths = null;
    static PreparedStatement select_show_type = null;
    String[] my_show_type = new String[200];
    static ResultSet rs = null;
    static PreparedStatement insertProgramma = null;
    static PreparedStatement selectKanaliP = null;
    static PreparedStatement selectShowP = null;

    static PreparedStatement selectShow = null;
    String[] myShow = new String[50];
    static PreparedStatement kid = null;
    static PreparedStatement sid = null;

    static PreparedStatement selectShowKanali = null;
    static PreparedStatement selectKanali = null;
    String[] myKanali = new String[200];
    String[] myKanaliP = new String[200];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KANALIJL;
    private javax.swing.JPanel KANALIJP;
    private javax.swing.JButton KANALI_Button;
    private javax.swing.JPanel KANALI_JP3;
    private javax.swing.JLabel KANALI_Label;
    private javax.swing.JLabel KANALI_Label1;
    private javax.swing.JLabel KANALI_Label2;
    private javax.swing.JLabel KANALI_Label3;
    private javax.swing.JLabel KANALI_Label4;
    private javax.swing.JPanel KANALI_Panel;
    private javax.swing.JPanel KANALI_Panel1;
    private javax.swing.JScrollPane KANALI_ScrollPane;
    private javax.swing.JTable KANALI_Table;
    private javax.swing.JLabel PROGRAMMAJL;
    private javax.swing.JPanel PROGRAMMAJP;
    private javax.swing.JPanel PROGRAMMA_JP4;
    private javax.swing.JLabel PROGRAMMA_Label1;
    private javax.swing.JLabel PROGRAMMA_Label3;
    private javax.swing.JLabel PROGRAMMA_Label5;
    private javax.swing.JPanel PROGRAMMA_Panel1;
    private javax.swing.JScrollPane PROGRAMMA_ScrollPane1;
    private javax.swing.JTable PROGRAMMA_Table;
    private javax.swing.JLabel RATINGSJL;
    private javax.swing.JPanel RATINGSJP;
    private javax.swing.JPanel RATINGS_JP5;
    private javax.swing.JLabel SHOWJL;
    private javax.swing.JPanel SHOWJP;
    private javax.swing.JPanel SHOWJP1;
    private javax.swing.JPanel SHOW_Panel;
    private javax.swing.JScrollPane SHOW_ScrollPane;
    private javax.swing.JPanel SHOW_jPanel;
    private javax.swing.JLabel SKHNOTHETHSJL;
    private javax.swing.JPanel SKHNOTHETHSJP;
    private javax.swing.JPanel SKHNOTHETHS_JP2;
    private javax.swing.JScrollPane SKHNOTHETHS_ScrollPane;
    private javax.swing.JButton ShowButton;
    private javax.swing.JLabel USERSJL1;
    private javax.swing.JPanel USERSJP;
    private javax.swing.JPanel USERS_JP0;
    private javax.swing.JRadioButton analog_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cb_shows_type;
    private javax.swing.JComboBox<String> cbkanali;
    private javax.swing.JComboBox<String> cbkanali1;
    private javax.swing.JComboBox<String> cbkanali2;
    private javax.swing.JComboBox<String> cbshow;
    private javax.swing.JComboBox<String> cbshow1;
    private javax.swing.JButton delete_kanali_update;
    private javax.swing.JButton delete_programma_button;
    private javax.swing.JButton delete_ratings_update1;
    private javax.swing.JButton delete_skhnotheths_button;
    private javax.swing.JButton delete_users_button;
    private javax.swing.JRadioButton digital_button;
    private javax.swing.JButton insert_programma_button;
    private javax.swing.JButton insert_show_button;
    private javax.swing.JButton insert_skhnotheths_button;
    private javax.swing.JButton insert_users_button;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTextField k_id;
    private javax.swing.JTextField kanali_id;
    private javax.swing.JButton kanali_insert_Button;
    private javax.swing.JTextField kanali_title;
    private javax.swing.JPanel menu;
    private javax.swing.JScrollPane pg1;
    private javax.swing.JTextField progr_time;
    private javax.swing.JButton programma_button;
    private javax.swing.JTextField rating;
    private javax.swing.JTable rating_Table;
    private javax.swing.JButton ratings_Button;
    private javax.swing.JPanel ratings_Panel;
    private javax.swing.JScrollPane ratings_ScrollPane;
    private javax.swing.JButton ratings_insert_Button;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton reset_kanali_button;
    private javax.swing.JButton reset_ratings_button;
    private javax.swing.JButton reset_skhnotheths_button;
    private javax.swing.JButton reset_users_button;
    private javax.swing.JTextField review;
    private javax.swing.JTextField s_id;
    private javax.swing.JTextField show;
    private javax.swing.JTextField show_id;
    private javax.swing.JTextField show_kanali;
    private javax.swing.JTextField show_skhnotheths;
    private javax.swing.JTable show_table;
    private javax.swing.JTextField show_title;
    private javax.swing.JTextField show_type;
    private javax.swing.JPanel skhn;
    private javax.swing.JButton skhnotheths_button;
    private javax.swing.JTextField skhnotheths_id;
    private javax.swing.JTextField skhnotheths_name;
    private javax.swing.JTable skhnotheths_table;
    private javax.swing.JPanel subject;
    private javax.swing.JButton update_kanali_update;
    private javax.swing.JButton update_programma_button;
    private javax.swing.JButton update_ratings_update;
    private javax.swing.JButton update_show_button;
    private javax.swing.JButton update_skhnotheths_button;
    private javax.swing.JButton update_users_button;
    private javax.swing.JTextField user_id;
    private javax.swing.JTextField user_name;
    private javax.swing.JTextField users;
    private javax.swing.JScrollPane users_ScrollPane;
    private javax.swing.JButton users_button;
    private javax.swing.JTable users_table;
    private javax.swing.JPanel usersjp;
    private javax.swing.JPanel usersjp1;
    private javax.swing.JPanel usersjp3;
    // End of variables declaration//GEN-END:variables
}
