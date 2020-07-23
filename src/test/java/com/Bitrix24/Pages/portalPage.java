package com.Bitrix24.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class portalPage extends BasePage{

    @FindBy(xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']/span")
    private WebElement messageTab;

    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    private WebElement sendMessageBox;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    private WebElement attachUploadFile;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']/i")
    private WebElement attachLink;


    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']/i")
    private WebElement insertVideo;

}
