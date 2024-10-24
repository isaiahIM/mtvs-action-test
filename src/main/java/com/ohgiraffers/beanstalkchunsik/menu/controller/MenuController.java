package com.ohgiraffers.beanstalkchunsik.menu.controller;

import com.ohgiraffers.beanstalkchunsik.menu.dto.MenuDTO;
import com.ohgiraffers.beanstalkchunsik.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/list")
    public List<MenuDTO> getAllMenus(){
        List<MenuDTO> menus = menuService.getAllMenus();

        log.info("[MenuController]: 메뉴쨩: {}", menus);

        return menus;
    }

    @GetMapping("/check")
    public String checkVersion(){
        return "♣버전 1.0.0♣";
    }
}
