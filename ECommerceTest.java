package Framework.TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework.Pages.BaseClass;
import Framework.Pages.CartPage;
import Framework.Pages.CheckoutPage;
import Framework.Pages.LoginPage;
import Framework.Pages.ProductPage;
import utility.ExcelDataReader;
import utility.ScreenshotUtility;

public class ECommerceTest extends BaseClass {

	@Test
	public void PlaceOrder() throws Exception {

		ExcelDataReader excel = new ExcelDataReader();

		String username = excel.getCellData("LoginData", 1, 0);

		String password = excel.getCellData("LoginData", 1, 1);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.Login(username, password);

		ProductPage product = PageFactory.initElements(driver, ProductPage.class);

		product.addProduct();

		product.openCart();

		CartPage cart = PageFactory.initElements(driver, CartPage.class);

		cart.clickCheckout();

		CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);

		checkout.userDetails();

		ScreenshotUtility.captureScreenshot(driver, "OrderSuccess");
	}
}
