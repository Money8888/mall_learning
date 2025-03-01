package com.learning.mall.mbg.mapper;

import com.learning.mall.mbg.model.UmsRole;
import com.learning.mall.mbg.model.UmsRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UmsRoleMapper {
    int countByExample(UmsRoleExample example);

    int deleteByExample(UmsRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    List<UmsRole> selectByExample(UmsRoleExample example);

    UmsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int updateByPrimaryKeySelective(UmsRole record);

    int updateByPrimaryKey(UmsRole record);
}
