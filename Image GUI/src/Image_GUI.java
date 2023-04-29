import javax.swing.*;
import java.awt.*;

public class Image_GUI
{
  public static void main(String[] args) throws Exception
  {
    //definizione titolo e creazione della pagina
    JFrame main_frame = new JFrame("HEHE");
    main_frame.setLayout(null);

    //definizione immagini
    ImageIcon icon = new ImageIcon("C:/Users/Matteo/Desktop/ /Java Projects/Image GUI/src/images/salento1.png");
    JLabel immagine = new JLabel(icon);
    immagine.setBounds(390, 160, 400, 180);
    immagine.setLayout(null);
    immagine.setForeground(null);

    ImageIcon icon1 = new ImageIcon("C:/Users/Matteo/Desktop/ /Java Projects/Image GUI/src/images/Anfiteatro.png");
    JLabel immagine1 = new JLabel(icon1);
    immagine1.setBounds(20, 50, 350, 232);
    immagine1.setLayout(null);
    immagine1.setForeground(null);

    ImageIcon icon2 = new ImageIcon("C:/Users/Matteo/Desktop/ /Java Projects/Image GUI/src/images/salento2.png");
    JLabel immagine2 = new JLabel(icon2);
    immagine2.setBounds(20, 312, 350, 144);
    immagine2.setLayout(null);
    immagine2.setForeground(null);


    //definizione pannelli
    JPanel first = new JPanel(null);
    JPanel second  = new JPanel(null);
    JPanel third  = new JPanel(null);
    JPanel fourth  = new JPanel(null);

    //definizione font
    Font sans = new Font("Comic Sans MS", Font.BOLD, 20);
    //Font arial = new Font("Arial", Font.BOLD, 12);
    Font tnr = new Font("Times New Roman", Font.BOLD, 32);

    //colore dei panelli
    first.setBackground(Color.blue);
    second.setBackground(Color.red);
    third.setBackground(Color.green);
    fourth.setBackground(Color.yellow);

    //dimensioni di schede e pannelli
    main_frame.setSize(1000, 750);
    first.setBounds(75, 200, 800, 500);
    second.setBounds(75, 75, 800, 80);
    third.setBounds(390, 75, 400, 40);
    fourth.setBounds(390, 390, 400, 40);

    //definizione etichette
    JLabel text1 = new JLabel("IMMAGINI DAL SALENTO");
    JLabel text2 = new JLabel("Anfiteatro Romano");
    JLabel text3 = new JLabel("Porto Cesareo");

    //formattazione prima scritta
    text1.setBounds(200, 25, 400, 30);
    text1.setForeground(Color.blue);
    text1.setFont(tnr);

    //formattazione prima scritta
    text2.setBounds(105, 3, 200, 30);
    text2.setForeground(Color.red);
    text2.setFont(sans);

    //formattazione prima scritta
    text3.setBounds(135, 3, 200, 30);
    text3.setForeground(Color.black);
    text3.setFont(sans);

    //disposizione etichette e pannelli nel frame
    main_frame.add(first);
    main_frame.add(second);
    first.add(immagine);
    first.add(immagine1);
    first.add(immagine2);
    first.add(third);
    first.add(fourth);
    second.add(text1);
    third.add(text2);
    fourth.add(text3);

    //frame visibile
    main_frame.setVisible(true);

  }
}