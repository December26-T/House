package com.github.dao;

import com.github.pojo.SysUser;

import java.util.List;

public interface SelectMapper {
    List<SysUser> getSelect(String name);
}
