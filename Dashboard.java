import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Dashboard extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JButton checkBalance=new JButton("Check Your Balance");
    JButton deposit=new JButton("Make a Deposit");
    JButton withdraw=new JButton("Withdraw");
    JButton previousTrans=new JButton("Previous Transactions");
    JButton calcInterest=new JButton("Calculate Interest");
    JButton logOut=new JButton("Log Out");

    JTextField checkBalanceField = new JTextField();
    JTextField depositField = new JTextField();
    JTextField withdrawField = new JTextField();
    JTextField previousTransField = new JTextField();
    JTextField calcInterestField = new JTextField();
    JTextField logOutField = new JTextField();

    
    Dashboard()
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
       checkBalance.setBounds(50,100,100,30);
       checkBalanceField.setBounds(250,100,150,30);
       deposit.setBounds(50,200,100,30);
       depositField.setBounds(250,200,150,30);
       withdraw.setBounds(50,300,100,30);
       withdrawField.setBounds(250,300,150,30);
       previousTrans.setBounds(50,400,100,30);
       previousTransField.setBounds(250,400,150,30);
       calcInterest.setBounds(50,500,100,30);
       calcInterestField.setBounds(250,500,150,30);

       logOut.setBounds(200,600,100,30);


 
 
   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(checkBalance);
       container.add(deposit);
       container.add(withdraw);
       container.add(previousTrans);
       container.add(calcInterest);
       container.add(logOut);

       container.add(checkBalanceField);
       container.add(depositField);
       container.add(withdrawField);
       container.add(previousTransField);
       container.add(calcInterestField);
       
       logOut.addActionListener(new ActionListener() {
        @Override 
        public void actionPerformed(ActionEvent e) {
            LoginFrame frame=new LoginFrame();
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
 
    }
}
 