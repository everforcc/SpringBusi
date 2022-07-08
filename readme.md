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

### service-user

- 业务逻辑

### common-api

- 公共业务对象

### common-utils

- 工具类

### common-config

- 公共的配置

### 依赖关系

~~~
< 左边的依赖右边的
common-api < common-utils
common-config < common-api 
service-user < common-config 
app-admin < service-user
app- user < service-user
~~~

</span>