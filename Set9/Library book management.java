import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

class Library {
    public static void main(String[] args) {
        JFrame f=new JFrame("Library");

        JTextField id=new JTextField(5);
        JTextField title=new JTextField(10);
        JTextField author=new JTextField(10);
        JButton add=new JButton("Add");
        JButton del=new JButton("Delete");

        String[] col={"ID","Title","Author"};
        DefaultTableModel m=new DefaultTableModel(col,0);
        JTable t=new JTable(m);

        f.setLayout(new FlowLayout());
        f.add(id); f.add(title); f.add(author);
        f.add(add); f.add(del);
        f.add(new JScrollPane(t));

        add.addActionListener(e ->
            m.addRow(new Object[]{
                id.getText(),title.getText(),author.getText()}));

        del.addActionListener(e -> {
            int r=t.getSelectedRow();
            if(r>=0) m.removeRow(r);
            else JOptionPane.showMessageDialog(f,"Select a row");
        });

        f.setSize(500,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
