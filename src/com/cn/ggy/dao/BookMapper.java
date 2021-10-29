package com.cn.ggy.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cn.ggy.valueobject.Book;

public interface BookMapper {
    /*int insert(Book record);

    int insertSelective(Book record);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);*/
	
	@Select("select name from book where id='1'")
	String qryBookName();
}