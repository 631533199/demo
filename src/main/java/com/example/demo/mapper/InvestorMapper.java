package com.example.demo.mapper;

import com.example.demo.pojo.Investor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InvestorMapper {
    @Insert("INSERT INTO investor values(#{investorId},#{investorName},#{investorShortName},#{type},#{documentType},#{idNumber},#{openingDate},#{expirationDate},#{startDate},#{endDate},#{emaile},#{initialFunding},#{legalPerson},#{registeredAddress})")
    int add(Investor investor);
    int delete(int investorId);
    int update(Investor inverstor);
    @Select("SELECT * FROM investor")
    Investor find(int investorId);
}
