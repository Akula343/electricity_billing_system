/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricitymanagment;

import javax.swing.*;

import java.awt.*;

public class MainScreen {
        
    JFrame f;
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/electricity.png"));
    JLabel image=new JLabel(i1);
    JLabel text=new JLabel("Electricity Management System");
    JProgressBar progressBar=new JProgressBar();
    MainScreen() {
        createGUI();
        addImage();
        addText();
        addProgressBar();
        runningPBar();
    }
    
    public void createGUI(){
        f=new JFrame(); 
        f.setUndecorated(true);
        f.setSize(600,600); 
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(0X78DEC7)); 
        f.setVisible(true);
        f.setLayout(null);
    }

    public void addImage(){
        image.setBounds(90, 70, 400, 200);
        f.add(image);
    }
    
    public void addText()
    {
        text.setFont(new Font("MV Boli",Font.BOLD,22));
        text.setBounds(120,300,400,50);
        text.setForeground(Color.black);
        f.add(text);
    }
    
    public void addProgressBar(){
        progressBar.setBounds(100,380,400,30); 
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(new Color(0XFF6464));
        progressBar.setValue(0);
        f.add(progressBar);
    }
    public void runningPBar(){
        int i=0;
        while( i<=100)
        {
            try{
                Thread.sleep(40);   
                progressBar.setValue(i);    
                i++;
                if(i==100)
                    f.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
   
    
    public static void main(String[] args) {
        new MainScreen();
        new Login();
    }
}

