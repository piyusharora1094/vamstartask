package Locators;

import org.openqa.selenium.By;

public class Locators {

	public static By PublicationDate = By.xpath("(//span[@class=\"col-sm-6 lbl-licitacao\"]//font[@style=\"vertical-align: inherit;\"])[4]");
	public static By English = By.xpath("//img[@alt=\"Inglês\"]");
	public static By Object = By.xpath("//font[contains(text(),'Price')]");
	public static By FileNumber = By.xpath("//font[contains(text(), 'File')]");
	public static By Information = By.xpath("//font[contains(text(), 'Bank')]");
	public static By Modality = By.xpath("(//span[@class=\"col-sm-6 lbl-licitacao\"]//font)[8]");
	public static By Situation = By.xpath("(//span[@class=\"col-sm-6 lbl-licitacao\"]//font)[11]");
	public static By BiddingDate = By.xpath("(//span[@class=\"col-sm-6 lbl-licitacao\"]//font)[16]");
}
