import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicativo_de_Notas {
    private JPanel lblAplicativoDeNotas;
    private JTextField txInserirNotas;
    private JButton btnadicionarNota;
    private JTextArea textArea1;
    private JButton btncalcular;
    private JPanel lblstatus;

    public Aplicativo_de_Notas() {
        btnadicionarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double nota = Double.parseDouble(txInserirNotas.getText());
            }
        });
        btncalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double nota = Double.parseDouble(txInserirNotas.getText());
            }
        });


    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicativo de Notas");
        frame.setContentPane(new Aplicativo_de_Notas().lblstatus);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}


