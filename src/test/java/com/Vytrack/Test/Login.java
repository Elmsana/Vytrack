package com.Vytrack.Test;

import com.Vytrack.Utility.ConfigurationReader;
import com.Vytrack.Utility.Driver;
import com.Vytrack.pages.dashboard;
import com.Vytrack.pages.loginPage;
import com.Vytrack.Utility.BrowserUtils;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login {

    loginPage logIn = new loginPage();
        @BeforeMethod
        public void Login() {
            Driver.get().get(ConfigurationReader.get("url"));
            String dUsername = ConfigurationReader.get("dusername");
            String dPassword = ConfigurationReader.get("dpassword");
            logIn.login(dUsername, dPassword);
        }
            @Test
            public void dashboard(){

            dashboard dash = new dashboard()
            dash.MyConfiguration.click();
            BrowserUtils.waitFor(2);
            String actualTitle = Driver.get().getTitle();
            Assert.assertEquals("John Doe", actualTitle);
            dash.logout.click();

        }


    public void close(){
            Driver.get().quit();

        }
    }


