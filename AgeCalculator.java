
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class temp extends JFrame implements ActionListener{
    JLabel  lmonth , lday , lyear ;
    JLabel yearresult, dayresult,monthresult;
    JLabel  tlmonth , tlday , tlyear ;
    JButton  cal, reset;
    JTextField txt_month,txt_day,txt_year;
    JTextField yr,mr,dr;
     JTextField txt_month2,txt_day2,txt_year2;
    FlowLayout f1;
    
    
    temp()
    {
       
        lyear=new JLabel("Birth Year");
        yearresult=new JLabel(" year ");
        monthresult=new JLabel("month =");
        dayresult=new JLabel(" days =");

        tlyear=new JLabel("present Year");
        
        
        txt_year=new JTextField(4);
        yr=new JTextField(4);
        dr=new JTextField(4);
        mr=new JTextField(4);

      
        txt_year2=new JTextField(4);
      
        cal=new JButton("Calculate");
        reset=new JButton("Reset");

       f1=new FlowLayout( );

       setLayout(f1);

       setVisible(true);
       setSize(500,500);
       setTitle("Age Calcualtor ");

       getContentPane().setBackground(Color.orange);

   

       add(lyear);
       add(txt_year);  
    
       add(tlyear);
       add(txt_year2);  


       add(cal);
       add(reset);

       add(yearresult);
       add(yr);
       
       add(monthresult);
        add(mr);

       add(dayresult);
      
       add(dr);

       cal.addActionListener(this);
       reset.addActionListener(this);


    }


    public void actionPerformed(ActionEvent e)
    {
        
        int Year1 =Integer.parseInt(txt_year.getText());

        
        int Year2 =Integer.parseInt(txt_year2.getText());
        
        int r_month=0;
        int r_year=0;
        int r_day=0;
        
        if(e.getSource()==cal)
        {
         
            r_year=Year2-Year1;
            r_month=r_year*12;
            r_day=r_month*365;
            
         

        }


        if(e.getSource()==reset)
        {
            yr.setText("");
            mr.setText("");
            dr.setText("");

            txt_year.setText("");
            txt_year2.setText("");


            

        }

        yr.setText(String.valueOf(r_year));
        mr.setText(String.valueOf(r_month));
        dr.setText(String.valueOf(r_day));
    }
}


public class AgeCalculator
{ public static void main(String [] args )
    {
    temp t=new temp();
}

}