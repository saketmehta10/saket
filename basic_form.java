import java.awt.*;
import javax.swing.*;


public class basic_form   extends  JFrame{

    JLabel lbl_name , lbl_age , lbl_gender ;
    JTextField txt_name ,txt_age,txt_gender;
    JButton btn_submit,btn_reset;
    
    FlowLayout f1;
    
    basic_form()
    {
        lbl_name=new JLabel("Name:");
        lbl_age=new JLabel("Age:");
        lbl_gender=new JLabel("Gender:");


        txt_age=new JTextField(10);
        txt_gender=new JTextField(10);
        txt_name=new JTextField(10);


        btn_reset=new JButton("RESET");
        btn_submit=new JButton("Submit");

     
        f1=new FlowLayout();

        setLayout(f1);

        setSize(150,300);
        setVisible(true);

        getContentPane().setBackground(Color.red);
        
       
        
        add(lbl_name);
        add(txt_name);

        add(lbl_age);
        add(txt_age);
        
        add(lbl_gender);
        add(txt_gender);

        add(btn_submit);
        add(btn_reset);
        
        


    }

    public static void main(String [] args)
    {
         basic_form f=new basic_form();                    
    }
    
}
