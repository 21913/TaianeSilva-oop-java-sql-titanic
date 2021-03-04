//Taiane Vieira da Silva - 21913

package oop.dorsetcollege;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TitanicListing();
            }
        });


    }
    }

