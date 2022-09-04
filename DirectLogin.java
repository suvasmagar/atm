import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class DirectLogin extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JLabel idLabel=new JLabel("ID");
    JPasswordField idField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    
    DirectLogin()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
 
    }
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       idLabel.setBounds(50,220,100,30);
       idField.setBounds(150,220,150,30);
       loginButton.setBounds(50,300,100,30); 
 
   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(idLabel);
       container.add(idField);
       container.add(loginButton);

       loginButton.addActionListener(new ActionListener() {
         @Override 
         public void actionPerformed(ActionEvent e) {
             Dashboard frame=new Dashboard();
             frame.setTitle("Login Form");
             frame.setVisible(true);
             frame.setBounds(10,10,370,600);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setResizable(true);
         }
         });
 
   }
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}
 