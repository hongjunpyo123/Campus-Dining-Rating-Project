package com.univ.start.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.univ.start.dto.MenuData;
import com.univ.start.dto.MenuResponse;
import com.univ.start.service.ProjectService;
import java.util.List;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Api {
  private final ProjectService projectService;

  @GetMapping({"/start"})
  public MenuResponse start() throws InterruptedException, JsonProcessingException {
    List<MenuData> menuDataList = this.projectService.test();
    MenuResponse menuResponse = new MenuResponse();
    menuResponse.setMenuDataList(menuDataList);
    return menuResponse;
  }

  @GetMapping({"/ai/monday"})
  public String aiMonday() {
    return this.projectService.aiMonday();
  }

  @GetMapping({"/ai/tuesday"})
  public String aiTuesday() {
    return this.projectService.aiTuesday();
  }

  @GetMapping({"/ai/wednesday"})
  public String aiWednesday() {
    return this.projectService.aiWednesday();
  }

  @GetMapping({"/ai/thursday"})
  public String aiThursday() {
    return this.projectService.aiThursday();
  }

  @GetMapping({"/ai/friday"})
  public String aiFriday() {
    return this.projectService.aiFriday();
  }

}

