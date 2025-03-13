package com.example.springPj.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends ViewCommonData {
    /* 番号 */
    private int id;

    /* 氏名 */
    private String name;

    /* 年齢 */
    private int age;

    /* 誕生日 */
    private String birthday_date;

    /* 住所 */
    private Address address = new Address();
}
