package PagesObjectModel;

import Utilities.CommonMethods;

public class MyAccount extends CommonMethods {

    public void login() {
        enterUserName("heera.arshu19@gmail.com");
        enterPassword("lijinishanth");
        clickLogin();
    }

    public void register() {
        enterEmailAddress("arshunish18@gmail.com");
        enterPasswordForRegister("lijinishanth");
        clickRegister();

    }


    public void lostPassword(){}
    public void signOut(){
        clickSignOut();
    }



//Actions >>>>>Login Process
    public void enterUserName(String email) {
        setText("//input[@name='username']","xpath",email);
    }
    public void enterPassword(String password) {
       setText("//input[@name=\"password\"]","xpath",password);
    }
    public void clickLogin() {
        clickAnElement("//input[@name=\"login\"]","xpath");
    }

//Actions >>>>>Register Process
    public void enterEmailAddress(String email) {
        setText("//input[@name=\"email\"]","xpath",email);
    }
    public void enterPasswordForRegister(String password) {
        setText("//input[@id=\"reg_password\"]","xpath",password);
    }
    public void clickRegister() {
        clickAnElement("//input[@name=\"register\"]","xpath");
    }

    public void clickSignOut() {
        clickAnElement("//a[text()='Sign out']","xpath");

    }


    }






