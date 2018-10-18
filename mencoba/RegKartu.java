package mencoba;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class RegKartu extends JFrame {
     JLabel lblreg=new JLabel("Kartu Anda Akan Aktif Setelah Registrasi ");
 
 JLabel lblnik=new JLabel("NIK ");
 JTextField txnik=new JTextField(20);
 JLabel lblnama=new JLabel("Nama Lengkap");
 JTextField txnama=new JTextField(20);
 
 JLabel lbljk=new JLabel("Jenis Kelamin ");
 JRadioButton lk=new JRadioButton("Laki-laki");
 JRadioButton pr=new JRadioButton("Perempuan");
 ButtonGroup grupjk=new ButtonGroup();
 
 JLabel lblagama=new JLabel("Agama");
 String[] ja={"Pilih","Islam","Kristen","Budha","Hindu","Keharingan"};
 JComboBox cbja=new JComboBox(ja);
 
 
JLabel lblalamat=new JLabel("Alamat");
 JTextField txalamat=new JTextField(100);
JButton tbreg=new JButton("Registrasi");
 JButton tblbatal=new JButton("Nanti Aja");
 
 JButton kirim=new JButton("Konfirmasi");
JTextArea hasil=new JTextArea();
    RegKartu()
 {
        
 setTitle("Registrasi Kartu");
 setLocation(300,100);
 setSize(400,450);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
    void info (){
    
    getContentPane().setLayout(null);
 getContentPane().add(lblreg);
 lblreg.setBounds(50,10,300,20);
 getContentPane().add(lblnik);
 lblnik.setBounds(10,40,70,20);
 getContentPane().add(txnik);
 txnik.setBounds(115,40,100,20);
 getContentPane().add(lblnama);
 lblnama.setBounds(10,70,500,20);
 getContentPane().add(txnama);
 txnama.setBounds(115,70,200,20);
 
 
 getContentPane().add(lbljk);
 lbljk.setBounds(10,100,500,20);
 getContentPane().add(lk);
 lk.setBounds(115,100,80,20);
 getContentPane().add(pr);
 pr.setBounds(200,100,130,20);
 grupjk.add(lk);
 grupjk.add(pr);
 
 getContentPane().add(lblagama);
 lblagama.setBounds(10,130,100,20);
 getContentPane().add(cbja);
 cbja.setBounds(115,130,100,20);
 
 getContentPane().add(lblalamat);
 lblalamat.setBounds(10,160,300,20);
 getContentPane().add(txalamat);
 txalamat.setBounds(115,160,200,20);
 
 getContentPane().add(tbreg);
 tbreg.setBounds(290,210,95,20);
 getContentPane().add(tblbatal);
 tblbatal.setBounds(290,240,95,20);
 getContentPane().add(kirim); kirim.setBounds(290,270,110,20);
 getContentPane().add(hasil); hasil.setBounds(10,190,270,150);
 setVisible(true);
    
    
    
    }
    void AksiReaksi()
{
kirim.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
hasil.append(txnik.getText()+"\n");
hasil.append(txnama.getText()+"\n");

if(lk.isSelected()==true) 

{
hasil.append(lk.getText()+"\n");
}
else
{ 
hasil.append(pr.getText()+"\n");

}
 String jenis = (String)
         cbja.getSelectedItem();
 hasil.append(jenis+"\n");

hasil.append(txalamat.getText()+"\n");
}
  
});

}

     public static void main(String args[]){
 RegKartu rk=new RegKartu();
 rk.info();
 rk.AksiReaksi();
  }
 
}
