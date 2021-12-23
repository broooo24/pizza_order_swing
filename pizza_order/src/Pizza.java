import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Pizza extends JFrame implements ActionListener{
    ArrayList<String > eachProduct = new ArrayList<>();
    JLabel pizza1,pizza2,pizza3,pizza4,pizza1description,pizza2description,pizza3description,pizza4description,listLabel;
    JLabel pizza5,pizza6,pizza7,pizza8,pizza5description,pizza6description,pizza7description,pizza8description;
    JLabel displayOrders,ordermessage;
    JCheckBox pizza1small,pizza1medium,pizza1large,pizza2small,pizza2medium,pizza2large,pizza3small,pizza3medium,pizza3large,pizza4small,pizza4medium,pizza4large;
    JCheckBox pizza5small,pizza5medium,pizza5large,pizza6small,pizza6medium,pizza6large,pizza7small,pizza7medium,pizza7large,pizza8small,pizza8medium,pizza8large;
    JButton pizza1buy,pizza2buy,pizza3buy,pizza4buy,pizza5buy,pizza6buy,pizza7buy,pizza8buy,listbtn,resetbtn,orderbtn;
    JButton administrationbtn;
    static int amount;
    static int summary;
    static String bought;
    Pizza() {
        setTitle("Pizzéria");
        administrationbtn = new JButton("Adminisztráció");
        administrationbtn.setBounds(1750,50,150,20);
        administrationbtn.addActionListener(this);
        pizza1 = new JLabel("Margaréta");
        pizza1.setBounds(250, 50, 300, 20);
        pizza1description = new JLabel("paradicsomos alap,mozeralla,oregánó");
        pizza1description.setBounds(150, 75, 300, 20);
        pizza1small = new JCheckBox("1100");
        pizza1small.setBounds(150, 100, 75, 20);
        pizza1medium = new JCheckBox("1790");
        pizza1medium.setBounds(250, 100, 75, 20);
        pizza1large = new JCheckBox("4790");
        pizza1large.setBounds(350, 100, 75, 20);
        pizza1buy = new JButton("Kosárba");
        pizza1buy.setBounds(200, 175, 150, 20);
        pizza1buy.addActionListener(this);

        pizza2 = new JLabel("Sonkás");
        pizza2.setBounds(650, 50, 300, 20);
        pizza2description = new JLabel("paradicsomos alap,mozzarella,sonka,oregánó");
        pizza2description.setBounds(550, 75, 300, 20);
        pizza2small = new JCheckBox("1150");
        pizza2small.setBounds(550, 100, 75, 20);
        pizza2medium = new JCheckBox("1890");
        pizza2medium.setBounds(650, 100, 75, 20);
        pizza2large = new JCheckBox("5190");
        pizza2large.setBounds(750, 100, 75, 20);
        pizza2buy = new JButton("Kosárba");
        pizza2buy.setBounds(600, 175, 150, 20);
        pizza2buy.addActionListener(this);



        pizza3 = new JLabel("Csirkemájas");
        pizza3.setBounds(1050, 50, 300, 20);
        pizza3description = new JLabel("paradicsomos alap,mozzarella, házi csirkemáj ragu, lillahagyma");
        pizza3description.setBounds(950, 75, 300, 20);
        pizza3small = new JCheckBox("1200");
        pizza3small.setBounds(950, 100, 75, 20);
        pizza3medium = new JCheckBox("1990");
        pizza3medium.setBounds(1050, 100, 75, 20);
        pizza3large = new JCheckBox("5390");
        pizza3large.setBounds(1150, 100, 75, 20);
        pizza3buy = new JButton("Kosárba");
        pizza3buy.setBounds(1000, 175, 150, 20);
        pizza3buy.addActionListener(this);


        pizza4 = new JLabel("Gombás");
        pizza4.setBounds(1450, 50, 300, 20);
        pizza4description = new JLabel("paradicsomos alap,mozzarella,sonkás gomba");
        pizza4description.setBounds(1350, 75, 300, 20);
        pizza4small = new JCheckBox("1200");
        pizza4small.setBounds(1350, 100, 75, 20);
        pizza4medium = new JCheckBox("1990");
        pizza4medium.setBounds(1450, 100, 75, 20);
        pizza4large = new JCheckBox("5390");
        pizza4large.setBounds(1550, 100, 75, 20);
        pizza4buy = new JButton("Kosárba");
        pizza4buy.setBounds(1400, 175, 150, 20);
        pizza4buy.addActionListener(this);

        pizza5 = new JLabel("Hawai");
        pizza5.setBounds(250, 350, 300, 20);
        pizza5description = new JLabel("paradicsomos alap, sonka, mozzarella, ananász");
        pizza5description.setBounds(150, 375, 300, 20);
        pizza5small = new JCheckBox("1200");
        pizza5small.setBounds(150, 400, 75, 20);
        pizza5medium = new JCheckBox("1990");
        pizza5medium.setBounds(250, 400, 75, 20);
        pizza5large = new JCheckBox("5390");
        pizza5large.setBounds(350, 400, 75, 20);
        pizza5buy = new JButton("Kosárba");
        pizza5buy.setBounds(200, 475, 150, 20);
        pizza5buy.addActionListener(this);

        pizza6 = new JLabel("Kukoricás");
        pizza6.setBounds(650, 350, 300, 20);
        pizza6description = new JLabel("paradicsomos alap, sonka, mozzarella, kukorica");
        pizza6description.setBounds(550, 375, 300, 20);
        pizza6small = new JCheckBox("1200");
        pizza6small.setBounds(550, 400, 75, 20);
        pizza6medium = new JCheckBox("1990");
        pizza6medium.setBounds(650, 400, 75, 20);
        pizza6large = new JCheckBox("5390");
        pizza6large.setBounds(750, 400, 75, 20);
        pizza6buy = new JButton("Kosárba");
        pizza6buy.setBounds(600, 475, 150, 20);
        pizza6buy.addActionListener(this);

        pizza7 = new JLabel("Kusza");
        pizza7.setBounds(1050, 350, 300, 20);
        pizza7description = new JLabel("paradicsomos alap, mozzarella, szalámi, kukorica");
        pizza7description.setBounds(950, 375, 300, 20);
        pizza7small = new JCheckBox("1200");
        pizza7small.setBounds(950, 400, 75, 20);
        pizza7medium = new JCheckBox("1990");
        pizza7medium.setBounds(1050, 400, 75, 20);
        pizza7large = new JCheckBox("5390");
        pizza7large.setBounds(1150, 400, 75, 20);
        pizza7buy = new JButton("Kosárba");
        pizza7buy.setBounds(1000, 475, 150, 20);
        pizza7buy.addActionListener(this);

        pizza8 = new JLabel("Négy sajtos");
        pizza8.setBounds(1450, 350, 300, 20);
        pizza8description = new JLabel("paradicsomos alap, mozzarella, trappista, füstölt sajt, márvány sajt");
        pizza8description.setBounds(1300, 375, 400, 20);
        pizza8small = new JCheckBox("1200");
        pizza8small.setBounds(1350, 400, 75, 20);
        pizza8medium = new JCheckBox("1990");
        pizza8medium.setBounds(1450, 400, 75, 20);
        pizza8large = new JCheckBox("5390");
        pizza8large.setBounds(1550, 400, 75, 20);
        pizza8buy = new JButton("Kosárba");
        pizza8buy.setBounds(1400, 475, 150, 20);
        pizza8buy.addActionListener(this);


        listbtn = new JButton("Kilistáz");
        listbtn.setBounds(1400,675,150,20);
        listbtn.addActionListener(this);
        resetbtn = new JButton("Töröl");
        resetbtn.setBounds(1200,675,150,20);
        resetbtn.addActionListener(this);
        orderbtn = new JButton("Rendel");
        orderbtn.setBounds(1600,675,150,20);
        orderbtn.addActionListener(this);

        listLabel = new JLabel();
            listLabel.setBounds(1000,475,850,220);


        add(pizza1);
        add(pizza1description);
        add(pizza2);
        add(pizza2description);
        add(pizza3);
        add(pizza3description);
        add(pizza4);
        add(pizza4description);
        add(pizza5);
        add(pizza5description);
        add(pizza6);
        add(pizza6description);
        add(pizza7);
        add(pizza7description);
        add(pizza8);
        add(pizza8description);
        add(pizza1small);
        add(pizza1medium);
        add(pizza1large);
        add(pizza2small);
        add(pizza2medium);
        add(pizza2large);
        add(pizza3small);
        add(pizza3medium);
        add(pizza3large);
        add(pizza4small);
        add(pizza4medium);
        add(pizza4large);
        add(pizza5small);
        add(pizza5medium);
        add(pizza5large);
        add(pizza6small);
        add(pizza6medium);
        add(pizza6large);
        add(pizza7small);
        add(pizza7medium);
        add(pizza7large);
        add(pizza8small);
        add(pizza8medium);
        add(pizza8large);
        add(pizza1buy);
        add(pizza2buy);
        add(pizza3buy);
        add(pizza4buy);
        add(pizza5buy);
        add(pizza6buy);
        add(pizza7buy);
        add(pizza8buy);
        add(listbtn);
        add(listLabel);
        add(resetbtn);
        add(orderbtn);
        add(administrationbtn);
        setSize(2000, 1600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pizza();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pizza1buy){
            if (pizza1small.isSelected()){
                amount =Integer.parseInt(pizza1small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza1.getText() + " ar: " + pizza1small.getText());
            }
            if (pizza1medium.isSelected()){
                amount = Integer.parseInt(pizza1medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza1.getText() + " ar:" + pizza1medium.getText());

            }
            if (pizza1large.isSelected()){
                amount = Integer.parseInt(pizza1large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza1.getText()+ " ar: " + pizza1large.getText());
            }
        }
        if (e.getSource()==pizza2buy){
            if (pizza2small.isSelected()){
                amount =Integer.parseInt(pizza2small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza2.getText() + " ar: " + pizza2small.getText());
            }
            if (pizza2medium.isSelected()){
                amount = Integer.parseInt(pizza2medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza2.getText() + " ar:" + pizza2medium.getText());

            }
            if (pizza2large.isSelected()){
                amount = Integer.parseInt(pizza2large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza2.getText()+ " ar: " + pizza2large.getText());
            }
        }
        if (e.getSource()==pizza3buy){
            if (pizza3small.isSelected()){
                amount =Integer.parseInt(pizza3small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza3.getText() + " ar: " + pizza3small.getText());
            }
            if (pizza3medium.isSelected()){
                amount = Integer.parseInt(pizza3medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza3.getText() + " ar:" + pizza3medium.getText());

            }
            if (pizza3large.isSelected()){
                amount = Integer.parseInt(pizza3large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza3.getText()+ " ar: " + pizza3large.getText());
            }
        }
        if (e.getSource()==pizza4buy){
            if (pizza4small.isSelected()){
                amount =Integer.parseInt(pizza4small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza4.getText() + " ar: " + pizza4small.getText());
            }
            if (pizza4medium.isSelected()){
                amount = Integer.parseInt(pizza4medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza4.getText() + " ar:" + pizza4medium.getText());

            }
            if (pizza4large.isSelected()){
                amount = Integer.parseInt(pizza4large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza4.getText()+ " ar: " + pizza4large.getText());
            }
        }
        if (e.getSource()==pizza5buy){
            if (pizza5small.isSelected()){
                amount =Integer.parseInt(pizza5small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza5.getText() + " ar: " + pizza5small.getText());
            }
            if (pizza5medium.isSelected()){
                amount = Integer.parseInt(pizza5medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza5.getText() + " ar:" + pizza5medium.getText());

            }
            if (pizza5large.isSelected()){
                amount = Integer.parseInt(pizza5large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza5.getText()+ " ar: " + pizza5large.getText());
            }
        }
        if (e.getSource()==pizza6buy){
            if (pizza6small.isSelected()){
                amount =Integer.parseInt(pizza6small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza6.getText() + " ar: " + pizza6small.getText());
            }
            if (pizza6medium.isSelected()){
                amount = Integer.parseInt(pizza6medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza6.getText() + " ar:" + pizza6medium.getText());

            }
            if (pizza6large.isSelected()){
                amount = Integer.parseInt(pizza6large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza6.getText()+ " ar: " + pizza6large.getText());
            }
        }
        if (e.getSource()==pizza7buy){
            if (pizza7small.isSelected()){
                amount =Integer.parseInt(pizza7small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza7.getText() + " ar: " + pizza7small.getText());
            }
            if (pizza7medium.isSelected()){
                amount = Integer.parseInt(pizza7medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza7.getText() + " ar:" + pizza7medium.getText());
            }
            if (pizza7large.isSelected()){
                amount = Integer.parseInt(pizza7large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza7.getText()+ " ar: " + pizza7large.getText());
            }
        }
        if (e.getSource()==pizza8buy){
            if (pizza8small.isSelected()){
                amount =Integer.parseInt(pizza8small.getText());
                summary += amount;
                eachProduct.add("1 db kis " + pizza8.getText() + " ar: " + pizza8small.getText());
            }
            if (pizza8medium.isSelected()){
                amount = Integer.parseInt(pizza8medium.getText());
                summary += amount;
                eachProduct.add("1 db kozepes " + pizza8.getText() + " ar:" + pizza8medium.getText());
            }
            if (pizza8large.isSelected()){
                amount = Integer.parseInt(pizza8large.getText());
                summary += amount;
                eachProduct.add("1 db nagy " + pizza8.getText()+ " ar: " + pizza8large.getText());
            }
        }
        if (e.getSource() ==listbtn){
            String products ="";
            //System.out.println(eachProduct);
            for (int i = 0;i<eachProduct.size();i++){
                products += eachProduct.get(i);
                products +=",";
            }
            listLabel.setText(products);
        }
        if (e.getSource() == resetbtn){
            eachProduct.clear();

        }
        if (e.getSource()==orderbtn){
            FileManager.append(String.valueOf(eachProduct));
        }
        if (e.getSource()==administrationbtn){
            getContentPane().removeAll();
            ordermessage = new JLabel();
            ordermessage.setText("Rendelések");
            ordermessage.setBounds(20,20,100,100);
            add(ordermessage);
            displayOrders = new JLabel();
            String text = String.valueOf(FileManager.read());
            String replaceString=text.replace("],","\n");
            replaceString = replaceString.replace("[","");
            replaceString = replaceString.replace("]","");
            displayOrders.setText(convertToMultiline(replaceString));
            displayOrders.setBounds(100,25,200,400);
            add(displayOrders);
            repaint();
        }
    }
    public static String convertToMultiline(String orig)
    {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}
