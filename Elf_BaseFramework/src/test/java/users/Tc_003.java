package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.Users_page;


	public class Tc_003 extends Base_Class{
		@Test
		public void Tc_02() {
			
			Users_page up=new Users_page(driver);
	         up.container_users();
	         up.manageUsers();
	         up.DELETE();
	         
	         
	         
		}
}
