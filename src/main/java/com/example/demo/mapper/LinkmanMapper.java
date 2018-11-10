package com.example.demo.mapper;

import com.example.demo.pojo.Linkman;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LinkmanMapper {

    @Insert("INSERT INTO linkman values(#{investorId},#{lmNmae},#{lmPost},#{lmPhone},#{lmEmail},#{lmRemake})")
    int addLinkMan(Linkman linkman);
}
