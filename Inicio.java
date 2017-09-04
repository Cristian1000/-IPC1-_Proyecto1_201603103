/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

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
    etiqueta.setBounds(100, 150, 50, 30);
    this.add(etiqueta);
    etiqueta.setVisible(true);
    contrasena = new  JPasswordField();
    contrasena.setBounds(170, 150, 200, 30);
    this.add(contrasena);
    contrasena.setVisible(true);
    boton = new JButton("Ingresar");
    boton.setBounds(280,220, 100, 30 );
    this.add(boton);
    boton.setVisible(true);
    boton = new JButton("Registrarse");
    boton.setBounds(280,270, 110, 30 );
    this.add(boton);
    boton.setVisible(true);
    }
    
}
