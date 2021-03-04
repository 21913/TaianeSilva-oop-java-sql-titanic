//Taiane Vieira da Silva - 21913

package oop.dorsetcollege;


import oop.dorsetcollege.models.Passenger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TitanicListing extends JFrame {

    public TitanicListing() {

        String[] columns = new String[]{
                "name", "gender", "age"
        }; // getByName, getByGender , getByAge

        DefaultTableModel m = new DefaultTableModel();

        m.setColumnIdentifiers(columns);

        JTable table = new JTable(m);

//         m.addRow(new Object[]{"david", "male", 21});
//         m.addRow(new Object[]{"john", "female", 38});
//         m.addRow(new Object[]{"gladys", "female", 30});

        TitanicQueries tqueries = new TitanicQueries();
        List<Passenger> passengers =  tqueries.getPassengersByName("michael");

        for(Passenger people : passengers) {

            m.addRow(new Object[]{people.name, people.gender, people.age});
        }


        this.add(new JScrollPane(table));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);


    }
}


