package com.scuse.mapper;

import com.scuse.entity.BookBank;

public interface BookBankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookBank record);

    int insertSelective(BookBank record);

    BookBank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookBank record);

    int updateByPrimaryKey(BookBank record);
}