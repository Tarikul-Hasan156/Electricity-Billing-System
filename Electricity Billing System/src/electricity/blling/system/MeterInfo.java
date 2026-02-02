package electricity.blling.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeterInfo extends JFrame implements ActionListener {
    Choice meterLocationCho,meterTypeCho,phaseCodeCho,buildTypeCho;
    JButton submit;
    String meter_number;
    MeterInfo(String meter_number){
        this.meter_number=meter_number;

        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252,186,3));
        add(panel);

        JLabel heading=new JLabel("Meter Information");
        heading.setBounds(180,10,200,20);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(heading);

        JLabel meterNumber=new JLabel("Meter Number");
        meterNumber.setBounds(50,80,100,20);
        panel.add(meterNumber);



        JLabel meterNumberText=new JLabel(meter_number);
        meterNumberText.setBounds(180,80,150,20);
        panel.add(meterNumberText);


        JLabel meterLocation=new JLabel("Meter Location");
        meterLocation.setBounds(50,120,100,20);
        panel.add(meterLocation);


        meterLocationCho =new Choice();
        meterLocationCho.add("Outside");
        meterLocationCho.add("Inside");
        meterLocationCho.setBounds(180,120,150,20);
        panel.add(meterLocationCho);


        JLabel metertype=new JLabel("Meter Type");
        metertype.setBounds(50,160,100,20);
        panel.add(metertype);

        meterTypeCho =new Choice();
        meterTypeCho.add("Electric");
        meterTypeCho.add("Solar Meter");
        meterTypeCho.add("Smart Meter");
        meterTypeCho.setBounds(180,160,150,20);
        panel.add(meterTypeCho);



        JLabel phasecode=new JLabel("Phase Code");
        phasecode.setBounds(50,200,100,20);
        panel.add(phasecode);

        phaseCodeCho =new Choice();
        phaseCodeCho.add("011");
        phaseCodeCho.add("022");
        phaseCodeCho.add("033");
        phaseCodeCho.add("044");
        phaseCodeCho.add("055");
        phaseCodeCho.add("066");
        phaseCodeCho.add("077");
        phaseCodeCho.add("088");
        phaseCodeCho.add("099");
        phaseCodeCho.setBounds(180,200,150,20);
        panel.add(phaseCodeCho);


                JLabel buildType=new JLabel("Bill Type");
        buildType.setBounds(50,240,100,20);
        panel.add(buildType);


        buildTypeCho =new Choice();
        buildTypeCho.add("Normal");
        buildTypeCho.add("Industrial");
        buildTypeCho.setBounds(180,240,150,20);
        panel.add(buildTypeCho);


        JLabel day=new JLabel("30 Days Billing Time...");
        day.setBounds(50,280,150,20);
        panel.add(day);

        JLabel note=new JLabel("Note...");
        note.setBounds(50,320,100,20);
        panel.add(note);



        JLabel noteOne=new JLabel("By default bill is calculated for 30 days only.");
        noteOne.setBounds(50,340,300,20);
        panel.add(noteOne);


        submit=new JButton("Submit");
        submit.setBounds(220,390,100,25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        panel.add(submit);


        setLayout(new BorderLayout());
        add(panel,"Center");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/details.png"));
        Image i2=i1.getImage().getScaledInstance(230,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel imgLabel=new JLabel(i3);
        add(imgLabel,"East");














        setSize(700,500);
        setLocation(400,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit){
            String smeternumber=meter_number;
            String smeterlocation=meterLocationCho.getSelectedItem();
            String smetertype=meterTypeCho.getSelectedItem();
            String sphasecode=phaseCodeCho.getSelectedItem();
            String sbuildtype=buildTypeCho.getSelectedItem();
            String sday="30";

            String query_meterinfo="insert into meter_info values ('"+smeternumber+"','"+smeterlocation+"','"+smetertype+"','"+sphasecode+"','"+sbuildtype+"','"+sday+"')";

            try{
                Database c=new Database();
                c.statement.executeUpdate(query_meterinfo);
                JOptionPane.showMessageDialog(null,"Meter information submitted successfully");

                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new MeterInfo("");
    }
}
