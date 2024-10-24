package com.ohgiraffers.beanstalkchunsik.menu.service;

import com.ohgiraffers.beanstalkchunsik.menu.dto.MenuDTO;
import com.ohgiraffers.beanstalkchunsik.menu.entity.Menu;
import com.ohgiraffers.beanstalkchunsik.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDTO> getAllMenus() {
        List<Menu> rawMenus = menuRepository.findAll();

        List<MenuDTO> menus = rawMenus.stream()
                .map(MenuDTO::new)
                .collect(Collectors.toList());

        return  menus;
    }
}
