import org.testng.annotations.Test;

public class Priority_configuration {
		@Test(priority=1)
		public void login() {
			System.out.println("Login success");
		}
		
		@Test(priority= 2)
		public void DashBoard() {
			System.out.println("DashBoard Created");
		}
		@Test(priority=3)
		public void signout() {
			System.out.println("Signed Out");
		}
}
