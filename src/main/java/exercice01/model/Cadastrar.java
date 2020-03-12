package exercice01.model;

import java.util.ArrayList;

public class Cadastrar{
       private ArrayList<Cadastrar> cadastrar;
       private String name;
    public static void  cadastrar(){
    
    }

    public Cadastrar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    // GET AND SETTERS

    public Cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cadastrar> getCadastrar() {
        return this.cadastrar;
    }

    public void setCadastrar(ArrayList<Cadastrar> cadastrar) {
        this.cadastrar = cadastrar;
    }


}

/* 
public static void event(){

  

     // GET AND SETTERS
 
    public ArrayList<Activities> getListActivities() {
        return this.listActivities;
    }

    public void setListActivities(ArrayList<Activities> listActivities) {
        this.listActivities = listActivities;
    }

}






public static void viewController(){
    private Screen screen= new Screen();
} 
  */