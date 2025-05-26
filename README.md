JavaWeb TLias Day 11 - 后端接口开发完整作业代码
项目简介
javaweb-tlias-day11 是黑马程序员 JavaWeb 后端接口开发课程 第 11 天的完整作业代码。本仓库包含了基于 Spring Boot 框架开发的 TLias 智能学习辅助系统 的后端接口实现，涵盖了用户管理、课程管理和学习进度跟踪等功能模块。

该项目旨在帮助学习者掌握 JavaWeb 后端开发的核心技能，包括 RESTful API 设计、数据库操作、权限管理以及前后端交互等内容。代码结构清晰，注释详尽，适合初学者和进阶开发者参考学习。

课程文档链接： 黑马 JavaWeb 课程文档(https://heuqqdmbyk.feishu.cn/wiki/LYVswfK4eigRIhkW0pvcqgH9nWd)

技术栈
本项目使用以下技术栈构建：

后端框架：Spring Boot
数据库：MySQL
ORM 框架：MyBatis
依赖管理：Maven
接口测试工具：Postman / Swagger（可选）
其他依赖：
Spring Security（权限管理）
Lombok（简化代码）
FastJSON（JSON 处理）
项目结构
项目的目录结构如下，遵循 Spring Boot 的标准布局，便于理解和维护：
javaweb-tlias-day11/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.tlias/
│   │   │   │   ├── config/        # 配置类（如数据库配置、拦截器等）
│   │   │   │   ├── controller/    # 控制器层，处理 HTTP 请求
│   │   │   │   ├── entity/        # 实体类，映射数据库表结构
│   │   │   │   ├── mapper/        # 数据访问层，MyBatis Mapper 接口
│   │   │   │   ├── service/       # 业务逻辑层，处理核心业务
│   │   │   │   └── utils/         # 工具类（如 JWT 工具、结果封装等）
│   │   └── resources/
│   │       ├── mapper/            # MyBatis XML 映射文件
│   │       └── application.yml    # 项目配置文件
└── pom.xml                        # Maven 依赖配置文件
功能模块
本项目实现了以下核心功能模块，覆盖了后端接口开发的典型场景：

用户管理：
用户注册、登录、注销功能。
基于 JWT 的用户认证和权限管理。
课程管理：
课程的增删改查接口。
课程分类和标签管理。
学习进度跟踪：
记录用户的学习进度。
提供学习统计和分析接口。
文件上传与管理：
支持学习资料的上传和下载。
文件存储路径可配置。

环境要求
在运行本项目之前，请确保已安装以下环境：

JDK：版本 1.8 或以上
Maven：版本 3.6 或以上
MySQL：版本 5.7 或以上
IDE：推荐使用 IntelliJ IDEA 或 Eclipse

快速开始
1. 克隆仓库
<BASH>
git clone https://github.com/CPbianma/javaweb-tlias-day11.git
cd javaweb-tlias-day11
2. 配置数据库
在 MySQL 中创建数据库 tlias_db。
执行项目中提供的 SQL 脚本（位于 resources/sql/ 目录下，若无则参考课程文档初始化数据库）。
修改 application.yml 文件中的数据库连接信息：
<YAML>
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/tlias_db?useSSL=false&serverTimezone=UTC
    username: root
    password: your_password
3. 构建并运行
使用 Maven 构建项目并启动 Spring Boot 应用：

<BASH>
mvn clean install
mvn spring-boot:run
4. 访问接口
项目启动后，默认运行在 http://localhost:8080。可通过以下方式测试接口：

使用 Postman 工具调用接口。
访问 Swagger UI（若已集成）：http://localhost:8080/swagger-ui.html。

致谢
感谢黑马程序员提供的优质课程资源，以及所有参与课程学习和代码贡献的同学。如果您觉得本仓库对您有帮助，欢迎 Star 和 Fork 支持！

