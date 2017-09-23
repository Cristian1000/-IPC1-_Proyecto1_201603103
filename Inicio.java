/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class Inicio extends JFrame {
    private JButton boton;
    private JLabel etiqueta;
    private JTextField texto;
    private JPasswordField contrasena;
    public static String[] usuarions = new String[10];
    public static String[] contra = new String[10];
    public static int cont = 0;
    public Inicio(){
    super("Inicio");
    this.setBounds(100, 100, 600, 420);
    this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    etiqueta = new JLabel("Usuario");
    etiqueta.setBounds(100, 100, 50, 30);
    this.add(etiqueta);
    etiqueta.setVisible(true);
    texto = new JTextField();
    texto.setBounds(170, 100, 220, 30);
    this.add(texto);
    texto.setVisible(true);
    etiqueta = new JLabel("Contraseña: ");
    etiqueta.setBounds(100, 150, 80, 30);
    this.add(etiqueta);
    etiqueta.setVisible(true);
    contrasena = new  JPasswordField();
    contrasena.setBounds(200, 150, 200, 30);
    this.add(contrasena);
    contrasena.setVisible(true);
    boton = new JButton("Ingresar");
    boton.setBounds(280,220, 100, 30 );
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a;
            String b;
            a = texto.getText();
            b = contrasena.getText();
            buscar(a, b);
        }

    });
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Registrarse");
    boton.setBounds(280,270, 110, 30 );
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String a;
            String b;
            a = texto.getText();
            b = contrasena.getText();
            try{
            guardarUsuario(a, b);
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Base de Datos Llena" + "!");
            }
            }

    });
    this.add(boton);
    boton.setVisible(true);
    }
    public void guardarUsuario(String nom, String con){
        usuarions[cont]= nom;
        contra[cont]= con;
        cont++;
        Opcion a = new Opcion();
        a.setVisible(true);
        this.setVisible(false);    
    }   
    public void buscar(String a, String b){
    for(int i = 0; i<= 9; i++){
    if(a.equals(usuarions[i]) && b.equals(contra[i])){
    TransfEstud.numerous = i;
    Principal pri = new Principal();
    pri.setVisible(true);
    this.setVisible(false);
    }else{
    JOptionPane.showMessageDialog(null, "Usuario no Existe o No Ingreso Bien los Datos" + "!");
    }
    }
    }
}
