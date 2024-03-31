package com.demo.dockerdemo.user.service;

import com.demo.dockerdemo.user.api.*;
import com.demo.dockerdemo.user.entity.TSysUsers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TSysUsers)表服务接口
 *
 * @author makejava
 * @since 2024-03-31 16:27:56
 */
public interface TSysUsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TSysUsers queryById(Integer userId);

    /**
     * 分页查询
     *
     * @param tSysUsers 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TSysUsers> queryByPage(TSysUsers tSysUsers, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tSysUsers 实例对象
     * @return 实例对象
     */
    TSysUsers insert(TSysUsers tSysUsers);

    /**
     * 修改数据
     *
     * @param tSysUsers 实例对象
     * @return 实例对象
     */
    TSysUsers update(TSysUsers tSysUsers);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);

    boolean login(LoginReq req);

    boolean logout(LogoutReq req);

}
