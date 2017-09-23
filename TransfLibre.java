/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static proyecto1.TransfEstud.numerous;


/**
 *
 * @author crist
 */
public class TransfLibre extends JFrame{
    private JTextArea area;
    private JLabel label;
    private JButton boton;
    private JTextField texto, texto1;
    
    public TransfLibre(){
    super("Transferencia de Saldo Libre");
    this.setBounds(100, 100, 400, 400);
    this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    label = new JLabel("Ingrese un usuario");
    label.setBounds(15, 15, 120, 30);
    this.add(label);
    label.setVisible(true);
    texto = new JTextField();
    texto.setBounds(145, 15, 100, 30);
    this.add(texto);
    texto.setVisible(true);
    label = new JLabel("Ingrese Monto a Transferir");
    label.setBounds(15, 65, 170, 30);
    this.add(label);
    label.setVisible(true);
    texto1 = new JTextField();
    texto1.setBounds(195, 65, 100, 30);
    this.add(texto1);
    texto1.setVisible(true);
    boton = new JButton("Transferir");
    boton.setBounds(150, 115, 100, 30);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String us = texto.getText();
        String can = texto1.getText();
        int a = Integer.parseInt(can);
            transferir(us, a);
        
        }

    });
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Regresar");
    boton.setBounds(150, 165, 100, 30);
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        reg();
        
        }

    });
    this.add(boton);
    boton.setVisible(true);
    }
    public void mostrar(){
    for(int i = 0; i <= 9; i++){
    area.setText(Inicio.usuarions[i]+"\n");
    }
    }
    public void transferir(String nombre, int monto){
        if(SaldoInicial.Saldo[numerous] <= monto){
        JOptionPane.showMessageDialog(null, "Saldo Insuficiente" + "!");
        }else{
        for(int a = 0; a <= 9; a++){
        if(nombre.equals(Inicio.usuarions[a])){
        int guardar;
        int mi;
        int suma, resta;
        guardar = SaldoInicial.Saldo[a];
        suma = monto + guardar;
        SaldoInicial.Saldo[a] = suma;
        mi = SaldoInicial.Saldo[numerous];
        resta = mi - monto;
        SaldoInicial.Saldo[numerous] = resta;
        }else{
    JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto" + texto.getText() + "!");
    }
        }
        }
    
    }
    public void reg(){
    Principal a = new Principal();
    a.setVisible(true);
    this.setVisible(false);
    }
    
}
