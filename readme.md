<span  style="font-family: Simsun,serif; font-size: 15px; ">

- 记录开发中常用的配置,不含业务代码

### app-admin

- controller
- 管理员接口
- 发布打包为jar

### app- user

- controller
- 用户接口
- 发布打包为jar

### common-api

- 公共业务对象
- [ ] 计划把dao层也放到这里

### common-config

- 公共的配置
- aop日志等

### common-utils

- 工具类
- [ ] guava
- [ ] apache-commons

### service-admin

- 管理员的拦截器配置
- 管理员 逻辑

### service-user

- 管理员的拦截器配置
- 用户 业务逻辑

### 依赖关系

~~~
< 左边的依赖右边的
common-api < common-utils
common-config < common-api 
service-user < common-config
service-admin < common-config 
app-user < service-user
app-admin < service-admin
~~~

</span>