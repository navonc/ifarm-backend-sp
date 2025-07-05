# iFarm 后端项目

基于 Spring Boot 3 + MyBatis-Plus 的后端框架

## 技术栈

- **Spring Boot**: 3.2.0
- **MyBatis-Plus**: 3.5.4.1
- **MySQL**: 8.0.33
- **Druid**: 1.2.20 (数据库连接池)
- **FastJSON2**: 2.0.43
- **Hutool**: 5.8.23 (工具类库)
- **Java**: 17

## 项目结构

```
src/main/java/com/ifarm/
├── IfarmApplication.java          # 启动类
├── common/                        # 公共模块
│   ├── Result.java               # 统一响应结果
│   ├── ResultCode.java           # 响应状态码
│   ├── BusinessException.java    # 业务异常
│   └── GlobalExceptionHandler.java # 全局异常处理
├── config/                       # 配置模块
│   └── MybatisPlusConfig.java    # MyBatis-Plus配置
├── controller/                   # 控制器层
│   └── UserController.java       # 用户控制器
├── entity/                       # 实体类
│   ├── BaseEntity.java           # 基础实体类
│   └── User.java                 # 用户实体类
├── mapper/                       # 数据访问层
│   └── UserMapper.java           # 用户Mapper
└── service/                      # 服务层
    ├── UserService.java          # 用户服务接口
    └── impl/
        └── UserServiceImpl.java  # 用户服务实现
```

## 快速开始

### 1. 环境要求

- JDK 17+
- Maven 3.6+
- MySQL 8.0+

### 2. 数据库配置

1. 创建数据库：
```sql
CREATE DATABASE `ifarm` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

2. 执行初始化SQL：
```sql
-- 执行 src/main/resources/sql/init.sql 文件
```

3. 修改数据库连接配置：
编辑 `src/main/resources/application.yml` 文件，修改数据库连接信息：
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ifarm?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8
    username: your_username
    password: your_password
```

### 3. 启动项目

```bash
# 编译项目
mvn clean compile

# 运行项目
mvn spring-boot:run
```

### 4. 访问接口

- 应用地址：http://localhost:8080/api
- Druid监控：http://localhost:8080/api/druid (用户名：admin，密码：123456)
- 用户测试接口：http://localhost:8080/api/user/test

## 功能特性

### 1. 统一响应格式

所有接口返回统一的JSON格式：
```json
{
  "code": 200,
  "message": "操作成功",
  "data": {},
  "timestamp": 1704067200000
}
```

### 2. 全局异常处理

- 参数校验异常
- 业务异常
- 系统异常

### 3. MyBatis-Plus 特性

- 自动填充字段（创建时间、更新时间等）
- 逻辑删除
- 分页查询
- 条件构造器

### 4. 数据库监控

集成Druid连接池，提供数据库监控功能。

## API 接口

### 用户管理

| 方法 | 路径 | 描述 |
|------|------|------|
| GET | /api/user/page | 分页查询用户列表 |
| GET | /api/user/{id} | 根据ID查询用户 |
| POST | /api/user | 新增用户 |
| PUT | /api/user/{id} | 更新用户 |
| DELETE | /api/user/{id} | 删除用户 |
| GET | /api/user/test | 测试接口 |

## 开发规范

### 1. 包命名规范

- `controller`: 控制器层，处理HTTP请求
- `service`: 业务逻辑层
- `mapper`: 数据访问层
- `entity`: 实体类
- `common`: 公共模块
- `config`: 配置类

### 2. 异常处理

- 使用 `BusinessException` 抛出业务异常
- 全局异常处理器自动处理异常并返回统一格式

### 3. 数据库操作

- 继承 `BaseEntity` 获得公共字段
- 使用 MyBatis-Plus 提供的方法进行CRUD操作
- 复杂查询使用条件构造器

## 注意事项

1. 确保MySQL服务已启动
2. 检查数据库连接配置是否正确
3. 首次运行需要执行初始化SQL
4. 生产环境请修改Druid监控的默认密码

## 许可证

MIT License 