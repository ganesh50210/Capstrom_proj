package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_page {
	public Users_page(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[.='New User']")
	public WebElement newUser;	
	public void newUser_click()
	{
		newUser.click();
	}
	
	@FindBy(xpath="//div[@id='container_users']")public WebElement container_users;
	public void container_users() {
		container_users.click();
	}
	@FindBy(xpath="//div[.='New User']")public WebElement New_User;
	public void New_User() {
		 New_User.click();
		
	}
	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']")public WebElement firstNameField;
	public void firstNameField(String value) {
		// TODO Auto-generated method stub
		firstNameField.sendKeys(value);
	}
	
	@FindBy(xpath="//input[@id='createUserPanel_lastNameField']")public WebElement lastNameField;
	public void lastName_Field(String value) {
		lastNameField.sendKeys(value);
	}
	@FindBy(id="createUserPanel_emailField")public WebElement email_Field;
	public void email_Field(String value) {
		email_Field.sendKeys(value);
	}

	@FindBy(xpath="//div[.='Save & Send Invitation']")public WebElement Savelink;
	public void Save_link() {
		Savelink.click();
	}
	@FindBy(xpath="(//div[@class='icon manageUsers inactive'])[1]")public WebElement manageUsers;
	public void manageUsers() {
		manageUsers.click();
	}
	
	@FindBy(xpath="(//div[.='DELETE'])[2]")public WebElement DELETE;
	public void DELETE() {
		DELETE.click();
	}
	
	
	
	//inviteSeveralUsersLightBox_commitBtn   
}

//@FindBy(xpath="//a[.='Edit user permissions templates']/../../../div[2]//tr[1]/td[2]/input")public WebElement firstNameCell;
//public void firstNameCell(String value) {
	// TODO Auto-generated method stub
//	firstNameField.sendKeys(value);
//}

//@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder lastNameCell'])[1]")public WebElement lastNameCell;
//public void lastNameCell(String value) {
	// TODO Auto-generated method stub
//	firstNameField.sendKeys(value);
//}

//@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder emailCell'])[1]")public WebElement emailCell;
//public void emailCell(String value) {
	// TODO Auto-generated method stub
//	firstNameField.sendKeys(value);
	//}


//@FindBy(id="inviteSeveralUsersLightBox_commitBtn")public WebElement commitBtn;
//public void commitBtn() {
	// TODO Auto-generated method stub
//	firstNameField.click();
//}
//@FindBy(xpath="//div[.='Bulk Invitations']")public WebElement Bulk_Invitations;
//public void Bulk_Invitations() {
	// TODO Auto-generated method stub
//	Bulk_Invitations.click();
//}