package TestNG;

import org.testng.annotations.Test;

public class Invo {
		@Test(invocationCount=4)
		public void login1() {
			System.out.println("Login success");
		}
		
		@Test(invocationCount=3 ,priority= 2)
		public void DashBoard1() {
			System.out.println("DashBoard Created");
		}
}
