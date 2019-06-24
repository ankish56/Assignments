import javax.swing.*;
   class Exercise1{
      public static void main(String args[]){
    	  JFrame fr = new JFrame("Exercise1");
    	  JRadioButton b1 = new JRadioButton("Red");
    	  JRadioButton b2 = new JRadioButton("Yellow");
    	  JRadioButton b3 = new JRadioButton("Green");
    	  b1.setBounds(50, 50, 100, 30);
    	  b2.setBounds(50, 100, 100, 30);
    	  b3.setBounds(50, 150, 100, 30);
    	  ButtonGroup bg = new ButtonGroup();
    	  bg.add(b1);
    	  bg.add(b2);
    	  bg.add(b3);
    	  fr.add(b1);
    	  fr.add(b2);
    	  fr.add(b3);
    	  fr.setSize(300,300);
    	  fr.setVisible(true);
    	  fr.setLayout(null);
    	  
    	  
     }
}
