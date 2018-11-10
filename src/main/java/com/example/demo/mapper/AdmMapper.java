package com.example.demo.mapper;

import com.example.demo.pojo.Adm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdmMapper {

    @Select("SELECT * FROM adm where admPhone=#{admPhone}")
    Adm search(String admPhone);
    @Insert("INSERT INTO adm values(default,#{admName},#{admPhone})")
    int addAdm(Adm adm);
}
