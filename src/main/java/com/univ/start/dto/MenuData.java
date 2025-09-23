package com.univ.start.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MenuData {

  private String dotw;
  private List<Menu> menus;

  @Getter
  @Setter
  @NoArgsConstructor
  @ToString
  public static class Menu {  // 여기 있었습니다!
    private String title;
    private List<String> menuItems;
    private String price;
  }

}
