package com.example.springPj.model;

import java.util.List;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Address {
    /* 都道府県 */
    private String region;

    /* 市区町村 */
    private String city;

    /* 市区町村以下 */
    private List<String> adressLine = new ArrayList<>();
}
