import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginFrame extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel idLabel=new JLabel("ID");
    JTextField userTextField=new JTextField();
    JPasswordField idField=new JPasswordField();
    JButton signinButton=new JButton("LOGIN");
    JButton loginButton=new JButton("Already Have Account");
    
    LoginFrame()
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
       userLabel.setBounds(50,150,100,30);
       idLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       idField.setBounds(150,220,150,30);
       signinButton.setBounds(50,300,100,30);
       loginButton.setBounds(200,300,100,30);
 
 
   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(userLabel);
       container.add(idLabel);
       container.add(userTextField);
       container.add(idField);
       container.add(signinButton);
       container.add(loginButton);


   signinButton.addActionListener(new ActionListener() {
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

    loginButton.addActionListener(new ActionListener() {
        @Override 
        public void actionPerformed(ActionEvent e) {
            DirectLogin frame=new DirectLogin();
            frame.setTitle("Login Form");
            frame.setVisible(true);
            frame.setBounds(10,10,370,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
        }
        });

    }
@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
}
}
 