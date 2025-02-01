import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class   LibraryFrame extends JFrame {
    private JTextField searchField;
    private   final JButton searchButton;
    private JLabel resultLabel;
    private   final Library library;
    private JLabel label;
  

    public LibraryFrame(Library library){
        this.library=library;
        setTitle("Library");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);
        label=new JLabel("Search  by the name of book or author");
        searchField= new JTextField(20);
         searchButton=new JButton("Search");
         resultLabel= new JLabel("Searching");
        searchButton.addActionListener((ActionEvent e) -> {
            if (resultLabel.getText() != null && !resultLabel.getText().isEmpty()) {
                resultLabel.setText("");
            }
            
            String search = searchField.getText().trim();
            String result = library.search(search);
            resultLabel.setText(result);
            contentPane.add(resultLabel);
        });
            contentPane.add(label);
            contentPane.add(searchField);
            contentPane.add(searchButton);

         
        }
}
