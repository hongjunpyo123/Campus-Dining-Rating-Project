package com.univ.start.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.univ.start.claude.ClaudeAiClient;
import com.univ.start.dto.MenuData;
import com.univ.start.dto.MenuResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

  private final WebDriver driver;
  private final ClaudeAiClient claudeAiClient;
  private ObjectMapper objectMapper = new ObjectMapper();
  private String mondayMenuData;
  private String tuesdayMenuData;
  private String wednesdayMenuData;
  private String thursdayMenuData;
  private String fridayMenuData;


  public List<MenuData> test() throws InterruptedException, JsonProcessingException {
    new MenuResponse();
    Thread.sleep(2000L);
    String url = "https://www.daejin.ac.kr/daejin/924/subview.do";
    this.driver.get(url);
    String menu_1_1 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(1) td:nth-child(2)")).getText();
    String menu_1_2 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(2) td:nth-child(1)")).getText();
    String menu_1_3 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(3) td:nth-child(1)")).getText();
    String menu_1_4 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(4) td:nth-child(1)")).getText();

    MenuData mondayMenuData = new MenuData();
    MenuData.Menu menuObject_1_1 = new MenuData.Menu();
    MenuData.Menu menuObject_1_2 = new MenuData.Menu();
    MenuData.Menu menuObject_1_3 = new MenuData.Menu();
    MenuData.Menu menuObject_1_4 = new MenuData.Menu();

    this.parseMenuData(menu_1_1, menuObject_1_1);
    this.parseMenuData(menu_1_2, menuObject_1_2);
    this.parseMenuData(menu_1_3, menuObject_1_3);
    this.parseMenuData(menu_1_4, menuObject_1_4);


    mondayMenuData.setDotw("월요일");
    mondayMenuData.setMenus(
        Arrays.asList(menuObject_1_1, menuObject_1_2, menuObject_1_3, menuObject_1_4));
    this.mondayMenuData = this.objectMapper.writeValueAsString(mondayMenuData);
    String menu_2_1 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(1) td:nth-child(3)")).getText();
    String menu_2_2 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(2) td:nth-child(2)")).getText();
    String menu_2_3 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(3) td:nth-child(2)")).getText();
    String menu_2_4 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(4) td:nth-child(2)")).getText();

    MenuData tuesdayMenuData = new MenuData();
    MenuData.Menu menuObject_2_1 = new MenuData.Menu();
    MenuData.Menu menuObject_2_2 = new MenuData.Menu();
    MenuData.Menu menuObject_2_3 = new MenuData.Menu();
    MenuData.Menu menuObject_2_4 = new MenuData.Menu();

    this.parseMenuData(menu_2_1, menuObject_2_1);
    this.parseMenuData(menu_2_2, menuObject_2_2);
    this.parseMenuData(menu_2_3, menuObject_2_3);
    this.parseMenuData(menu_2_4, menuObject_2_4);


    tuesdayMenuData.setDotw("화요일");
    tuesdayMenuData.setMenus(Arrays.asList(menuObject_2_1, menuObject_2_2, menuObject_2_3, menuObject_2_4));
    this.tuesdayMenuData = this.objectMapper.writeValueAsString(tuesdayMenuData);
    String menu_3_1 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(1) td:nth-child(4)")).getText();
    String menu_3_2 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(2) td:nth-child(3)")).getText();
    String menu_3_3 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(3) td:nth-child(3)")).getText();
    String menu_3_4 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(4) td:nth-child(3)")).getText();

    MenuData wednesdayMenuData = new MenuData();
    MenuData.Menu menuObject_3_1 = new MenuData.Menu();
    MenuData.Menu menuObject_3_2 = new MenuData.Menu();
    MenuData.Menu menuObject_3_3 = new MenuData.Menu();
    MenuData.Menu menuObject_3_4 = new MenuData.Menu();

    this.parseMenuData(menu_3_1, menuObject_3_1);
    this.parseMenuData(menu_3_2, menuObject_3_2);
    this.parseMenuData(menu_3_3, menuObject_3_3);
    this.parseMenuData(menu_3_4, menuObject_3_4);


    wednesdayMenuData.setDotw("수요일");
    wednesdayMenuData.setMenus(Arrays.asList(menuObject_3_1, menuObject_3_2, menuObject_3_3, menuObject_3_4));
    this.wednesdayMenuData = this.objectMapper.writeValueAsString(wednesdayMenuData);

    String menu_4_1 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(1) td:nth-child(5)")).getText();
    String menu_4_2 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(2) td:nth-child(4)")).getText();
    String menu_4_3 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(3) td:nth-child(4)")).getText();
    String menu_4_4 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(4) td:nth-child(4)")).getText();
    MenuData thursdayMenuData = new MenuData();

    MenuData.Menu menuObject_4_1 = new MenuData.Menu();
    MenuData.Menu menuObject_4_2 = new MenuData.Menu();
    MenuData.Menu menuObject_4_3 = new MenuData.Menu();
    MenuData.Menu menuObject_4_4 = new MenuData.Menu();

    this.parseMenuData(menu_4_1, menuObject_4_1);
    this.parseMenuData(menu_4_2, menuObject_4_2);
    this.parseMenuData(menu_4_3, menuObject_4_3);
    this.parseMenuData(menu_4_4, menuObject_4_4);



    thursdayMenuData.setDotw("목요일");
    thursdayMenuData.setMenus(Arrays.asList(menuObject_4_1, menuObject_4_2, menuObject_4_3, menuObject_4_4));
    this.thursdayMenuData = this.objectMapper.writeValueAsString(thursdayMenuData);
    String menu_5_1 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(1) td:nth-child(6)")).getText();
    String menu_5_2 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(2) td:nth-child(5)")).getText();
    String menu_5_3 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(3) td:nth-child(5)")).getText();
    String menu_5_4 = this.driver.findElement(By.cssSelector(".box-table table tbody tr:nth-child(4) td:nth-child(5)")).getText();


    MenuData fridayMenuData = new MenuData();
    MenuData.Menu menuObject_5_1 = new MenuData.Menu();
    MenuData.Menu menuObject_5_2 = new MenuData.Menu();
    MenuData.Menu menuObject_5_3 = new MenuData.Menu();
    MenuData.Menu menuObject_5_4 = new MenuData.Menu();

    this.parseMenuData(menu_5_1, menuObject_5_1);
    this.parseMenuData(menu_5_2, menuObject_5_2);
    this.parseMenuData(menu_5_3, menuObject_5_3);
    this.parseMenuData(menu_5_4, menuObject_5_4);



    fridayMenuData.setDotw("금요일");
    fridayMenuData.setMenus(Arrays.asList(menuObject_5_1, menuObject_5_2, menuObject_5_3, menuObject_5_4));
    this.fridayMenuData = this.objectMapper.writeValueAsString(fridayMenuData);
    return Arrays.asList(mondayMenuData, tuesdayMenuData, wednesdayMenuData, thursdayMenuData, fridayMenuData);
  }

  public void parseMenuData(String fullText, MenuData.Menu menu) {
    try {

      System.out.println("fullText = " + fullText);

      String[] lines = fullText.split("\n");
      String firstLine = lines[0];
      String title = firstLine.substring(firstLine.indexOf("["), firstLine.indexOf("]") + 1);
      menu.setTitle(title);
      String menuPart = firstLine.substring(firstLine.indexOf("]") + 1).trim();
      String[] menuArray = menuPart.split("/");
      menuArray = (String[])Arrays.copyOf(menuArray, menuArray.length - 1);
      List<String> menuList = new ArrayList();

      for(String m : menuArray) {
        menuList.add(m.trim());
      }

      menu.setMenuItems(menuList);
      String priceLine = lines[2];
      String price = priceLine.replaceAll("[^0-9,]", "");
      menu.setPrice(price);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }


  public String aiMonday() {
    return this.claudeAiClient.call(this.mondayMenuData);
  }

  public String aiTuesday() {
    return this.claudeAiClient.call(this.tuesdayMenuData);
  }

  public String aiWednesday() {
    return this.claudeAiClient.call(this.wednesdayMenuData);
  }

  public String aiThursday() {
    return this.claudeAiClient.call(this.thursdayMenuData);
  }

  public String aiFriday() {
    return this.claudeAiClient.call(this.fridayMenuData);
  }


}
