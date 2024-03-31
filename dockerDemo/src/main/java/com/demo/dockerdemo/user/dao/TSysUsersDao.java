package com.demo.dockerdemo.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.dockerdemo.user.entity.TSysUsers;
import org.apache.ibatis.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.*;

import java.util.List;

/**
 * (TSysUsers)表数据库访问层
 *
 * @author makejava
 * @since 2024-03-31 16:27:54
 */

@Mapper
@Component
public interface TSysUsersDao extends BaseMapper<TSysUsers> {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TSysUsers queryById(Integer userId);

    /**
     * 查询指定行数据
     *
     * @param tSysUsers 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TSysUsers> queryAllByLimit(TSysUsers tSysUsers, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tSysUsers 查询条件
     * @return 总行数
     */
    long count(TSysUsers tSysUsers);

    /**
     * 新增数据
     *
     * @param tSysUsers 实例对象
     * @return 影响行数
     */
    int insert(TSysUsers tSysUsers);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TSysUsers> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TSysUsers> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TSysUsers> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TSysUsers> entities);

    /**
     * 修改数据
     *
     * @param tSysUsers 实例对象
     * @return 影响行数
     */
    int update(TSysUsers tSysUsers);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);

}

