package com.cybertek.tests.day04_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC03_FindElements_Apple {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");

        //3. Click to all of the headers one by one
        //a. Mac, iPad, iPhone, Watch, TV, Music, Support
        //4. Print out how many links on each page with the titles of the pages
        //MAc
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']")).click();
        List<WebElement> linksOnMacPage = driver.findElements(By.xpath("//body//a"));
        String titleOnMacPage = driver.getTitle();
        int linksWithoutTextOnMac = 0;
        int linksWithTextOnMac = 0;
        for(WebElement eachLink : linksOnMacPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnMac++;
            }else{
                linksWithTextOnMac++;
            }
        }
        int mac = linksOnMacPage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnMacPage+ "\" is " + mac);

        //Ipad
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-ipad']")).click();
        List<WebElement> linksOnIpadPage = driver.findElements(By.xpath("//body//a"));
        String titleOnIpadPage = driver.getTitle();
        int linksWithoutTextOnIpad = 0;
        int linksWithTextOnIpad = 0;
        for(WebElement eachLink : linksOnIpadPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnIpad++;
            }else{
                linksWithTextOnIpad++;
            }
        }
        int ipad = linksOnIpadPage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnIpadPage+ "\" is " + ipad);

        //IPhone
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
        List<WebElement> linksOnIphonePage = driver.findElements(By.xpath("//body//a"));
        String titleOnIphonePage = driver.getTitle();
        int linksWithoutTextOnIphone = 0;
        int linksWithTextOnIphone = 0;
        for(WebElement eachLink : linksOnIphonePage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnIphone++;
            }else{
                linksWithTextOnIphone++;
            }
        }
        int iphone = linksOnIphonePage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnIphonePage+ "\" is " + iphone);

        //Watch
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']")).click();
        List<WebElement> linksOnWatchPage = driver.findElements(By.xpath("//body//a"));
        String titleOnWatchPage = driver.getTitle();
        int linksWithoutTextOnWatch = 0;
        int linksWithTextOnWatch = 0;
        for(WebElement eachLink : linksOnWatchPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnWatch++;
            }else{
                linksWithTextOnWatch++;
            }
        }
        int watch = linksOnWatchPage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnWatchPage+ "\" is " + watch);

        //TV
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']")).click();
        List<WebElement> linksOnTVPage = driver.findElements(By.xpath("//body//a"));
        String titleOnTVPage = driver.getTitle();
        int linksWithoutTextOnTV = 0;
        int linksWithTextOnTV = 0;
        for(WebElement eachLink : linksOnTVPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnTV++;
            }else{
                linksWithTextOnTV++;
            }
        }
        int TV = linksOnTVPage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnTVPage+ "\" is " + TV);

        //Music
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']")).click();
        List<WebElement> linksOnMusicPage = driver.findElements(By.xpath("//body//a"));
        String titleOnMusicPage = driver.getTitle();
        int linksWithoutTextOnMusic = 0;
        int linksWithTextOnMusic = 0;
        for(WebElement eachLink : linksOnMusicPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnMusic++;
            }else{
                linksWithTextOnMusic++;
            }
        }
        int music = linksOnMusicPage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnMusicPage+ "\" is " + music);

        //Support
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-support']")).click();
        List<WebElement> linksOnSupportPage = driver.findElements(By.xpath("//body//a"));
        String titleOnSupportPage = driver.getTitle();
        int linksWithoutTextOnSupport = 0;
        int linksWithTextOnSupport = 0;
        for(WebElement eachLink : linksOnSupportPage ){
            if(eachLink.getText().isEmpty()){
                linksWithoutTextOnSupport++;
            }else{
                linksWithTextOnSupport++;
            }
        }
        int support = linksOnSupportPage.size();
        System.out.println("Total Number of Links on the page with the title \""+titleOnSupportPage+ "\" is " + support);


        //5. Loop through all
        //6. Print out how many link is missing text TOTAL
         System.out.println("Total number of links missing Text is "+(linksWithoutTextOnIpad+linksWithoutTextOnIphone+linksWithoutTextOnMac+linksWithoutTextOnMusic+linksWithoutTextOnSupport+linksWithoutTextOnTV+linksWithoutTextOnWatch));
        //7. Print out how many link has text TOTAL
        System.out.println("Total number of links that have Text is "+(linksWithTextOnIpad+linksWithTextOnIphone+linksWithTextOnMac+linksWithTextOnMusic+linksWithTextOnSupport+linksWithTextOnTV+linksWithTextOnWatch));
        //8. Print out how many total link TOTAL
        System.out.println("Total number of links on all pages is " + (mac+ipad+iphone+music+TV+watch+support));

        Thread.sleep(3000);
        driver.close();
    }
}
