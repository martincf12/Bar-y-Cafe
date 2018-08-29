package Interfaz;

import static Interfaz.Principal.TstVentNvoPres;
import java.awt.Color;

public class Juegos_Pantalla extends javax.swing.JFrame {

    private static String Ajedrez_uno = "-- Deposito --";
    private static String Ajedrez_dos = "-- Deposito --";
    private static String Ajedrez_tres = "-- Deposito --";
    private static String Domino_uno = "-- Deposito --";
    private static String Domino_dos = "-- Deposito --";
    private static String Domino_tres = "-- Deposito --";
    private static String Domino_cuatro = "-- Deposito --";
    private static String Jenga_uno = "-- Deposito --";
    private static String Jenga_dos = "-- Deposito --";
    private static String Generala_uno = "-- Deposito --";
    private static String Generala_dos = "-- Deposito --";
    private static String Generala_tres = "-- Deposito --";
    private static String Generala_cuatro = "-- Deposito --";
    private static String Generala_cinco = "-- Deposito --";
    private static String Car_esp_uno = "-- Deposito --";
    private static String Car_esp_dos = "-- Deposito --";
    private static String Car_Uno_uno = "-- Deposito --";
    private static String Car_Uno_dos = "-- Deposito --";
    private static String Car_Uno_tres = "-- Deposito --";
    private static String Sexy_uno = "-- Deposito --";
    private static String Melomano_uno = "-- Deposito --";
    private static String Dardos_uno = "-- Deposito --";
    private static String Perinola_uno = "-- Deposito --";
    private static String Perinola_dos = "-- Deposito --";
    private static String Dama_uno = "-- Deposito --";
    private static String Dama_dos = "-- Deposito --";
    private static String campo1;
    private static String campo2;
    private static String campo3;
    private static String campo4;
    private static String campo5;
    private static String campo6;
    private static String campo7;
    private static String campo8;
    private static String campo9;
    private static String campo10;
    private static String campo11;
    private static String campo12;
    private static String campo13;
    private static String campo14;
    private static String campo15;
    private static String campo16;
    private static String campo17;
    private static String campo18;
    private static String campo19;
    private static String campo20;
    private static String campo21;
    private static String campo22;
    private static String campo23;
    private static String campo24;
    private static String campo25;
    private static String campo26;
    
    public Juegos_Pantalla() {
        initComponents();
        Carga_Mesas_Juegos(); 
        Segunda_Carga();
    }
    private void Segunda_Carga()
    {
        Aje1.setText(campo1);
        Aje2.setText(campo2);
        Aje3.setText(campo3);
        Dom1.setText(campo4);
        Dom2.setText(campo5);
        Dom3.setText(campo6);
        Dom4.setText(campo7);
        Jen1.setText(campo8);
        Jen2.setText(campo9);
        Gen1.setText(campo10);
        Gen2.setText(campo11);
        Gen3.setText(campo12);
        Gen4.setText(campo13);
        Gen5.setText(campo14);
        Esp1.setText(campo15);
        Esp2.setText(campo16);
        Uno1.setText(campo17);
        Uno2.setText(campo18);
        Uno3.setText(campo19);
        Sex1.setText(campo20);
        Melo1.setText(campo21);
        Dar1.setText(campo22);
        Per1.setText(campo23);
        Per2.setText(campo24);
        Dam1.setText(campo25);
        Dam2.setText(campo26);
        Ajedrez_1.setSelectedItem(Ajedrez_uno);
        Ajedrez_2.setSelectedItem(Ajedrez_dos);
        Ajedrez_3.setSelectedItem(Ajedrez_tres);
        if (("-- Deposito --".equals(Ajedrez_dos))&&("-- Deposito --".equals(Ajedrez_uno))&&("-- Deposito --".equals(Ajedrez_tres)))
        { 
            P_Ajedrez.setForeground(Color.green);
        }else
        { 
            if (!("-- Deposito --".equals(Ajedrez_dos))&&!("-- Deposito --".equals(Ajedrez_uno))&&!("-- Deposito --".equals(Ajedrez_tres)))      
            {
                P_Ajedrez.setForeground(Color.red);
            }
            else
            {
                P_Ajedrez.setForeground(Color.yellow);
            }
        }
        Domino_1.setSelectedItem(Domino_uno);
        Domino_2.setSelectedItem(Domino_dos);
        Domino_3.setSelectedItem(Domino_tres);
        Domino_4.setSelectedItem(Domino_cuatro);
        if (("-- Deposito --".equals(Domino_uno))&&("-- Deposito --".equals(Domino_dos))&&("-- Deposito --".equals(Domino_tres))&&("-- Deposito --".equals(Domino_cuatro)))
        {
            P_Domino.setForeground(Color.green);
        }else
        {   
            if(!("-- Deposito --".equals(Domino_uno))&&!("-- Deposito --".equals(Domino_dos))&&!("-- Deposito --".equals(Domino_tres))&&!("-- Deposito --".equals(Domino_cuatro)))
            {
                P_Domino.setForeground(Color.red);
            }else
            {
                P_Domino.setForeground(Color.yellow);
            }
        }
        Jenga_1.setSelectedItem(Jenga_uno);
        Jenga_2.setSelectedItem(Jenga_dos);
        if (("-- Deposito --".equals(Jenga_uno))&&("-- Deposito --".equals(Jenga_dos)))
        { 
            P_Jenga.setForeground(Color.green);
        }else
        {   
            if (!("-- Deposito --".equals(Jenga_uno))&&!("-- Deposito --".equals(Jenga_dos)))
            {
                P_Jenga.setForeground(Color.red);
            }else
            {
                P_Jenga.setForeground(Color.yellow);
            }
        }
        Generala_1.setSelectedItem(Generala_uno);
        Generala_2.setSelectedItem(Generala_dos);
        Generala_3.setSelectedItem(Generala_tres);
        Generala_4.setSelectedItem(Generala_cuatro);
        Generala_5.setSelectedItem(Generala_cinco);
        if (("-- Deposito --".equals(Generala_uno))&&("-- Deposito --".equals(Generala_dos))&&("-- Deposito --".equals(Generala_tres))&&("-- Deposito --".equals(Generala_cuatro))&&("-- Deposito --".equals(Generala_cinco)))
        {
            P_Generala.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Generala_uno))&&!("-- Deposito --".equals(Generala_dos))&&!("-- Deposito --".equals(Generala_tres))&&!("-- Deposito --".equals(Generala_cuatro))&&!("-- Deposito --".equals(Generala_cinco)))
            {
                P_Generala.setForeground(Color.red);
            }else
            {
                P_Generala.setForeground(Color.yellow);
            }
        }
        Car_esp_1.setSelectedItem(Car_esp_uno);
        Car_esp_2.setSelectedItem(Car_esp_dos);
        if (("-- Deposito --".equals(Car_esp_uno))&&("-- Deposito --".equals(Car_esp_dos)))
        {
            P_Car_Esp.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Car_esp_uno))&&!("-- Deposito --".equals(Car_esp_dos)))
            {
                P_Car_Esp.setForeground(Color.red);
            }else
            {
                P_Car_Esp.setForeground(Color.yellow);
            }
        }
        Car_Uno_1.setSelectedItem(Car_Uno_uno);
        Car_Uno_2.setSelectedItem(Car_Uno_dos);
        Car_Uno_3.setSelectedItem(Car_Uno_tres);
        if (("-- Deposito --".equals(Car_Uno_uno))&&("-- Deposito --".equals(Car_Uno_dos))&&("-- Deposito --".equals(Car_Uno_tres)))
        {
            P_Car_Uno.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Car_Uno_uno))&&!("-- Deposito --".equals(Car_Uno_dos))&&!("-- Deposito --".equals(Car_Uno_tres)))
            {
                P_Car_Uno.setForeground(Color.red);
            }else
            {
                P_Car_Uno.setForeground(Color.yellow);
            }
        }
        Sexy_1.setSelectedItem(Sexy_uno);
        if ("-- Deposito --".equals(Sexy_uno))
        {
            P_Sexy.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Sexy_uno)))
            {
                P_Sexy.setForeground(Color.red);
            }else
            {
                P_Sexy.setForeground(Color.yellow);
            }
        }
        Melomano_1.setSelectedItem(Melomano_uno);
        if ("-- Deposito --".equals(Melomano_uno))
        {
            P_Melo.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Melomano_uno)))
            {
                P_Melo.setForeground(Color.red);
            }else
            {
                P_Melo.setForeground(Color.yellow);
            }
        }
        Dardos_1.setSelectedItem(Dardos_uno);
        if ("-- Deposito --".equals(Dardos_uno))
        {
            P_Dardos.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Dardos_uno)))
            {
                P_Dardos.setForeground(Color.red);
            }else
            {
                P_Dardos.setForeground(Color.yellow);
            }
        }
        Perinola_1.setSelectedItem(Perinola_uno);
        Perinola_2.setSelectedItem(Perinola_dos);
        if (("-- Deposito --".equals(Perinola_uno))&&("-- Deposito --".equals(Perinola_dos)))
        {
            P_Perinola.setForeground(Color.green);
        }else
        {
            if (!("-- Deposito --".equals(Perinola_uno))&&!("-- Deposito --".equals(Perinola_dos)))
            {
                P_Perinola.setForeground(Color.red);
            }else
            {
                P_Perinola.setForeground(Color.yellow);
            }
        }
        Dama_1.setSelectedItem(Dama_uno);
        Dama_2.setSelectedItem(Dama_dos);
        if (("-- Deposito --".equals(Dama_uno))&&("-- Deposito --".equals(Dama_dos)))
        {
            P_Damas.setForeground(Color.green);
        }else
        {
            if(!("-- Deposito --".equals(Dama_uno))&&!("-- Deposito --".equals(Dama_dos)))
            {
                P_Damas.setForeground(Color.red);
            }else
            {
                P_Damas.setForeground(Color.yellow);
            }
        }              
    }
    private void Carga_Mesas_Juegos()
    {
        Ajedrez_1.addItem("-- Deposito --");
        Ajedrez_1.addItem("Cerati");
        Ajedrez_1.addItem("Mercedes Sosa");
        Ajedrez_1.addItem("Caetano Veloso");
        Ajedrez_1.addItem("Janis Joplin");
        Ajedrez_1.addItem("Amy Winehouse");
        Ajedrez_1.addItem("Spinetta");
        Ajedrez_1.addItem("Michael Jackson");
        Ajedrez_1.addItem("Madonna");
        Ajedrez_1.addItem("Beethoveen");
        Ajedrez_1.addItem("Bach");
        Ajedrez_1.addItem("Cortázar");
        Ajedrez_1.addItem("Bob Marley");
        Ajedrez_1.addItem("Piazzolla");
        Ajedrez_1.addItem("Borges");
        Ajedrez_1.addItem("Mesa Logo");
        Ajedrez_2.addItem("-- Deposito --");
        Ajedrez_2.addItem("Cerati");
        Ajedrez_2.addItem("Mercedes Sosa");
        Ajedrez_2.addItem("Caetano Veloso");
        Ajedrez_2.addItem("Janis Joplin");
        Ajedrez_2.addItem("Amy Winehouse");
        Ajedrez_2.addItem("Spinetta");
        Ajedrez_2.addItem("Michael Jackson");
        Ajedrez_2.addItem("Madonna");
        Ajedrez_2.addItem("Beethoveen");
        Ajedrez_2.addItem("Bach");
        Ajedrez_2.addItem("Cortázar");
        Ajedrez_2.addItem("Bob Marley");
        Ajedrez_2.addItem("Piazzolla");
        Ajedrez_2.addItem("Borges");
        Ajedrez_2.addItem("Mesa Logo");
        Ajedrez_3.addItem("-- Deposito --");
        Ajedrez_3.addItem("Cerati");
        Ajedrez_3.addItem("Mercedes Sosa");
        Ajedrez_3.addItem("Caetano Veloso");
        Ajedrez_3.addItem("Janis Joplin");
        Ajedrez_3.addItem("Amy Winehouse");
        Ajedrez_3.addItem("Spinetta");
        Ajedrez_3.addItem("Michael Jackson");
        Ajedrez_3.addItem("Madonna");
        Ajedrez_3.addItem("Beethoveen");
        Ajedrez_3.addItem("Bach");
        Ajedrez_3.addItem("Cortázar");
        Ajedrez_3.addItem("Bob Marley");
        Ajedrez_3.addItem("Piazzolla");
        Ajedrez_3.addItem("Borges");
        Ajedrez_3.addItem("Mesa Logo");
        Domino_1.addItem("-- Deposito --");
        Domino_1.addItem("Cerati");
        Domino_1.addItem("Mercedes Sosa");
        Domino_1.addItem("Caetano Veloso");
        Domino_1.addItem("Janis Joplin");
        Domino_1.addItem("Amy Winehouse");
        Domino_1.addItem("Spinetta");
        Domino_1.addItem("Michael Jackson");
        Domino_1.addItem("Madonna");
        Domino_1.addItem("Beethoveen");
        Domino_1.addItem("Bach");
        Domino_1.addItem("Cortázar");
        Domino_1.addItem("Bob Marley");
        Domino_1.addItem("Piazzolla");
        Domino_1.addItem("Borges");
        Domino_1.addItem("Mesa Logo");
        Domino_2.addItem("-- Deposito --");
        Domino_2.addItem("Cerati");
        Domino_2.addItem("Mercedes Sosa");
        Domino_2.addItem("Caetano Veloso");
        Domino_2.addItem("Janis Joplin");
        Domino_2.addItem("Amy Winehouse");
        Domino_2.addItem("Spinetta");
        Domino_2.addItem("Michael Jackson");
        Domino_2.addItem("Madonna");
        Domino_2.addItem("Beethoveen");
        Domino_2.addItem("Bach");
        Domino_2.addItem("Cortázar");
        Domino_2.addItem("Bob Marley");
        Domino_2.addItem("Piazzolla");
        Domino_2.addItem("Borges");
        Domino_2.addItem("Mesa Logo");
        Domino_3.addItem("-- Deposito --");
        Domino_3.addItem("Cerati");
        Domino_3.addItem("Mercedes Sosa");
        Domino_3.addItem("Caetano Veloso");
        Domino_3.addItem("Janis Joplin");
        Domino_3.addItem("Amy Winehouse");
        Domino_3.addItem("Spinetta");
        Domino_3.addItem("Michael Jackson");
        Domino_3.addItem("Madonna");
        Domino_3.addItem("Beethoveen");
        Domino_3.addItem("Bach");
        Domino_3.addItem("Cortázar");
        Domino_3.addItem("Bob Marley");
        Domino_3.addItem("Piazzolla");
        Domino_3.addItem("Borges");
        Domino_3.addItem("Mesa Logo");
        Domino_4.addItem("-- Deposito --");
        Domino_4.addItem("Cerati");
        Domino_4.addItem("Mercedes Sosa");
        Domino_4.addItem("Caetano Veloso");
        Domino_4.addItem("Janis Joplin");
        Domino_4.addItem("Amy Winehouse");
        Domino_4.addItem("Spinetta");
        Domino_4.addItem("Michael Jackson");
        Domino_4.addItem("Madonna");
        Domino_4.addItem("Beethoveen");
        Domino_4.addItem("Bach");
        Domino_4.addItem("Cortázar");
        Domino_4.addItem("Bob Marley");
        Domino_4.addItem("Piazzolla");
        Domino_4.addItem("Borges");
        Domino_4.addItem("Mesa Logo");
        Jenga_1.addItem("-- Deposito --");
        Jenga_1.addItem("Cerati");
        Jenga_1.addItem("Mercedes Sosa");
        Jenga_1.addItem("Caetano Veloso");
        Jenga_1.addItem("Janis Joplin");
        Jenga_1.addItem("Amy Winehouse");
        Jenga_1.addItem("Spinetta");
        Jenga_1.addItem("Michael Jackson");
        Jenga_1.addItem("Madonna");
        Jenga_1.addItem("Beethoveen");
        Jenga_1.addItem("Bach");
        Jenga_1.addItem("Cortázar");
        Jenga_1.addItem("Bob Marley");
        Jenga_1.addItem("Piazzolla");
        Jenga_1.addItem("Borges");
        Jenga_1.addItem("Mesa Logo");
        Jenga_2.addItem("-- Deposito --");
        Jenga_2.addItem("Cerati");
        Jenga_2.addItem("Mercedes Sosa");
        Jenga_2.addItem("Caetano Veloso");
        Jenga_2.addItem("Janis Joplin");
        Jenga_2.addItem("Amy Winehouse");
        Jenga_2.addItem("Spinetta");
        Jenga_2.addItem("Michael Jackson");
        Jenga_2.addItem("Madonna");
        Jenga_2.addItem("Beethoveen");
        Jenga_2.addItem("Bach");
        Jenga_2.addItem("Cortázar");
        Jenga_2.addItem("Bob Marley");
        Jenga_2.addItem("Piazzolla");
        Jenga_2.addItem("Borges");
        Jenga_2.addItem("Mesa Logo");
        Generala_1.addItem("-- Deposito --");
        Generala_1.addItem("Cerati");
        Generala_1.addItem("Mercedes Sosa");
        Generala_1.addItem("Caetano Veloso");
        Generala_1.addItem("Janis Joplin");
        Generala_1.addItem("Amy Winehouse");
        Generala_1.addItem("Spinetta");
        Generala_1.addItem("Michael Jackson");
        Generala_1.addItem("Madonna");
        Generala_1.addItem("Beethoveen");
        Generala_1.addItem("Bach");
        Generala_1.addItem("Cortázar");
        Generala_1.addItem("Bob Marley");
        Generala_1.addItem("Piazzolla");
        Generala_1.addItem("Borges");
        Generala_1.addItem("Mesa Logo");
        Generala_2.addItem("-- Deposito --");
        Generala_2.addItem("Cerati");
        Generala_2.addItem("Mercedes Sosa");
        Generala_2.addItem("Caetano Veloso");
        Generala_2.addItem("Janis Joplin");
        Generala_2.addItem("Amy Winehouse");
        Generala_2.addItem("Spinetta");
        Generala_2.addItem("Michael Jackson");
        Generala_2.addItem("Madonna");
        Generala_2.addItem("Beethoveen");
        Generala_2.addItem("Bach");
        Generala_2.addItem("Cortázar");
        Generala_2.addItem("Bob Marley");
        Generala_2.addItem("Piazzolla");
        Generala_2.addItem("Borges");
        Generala_2.addItem("Mesa Logo");
        Generala_3.addItem("-- Deposito --");
        Generala_3.addItem("Cerati");
        Generala_3.addItem("Mercedes Sosa");
        Generala_3.addItem("Caetano Veloso");
        Generala_3.addItem("Janis Joplin");
        Generala_3.addItem("Amy Winehouse");
        Generala_3.addItem("Spinetta");
        Generala_3.addItem("Michael Jackson");
        Generala_3.addItem("Madonna");
        Generala_3.addItem("Beethoveen");
        Generala_3.addItem("Bach");
        Generala_3.addItem("Cortázar");
        Generala_3.addItem("Bob Marley");
        Generala_3.addItem("Piazzolla");
        Generala_3.addItem("Borges");
        Generala_3.addItem("Mesa Logo");
        Generala_4.addItem("-- Deposito --");
        Generala_4.addItem("Cerati");
        Generala_4.addItem("Mercedes Sosa");
        Generala_4.addItem("Caetano Veloso");
        Generala_4.addItem("Janis Joplin");
        Generala_4.addItem("Amy Winehouse");
        Generala_4.addItem("Spinetta");
        Generala_4.addItem("Michael Jackson");
        Generala_4.addItem("Madonna");
        Generala_4.addItem("Beethoveen");
        Generala_4.addItem("Bach");
        Generala_4.addItem("Cortázar");
        Generala_4.addItem("Bob Marley");
        Generala_4.addItem("Piazzolla");
        Generala_4.addItem("Borges");
        Generala_4.addItem("Mesa Logo");
        Generala_5.addItem("-- Deposito --");
        Generala_5.addItem("Cerati");
        Generala_5.addItem("Mercedes Sosa");
        Generala_5.addItem("Caetano Veloso");
        Generala_5.addItem("Janis Joplin");
        Generala_5.addItem("Amy Winehouse");
        Generala_5.addItem("Spinetta");
        Generala_5.addItem("Michael Jackson");
        Generala_5.addItem("Madonna");
        Generala_5.addItem("Beethoveen");
        Generala_5.addItem("Bach");
        Generala_5.addItem("Cortázar");
        Generala_5.addItem("Bob Marley");
        Generala_5.addItem("Piazzolla");
        Generala_5.addItem("Borges");
        Generala_5.addItem("Mesa Logo");
        Car_esp_1.addItem("-- Deposito --");
        Car_esp_1.addItem("Cerati");
        Car_esp_1.addItem("Mercedes Sosa");
        Car_esp_1.addItem("Caetano Veloso");
        Car_esp_1.addItem("Janis Joplin");
        Car_esp_1.addItem("Amy Winehouse");
        Car_esp_1.addItem("Spinetta");
        Car_esp_1.addItem("Michael Jackson");
        Car_esp_1.addItem("Madonna");
        Car_esp_1.addItem("Beethoveen");
        Car_esp_1.addItem("Bach");
        Car_esp_1.addItem("Cortázar");
        Car_esp_1.addItem("Bob Marley");
        Car_esp_1.addItem("Piazzolla");
        Car_esp_1.addItem("Borges");
        Car_esp_1.addItem("Mesa Logo");
        Car_esp_2.addItem("-- Deposito --");
        Car_esp_2.addItem("Cerati");
        Car_esp_2.addItem("Mercedes Sosa");
        Car_esp_2.addItem("Caetano Veloso");
        Car_esp_2.addItem("Janis Joplin");
        Car_esp_2.addItem("Amy Winehouse");
        Car_esp_2.addItem("Spinetta");
        Car_esp_2.addItem("Michael Jackson");
        Car_esp_2.addItem("Madonna");
        Car_esp_2.addItem("Beethoveen");
        Car_esp_2.addItem("Bach");
        Car_esp_2.addItem("Cortázar");
        Car_esp_2.addItem("Bob Marley");
        Car_esp_2.addItem("Piazzolla");
        Car_esp_2.addItem("Borges");
        Car_esp_2.addItem("Mesa Logo");
        Car_Uno_1.addItem("-- Deposito --");
        Car_Uno_1.addItem("Cerati");
        Car_Uno_1.addItem("Mercedes Sosa");
        Car_Uno_1.addItem("Caetano Veloso");
        Car_Uno_1.addItem("Janis Joplin");
        Car_Uno_1.addItem("Amy Winehouse");
        Car_Uno_1.addItem("Spinetta");
        Car_Uno_1.addItem("Michael Jackson");
        Car_Uno_1.addItem("Madonna");
        Car_Uno_1.addItem("Beethoveen");
        Car_Uno_1.addItem("Bach");
        Car_Uno_1.addItem("Cortázar");
        Car_Uno_1.addItem("Bob Marley");
        Car_Uno_1.addItem("Piazzolla");
        Car_Uno_1.addItem("Borges");
        Car_Uno_1.addItem("Mesa Logo");  
        Car_Uno_2.addItem("-- Deposito --");
        Car_Uno_2.addItem("Cerati");
        Car_Uno_2.addItem("Mercedes Sosa");
        Car_Uno_2.addItem("Caetano Veloso");
        Car_Uno_2.addItem("Janis Joplin");
        Car_Uno_2.addItem("Amy Winehouse");
        Car_Uno_2.addItem("Spinetta");
        Car_Uno_2.addItem("Michael Jackson");
        Car_Uno_2.addItem("Madonna");
        Car_Uno_2.addItem("Beethoveen");
        Car_Uno_2.addItem("Bach");
        Car_Uno_2.addItem("Cortázar");
        Car_Uno_2.addItem("Bob Marley");
        Car_Uno_2.addItem("Piazzolla");
        Car_Uno_2.addItem("Borges");
        Car_Uno_2.addItem("Mesa Logo");
        Car_Uno_3.addItem("-- Deposito --");
        Car_Uno_3.addItem("Cerati");
        Car_Uno_3.addItem("Mercedes Sosa");
        Car_Uno_3.addItem("Caetano Veloso");
        Car_Uno_3.addItem("Janis Joplin");
        Car_Uno_3.addItem("Amy Winehouse");
        Car_Uno_3.addItem("Spinetta");
        Car_Uno_3.addItem("Michael Jackson");
        Car_Uno_3.addItem("Madonna");
        Car_Uno_3.addItem("Beethoveen");
        Car_Uno_3.addItem("Bach");
        Car_Uno_3.addItem("Cortázar");
        Car_Uno_3.addItem("Bob Marley");
        Car_Uno_3.addItem("Piazzolla");
        Car_Uno_3.addItem("Borges");
        Car_Uno_3.addItem("Mesa Logo");
        Sexy_1.addItem("-- Deposito --");
        Sexy_1.addItem("Cerati");
        Sexy_1.addItem("Mercedes Sosa");
        Sexy_1.addItem("Caetano Veloso");
        Sexy_1.addItem("Janis Joplin");
        Sexy_1.addItem("Amy Winehouse");
        Sexy_1.addItem("Spinetta");
        Sexy_1.addItem("Michael Jackson");
        Sexy_1.addItem("Madonna");
        Sexy_1.addItem("Beethoveen");
        Sexy_1.addItem("Bach");
        Sexy_1.addItem("Cortázar");
        Sexy_1.addItem("Bob Marley");
        Sexy_1.addItem("Piazzolla");
        Sexy_1.addItem("Borges");
        Sexy_1.addItem("Mesa Logo");
        Melomano_1.addItem("-- Deposito --");
        Melomano_1.addItem("Cerati");
        Melomano_1.addItem("Mercedes Sosa");
        Melomano_1.addItem("Caetano Veloso");
        Melomano_1.addItem("Janis Joplin");
        Melomano_1.addItem("Amy Winehouse");
        Melomano_1.addItem("Spinetta");
        Melomano_1.addItem("Michael Jackson");
        Melomano_1.addItem("Madonna");
        Melomano_1.addItem("Beethoveen");
        Melomano_1.addItem("Bach");
        Melomano_1.addItem("Cortázar");
        Melomano_1.addItem("Bob Marley");
        Melomano_1.addItem("Piazzolla");
        Melomano_1.addItem("Borges");
        Melomano_1.addItem("Mesa Logo");
        Dardos_1.addItem("-- Deposito --");
        Dardos_1.addItem("Cerati");
        Dardos_1.addItem("Mercedes Sosa");
        Dardos_1.addItem("Caetano Veloso");
        Dardos_1.addItem("Janis Joplin");
        Dardos_1.addItem("Amy Winehouse");
        Dardos_1.addItem("Spinetta");
        Dardos_1.addItem("Michael Jackson");
        Dardos_1.addItem("Madonna");
        Dardos_1.addItem("Beethoveen");
        Dardos_1.addItem("Bach");
        Dardos_1.addItem("Cortázar");
        Dardos_1.addItem("Bob Marley");
        Dardos_1.addItem("Piazzolla");
        Dardos_1.addItem("Borges");
        Dardos_1.addItem("Mesa Logo");
        Perinola_1.addItem("-- Deposito --");
        Perinola_1.addItem("Cerati");
        Perinola_1.addItem("Mercedes Sosa");
        Perinola_1.addItem("Caetano Veloso");
        Perinola_1.addItem("Janis Joplin");
        Perinola_1.addItem("Amy Winehouse");
        Perinola_1.addItem("Spinetta");
        Perinola_1.addItem("Michael Jackson");
        Perinola_1.addItem("Madonna");
        Perinola_1.addItem("Beethoveen");
        Perinola_1.addItem("Bach");
        Perinola_1.addItem("Cortázar");
        Perinola_1.addItem("Bob Marley");
        Perinola_1.addItem("Piazzolla");
        Perinola_1.addItem("Borges");
        Perinola_1.addItem("Mesa Logo");
        Perinola_2.addItem("-- Deposito --");
        Perinola_2.addItem("Cerati");
        Perinola_2.addItem("Mercedes Sosa");
        Perinola_2.addItem("Caetano Veloso");
        Perinola_2.addItem("Janis Joplin");
        Perinola_2.addItem("Amy Winehouse");
        Perinola_2.addItem("Spinetta");
        Perinola_2.addItem("Michael Jackson");
        Perinola_2.addItem("Madonna");
        Perinola_2.addItem("Beethoveen");
        Perinola_2.addItem("Bach");
        Perinola_2.addItem("Cortázar");
        Perinola_2.addItem("Bob Marley");
        Perinola_2.addItem("Piazzolla");
        Perinola_2.addItem("Borges");
        Perinola_2.addItem("Mesa Logo");      
        Dama_1.addItem("-- Deposito --");
        Dama_1.addItem("Cerati");
        Dama_1.addItem("Mercedes Sosa");
        Dama_1.addItem("Caetano Veloso");
        Dama_1.addItem("Janis Joplin");
        Dama_1.addItem("Amy Winehouse");
        Dama_1.addItem("Spinetta");
        Dama_1.addItem("Michael Jackson");
        Dama_1.addItem("Madonna");
        Dama_1.addItem("Beethoveen");
        Dama_1.addItem("Bach");
        Dama_1.addItem("Cortázar");
        Dama_1.addItem("Bob Marley");
        Dama_1.addItem("Piazzolla");
        Dama_1.addItem("Borges");
        Dama_1.addItem("Mesa Logo");
        Dama_2.addItem("-- Deposito --");
        Dama_2.addItem("Cerati");
        Dama_2.addItem("Mercedes Sosa");
        Dama_2.addItem("Caetano Veloso");
        Dama_2.addItem("Janis Joplin");
        Dama_2.addItem("Amy Winehouse");
        Dama_2.addItem("Spinetta");
        Dama_2.addItem("Michael Jackson");
        Dama_2.addItem("Madonna");
        Dama_2.addItem("Beethoveen");
        Dama_2.addItem("Bach");
        Dama_2.addItem("Cortázar");
        Dama_2.addItem("Bob Marley");
        Dama_2.addItem("Piazzolla");
        Dama_2.addItem("Borges");
        Dama_2.addItem("Mesa Logo");        
    }
    private void Carga_Juegos_Bt_OK()
    {
        Ajedrez_uno = (String) Ajedrez_1.getSelectedItem();
        Ajedrez_dos = (String) Ajedrez_2.getSelectedItem();
        Ajedrez_tres = (String) Ajedrez_3.getSelectedItem();
        Domino_uno = (String) Domino_1.getSelectedItem();
        Domino_dos = (String) Domino_2.getSelectedItem();
        Domino_tres = (String) Domino_3.getSelectedItem();
        Domino_cuatro = (String) Domino_4.getSelectedItem();
        Jenga_uno = (String) Jenga_1.getSelectedItem();
        Jenga_dos = (String) Jenga_2.getSelectedItem();
        Generala_uno = (String) Generala_1.getSelectedItem();
        Generala_dos = (String) Generala_2.getSelectedItem();
        Generala_tres = (String) Generala_3.getSelectedItem();
        Generala_cuatro = (String) Generala_4.getSelectedItem();
        Generala_cinco = (String) Generala_5.getSelectedItem();
        Car_esp_uno = (String) Car_esp_1.getSelectedItem();
        Car_esp_dos = (String) Car_esp_2.getSelectedItem();
        Car_Uno_uno = (String) Car_Uno_1.getSelectedItem();
        Car_Uno_dos = (String) Car_Uno_2.getSelectedItem();
        Car_Uno_tres = (String) Car_Uno_3.getSelectedItem();
        Sexy_uno = (String) Sexy_1.getSelectedItem();
        Melomano_uno = (String) Melomano_1.getSelectedItem();
        Dardos_uno = (String) Dardos_1.getSelectedItem();
        Perinola_uno = (String) Perinola_1.getSelectedItem();
        Perinola_dos = (String) Perinola_2.getSelectedItem();
        Dama_uno = (String) Dama_1.getSelectedItem();
        Dama_dos = (String) Dama_2.getSelectedItem();
        TstVentNvoPres=false;        
        campo1 = Aje1.getText();
        campo2 = Aje2.getText();
        campo3 = Aje3.getText();
        campo4 = Dom1.getText();
        campo5 = Dom2.getText();
        campo6 = Dom3.getText();
        campo7 = Dom4.getText();
        campo8 = Jen1.getText();
        campo9 = Jen2.getText();
        campo10 = Gen1.getText();
        campo11 = Gen2.getText();
        campo12 = Gen3.getText();
        campo13 = Gen4.getText();
        campo14 = Gen5.getText();
        campo15 = Esp1.getText();
        campo16 = Esp2.getText();
        campo17 = Uno1.getText();
        campo18 = Uno2.getText();
        campo19 = Uno3.getText();
        campo20 = Sex1.getText();
        campo21 = Melo1.getText();
        campo22 = Dar1.getText();
        campo23 = Per1.getText();
        campo24 = Per2.getText();
        campo25 = Dam1.getText();
        campo26 = Dam2.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Ajedrez_1 = new javax.swing.JComboBox<>();
        Ajedrez_2 = new javax.swing.JComboBox<>();
        Ajedrez_3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Aje1 = new javax.swing.JTextField();
        Aje2 = new javax.swing.JTextField();
        Aje3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Domino_1 = new javax.swing.JComboBox<>();
        Domino_2 = new javax.swing.JComboBox<>();
        Domino_3 = new javax.swing.JComboBox<>();
        Domino_4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Dom1 = new javax.swing.JTextField();
        Dom2 = new javax.swing.JTextField();
        Dom3 = new javax.swing.JTextField();
        Dom4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Jenga_1 = new javax.swing.JComboBox<>();
        Jenga_2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Jen1 = new javax.swing.JTextField();
        Jen2 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Generala_1 = new javax.swing.JComboBox<>();
        Generala_2 = new javax.swing.JComboBox<>();
        Generala_3 = new javax.swing.JComboBox<>();
        Generala_4 = new javax.swing.JComboBox<>();
        Generala_5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Gen1 = new javax.swing.JTextField();
        Gen2 = new javax.swing.JTextField();
        Gen3 = new javax.swing.JTextField();
        Gen4 = new javax.swing.JTextField();
        Gen5 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Car_esp_1 = new javax.swing.JComboBox<>();
        Car_esp_2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Esp1 = new javax.swing.JTextField();
        Esp2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Car_Uno_1 = new javax.swing.JComboBox<>();
        Car_Uno_2 = new javax.swing.JComboBox<>();
        Car_Uno_3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Uno1 = new javax.swing.JTextField();
        Uno2 = new javax.swing.JTextField();
        Uno3 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Sexy_1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Sex1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        Melomano_1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Melo1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        Dardos_1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        Dar1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        Perinola_1 = new javax.swing.JComboBox<>();
        Perinola_2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Per1 = new javax.swing.JTextField();
        Per2 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        Dama_1 = new javax.swing.JComboBox<>();
        Dama_2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Dam2 = new javax.swing.JTextField();
        Dam1 = new javax.swing.JTextField();
        BotonOkJuegos = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        P_Ajedrez = new javax.swing.JLabel();
        P_Domino = new javax.swing.JLabel();
        P_Jenga = new javax.swing.JLabel();
        P_Generala = new javax.swing.JLabel();
        P_Car_Esp = new javax.swing.JLabel();
        P_Car_Uno = new javax.swing.JLabel();
        P_Sexy = new javax.swing.JLabel();
        P_Melo = new javax.swing.JLabel();
        P_Dardos = new javax.swing.JLabel();
        P_Perinola = new javax.swing.JLabel();
        P_Damas = new javax.swing.JLabel();
        Cancelar_Btn = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setText("Item 1 :");

        jLabel2.setText("Item 2 :");

        jLabel3.setText("Item 3 :");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/250px-ChessSet.jpg"))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("DNI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ajedrez_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ajedrez_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ajedrez_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aje1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aje2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aje3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Ajedrez_1)
                                .addComponent(Aje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Ajedrez_2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Aje2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Ajedrez_3)
                                .addComponent(Aje3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ajedrez", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel4.setText("Item 3 :");

        jLabel5.setText("Item 2 :");

        jLabel6.setText("Item 1 :");

        jLabel9.setText("Item 4 :");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/51IYn9GscOL._SL500_AC_SS350_.jpg"))); // NOI18N

        jLabel38.setText("(x54)");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("DNI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Domino_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Domino_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Domino_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Domino_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dom4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 49, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dom1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dom2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dom3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Domino_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Domino_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Domino_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Dom1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Dom2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Dom3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Domino_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Dom4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Domino", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));

        jLabel10.setText("Item 2 :");

        jLabel11.setText("Item 1 :");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/d70378f9-6613-43e3-8dae-7becf9fc18be_1.df941082b1648dfaab6d7e1af3827da6.jpg"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("DNI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jenga_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jenga_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jen1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jen2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Jen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jenga_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jenga_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jenga", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        jLabel7.setText("Item 3 :");

        jLabel12.setText("Item 2 :");

        jLabel13.setText("Item 1 :");

        jLabel15.setText("Item 5 :");

        jLabel16.setText("Item 4 :");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/juego-mesa-generala-juego-D_NQ_NP_646011-MLA20448459504_102015-F.jpg"))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("DNI");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Generala_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generala_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generala_5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generala_4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generala_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(Gen3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Generala_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Generala_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Generala_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Generala_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Generala_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gen5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generala", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 204, 51));

        jLabel17.setText("Item 2 :");

        jLabel18.setText("Item 1 :");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tirada-de-cartas-españolas-gratis.jpg"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("DNI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Car_esp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Car_esp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Esp1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Esp2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Esp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Esp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Car_esp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Car_esp_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cartas Españolas", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 51));

        jLabel14.setText("Item 3 :");

        jLabel19.setText("Item 2 :");

        jLabel20.setText("Item 1 :");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/juego-de-cartas-uno-D_NQ_NP_22649-MLC20234483969_012015-O.jpg"))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("DNI");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Car_Uno_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Car_Uno_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Car_Uno_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Uno1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Uno2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Uno3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Car_Uno_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Car_Uno_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Uno1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Uno2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Car_Uno_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Uno3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cartas Uno", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 204, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel23.setText("Item 1 :");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sexyonary_1.jpg"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("DNI");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(Sexy_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(Sex1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sex1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sexy_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sexyonary", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 204, 51));

        jLabel24.setText("Item 1 :");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/el-melomano-juego-de-mesa-maldon-ploppy-581101-D_NQ_NP_966298-MLA26431729267_112017-F.jpg"))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("DNI");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(Melomano_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(Melo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Melo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Melomano_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Melomano", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 204, 51));

        jLabel25.setText("Item 1 :");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dardoak.jpg"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("DNI");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(Dardos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(Dar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Dar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dardos_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dardos", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 204, 51));

        jLabel22.setText("Item 2 :");

        jLabel26.setText("Item 1 :");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/juego-de-perinola-clasica-por-unidad-D_NQ_NP_102225-MLA25402681847_022017-F.jpg"))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("DNI");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Perinola_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Perinola_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Per1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Per2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Perinola_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Per1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Perinola_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Per2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perinola", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 204, 51));

        jLabel27.setText("Item 2 :");

        jLabel28.setText("Item 1 :");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/s63021631.jpg"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("DNI");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dama_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dama_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dam1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dam2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(Dam1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dam2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dama_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dama_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Damas", jPanel11);

        jPanel12.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BotonOkJuegos.setBackground(new java.awt.Color(0, 204, 51));
        BotonOkJuegos.setText("OK");
        BotonOkJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOkJuegosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonOkJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 246, 52, 38));

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Estado (Verde: Deposito - Amarillo: Ocupados - Rojo: Todos Ocupados) :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        P_Ajedrez.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Ajedrez.setText("Ajedrez");
        getContentPane().add(P_Ajedrez, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 271, -1, -1));

        P_Domino.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Domino.setText("Domino");
        getContentPane().add(P_Domino, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 271, -1, -1));

        P_Jenga.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Jenga.setText("Jenga");
        getContentPane().add(P_Jenga, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 271, -1, -1));

        P_Generala.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Generala.setText("Generala");
        getContentPane().add(P_Generala, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 271, -1, -1));

        P_Car_Esp.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Car_Esp.setText("Cartas Españolas");
        getContentPane().add(P_Car_Esp, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 271, -1, -1));

        P_Car_Uno.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Car_Uno.setText("Cartas Uno");
        getContentPane().add(P_Car_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 271, -1, -1));

        P_Sexy.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Sexy.setText("Sexyonary");
        getContentPane().add(P_Sexy, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 292, -1, -1));

        P_Melo.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Melo.setText("Melomano");
        getContentPane().add(P_Melo, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 292, -1, -1));

        P_Dardos.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Dardos.setText("Dardos");
        getContentPane().add(P_Dardos, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 292, -1, -1));

        P_Perinola.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Perinola.setText("Perinola");
        getContentPane().add(P_Perinola, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 292, -1, -1));

        P_Damas.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        P_Damas.setText("Damas");
        getContentPane().add(P_Damas, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 292, -1, -1));

        Cancelar_Btn.setBackground(new java.awt.Color(204, 0, 0));
        Cancelar_Btn.setText("X");
        Cancelar_Btn.setPreferredSize(new java.awt.Dimension(47, 23));
        Cancelar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 290, 52, 38));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-negro.jpg"))); // NOI18N
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 590, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonOkJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOkJuegosActionPerformed
        Carga_Juegos_Bt_OK();
        this.setVisible(false);
    }//GEN-LAST:event_BotonOkJuegosActionPerformed

    private void Cancelar_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_BtnActionPerformed
        TstVentNvoPres=false; 
        this.setVisible(false);
    }//GEN-LAST:event_Cancelar_BtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juegos_Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Juegos_Pantalla().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aje1;
    private javax.swing.JTextField Aje2;
    private javax.swing.JTextField Aje3;
    private javax.swing.JComboBox<String> Ajedrez_1;
    private javax.swing.JComboBox<String> Ajedrez_2;
    private javax.swing.JComboBox<String> Ajedrez_3;
    private javax.swing.JButton BotonOkJuegos;
    private javax.swing.JButton Cancelar_Btn;
    private javax.swing.JComboBox<String> Car_Uno_1;
    private javax.swing.JComboBox<String> Car_Uno_2;
    private javax.swing.JComboBox<String> Car_Uno_3;
    private javax.swing.JComboBox<String> Car_esp_1;
    private javax.swing.JComboBox<String> Car_esp_2;
    private javax.swing.JTextField Dam1;
    private javax.swing.JTextField Dam2;
    private javax.swing.JComboBox<String> Dama_1;
    private javax.swing.JComboBox<String> Dama_2;
    private javax.swing.JTextField Dar1;
    private javax.swing.JComboBox<String> Dardos_1;
    private javax.swing.JTextField Dom1;
    private javax.swing.JTextField Dom2;
    private javax.swing.JTextField Dom3;
    private javax.swing.JTextField Dom4;
    private javax.swing.JComboBox<String> Domino_1;
    private javax.swing.JComboBox<String> Domino_2;
    private javax.swing.JComboBox<String> Domino_3;
    private javax.swing.JComboBox<String> Domino_4;
    private javax.swing.JTextField Esp1;
    private javax.swing.JTextField Esp2;
    private javax.swing.JTextField Gen1;
    private javax.swing.JTextField Gen2;
    private javax.swing.JTextField Gen3;
    private javax.swing.JTextField Gen4;
    private javax.swing.JTextField Gen5;
    private javax.swing.JComboBox<String> Generala_1;
    private javax.swing.JComboBox<String> Generala_2;
    private javax.swing.JComboBox<String> Generala_3;
    private javax.swing.JComboBox<String> Generala_4;
    private javax.swing.JComboBox<String> Generala_5;
    private javax.swing.JTextField Jen1;
    private javax.swing.JTextField Jen2;
    private javax.swing.JComboBox<String> Jenga_1;
    private javax.swing.JComboBox<String> Jenga_2;
    private javax.swing.JTextField Melo1;
    private javax.swing.JComboBox<String> Melomano_1;
    private javax.swing.JLabel P_Ajedrez;
    private javax.swing.JLabel P_Car_Esp;
    private javax.swing.JLabel P_Car_Uno;
    private javax.swing.JLabel P_Damas;
    private javax.swing.JLabel P_Dardos;
    private javax.swing.JLabel P_Domino;
    private javax.swing.JLabel P_Generala;
    private javax.swing.JLabel P_Jenga;
    private javax.swing.JLabel P_Melo;
    private javax.swing.JLabel P_Perinola;
    private javax.swing.JLabel P_Sexy;
    private javax.swing.JTextField Per1;
    private javax.swing.JTextField Per2;
    private javax.swing.JComboBox<String> Perinola_1;
    private javax.swing.JComboBox<String> Perinola_2;
    private javax.swing.JTextField Sex1;
    private javax.swing.JComboBox<String> Sexy_1;
    private javax.swing.JTextField Uno1;
    private javax.swing.JTextField Uno2;
    private javax.swing.JTextField Uno3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
