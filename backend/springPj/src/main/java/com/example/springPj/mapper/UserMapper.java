package com.example.springPj.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.springPj.entity.UsersTable;

@Mapper
public interface UserMapper {
    /* 番号で検索 */
    public List<UsersTable> selectById(int id);

    /* ユーザー登録 */
    public int insert(UsersTable usersTable);
}
