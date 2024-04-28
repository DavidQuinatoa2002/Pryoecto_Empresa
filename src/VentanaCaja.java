import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCaja {
    private JButton añadirButton;
    private JButton buscarButton;
    private JButton mostrarTodosLosElementosButton;
    private JTextField codigoTextField1;
    private JTextField nombreEmpresaTextField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextArea textArea1;

    private Pila pila1 = new Pila();
    private Pila pila2 = new Pila();
    private Pila pila3 = new Pila();


    public VentanaCaja() {
        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String selectedItem = comboBox1.getSelectedItem().toString();
            if(selectedItem.equals("1")){
                if(pila1.gettamanio()<6){
                    pila1.apilar(codigoTextField1.getText(), nombreEmpresaTextField2.getText(), comboBox2.getSelectedItem().toString());
                    textArea1.setText(pila1.toString());
                }else {
                    JOptionPane.showMessageDialog(null, "esta vacia");
                }

            }




            }
        });


    }
}
