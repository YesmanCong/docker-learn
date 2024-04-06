# docker-learn
docker基础学习 完成一个基础项目构建 包含数据库 redis nginx  kafka 初始化脚本 配置文件 通过dockerFile部署

这条命令自动检查dockerDesktop运行状态并给出解决方法
```
 & "C:\Program Files\Docker\Docker\resources\com.docker.diagnose.exe" check

```
本地暴漏2375端口后 重启一下

# docker images
1. 上传项目镜像到私有仓库(done)
2. 在本地拿取镜像并启动(done)

# Dockerfile
1. 自行构建项目镜像(done)

# docker-compose

1. docker-compose部署spring boot 项目 
   - 启动 postgresql redis springboot-app 形成可运行服务
2. 自行构建项目镜像(包含启动需要的第三方环境)
   

# dockerfile-maven-plugin maven
1. 使用maven插件完成镜像构建(done)
2. 使用maven构建出的镜像上传到仓库(done)
3. 使用该镜像完成项目启动(done)

# docker 实战2
1. 使用搭建elk日志收集
2. docker启动项目然后接上elk
3. 使用docker-compose 将 1和2 启动

# docker spring cloud
1. 学习微服务并模拟出一套微服务系统
2. 同一个服务运行多个实例并使用docker部署
   - docker-compose scale [images:num]


# docker swarm 前置(linux)

# linux
0. 在电脑上搭建 linux,并配置docker 和k8s相关运行环境
1. 自家废弃电脑/树莓派 构建一套可以远程使用的linux服务器
2. 学习基础命令 执行文件下载(yum apt) 网络通讯(curl) 服务器运行情况(top free) 脚本文件(bash) 网络(host) 等

