package com.LoginRegister;

import AppPackage.AnimationClass;
/*
    start(): digunakan untuk menjalankan thread. saat start() dijalankan, isi method run() dari class akan dijalankan.
*/

public class LoginActivity {
    public static void main(String[] args) {
        LoginLayout loginLayout = new LoginLayout(); // Membuat Objek Kelas LoginLayout
        loginLayout.setVisible(true); // Masuk ke jendela LoginLayout
    }
    
    public static void slideShow() {
        AnimationClass anim = new AnimationClass(); // Membuat Objek Kelas AnimationClass dengan memanfaatkan Libraries, AnimatonClass.jar -> AppPackage
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;            
                try {
                    while(true) { // infinity loop
                        switch(i) {
                            case 0: // gambar 1 akan bergeser ke gambar 2. 1 -> 2.
                                Thread.sleep(5000); // akan berlangsung 5 detik, 5000ms == 5d
                                anim.jLabelXLeft(0, -500, 12, 10, LoginLayout.gambar1);
                                anim.jLabelXLeft(500, 0, 12, 10, LoginLayout.gambar2);
                                anim.jLabelXLeft(1000, 500, 12, 10, LoginLayout.gambar3);
                                i++;
                            case 1: // gambar 2 akan bergeser ke gambar 3. 2 -> 3.
                                Thread.sleep(5000); // akan berlangsung 5 detik, 5000ms == 5d
                                anim.jLabelXLeft(-500, -1000, 12, 10, LoginLayout.gambar1);
                                anim.jLabelXLeft(0, -500, 12, 10, LoginLayout.gambar2);
                                anim.jLabelXLeft(500, 0, 12, 10, LoginLayout.gambar3);
                                i++;
                            case 2: // gambar 3 akan bergeser kembali ke gambar 2. 3 -> 2.
                                Thread.sleep(5000); // akan berlangsung 5 detik, 5000ms == 5d
                                anim.jLabelXRight(-1000, -500, 12, 10, LoginLayout.gambar1);
                                anim.jLabelXRight(-500, 0, 12, 10, LoginLayout.gambar2);
                                anim.jLabelXRight(0, 500, 12, 10, LoginLayout.gambar3);
                                i++;
                            case 3: // gambar 2 akan bergeser kembali ke gambar 1. 2 -> 1.
                                Thread.sleep(5000);
                                anim.jLabelXRight(-500, 0, 12, 10, LoginLayout.gambar1);
                                anim.jLabelXRight(0, 500, 12, 10, LoginLayout.gambar2);
                                anim.jLabelXRight(500, 1000, 12, 10, LoginLayout.gambar3);
                                i=0;
                        }
                    }
                }catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }
}
