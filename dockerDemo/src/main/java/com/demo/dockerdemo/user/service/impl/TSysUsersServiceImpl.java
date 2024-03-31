package com.demo.dockerdemo.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.dockerdemo.user.api.*;
import com.demo.dockerdemo.user.entity.TSysUsers;
import com.demo.dockerdemo.user.dao.TSysUsersDao;
import com.demo.dockerdemo.user.service.TSysUsersService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TSysUsers)表服务实现类
 *
 * @author makejava
 * @since 2024-03-31 16:27:57
 */
@Service("tSysUsersService")
public class TSysUsersServiceImpl extends ServiceImpl<TSysUsersDao,TSysUsers> implements TSysUsersService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Resource
    private TSysUsersDao tSysUsersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public TSysUsers queryById(Integer userId) {
        return this.tSysUsersDao.queryById(userId);
    }

    /**
     * 分页查询
     *
     * @param tSysUsers 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TSysUsers> queryByPage(TSysUsers tSysUsers, PageRequest pageRequest) {
        long total = this.tSysUsersDao.count(tSysUsers);
        return new PageImpl<>(this.tSysUsersDao.queryAllByLimit(tSysUsers, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tSysUsers 实例对象
     * @return 实例对象
     */
    @Override
    public TSysUsers insert(TSysUsers tSysUsers) {
        this.tSysUsersDao.insert(tSysUsers);
        return tSysUsers;
    }

    /**
     * 修改数据
     *
     * @param tSysUsers 实例对象
     * @return 实例对象
     */
    @Override
    public TSysUsers update(TSysUsers tSysUsers) {
        this.tSysUsersDao.update(tSysUsers);
        return this.queryById(tSysUsers.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userId) {
        return this.tSysUsersDao.deleteById(userId) > 0;
    }


    @Override
    public boolean login(LoginReq req) {
        TSysUsers users = baseMapper.selectOne(new QueryWrapper<TSysUsers>().eq("user_code", req.getUserCode()));
        if (users.getAuthenticator().equals(req.getPassword())) {
            redisTemplate.opsForSet().add(req.getUserCode(),users);
            return true;
        }
        return false;
    }

    @Override
    public boolean logout(LogoutReq req) {
        if(Boolean.TRUE.equals(redisTemplate.hasKey(req.getUserCode()))){
            redisTemplate.delete(req.getUserCode());
            return true;
        }
        return false;
    }
}
