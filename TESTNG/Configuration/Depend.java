package TestNG;

import org.testng.annotations.Test;

public class Depend {
		@Test(priority=1)
		public void login() {
			System.out.println("Login success");
		}
		
		@Test(dependsOnMethods= {"login"})
		public void DashBoard() {
			System.out.println("DashBoard Created");
		}
		@Test(dependsOnMethods= {"DashBoard"})
		public void signout() {
			System.out.println("Signed Out");
		}
}
