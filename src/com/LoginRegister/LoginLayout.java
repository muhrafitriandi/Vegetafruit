package com.LoginRegister;
import com.Admin.Admin;
import com.PlaceHolder.PlaceHolder;
import com.User.User;
import com.Connection.MyConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static com.Connection.MyConnection.getConnection;
import com.Interface.Regex;
import com.Register.Register;
import com.User.About;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    matches(): digunakan untuk mencocokkan apakah String yang dibandingkan sesuai dengan regex yang diberikan atau tidak.
    executeUpdate(): mengeksekusi perintah insert.
*/

public class LoginLayout extends Register implements Regex { // Kelas LoginLayout sebagai Subclass dari Kelas Register yang Mengimplementasikan Regex
    // Menjadikan String sebagai final/immutable.
    /* patternFullname: String hanya menerima huruf [A-Z atau a-z] dengan panjang minimal 1
                        diikuti spasi(opsional), dst. sampai terbentuk menjadi 5 kata.
    */
    /* patternEmail: String hanya menerima huruf dan angka [a-z atau 0-9] dengan panjang minimal 1 dan maksimal 30
                     harus diikuti oleh simbol '@', dan
                     huruf [a-z] dengan panjang minimal 1 dan maksimal 10, dan
                     simbol '.', dan
                     huruf [a-z] dengan panjang minimal 1 dan maksimal 5.
    */
    /*
       patternUsername: String hanya menerima huruf [a-z] dengan panjang minimal 1 dan maksimal 30
                        harus diikuti simbol '.' atau '_', dan
                        huruf [a-z] dengan panjang minimal 1 dan maksimal 30
    */
    /*
       patterPhoneNumber: String hanya menerima angka [0-9] dengan panjang minimal 1 dan maksimal 16
    */
    /*
       patternPassword: String hanya menerima [huruf, angka, beberapa simbol] dengan panjang minimal 8 dan maksimal 12
    */
    private static final String patternFullname = "(^[A-Za-z]{1,})([ ]{0,1})([A-Za-z]{0,})([ ]{0,1})([A-Za-z]{0,})([ ]{0,1})([A-Za-z]{0,})([ ]{0,1})([A-Za-z]{0,})$";
    private static final String patternEmail = "^[a-z0-9]{1,30}[@][a-z]{1,10}[.][a-z]{1,5}$";
    private static final String patternUsername = "^[a-z]{1,30}[._][a-z]{1,30}$";
    private static final String patternPhoneNumber = "^[0-9]{1,16}$";
    private static final String patternPassword = "^[A-Za-z0-9#?!@$%^&*-]{8,12}$";
    
    public void validationFullName() {
        if(tf_fullname_register.getText().matches(patternFullname)) { // jika inputan cocok
            lbl_fullname_warning.setVisible(false); // pesan tidak akan muncul
        }else { // selain itu
            lbl_fullname_warning.setVisible(true); // pesan akan muncul
        }
    }
    
    /**
     * 
     * @param fullName mengoverride dari method abstrak di Interface Regex
     * @return true jika inputan cocok
     */
    @Override
    public boolean validationFullName(String fullName) {
        if(fullName.matches(patternFullname)) { // jika inputan cocok
            return true; // mengembalikan nilai true
        }else { // selain itu
            return false; // mengembalikan nilai false
        }
    }
    
    public void validationEmail() {
        if(tf_email_register.getText().matches(patternEmail)) { // jika inputan cocok
            lbl_email_warning.setVisible(false); // pesan tidak akan muncul
        }else { // selain itu
            lbl_email_warning.setVisible(true); // pesan akan muncul
        }        
    }
    
    /**
     * 
     * @param email mengoverride dari method abstrak di Interface Regex
     * @return true jika inputan cocok
     */    
    @Override
    public boolean validationEmail(String email) {
        if(email.matches(patternEmail)) { // jika inputan cocok
            return true; // mengembalikan nilai true
        }else { // selain itu
            return false; // mengembalikan nilai false
        }
    }
    
    public void validationUsername() {
        if(tf_username_register.getText().matches(patternUsername)) { // jika inputan cocok
            lbl_username_warning.setVisible(false); // pesan tidak akan muncul
        }else { // selain itu
            lbl_username_warning.setVisible(true); // pesan akan muncul
        }           
    }
    
    /**
     * 
     * @param username mengoverride dari method abstrak di Interface Regex
     * @return true jika inputan cocok
     */    
    @Override
    public boolean validationUsername(String username) {
        if(username.matches(patternUsername)) { // jika inputan cocok
            return true; // mengembalikan nilai true
        }else { // selain itu
            return false; // mengembalikan nilai false
        }
    }

    public void validationPassword() {
        if(pf_password_register.getText().matches(patternPassword)) { // jika inputan cocok
            lbl_password_warning.setVisible(false); // pesan tidak akan muncul
        }else { // selain itu
            lbl_password_warning.setVisible(true); // pesan akan muncul
        }           
    }
    
    public void validationConfirmPassword() {
        String password = pf_password_register.getText();
        String confirmPassword = pf_confirmpassword_register.getText();
        
        if(!password.equals(confirmPassword)) { // jika password tidak cocok dengan confirm password
            lbl_confirmpassword_warning.setVisible(true); // pesan akan muncul
        }else { // selain itu
            lbl_confirmpassword_warning.setVisible(false); // pesan tidak akan muncul
        }          
    }
    
    /**
     * 
     * @param password mengoverride dari method abstrak di Interface Regex
     * @return true jika inputan cocok
     */    
    @Override
    public boolean validationPassword(String password) {
        if(password.matches(patternPassword)) { // jika password cocok
            if(password.equals(pf_confirmpassword_register.getText())) { // jika password cocok dengan confirm password
                return true; // mengembalikan nilai true
            }else { // selain itu
                return false; // mengembalikan nilai false
            }
        }else { // selain itu
            return false; // mengembalikan nilai false
        }
    }
    
    public void validationPhoneNumber() {
        if(tf_phonenumber_register.getText().matches(patternPhoneNumber)) { // jika inputan cocok
            lbl_phonenumber_warning.setVisible(false); // pesan tidak akan muncul
        }else { // selain itu
            lbl_phonenumber_warning.setVisible(true); // pesan akan muncul
        }         
    }
    
    /**
     * 
     * @param phoneNumber mengoverride dari method abstrak di Interface Regex
     * @return true jika inputan cocok
     */    
    @Override
    public boolean validationPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches(patternPhoneNumber)) { // jika inputan cocok
            return true; // mengembalikan nilai true
        }else { // selain itu
            return false; // mengembalikan nilai false
        }
    }
    
    public boolean isFormEmpty() {
        // jika salah satu form/field ada yang kosong, maka akan memunculkan,
        if(tf_fullname_register.getText().equals("") || tf_email_register.getText().equals("")
            || tf_username_register.getText().equals("") || pf_password_register.getText().equals("")
            || pf_confirmpassword_register.getText().equals("") || tf_phonenumber_register.getText().equals("")) {
            // pesan peringatan. dan mengatakan bahwa "Form tidak boleh kosong!" atau harus terisi.
            JOptionPane.showMessageDialog(null, "Form cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false; // mengembalikan nilai false
        }else { // selain itu
            return true; // mengembalikan nilai true
        }
    }
    
    public void clearFormRegister() {
        // menghapus form/field Register
        tf_fullname_register.setText("");
        tf_email_register.setText("");
        tf_username_register.setText("");
        pf_password_register.setText("");
        pf_confirmpassword_register.setText("");
        tf_phonenumber_register.setText("");
    }
    
    public void clearFormLogin() {
        // menghapus form/field Login
        tf_username_login.setText("");
        pf_password_login.setText("");        
    }
    
    public void clearPalleteLogin() {
        lbl_login.setVisible(false); // pallete label_login akan hilang
        lbl_dhac.setVisible(false);  // pallete label_don't have an account tidak akan muncul

        tf_username_login.setVisible(false); // pallete textfield_username_login akan hilang
        pf_password_login.setVisible(false); // pallete passwordfield_password_login akan hilang

        hideeye_password_login.setVisible(false); // pallete hideeye_password_login akan hilang
        showeye_password_login.setVisible(false); // pallete showeye_password_login akan hilang

        btn_signIn.setVisible(false); // pallete button_signIn akan hilang
        btn_register.setVisible(false); // pallete button_register akan hilang        
    }
    
    public void showPalleteLogin() {
        lbl_login.setVisible(true); // pallete label_login akan muncul
        lbl_dhac.setVisible(true); // pallete label_don't have an account akan muncul
        
        tf_username_login.setVisible(true); // pallete textfield_username_login akan muncul
        pf_password_login.setVisible(true); // pallete passwordfield_password_login akan muncul
        
        showeye_password_login.setVisible(true); // pallete showeye_password_login akan muncul
        hideeye_password_login.setVisible(false); // palete hideeye_password_login akan hilang
        
        btn_signIn.setVisible(true); // pallete button_signIn akan muncul
        btn_register.setVisible(true); // pallete button_register akan muncul        
    }
    
    public void clearPalleteRegister() {
        // pesan peringatan tidak akan muncul
        lbl_fullname_warning.setVisible(false);
        lbl_email_warning.setVisible(false);
        lbl_username_warning.setVisible(false);
        lbl_password_warning.setVisible(false);
        lbl_confirmpassword_warning.setVisible(false);
        lbl_phonenumber_warning.setVisible(false);       
    }
        
    Connection connection = null;
    public LoginLayout() {
        initComponents();
        // Saat mengklik button register/signup di Panel Login
        btn_register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_register.setVisible(true); // semua pallete dari panel_register akan muncul
                // method menghapus pallete warning message register
                clearPalleteRegister();
                
                // method menghapus text form/field Register
                clearFormRegister();
                
                // method menghapus pallete login
                clearPalleteLogin();
            }
        });
        
        // Saat mengklik button back di Panel Register
        btn_back.addActionListener(e -> {
            panel_register.setVisible(false); // semua pallete dari panel_register akan hilang

            // text form/field Login akan menjadi kosong
            // method menghapus text form/field Login
            clearFormLogin();
            
            // method memunculkan pallete Login
            showPalleteLogin();
        });
        
        getConnection();
        //------
        // membuat objek Kelas PlaceHolder yang akan diisi parameter("text_placeholder" , variable_name_layout);
        // Login
        PlaceHolder pl1 = new PlaceHolder("Phone number, email or username", tf_username_login);
        PlaceHolder pl2 = new PlaceHolder("Password", pf_password_login);
        // Register
        PlaceHolder pl3 = new PlaceHolder("Full Name", tf_fullname_register);
        PlaceHolder pl4 = new PlaceHolder("Email", tf_email_register);
        PlaceHolder pl5 = new PlaceHolder("Username", tf_username_register);
        PlaceHolder pl6 = new PlaceHolder("Password", pf_password_register);
        PlaceHolder pl7 = new PlaceHolder("Confirm Password", pf_confirmpassword_register);
        PlaceHolder pl8 = new PlaceHolder("Phone Number", tf_phonenumber_register);
        // ---------------------------
        LoginActivity.slideShow(); // memanggil Kelas LoginActivity.methodslideShow();
        panel_register.setVisible(false); // semua pallete dari panel_register tidak akan muncul
        hideeye_password_login.setVisible(false); // pallete hideeye_password di Panel Login tidak akan muncul
        hideeye_password_register.setVisible(false); // pallete hideeye_password di Panel Register tidak akan muncul
        hideeye_confirmpassword_register.setVisible(false); // pallete hideeye_confirmpassword di Panel Register tidak akan muncul
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        panel_slideshow = new javax.swing.JPanel();
        judul1 = new javax.swing.JLabel();
        deskripsi1a = new javax.swing.JLabel();
        deskripsi1b = new javax.swing.JLabel();
        gambar1 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JLabel();
        gambar3 = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        tf_username_login = new javax.swing.JTextField();
        showeye_password_login = new javax.swing.JLabel();
        hideeye_password_login = new javax.swing.JLabel();
        pf_password_login = new javax.swing.JPasswordField();
        btn_signIn = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        lbl_dhac = new javax.swing.JLabel();
        panel_register = new javax.swing.JPanel();
        lbl_register = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        tf_fullname_register = new javax.swing.JTextField();
        tf_email_register = new javax.swing.JTextField();
        tf_username_register = new javax.swing.JTextField();
        showeye_password_register = new javax.swing.JLabel();
        hideeye_password_register = new javax.swing.JLabel();
        pf_password_register = new javax.swing.JPasswordField();
        showeye_confirmpassword_register = new javax.swing.JLabel();
        hideeye_confirmpassword_register = new javax.swing.JLabel();
        pf_confirmpassword_register = new javax.swing.JPasswordField();
        tf_phonenumber_register = new javax.swing.JTextField();
        btn_signUp = new javax.swing.JButton();
        lbl_fullname_warning = new javax.swing.JLabel();
        lbl_email_warning = new javax.swing.JLabel();
        lbl_username_warning = new javax.swing.JLabel();
        lbl_password_warning = new javax.swing.JLabel();
        lbl_confirmpassword_warning = new javax.swing.JLabel();
        lbl_phonenumber_warning = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_slideshow.setBackground(new java.awt.Color(255, 255, 255));
        panel_slideshow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul1.setBackground(new java.awt.Color(255, 255, 255));
        judul1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        judul1.setForeground(new java.awt.Color(255, 255, 255));
        judul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_slideshow.add(judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 500, -1));

        deskripsi1a.setBackground(new java.awt.Color(255, 255, 255));
        deskripsi1a.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        deskripsi1a.setForeground(new java.awt.Color(255, 255, 255));
        deskripsi1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deskripsi1a.setToolTipText("");
        panel_slideshow.add(deskripsi1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 500, -1));

        deskripsi1b.setBackground(new java.awt.Color(255, 255, 255));
        deskripsi1b.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        deskripsi1b.setForeground(new java.awt.Color(255, 255, 255));
        deskripsi1b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_slideshow.add(deskripsi1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 500, -1));

        gambar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/vegetable1.jpg"))); // NOI18N
        panel_slideshow.add(gambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        gambar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/fruit1.jpg"))); // NOI18N
        panel_slideshow.add(gambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 500));

        gambar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/vegetable2.jpg"))); // NOI18N
        panel_slideshow.add(gambar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 500, 500));

        container.add(panel_slideshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        panel_login.setBackground(new java.awt.Color(31, 36, 42));
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login.setFont(new java.awt.Font("Showcard Gothic", 3, 28)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(102, 204, 0));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("Login");
        panel_login.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, -1));

        tf_username_login.setBackground(new java.awt.Color(31, 36, 42));
        tf_username_login.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        tf_username_login.setForeground(new java.awt.Color(255, 255, 255));
        tf_username_login.setToolTipText("");
        tf_username_login.setAlignmentX(2.0F);
        tf_username_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        tf_username_login.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_username_login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_username_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tf_username_loginMouseMoved(evt);
            }
        });
        tf_username_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_username_loginActionPerformed(evt);
            }
        });
        tf_username_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_username_loginKeyTyped(evt);
            }
        });
        panel_login.add(tf_username_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, 40));

        showeye_password_login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showeye_password_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/showeye.png"))); // NOI18N
        showeye_password_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showeye_password_loginMousePressed(evt);
            }
        });
        panel_login.add(showeye_password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 20, 40));

        hideeye_password_login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hideeye_password_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hideeye.png"))); // NOI18N
        hideeye_password_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideeye_password_loginMousePressed(evt);
            }
        });
        panel_login.add(hideeye_password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 20, 40));

        pf_password_login.setBackground(new java.awt.Color(31, 36, 42));
        pf_password_login.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        pf_password_login.setForeground(new java.awt.Color(255, 255, 255));
        pf_password_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        pf_password_login.setCaretColor(new java.awt.Color(255, 255, 255));
        pf_password_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_password_loginActionPerformed(evt);
            }
        });
        panel_login.add(pf_password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 260, 40));

        btn_signIn.setBackground(new java.awt.Color(102, 204, 0));
        btn_signIn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_signIn.setForeground(new java.awt.Color(21, 25, 28));
        btn_signIn.setText("Sign In");
        btn_signIn.setBorder(null);
        btn_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signIn.setFocusPainted(false);
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });
        panel_login.add(btn_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 260, 40));

        btn_register.setBackground(new java.awt.Color(102, 204, 0));
        btn_register.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(102, 204, 0));
        btn_register.setText("Sign Up");
        btn_register.setBorder(null);
        btn_register.setBorderPainted(false);
        btn_register.setContentAreaFilled(false);
        btn_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_register.setRequestFocusEnabled(false);
        btn_register.setVerifyInputWhenFocusTarget(false);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        btn_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_registerKeyTyped(evt);
            }
        });
        panel_login.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 60, 30));

        lbl_dhac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_dhac.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dhac.setText("Don't have an account?");
        panel_login.add(lbl_dhac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 30));

        panel_register.setBackground(new java.awt.Color(31, 36, 42));
        panel_register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_register.setFont(new java.awt.Font("Showcard Gothic", 3, 28)); // NOI18N
        lbl_register.setForeground(new java.awt.Color(102, 204, 0));
        lbl_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_register.setText("Register");
        panel_register.add(lbl_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, -1));

        btn_back.setBackground(new java.awt.Color(102, 204, 0));
        btn_back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(102, 204, 0));
        btn_back.setText("Back");
        btn_back.setBorder(null);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setRequestFocusEnabled(false);
        btn_back.setVerifyInputWhenFocusTarget(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        panel_register.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 500, 20));

        tf_fullname_register.setBackground(new java.awt.Color(31, 36, 42));
        tf_fullname_register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tf_fullname_register.setForeground(new java.awt.Color(255, 255, 255));
        tf_fullname_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        tf_fullname_register.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_fullname_register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tf_fullname_registerMouseMoved(evt);
            }
        });
        tf_fullname_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fullname_registerActionPerformed(evt);
            }
        });
        tf_fullname_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_fullname_registerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_fullname_registerKeyTyped(evt);
            }
        });
        panel_register.add(tf_fullname_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 330, 30));

        tf_email_register.setBackground(new java.awt.Color(31, 36, 42));
        tf_email_register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tf_email_register.setForeground(new java.awt.Color(255, 255, 255));
        tf_email_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        tf_email_register.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_email_register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tf_email_registerMouseMoved(evt);
            }
        });
        tf_email_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_email_registerActionPerformed(evt);
            }
        });
        tf_email_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_email_registerKeyReleased(evt);
            }
        });
        panel_register.add(tf_email_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 330, 30));

        tf_username_register.setBackground(new java.awt.Color(31, 36, 42));
        tf_username_register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tf_username_register.setForeground(new java.awt.Color(255, 255, 255));
        tf_username_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        tf_username_register.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_username_register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tf_username_registerMouseMoved(evt);
            }
        });
        tf_username_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_username_registerActionPerformed(evt);
            }
        });
        tf_username_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_username_registerKeyReleased(evt);
            }
        });
        panel_register.add(tf_username_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 330, 30));

        showeye_password_register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showeye_password_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/showeye.png"))); // NOI18N
        showeye_password_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showeye_password_registerMousePressed(evt);
            }
        });
        panel_register.add(showeye_password_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 20, 30));

        hideeye_password_register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hideeye_password_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hideeye.png"))); // NOI18N
        hideeye_password_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideeye_password_registerMousePressed(evt);
            }
        });
        panel_register.add(hideeye_password_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 20, 30));

        pf_password_register.setBackground(new java.awt.Color(31, 36, 42));
        pf_password_register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        pf_password_register.setForeground(new java.awt.Color(255, 255, 255));
        pf_password_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        pf_password_register.setCaretColor(new java.awt.Color(255, 255, 255));
        pf_password_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_password_registerActionPerformed(evt);
            }
        });
        pf_password_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_password_registerKeyReleased(evt);
            }
        });
        panel_register.add(pf_password_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 330, 30));

        showeye_confirmpassword_register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showeye_confirmpassword_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/showeye.png"))); // NOI18N
        showeye_confirmpassword_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showeye_confirmpassword_registerMousePressed(evt);
            }
        });
        panel_register.add(showeye_confirmpassword_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 20, 30));

        hideeye_confirmpassword_register.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hideeye_confirmpassword_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hideeye.png"))); // NOI18N
        hideeye_confirmpassword_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideeye_confirmpassword_registerMousePressed(evt);
            }
        });
        panel_register.add(hideeye_confirmpassword_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 20, 30));

        pf_confirmpassword_register.setBackground(new java.awt.Color(31, 36, 42));
        pf_confirmpassword_register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        pf_confirmpassword_register.setForeground(new java.awt.Color(255, 255, 255));
        pf_confirmpassword_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        pf_confirmpassword_register.setCaretColor(new java.awt.Color(255, 255, 255));
        pf_confirmpassword_register.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf_confirmpassword_registerFocusLost(evt);
            }
        });
        pf_confirmpassword_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_confirmpassword_registerActionPerformed(evt);
            }
        });
        pf_confirmpassword_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_confirmpassword_registerKeyReleased(evt);
            }
        });
        panel_register.add(pf_confirmpassword_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 330, 30));

        tf_phonenumber_register.setBackground(new java.awt.Color(31, 36, 42));
        tf_phonenumber_register.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tf_phonenumber_register.setForeground(new java.awt.Color(255, 255, 255));
        tf_phonenumber_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));
        tf_phonenumber_register.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_phonenumber_register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tf_phonenumber_registerMouseMoved(evt);
            }
        });
        tf_phonenumber_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phonenumber_registerActionPerformed(evt);
            }
        });
        tf_phonenumber_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_phonenumber_registerKeyReleased(evt);
            }
        });
        panel_register.add(tf_phonenumber_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 330, 30));

        btn_signUp.setBackground(new java.awt.Color(102, 204, 0));
        btn_signUp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_signUp.setForeground(new java.awt.Color(21, 25, 28));
        btn_signUp.setText("Sign Up");
        btn_signUp.setBorder(null);
        btn_signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signUp.setFocusPainted(false);
        btn_signUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_signUpFocusLost(evt);
            }
        });
        btn_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signUpActionPerformed(evt);
            }
        });
        panel_register.add(btn_signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 330, 40));

        lbl_fullname_warning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_fullname_warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_fullname_warning.setText("Names cannot contain numbers or symbols");
        panel_register.add(lbl_fullname_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 330, -1));

        lbl_email_warning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_email_warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_email_warning.setText("Please include an '@' in the email address");
        panel_register.add(lbl_email_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 330, -1));

        lbl_username_warning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_username_warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_username_warning.setText("Username must be include '.' or '_'");
        panel_register.add(lbl_username_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 330, -1));

        lbl_password_warning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_password_warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_password_warning.setText("Password must be atleast 8 characters");
        panel_register.add(lbl_password_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 330, -1));

        lbl_confirmpassword_warning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_confirmpassword_warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_confirmpassword_warning.setText("Password and Confirm Password doesn't macth");
        panel_register.add(lbl_confirmpassword_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 330, -1));

        lbl_phonenumber_warning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_phonenumber_warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_phonenumber_warning.setText("Phone Number cannot contain letters or symbols");
        panel_register.add(lbl_phonenumber_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 330, -1));

        panel_login.add(panel_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        container.add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 500));

        getContentPane().add(container, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // saat mengklik button sign in di LoginLayout
    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        String username = tf_username_login.getText();
        String email = tf_username_login.getText();
        String phoneNumber = tf_username_login.getText();
        String password = pf_password_login.getText();
        
        connection = MyConnection.getConnection();
        
        try {
            // Mengambil data yang ada di database mysql.
            // fullname, username, password, id_role dari tabel register dan dijoinkan dengan tabel role yang menampilkan data yang sama.
            String query = "SELECT reg.full_name, reg.username, reg.email, reg.phone_number, reg.password, r.id_role FROM register as reg INNER JOIN role as r ON r.id_role = reg.id_role WHERE (reg.username ='" + username + "' or reg.email = '" + email + "' or reg.phone_number = '" + phoneNumber + "') and reg.password = '" + password + "'";
            
            // mengirim pernyataan
            Statement st = connection.createStatement();
            // query akan dieksekusi dan data akan ditampung oleh set
            ResultSet set = st.executeQuery(query);
            // Menampilkan hasil query
            if(set.next()) {
                String role =  set.getString("r.id_role"); // mengeset/ambil data id_role masing-masing dan ditampung ke variabel role. yang akan diisi parameter (1 atau 2)
                String checkUsername = set.getString("reg.username"); // mengeset/ambil data username
                String checkEmail = set.getString("reg.email"); // mengeset/ambil data email
                String checkPhoneNumber = set.getString("reg.phone_number"); // mengeset/ambil data phone number
                String checkPassword = set.getString("reg.password"); // mengeset/ambil data password
                
                // jika username atau email atau phoneNumber sama dengan data yang ada di database dan password sama dengan data yang ada di database
                if((username.equals(checkUsername) || email.equals(checkEmail) || phoneNumber.equals(checkPhoneNumber)) && password.equals(checkPassword)) {
                    if(role.equals("1")){ // jika role sama dengan 1
                        Admin admin = new Admin(); // membuat objek Kelas Admin
                        admin.lbl_helloAdmin.setText(set.getString(1)); // mengambil data query value 1, yaitu reg.full_name
                        admin.setVisible(true); // masuk ke Panel Admin
                        this.dispose();
                    }else { // selain itu
                        User user = new User(); // membuat objek Kelas User
                        user.lbl_customerName.setText(set.getString(1)); // mengambil data query value 1, yaitu reg.full_name
                        //----------------------------------
                        user.in_username.setText(set.getString(2)); // mengambil data query value 2, yaitu reg.username
                        
                        user.setVisible(true); // masuk ke Panel User
                        this.dispose();
                    }
                }else {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password"); // gagal login admin
                }
            }else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password"); // gagal login user
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_signInActionPerformed

    private void pf_password_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_password_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_password_loginActionPerformed

    private void tf_username_loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_username_loginMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_username_loginMouseMoved

    private void tf_username_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_username_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_username_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void tf_email_registerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_email_registerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_email_registerMouseMoved

    private void tf_email_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_email_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_email_registerActionPerformed

    private void tf_fullname_registerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_fullname_registerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fullname_registerMouseMoved

    private void tf_fullname_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fullname_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fullname_registerActionPerformed

    private void tf_username_registerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_username_registerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_username_registerMouseMoved

    private void tf_username_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_username_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_username_registerActionPerformed

    private void pf_password_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_password_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_password_registerActionPerformed

    private void pf_confirmpassword_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_confirmpassword_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_confirmpassword_registerActionPerformed

    private void tf_phonenumber_registerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_phonenumber_registerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phonenumber_registerMouseMoved

    private void tf_phonenumber_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phonenumber_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phonenumber_registerActionPerformed

    private void tf_username_loginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_username_loginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_username_loginKeyTyped
    
    // saat mengklik button sign up
    private void btn_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signUpActionPerformed
        String v_full_name = tf_fullname_register.getText();
        String v_email = tf_email_register.getText();
        String v_username = tf_username_register.getText();
        String v_password = String.valueOf(pf_password_register.getPassword());
        String v_confirm_password = String.valueOf(pf_confirmpassword_register.getPassword());
        String v_phone_number = String.valueOf(tf_phonenumber_register.getText());
        
        PreparedStatement ps; // PreparedStatement digunakan untuk memanipulasi/menginsert query yang merupa dinamis yg di representasikan dengan parameter "?"
        // menginsert fullname, email, username, password, confirm_password, phone_number secara dinamis, sementara
        // id_role sudah diinsert secara statis yaitu value 2(user)
        String query = "INSERT INTO `register`(`full_name`, `email`, `username`, `password`, `confirm_password`, `phone_number`, `id_role`) VALUES (?, ?, ?, ?, ?, ?, 2)";
        // query yang akan digunakan untuk mengecek apakah username sudah pernah terdaftar atau belum
        String query_check_username = "SELECT * FROM register WHERE username = '" + v_username + "'";
        String query_check_email = "SELECT * FROM register WHERE email = '" + v_email +"'";
        
        try {
            // Memasukkan nilai-nilai pada parameter "?, ?, ?, ?, ?, ?"
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, v_full_name);
            ps.setString(2, v_email);
            ps.setString(3, v_username);
            ps.setString(4, v_password);
            ps.setString(5, v_confirm_password);
            ps.setString(6, v_phone_number);
            
            // query akan di eksekusi dan ditampung ke variabel check
            ResultSet check1 = ps.executeQuery(query_check_email);
            if(isFormEmpty()) { // validasi method form tidak boleh ada yang kosong
                if(validationFullName(v_full_name)) { // validasi method full name Regex
                    if(validationEmail(v_email)) { // validasi method email Regex
                        if(validationUsername(v_username)) { // validasi method username Regex
                            if (validationPassword(v_password)) { // validasi method password Regex
                                if(validationPhoneNumber(v_phone_number)) { // validasi method phone number Regex
                                    if(check1.next()) { // jika username ditemukan/terdaftar, akan memunculkan
                                        // pesan peringatan. dan mengatakan bahwa "Username sudah digunakan"
                                        JOptionPane.showMessageDialog(null, "This email has already been used", "Warning", JOptionPane.WARNING_MESSAGE);
                                    }else {
                                        ResultSet check = ps.executeQuery(query_check_username);
                                        if(check.next()) {
                                            JOptionPane.showMessageDialog(null, "Sorry, Username already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                                        }else if(ps.executeUpdate() > 0) { // selain itu jika sudah ter-insert, memunculkan pesan "Registrasi Sukes"
                                            JOptionPane.showMessageDialog(null, "Registration Successful");
                                            // menghapus field/form Register
                                            clearFormRegister();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_signUpActionPerformed

    private void tf_fullname_registerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_fullname_registerKeyTyped

    }//GEN-LAST:event_tf_fullname_registerKeyTyped

    private void showeye_password_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showeye_password_loginMousePressed
        // Saat mengklik showeye password di Panel Login
        hideeye_password_login.setVisible(true); // hideeye akan muncul dan password akan terlihat
        showeye_password_login.setVisible(false); // showeye akan hilang
        pf_password_login.setEchoChar((char)0); // mengeset/mengcasting password field menjadi 0 dalam bentuk ascii, atau null.
    }//GEN-LAST:event_showeye_password_loginMousePressed

    private void hideeye_password_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideeye_password_loginMousePressed
        // Saat mengklik hidden eye di Panel Login
        showeye_password_login.setVisible(true); // show eye akan muncul dan password tidak akan terlihat
        hideeye_password_login.setVisible(false); // hideeye akan hilang
        pf_password_login.setEchoChar((char)8226); // mengeset/mengcasting password field menjadi 8226 dalam bentuk ascii, atau simbol 'middle dot'.
    }//GEN-LAST:event_hideeye_password_loginMousePressed

    private void showeye_password_registerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showeye_password_registerMousePressed
        // Saat mengklik showeye password di Panel Register
        hideeye_password_register.setVisible(true); // hideeye akan muncul dan password akan terlihat
        showeye_password_register.setVisible(false); // showeye akan hilang
        pf_password_register.setEchoChar((char)0); // mengeset/mengcasting password field menjadi 0 dalam bentuk ascii, atau null.
    }//GEN-LAST:event_showeye_password_registerMousePressed

    private void hideeye_password_registerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideeye_password_registerMousePressed
        // Saat mengklik hidden eye password di Panel Register
        showeye_password_register.setVisible(true); /// show eye akan muncul dan password tidak akan terlihat
        hideeye_password_register.setVisible(false); // hideeye akan hilang
        pf_password_register.setEchoChar((char)8226); // mengeset/mengcasting password field menjadi 8226 dalam bentuk ascii, atau simbol 'middle dot'.
    }//GEN-LAST:event_hideeye_password_registerMousePressed

    private void showeye_confirmpassword_registerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showeye_confirmpassword_registerMousePressed
        // Saat mengklik hidden eye confirmpassword di Panel Register
        hideeye_confirmpassword_register.setVisible(true); // hideeye akan muncul dan password akan terlihat
        showeye_confirmpassword_register.setVisible(false); // showeye akan hilang
        pf_confirmpassword_register.setEchoChar((char)0); // mengeset/mengcasting password field menjadi 0 dalam bentuk ascii, atau null.
    }//GEN-LAST:event_showeye_confirmpassword_registerMousePressed

    private void hideeye_confirmpassword_registerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideeye_confirmpassword_registerMousePressed
        // Saat mengklik hidden eye confirmpassword di Panel Register
        showeye_confirmpassword_register.setVisible(true); /// show eye akan muncul dan password tidak akan terlihat
        hideeye_confirmpassword_register.setVisible(false); // hideeye akan hilang
        pf_confirmpassword_register.setEchoChar((char)8226); // mengeset/mengcasting password field menjadi 8226 dalam bentuk ascii, atau simbol 'middle dot'.
    }//GEN-LAST:event_hideeye_confirmpassword_registerMousePressed

    private void btn_registerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_registerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registerKeyTyped

    private void pf_confirmpassword_registerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_confirmpassword_registerFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_confirmpassword_registerFocusLost

    private void btn_signUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_signUpFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signUpFocusLost

    private void tf_fullname_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_fullname_registerKeyReleased
        validationFullName();
    }//GEN-LAST:event_tf_fullname_registerKeyReleased

    private void tf_email_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_email_registerKeyReleased
        validationEmail();
    }//GEN-LAST:event_tf_email_registerKeyReleased

    private void tf_username_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_username_registerKeyReleased
        validationUsername();
    }//GEN-LAST:event_tf_username_registerKeyReleased

    private void pf_password_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_password_registerKeyReleased
        validationPassword();
    }//GEN-LAST:event_pf_password_registerKeyReleased

    private void pf_confirmpassword_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_confirmpassword_registerKeyReleased
        validationConfirmPassword();
    }//GEN-LAST:event_pf_confirmpassword_registerKeyReleased

    private void tf_phonenumber_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_phonenumber_registerKeyReleased
        validationPhoneNumber();
    }//GEN-LAST:event_tf_phonenumber_registerKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_register;
    private javax.swing.JButton btn_signIn;
    private javax.swing.JButton btn_signUp;
    private javax.swing.JPanel container;
    private javax.swing.JLabel deskripsi1a;
    private javax.swing.JLabel deskripsi1b;
    public static javax.swing.JLabel gambar1;
    public static javax.swing.JLabel gambar2;
    public static javax.swing.JLabel gambar3;
    private javax.swing.JLabel hideeye_confirmpassword_register;
    private javax.swing.JLabel hideeye_password_login;
    private javax.swing.JLabel hideeye_password_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel lbl_confirmpassword_warning;
    private javax.swing.JLabel lbl_dhac;
    private javax.swing.JLabel lbl_email_warning;
    private javax.swing.JLabel lbl_fullname_warning;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_password_warning;
    private javax.swing.JLabel lbl_phonenumber_warning;
    private javax.swing.JLabel lbl_register;
    private javax.swing.JLabel lbl_username_warning;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_register;
    private javax.swing.JPanel panel_slideshow;
    private javax.swing.JPasswordField pf_confirmpassword_register;
    private javax.swing.JPasswordField pf_password_login;
    private javax.swing.JPasswordField pf_password_register;
    private javax.swing.JLabel showeye_confirmpassword_register;
    private javax.swing.JLabel showeye_password_login;
    private javax.swing.JLabel showeye_password_register;
    private javax.swing.JTextField tf_email_register;
    private javax.swing.JTextField tf_fullname_register;
    private javax.swing.JTextField tf_phonenumber_register;
    public javax.swing.JTextField tf_username_login;
    private javax.swing.JTextField tf_username_register;
    // End of variables declaration//GEN-END:variables
}