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
        };

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        JTable table = new JTable(model);

//         model.addRow(new Object[]{"david", "male", 21});
//         model.addRow(new Object[]{"john", "female", 38});
//         model.addRow(new Object[]{"gladys", "female", 30});

        TitanicQueries tq = new TitanicQueries();
        List<Passenger> passengers =  tq.getPassengersByName("michael");

        for(Passenger p : passengers) {

            model.addRow(new Object[]{p.name, p.gender, p.age});
        }


        this.add(new JScrollPane(table));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);


    }
}
