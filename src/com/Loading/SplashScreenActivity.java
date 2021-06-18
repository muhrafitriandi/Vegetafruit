package com.Loading;

import com.LoginRegister.LoginLayout;
import javax.swing.JOptionPane;

public class SplashScreenActivity {
    public static void main(String[] args) {
        
        SplashScreenLayout splashScreen = new SplashScreenLayout(); // Membuat Objek Kelas SplashScreenLayout
        splashScreen.setVisible(true); // Masuk ke jendela SplashScreenLayout
        
        try {
            for(int i = 0; i <= 100; i++) { // Loop 0 s.d. 100
                Thread.sleep(30); // Delay selama 3 detik
                SplashScreenLayout.lbl_loading.setText("" + i + "%"); // Menyimpan dan Mencetak loop sebanyak 0-100 kali
                SplashScreenLayout.jProgressBar1.setValue(i); // Menge-set bar hingga 100
                if(i == 100) { // Jika loading == 100
                    LoginLayout login = new LoginLayout(); // Membuat Objek Kelas LoginLayout
                    splashScreen.setVisible(false); // Keluar dari Layout Splash Screen, dan
                    login.setVisible(true); // Masuk ke jendela LoginLayout
                }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Loading Error!\nMessage: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
