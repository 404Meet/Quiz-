import java.awt.event.*; 
import javax.swing.*;  
public class OnlineTestdsa extends JFrame implements ActionListener
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2,b3;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTestdsa()  
    {    
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Bookmark");  
        b3=new JButton("Exit Test");
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this); 
        add(b1);add(b2);add(b3);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);
        b3.setBounds(185,280,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    } 
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }       
         if(e.getActionCommand().equals("Exit Test"))  
        {  
         subjects st1=new subjects();
         st1.setVisible(true);
         setVisible(false);
        }
        
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
         if(current==0)  
        {  
            l.setText("Que1:graph is a set of ?");  
            jb[0].setText("vertices");jb[1].setText("vertices and edges");jb[2].setText("edges");jb[3].setText("none of the above");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: best time complexity for selection ?");  
            jb[0].setText("n log");jb[1].setText("n");jb[2].setText("n square");jb[3].setText("n log n");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: average time complexity for selection ?");  
            jb[0].setText("n log");jb[1].setText("n");jb[2].setText("n log n");jb[3].setText("n square");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: worst time complexity for selection");  
            jb[0].setText("");jb[1].setText("two");jb[2].setText("three");jb[3].setText("four");  
        }  
        if(current==4)  
        {  
            l.setText("Que5:best time complexity for bubble?");  
            jb[0].setText("log n");jb[1].setText("n log n");jb[2].setText("n square");jb[3].setText("n");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: averge time complexity for bubble?");  
            jb[0].setText("n");jb[1].setText("n log n");jb[2].setText("n square");jb[3].setText("log n");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: worst time complexity for bubble ?");  
            jb[0].setText("n square");jb[1].setText("log n");jb[2].setText("n");  
                        jb[3].setText("n log n");  
        }  
        if(current==7)  
        {  
            l.setText("Que8:best time complexity for quick ?");  
            jb[0].setText("n");jb[1].setText("log n");jb[2].setText("n square");  
                        jb[3].setText("n log n");         
        }  
        if(current==8)  
        {  
            l.setText("Que9:avg time complexity for quick"); 
            jb[0].setText("n");jb[1].setText("n log n");jb[2].setText("n square");jb[3].setText("n log n");  
         }  
        if(current==9)  
        {  
            l.setText("Que10:best time complexity for quick ?");  
            jb[0].setText("n");jb[1].setText("n square");jb[2].setText("n log n");  
                        jb[3].setText("log n");  
        }
       
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[2].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[1].isSelected());  
        if(current==7)  
            return(jb[3].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return false;  
    }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
         new OnlineTestdsa();
  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
