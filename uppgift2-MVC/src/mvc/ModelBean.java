package mvc;

import java.util.ArrayList;

public class ModelBean {
 
    private String username;
    private String password;
    private ArrayList<String> listOfUsernames = new ArrayList<>();
    private ArrayList<String> listOfPasswords = new ArrayList<>();
    
    public void setName(String name) {
        this.username = name;
    }
   
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setListOfUsernames(String username) {
        this.listOfUsernames.add(username) ;
    }
    public void setListOfPasswords(String password) {
        this.listOfPasswords.add(password);
    }
    
    
    public boolean validate() {
        boolean answer = false;
        
        for (int i = 0; i < listOfUsernames.size(); i++) {
            if (listOfUsernames.get(i).equals(username) && listOfPasswords.get(i).equals(password)) {
                answer = true;
            } 
        }
        return answer;
    }
}


