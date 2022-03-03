package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.Users_page;




public class Tc_001 extends Base_Class{
	@Test
	public void Tc_01() {
		
		Users_page up=new Users_page(driver);
         up.container_users();
         up.New_User();
         up.firstNameField("ganesh");
         up.lastName_Field("tiru");
        up.email_Field("tganesh50210@gmail.com");
         up.Save_link();
	}

}
