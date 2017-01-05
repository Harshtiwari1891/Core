import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class TestFrame extends JFrame {
 
    public TestFrame() {
        super("Verificarea numarului de pagini in pdf");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
         
        panel.add(Box.createVerticalGlue());
 
        final JLabel label = new JLabel("Alegeti calea...");
        label.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label);
 
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
 
        JButton button = new JButton("selecta folderul");
        button.setAlignmentX(CENTER_ALIGNMENT);
 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser(); 
                fileopen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int ret = fileopen.showDialog(null, "Alegeti calea");  
                if (ret == JFileChooser.APPROVE_OPTION) {
//                    File file = fileopen.getSelectedFile();
                //	System.out.println(fileopen.getSelectedFile().getPath());
                    MainPDF.pdfNumberOfPages(fileopen.getSelectedFile());
                    label.setText("Operatiunea de verificare sa finisat!!!");
                }
            }
        });
 
        panel.add(button);
        
        panel.add(Box.createVerticalGlue());
        getContentPane().add(panel);
 
        setPreferredSize(new Dimension(400, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}