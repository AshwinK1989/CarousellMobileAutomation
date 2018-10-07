package com.managers;

import org.openqa.selenium.WebDriver;
import com.pageobjects.IntroPage;
import com.pageobjects.ListingDetailPage;
import com.pageobjects.BrowsePage;
import com.pageobjects.ChooseCategoryPage;
import com.pageobjects.DashboardPage;
import com.pageobjects.LoginPage;
import com.pageobjects.PhotosPage;
import com.pageobjects.ProductPage;

public class PageObjectManager {

	WebDriver driver;
	LoginPage loginPage;
	IntroPage introPage;
	DashboardPage dashboardPage;
	PhotosPage photospage;
	ChooseCategoryPage chooseCategoryPage;
	ListingDetailPage listingdetailPage;
	BrowsePage browsePage;
	ProductPage productpage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public LoginPage getLoginPage() {

		return (loginPage == null) ? new LoginPage(driver) : loginPage;
	}

	public DashboardPage getDashboardPage() {

		return (introPage == null) ? new DashboardPage(driver) : dashboardPage;
	}

	public PhotosPage getPhotosPage() {

		return (introPage == null) ? new PhotosPage(driver) : photospage;
	}

	public IntroPage getIntroPage() {

		return (introPage == null) ? new IntroPage(driver) : introPage;
	}

	public ChooseCategoryPage getChooseCategoryPage() {

		return (chooseCategoryPage == null) ? new ChooseCategoryPage(driver) : chooseCategoryPage;
	}

	public ListingDetailPage getListingDetailPage() {

		return (listingdetailPage == null) ? new ListingDetailPage(driver) : listingdetailPage;
	}

	public BrowsePage getBrowsePage() {

		return (browsePage == null) ? new BrowsePage(driver) : browsePage;
	}

	public ProductPage getProductPage() {

		return (productpage == null) ? new ProductPage(driver) : productpage;
	}

}
