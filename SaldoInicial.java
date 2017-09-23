/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author crist
 */
public class SaldoInicial extends JFrame{
    private JTextField texto;
    private JLabel label;
    private JButton boton;
    public static int[] Saldo = new int[10];
    public static int cont = 0;
    static public int saldo;
    public SaldoInicial(){
    super("Saldo Inicial");
    this.setBounds(100, 100, 250, 200);
    this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    label = new JLabel("Ingrese Saldo Inicial");
    label.setBounds(15, 15, 150, 30);
    this.add(label);
    label.setVisible(true);
    texto = new JTextField();
    texto.setBounds(15, 65, 100, 30);
    this.add(texto);
    texto.setVisible(true);
    boton = new JButton("Agregar");
    boton.setBounds(15, 115, 80, 30);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if(saldo >= 10000){
    JOptionPane.showMessageDialog(null, "Saldo es mayor de lo permitido" + texto.getText() + "!");
    }else{
            agregarDinero();
                }
            }catch(Exception ex){  
            JOptionPane.showMessageDialog(null, "No Ingreso Saldo Inicial" + texto.getText() + "!");
            }
        }

    });
    this.add(boton);
    boton.setVisible(true);
    }
    public void agregarDinero(){ 
    cont = 0;
    saldo = Integer.parseInt(texto.getText());
    Saldo[cont]=saldo;
    cont++;
    Principal a = new Principal();
    a.setVisible(true);
    this.setVisible(false);
    }
}
