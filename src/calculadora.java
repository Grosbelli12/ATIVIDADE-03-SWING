import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JTextField txtResultado;
    private JButton btn7;
    private JButton btnMultiplicar;
    private JButton btndDividir;
    private JButton btn8;
    private JButton btn4;
    private JButton btn5;
    private JButton btnLimpar;
    private JButton btn9;
    private JButton btn6;
    private JButton btnsoma;
    private JButton btnResultado;
    private JButton btn0;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btnSubtrair;
    private JPanel painelCalculadora;

    //.settext pega o numero do botão clicado e mostra no resultado

    public calculadora() {
        final Integer[] num1 = {0};
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText(txtResultado.getText() + "0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText(txtResultado.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText(txtResultado.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText(txtResultado.getText() + "3");
            }
        });

btnsoma.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        num[0] = Integer.valueOf(txtResultado.getText());
    }
});

}



public static void main(String[]args){
        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new calculadora().painelCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    }