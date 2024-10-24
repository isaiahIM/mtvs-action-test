package com.ohgiraffers.beanstalkchunsik.menu.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_menu")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "orderable_status")
    private String orderableStatus;

    @Builder
    public Menu(String orderableStatus, int categoryCode, int menuPrice, String menuName, Long menuCode) {
        this.orderableStatus = orderableStatus;
        this.categoryCode = categoryCode;
        this.menuPrice = menuPrice;
        this.menuName = menuName;
        this.menuCode = menuCode;
    }
}
