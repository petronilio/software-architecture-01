package exercice01.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.util.ArrayList;
//import exercice01.model.Student;
import exercice01.model.Cadastrar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Screen implements ActionListener{
  public JFrame jnl = new JFrame("Cadastro");
  public JLabel rot1 = new JLabel("Nome:");
  public JTextField cx1 = new JTextField(25);
  public JButton bt1 = new JButton("Cadastrar");
  public JButton bt2 = new JButton("Imprimir");
  //private ArrayList<Student> students = new ArrayList<>();
  private ArrayList<Cadastrar> cadastrar = new ArrayList<>();

  public Screen(){

    constructor();
  }

  private void constructor(){
    jnl.setDefaultCloseOperation(jnl.EXIT_ON_CLOSE);

    int larg = 600, alt = 300;

    jnl.setSize(larg, alt);
    jnl.add(cx1);
    jnl.add(rot1);
    jnl.add(bt1);
    jnl.add(bt2);
    jnl.setLayout(new FlowLayout());
    jnl.setVisible(true);

    bt1.addActionListener(this);
    bt2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae){
    if (ae.getSource().equals(bt1)) {
        cadastrar.add(new Cadastrar(cx1.getText()));
        //students.add(new Student(cx1.getText()));
    }

    if (ae.getSource().equals(bt2)) {
        /*for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName());
        }*/
        for(int i = 0; i < cadastrar.size(); i++){
            System.out.println(cadastrar.get(i).getName());
        }
    }

   }
  public void nome() {
      
      Cadastrar cadastrar
      cadastrar = new Cadastrar();
  }



}


