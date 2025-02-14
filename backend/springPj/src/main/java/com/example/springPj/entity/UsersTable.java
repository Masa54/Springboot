package com.example.springPj.entity;

import java.sql.Date;
import lombok.Data;

@Data
public class UsersTable {
    /* 番号 */
    private int id;

    /* 氏名 */
    private String name;

    /* 年齢 */
    private int age;

    /* 誕生日 */
    private Date birthday_date;
}
