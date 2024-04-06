package com.demo.dockerdemo.user.controller;

import com.demo.dockerdemo.user.api.*;
import com.demo.dockerdemo.user.entity.TSysUsers;
import com.demo.dockerdemo.user.service.TSysUsersService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * (TSysUsers)表控制层
 *
 * @author makejava
 * @since 2024-03-31 16:27:54
 */
@RestController
@RequestMapping("tSysUsers")
public class TSysUsersController {
    /**
     * 服务对象
     */
    @Resource
    private TSysUsersService tSysUsersService;

    /**
     * 分页查询
     *
     * @param tSysUsers 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TSysUsers>> queryByPage(TSysUsers tSysUsers, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tSysUsersService.queryByPage(tSysUsers, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TSysUsers> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tSysUsersService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tSysUsers 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TSysUsers> add(TSysUsers tSysUsers) {
        return ResponseEntity.ok(this.tSysUsersService.insert(tSysUsers));
    }
    /**
     * 登录
     *
     * @return 新增结果
     */
    @PostMapping("/login")
    public ResponseEntity<Boolean> login(LoginReq req) {
        return ResponseEntity.ok(this.tSysUsersService.login(req));
    }
    /**
     * 登出
     *
     * @return 新增结果
     */
    @PostMapping("/logout")
    public ResponseEntity<Boolean> logout(LogoutReq req) {
        return ResponseEntity.ok(this.tSysUsersService.logout(req));
    }

    /**
     * 编辑数据
     *
     * @param tSysUsers 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TSysUsers> edit(TSysUsers tSysUsers) {
        return ResponseEntity.ok(this.tSysUsersService.update(tSysUsers));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tSysUsersService.deleteById(id));
    }

}

