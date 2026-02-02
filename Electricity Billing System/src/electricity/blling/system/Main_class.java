package electricity.blling.system;

import javax.swing.*;
import java.awt.*;

public class Main_class extends JFrame {
    Main_class(){

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image image= imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcontwo=new ImageIcon(image);
        JLabel imageLable=new JLabel(imageIcontwo);
        add(imageLable);


        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);


        JMenu menu=new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(menu);

        JMenuItem newcustomer =new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerImg= new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerImage=customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerImage));
        menu.add(newcustomer);


        JMenuItem customerdetails =new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerdetailsImg= new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image customerdetailsImage=customerdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(customerdetailsImage));
        menu.add(customerdetails);


        JMenuItem depositedetails =new JMenuItem("Deposit Details");
        depositedetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon depositedetailsImg= new ImageIcon(ClassLoader.getSystemResource("icon/depositDetails.png"));
        Image depositedetailsImage=depositedetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositedetails.setIcon(new ImageIcon(depositedetailsImage));
        menu.add(depositedetails);



        JMenuItem calculatebill =new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatebillImg= new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calculatebillImage=calculatebillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculatebillImage));
        menu.add(calculatebill);





        JMenu information=new JMenu("Information");
        information.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(information);


        JMenuItem upinfo =new JMenuItem("Update Information");
        upinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon upinfoImg= new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image upinfoImage=upinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoImage));
        information.add(upinfo);


        JMenuItem viewinfo =new JMenuItem("View Information");
        viewinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon viewinfoImg= new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewinfoImage=viewinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(viewinfoImage));
        information.add(viewinfo);





        JMenu user=new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(user);


        JMenuItem paybill =new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon paybillImg= new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image paybillImage=paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        user.add(paybill);


        JMenuItem billDetails =new JMenuItem("Bill Details");
        billDetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon billDetailsImg= new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billDetailsImage=billDetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billDetails.setIcon(new ImageIcon(billDetailsImage));
        user.add(billDetails);





        JMenu bill=new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(bill);


        JMenuItem genbill =new JMenuItem("Generate Bill");
        genbill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon genbillImg= new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genbillImage=genbillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genbill.setIcon(new ImageIcon(genbillImage));
        bill.add(genbill);




        JMenu utility=new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(utility);


        JMenuItem notepad =new JMenuItem("NotePad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadImg= new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadImage=notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        utility.add(notepad);


        JMenuItem calculator =new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorImg= new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatorImage=calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        utility.add(calculator);





        JMenu exit=new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(exit);


        JMenuItem eexit =new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitImg= new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image eexitImage=eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        exit.add(eexit);



        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main_class();
    }
}
