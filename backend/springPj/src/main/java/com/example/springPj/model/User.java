package com.example.springPj.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User {
    /* 番号 */
    private int id;

    /* 氏名 */
    private String name;

    /* 年齢 */
    private int age;

    /* 誕生日 */
    private String birthday_date;
}
