# tlias接口文档

## 1. 部门管理

### 1.1 部门列表查询

#### 1.1.1 基本信息

> 请求路径：/depts
>
> 请求方式：GET
>
> 接口描述：该接口用于部门列表数据查询

#### 1.1.2 请求参数

无

#### 1.1.3 响应数据

参数格式：application/json

参数说明：

| 参数名         | 类型      | 是否必须 | 备注                           |
| -------------- | --------- | -------- | ------------------------------ |
| code           | number    | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg            | string    | 非必须   | 提示信息                       |
| data           | object[ ] | 非必须   | 返回的数据                     |
| \|- id         | number    | 非必须   | id                             |
| \|- name       | string    | 非必须   | 部门名称                       |
| \|- createTime | string    | 非必须   | 创建时间                       |
| \|- updateTime | string    | 非必须   | 修改时间                       |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": [
    {
      "id": 1,
      "name": "学工部",
      "createTime": "2022-09-01T23:06:29",
      "updateTime": "2022-09-01T23:06:29"
    },
    {
      "id": 2,
      "name": "教研部",
      "createTime": "2022-09-01T23:06:29",
      "updateTime": "2022-09-01T23:06:29"
    }
  ]
}
```









### 1.2 删除部门

#### 1.2.1 基本信息

> 请求路径：/depts
>
> 请求方式：DELETE
>
> 接口描述：该接口用于根据ID删除部门数据



#### 1.2.2 请求参数

参数说明：

| 参数名 | 类型   | 是否必须 | 备注   |
| ------ | ------ | -------- | ------ |
| id     | number | 必须     | 部门ID |

请求参数样例：

```
/depts?id=1
/depts?id=2
```



#### 1.2.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 1.3 添加部门

#### 1.3.1 基本信息

> 请求路径：/depts
>
> 请求方式：POST
>
> 接口描述：该接口用于添加部门数据




#### 1.3.2 请求参数

格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注     |
| ------ | ------ | -------- | -------- |
| name   | string | 必须     | 部门名称 |

请求参数样例：

```json
{
	"name": "教研部"
}
```



#### 1.3.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





### 1.4 根据ID查询

#### 1.4.1 基本信息

> 请求路径：/depts/{id}
>
> 请求方式：GET
>
> 接口描述：该接口用于根据ID查询部门数据




#### 1.4.2 请求参数

参数格式：路径参数

参数说明：

| 参数名 | 类型   | 是否必须 | 备注   |
| ------ | ------ | -------- | ------ |
| id     | number | 必须     | 部门ID |

请求参数样例：

```
/depts/1
/depts/3
```





#### 1.4.3 响应数据

参数格式：application/json

参数说明：

| 参数名         | 类型   | 是否必须 | 备注                           |
| -------------- | ------ | -------- | ------------------------------ |
| code           | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg            | string | 非必须   | 提示信息                       |
| data           | object | 非必须   | 返回的数据                     |
| \|- id         | number | 非必须   | id                             |
| \|- name       | string | 非必须   | 部门名称                       |
| \|- createTime | string | 非必须   | 创建时间                       |
| \|- updateTime | string | 非必须   | 修改时间                       |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "id": 1,
    "name": "学工部",
    "createTime": "2022-09-01T23:06:29",
    "updateTime": "2022-09-01T23:06:29"
  }
}
```





### 1.5 修改部门
#### 1.5.1 基本信息

> 请求路径：/depts
>
> 请求方式：PUT
>
> 接口描述：该接口用于修改部门数据



#### 1.5.2 请求参数

格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注     |
| ------ | ------ | -------- | -------- |
| id     | number | 必须     | 部门ID   |
| name   | string | 必须     | 部门名称 |

请求参数样例：

```json
{
	"id": 1,
	"name": "教研部"
}
```



#### 1.5.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```

















## 2. 员工管理

### 2.1 员工列表查询

#### 2.1.1 基本信息

> 请求路径：/emps
>
> 请求方式：GET
>
> 接口描述：该接口用于员工列表数据的条件分页查询

#### 2.1.2 请求参数

参数格式：queryString

参数说明：

| 参数名称 | 是否必须 | 示例       | 备注                                       |
| -------- | -------- | ---------- | ------------------------------------------ |
| name     | 否       | 张         | 姓名                                       |
| gender   | 否       | 1          | 性别 , 1 男 , 2 女                         |
| begin    | 否       | 2010-01-01 | 范围匹配的开始时间(入职日期)               |
| end      | 否       | 2020-01-01 | 范围匹配的结束时间(入职日期)               |
| page     | 是       | 1          | 分页查询的页码，如果未指定，默认为1        |
| pageSize | 是       | 10         | 分页查询的每页记录数，如果未指定，默认为10 |

请求数据样例：

```shell
/emps?name=张&gender=1&begin=2007-09-01&end=2022-09-01&page=1&pageSize=10
```





#### 2.1.3 响应数据

参数格式：application/json

参数说明：

| 名称           | 类型      | 是否必须 | 备注                                                         |
| -------------- | --------- | -------- | ------------------------------------------------------------ |
| code           | number    | 必须     | 响应码, 1 成功 , 0 失败                                      |
| msg            | string    | 非必须   | 提示信息                                                     |
| data           | object    | 必须     | 返回的数据                                                   |
| \|- total      | number    | 必须     | 总记录数                                                     |
| \|- rows       | object [] | 必须     | 数据列表                                                     |
| \|- id         | number    | 非必须   | id                                                           |
| \|- username   | string    | 非必须   | 用户名                                                       |
| \|- name       | string    | 非必须   | 姓名                                                         |
| \|- password   | string    | 非必须   | 密码                                                         |
| \|- gender     | number    | 非必须   | 性别 , 1 男 ; 2 女                                           |
| \|- image      | string    | 非必须   | 图像                                                         |
| \|- job        | number    | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |
| \|- salary     | number    | 非必须   | 薪资                                                         |
| \|- entryDate  | string    | 非必须   | 入职日期                                                     |
| \|- deptId     | number    | 非必须   | 部门id                                                       |
| \|- deptName   | string    | 非必须   | 部门名称                                                     |
| \|- createTime | string    | 非必须   | 创建时间                                                     |
| \|- updateTime | string    | 非必须   | 更新时间                                                     |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "total": 2,
    "rows": [
       {
        "id": 1,
        "username": "jinyong",
        "password": "123456",
        "name": "金庸",
        "gender": 1,
        "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
        "job": 2,
        "salary": 8000,
        "entryDate": "2015-01-01",
        "deptId": 2,
        "deptName": "教研部",
        "createTime": "2022-09-01T23:06:30",
        "updateTime": "2022-09-02T00:29:04"
      },
      {
        "id": 2,
        "username": "zhangwuji",
        "password": "123456",
        "name": "张无忌",
        "gender": 1,
        "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
        "job": 2,
        "salary": 6000,
        "entryDate": "2015-01-01",
        "deptId": 2,
        "deptName": "教研部",
        "createTime": "2022-09-01T23:06:30",
        "updateTime": "2022-09-02T00:29:04"
      }
    ]
  }
}
```







### 2.2 删除员工

#### 2.2.1 基本信息

> 请求路径：/emps
>
> 请求方式：DELETE
>
> 接口描述：该接口用于批量删除员工的数据信息



#### 2.2.2 请求参数

参数格式：查询参数

参数说明：

| 参数名 | 类型       | 示例  | 是否必须 | 备注         |
| ------ | ---------- | ----- | -------- | ------------ |
| ids    | 数组 array | 1,2,3 | 必须     | 员工的id数组 |

请求参数样例：

```
/emps?ids=1,2,3
```



#### 2.2.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 2.3 添加员工

#### 2.3.1 基本信息

> 请求路径：/emps
>
> 请求方式：POST
>
> 接口描述：该接口用于添加员工的信息



#### 2.3.2 请求参数

参数格式：application/json

参数说明：

| 名称        | 类型     | 是否必须 | 备注                                                         |
| ----------- | -------- | -------- | ------------------------------------------------------------ |
| username    | string   | 必须     | 用户名                                                       |
| name        | string   | 必须     | 姓名                                                         |
| gender      | number   | 必须     | 性别, 说明: 1 男, 2 女                                       |
| image       | string   | 非必须   | 图像                                                         |
| deptId      | number   | 非必须   | 部门id                                                       |
| entryDate   | string   | 非必须   | 入职日期                                                     |
| job         | number   | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |
| salary      | number   | 非必须   | 薪资                                                         |
| exprList    | object[] | 非必须   | 工作经历列表                                                 |
| \|- company | string   | 非必须   | 所在公司                                                     |
| \|- job     | string   | 非必须   | 职位                                                         |
| \|- begin   | string   | 非必须   | 开始时间                                                     |
| \|- end     | string   | 非必须   | 结束时间                                                     |

请求数据样例：

```json
{
  "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg",
  "username": "linpingzhi",
  "name": "林平之",
  "gender": 1,
  "job": 1,
  "entryDate": "2022-09-18",
  "deptId": 1,
  "phone": "18809091234",
  "salary": 8000,
  "exprList": [
      {
         "company": "百度科技股份有限公司",
         "job": "java开发",
         "begin": "2012-07-01",
         "end": "2019-03-03"
      },
      {
         "company": "阿里巴巴科技股份有限公司",
         "job": "架构师",
         "begin": "2019-03-15",
         "end": "2023-03-01"
      }
   ]
}
```





#### 2.3.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





### 2.4 根据ID查询

#### 2.4.1 基本信息

> 请求路径：/emps/{id}
>
> 请求方式：GET
>
> 接口描述：该接口用于根据主键ID查询员工的信息



#### 2.4.2 请求参数

参数格式：路径参数

参数说明：

| 参数名 | 类型   | 是否必须 | 备注   |
| ------ | ------ | -------- | ------ |
| id     | number | 必须     | 员工ID |

请求参数样例：

```
/emps/1
```



#### 2.4.3 响应数据

参数格式：application/json

参数说明：

| 名称           | 类型     | 是否必须 | 备注                                                         |
| -------------- | -------- | -------- | ------------------------------------------------------------ |
| code           | number   | 必须     | 响应码, 1 成功 , 0 失败                                      |
| msg            | string   | 非必须   | 提示信息                                                     |
| data           | object   | 必须     | 返回的数据                                                   |
| \|- id         | number   | 非必须   | id                                                           |
| \|- username   | string   | 非必须   | 用户名                                                       |
| \|- name       | string   | 非必须   | 姓名                                                         |
| \|- password   | string   | 非必须   | 密码                                                         |
| \|- entryDate  | string   | 非必须   | 入职日期                                                     |
| \|- gender     | number   | 非必须   | 性别 , 1 男 ; 2 女                                           |
| \|- image      | string   | 非必须   | 图像                                                         |
| \|- job        | number   | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |
| \|- salary     | number   | 非必须   | 薪资                                                         |
| \|- deptId     | number   | 非必须   | 部门id                                                       |
| \|- createTime | string   | 非必须   | 创建时间                                                     |
| \|- updateTime | string   | 非必须   | 更新时间                                                     |
| \|- exprList   | object[] | 非必须   | 工作经历列表                                                 |
| \|- id         | number   | 非必须   | ID                                                           |
| \|- company    | string   | 非必须   | 所在公司                                                     |
| \|- job        | string   | 非必须   | 职位                                                         |
| \|- begin      | string   | 非必须   | 开始时间                                                     |
| \|- end        | string   | 非必须   | 结束时间                                                     |
| \|- empId      | number   | 非必须   | 员工ID                                                       |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "id": 2,
    "username": "zhangwuji",
    "password": "123456",
    "name": "张无忌",
    "gender": 1,
    "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
    "job": 2,
    "salary": 8000,
    "entryDate": "2015-01-01",
    "deptId": 2,
    "createTime": "2022-09-01T23:06:30",
    "updateTime": "2022-09-02T00:29:04",
    "exprList": [
      {
        "id": 1,
        "begin": "2012-07-01",
        "end": "2019-03-03"
        "company": "百度科技股份有限公司"
        "job": "java开发",
        "empId": 2
      },
      {
        "id": 2,
        "begin": "2019-3-15",
        "end": "2023-03-01"
        "company": "阿里巴巴科技股份有限公司"
        "job": "架构师",
        "empId": 2
      }
    ]
  }
}
```







### 2.5 修改员工
#### 2.5.1 基本信息

> 请求路径：/emps
>
> 请求方式：PUT
>
> 接口描述：该接口用于修改员工的数据信息



#### 2.5.2 请求参数

参数格式：application/json

参数说明：

| 名称        | 类型     | 是否必须 | 备注                                                         |
| ----------- | -------- | -------- | ------------------------------------------------------------ |
| id          | number   | 必须     | id                                                           |
| username    | string   | 必须     | 用户名                                                       |
| name        | string   | 必须     | 姓名                                                         |
| gender      | number   | 必须     | 性别, 说明: 1 男, 2 女                                       |
| image       | string   | 非必须   | 图像                                                         |
| deptId      | number   | 非必须   | 部门id                                                       |
| entryDate   | string   | 非必须   | 入职日期                                                     |
| job         | number   | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |
| salary      | number   | 非必须   | 薪资                                                         |
| exprList    | object[] | 非必须   | 工作经历列表                                                 |
| \|- id      | number   | 非必须   | ID                                                           |
| \|- company | string   | 非必须   | 所在公司                                                     |
| \|- job     | string   | 非必须   | 职位                                                         |
| \|- begin   | string   | 非必须   | 开始时间                                                     |
| \|- end     | string   | 非必须   | 结束时间                                                     |
| \|- empId   | number   | 非必须   | 员工ID                                                       |



请求数据样例：

```json
{
    "id": 2,
    "username": "zhangwuji",
    "password": "123456",
    "name": "张无忌",
    "gender": 1,
    "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
    "job": 2,
    "salary": 8000,
    "entryDate": "2015-01-01",
    "deptId": 2,
    "createTime": "2022-09-01T23:06:30",
    "updateTime": "2022-09-02T00:29:04",
    "exprList": [
      {
        "id": 1,
        "begin": "2012-07-01",
        "end": "2015-06-20"
        "company": "中软国际股份有限公司"
        "job": "java开发",
        "empId": 2
      },
      {
        "id": 2,
        "begin": "2015-07-01",
        "end": "2019-03-03"
        "company": "百度科技股份有限公司"
        "job": "java开发",
        "empId": 2
      },
      {
        "id": 3,
        "begin": "2019-3-15",
        "end": "2023-03-01"
        "company": "阿里巴巴科技股份有限公司"
        "job": "架构师",
        "empId": 2
      }
    ]
  }
```



#### 2.5.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 2.6 查询全部员工

#### 2.6.1 基本信息

> 请求路径：/emps/list
>
> 请求方式：GET
>
> 接口描述：该接口用于查询全部员工信息 



#### 2.6.2 请求参数

无



#### 2.6.3 响应数据

参数格式：application/json

参数说明：

| 名称           | 类型     | 是否必须 | 备注                                                         |
| -------------- | -------- | -------- | ------------------------------------------------------------ |
| code           | number   | 必须     | 响应码, 1 成功 , 0 失败                                      |
| msg            | string   | 非必须   | 提示信息                                                     |
| data           | object[] | 必须     | 返回的数据                                                   |
| \|- id         | number   | 必须     | id                                                           |
| \|- username   | string   | 必须     | 用户名                                                       |
| \|- name       | string   | 必须     | 姓名                                                         |
| \|- password   | string   | 非必须   | 密码                                                         |
| \|- entryDate  | string   | 非必须   | 入职日期                                                     |
| \|- gender     | number   | 非必须   | 性别 , 1 男 ; 2 女                                           |
| \|- image      | string   | 非必须   | 图像                                                         |
| \|- job        | number   | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |
| \|- salary     | number   | 非必须   | 薪资                                                         |
| \|- deptId     | number   | 非必须   | 部门id                                                       |
| \|- createTime | string   | 非必须   | 创建时间                                                     |
| \|- updateTime | string   | 非必须   | 更新时间                                                     |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": [
    {
      "id": 21,
      "username": "zcc",
      "password": "123456",
      "name": "周星驰",
      "gender": 1,
      "image": "https://web-65.oss-cn-beijing.aliyuncs.com/99c143e9-0241-41f3-bc55-dd5e4e0824f4.jpg",
      "job": 1,
      "salary": 8000,
      "entryDate": "2023-04-23",
      "deptId": 2,
      "createTime": "2023-05-26T17:25:01",
      "updateTime": "2023-06-04T19:25:15"
    },
    {
      "id": 6,
      "username": "xiaozhao",
      "password": "123456",
      "name": "小昭",
      "gender": 2,
      "image": "https://web-65.oss-cn-beijing.aliyuncs.com/da94dc38-f165-480c-b8b7-0b3f4bcd1602.jpg",
      "job": 3,
      "salary": 8000,
      "entryDate": "2013-09-05",
      "deptId": 1,
      "createTime": "2023-04-07T11:16:00",
      "updateTime": "2023-04-14T08:22:41"
    }
  ]
}
```













## 3. 班级管理

### 3.1 班级列表查询

#### 3.1.1 基本信息

> 请求路径：/clazzs
>
> 请求方式：GET
>
> 接口描述：该接口用于班级列表数据的条件分页查询



#### 3.1.2 请求参数

参数格式：queryString

参数说明：

| 参数名称 | 是否必须 | 示例       | 备注                                       |
| -------- | -------- | ---------- | ------------------------------------------ |
| name     | 否       | 黄埔一期   | 班级名称                                   |
| begin    | 否       | 2023-01-01 | 范围匹配的开始时间(结课时间)               |
| end      | 否       | 2023-05-01 | 范围匹配的结束时间(结课时间)               |
| page     | 是       | 1          | 分页查询的页码，如果未指定，默认为1        |
| pageSize | 是       | 10         | 分页查询的每页记录数，如果未指定，默认为10 |

请求数据样例：

```shell
/clazzs?name=java&begin=2023-01-01&end=2023-06-30&page=1&pageSize=5
```





#### 3.1.3 响应数据

参数格式：application/json

参数说明：

| 名称           | 类型      | 是否必须 | 备注                            | 其他信息          |
| -------------- | --------- | -------- | ------------------------------- | ----------------- |
| code           | number    | 必须     | 响应码, 1 成功 , 0 失败         |                   |
| msg            | string    | 非必须   | 提示信息                        |                   |
| data           | object    | 必须     | 返回的数据                      |                   |
| \|- total      | number    | 必须     | 总记录数                        |                   |
| \|- rows       | object [] | 必须     | 数据列表                        | item 类型: object |
| \|- id         | number    | 非必须   | id                              |                   |
| \|- name       | string    | 非必须   | 班级名称                        |                   |
| \|- room       | string    | 非必须   | 班级教室                        |                   |
| \|- beginDate  | string    | 非必须   | 开课时间                        |                   |
| \|- endDate    | string    | 非必须   | 结课时间                        |                   |
| \|- masterId   | number    | 非必须   | 班主任(员工ID)                  |                   |
| \|- masterName | string    | 非必须   | 班主任姓名(员工姓名)            |                   |
| \|- createTime | string    | 非必须   | 创建时间                        |                   |
| \|- updateTime | string    | 非必须   | 更新时间                        |                   |
| \|- status     | string    | 非必须   | 状态 （未开班、已开班、已结课） |                   |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "total": 6,
    "rows": [
      {
        "id": 7,
        "name": "黄埔四期",
        "room": "209",
        "beginDate": "2023-08-01",
        "endDate": "2024-02-15",
        "masterId": 7,
        "createTime": "2023-06-01T17:51:21",
        "updateTime": "2023-06-01T17:51:21",
        "masterName": "纪晓芙",
        "status": "已开班"
      },
      {
        "id": 6,
        "name": "JavaEE就业166期",
        "room": "105",
        "beginDate": "2023-07-20",
        "endDate": "2024-02-20",
        "masterId": 20,
        "createTime": "2023-06-01T17:46:10",
        "updateTime": "2023-06-01T17:46:10",
        "masterName": "陈友谅",
        "status": "未开班"
      }
    ]
  }
}
```







### 3.2 删除班级

#### 3.2.1 基本信息

> 请求路径：/clazzs/{id}
>
> 请求方式：DELETE
>
> 接口描述：该接口用于删除班级信息



#### 3.2.2 请求参数

参数格式：路径参数

参数说明：

| 参数名 | 类型   | 示例 | 是否必须 | 备注     |
| ------ | ------ | ---- | -------- | -------- |
| id     | number | 1    | 必须     | 班级的ID |

请求参数样例：

```
/clazzs/5
```



#### 3.2.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 3.3 添加班级

#### 3.3.1 基本信息

> 请求路径：/clazzs
>
> 请求方式：POST
>
> 接口描述：该接口用于添加班级信息



#### 3.3.2 请求参数

参数格式：application/json

参数说明：

| 名称      | 类型   | 是否必须 | 备注                                                     |
| --------- | ------ | -------- | -------------------------------------------------------- |
| name      | string | 必须     | 班级名称                                                 |
| room      | string | 必须     | 班级教室                                                 |
| beginDate | string | 必须     | 开课时间                                                 |
| endDate   | string | 必须     | 结课时间                                                 |
| masterId  | number | 非必须   | 班主任                                                   |
| subject   | number | 必须     | 学科, 1:java, 2:前端, 3:大数据, 4:Python, 5:Go, 6:嵌入式 |

请求数据样例：

```json
{
  "name": "JavaEE就业166期",
  "room": "101",
  "beginDate": "2023-06-01",
  "endDate": "2024-01-25",
  "masterId": 7,
  "subject": 1
}
```





#### 3.3.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





### 3.4 根据ID查询

#### 3.4.1 基本信息

> 请求路径：/clazzs/{id}
>
> 请求方式：GET
>
> 接口描述：该接口用于根据主键ID查询班级的信息



#### 3.4.2 请求参数

参数格式：路径参数

参数说明：

| 参数名 | 类型   | 是否必须 | 备注   |
| ------ | ------ | -------- | ------ |
| id     | number | 必须     | 班级ID |

请求参数样例：

```
/clazzs/8
```



#### 3.4.3 响应数据

参数格式：application/json

参数说明：

| 名称           | 类型   | 是否必须 | 备注                                                     |
| -------------- | ------ | -------- | -------------------------------------------------------- |
| code           | number | 必须     | 响应码, 1 成功 , 0 失败                                  |
| msg            | string | 非必须   | 提示信息                                                 |
| data           | object | 必须     | 返回的数据                                               |
| \|- id         | number | 必须     | id                                                       |
| \|- name       | string | 必须     | 班级名称                                                 |
| \|- room       | string | 必须     | 班级教室                                                 |
| \|- beginDate  | string | 必须     | 开课时间                                                 |
| \|- endDate    | string | 必须     | 结课时间                                                 |
| \|- masterId   | number | 必须     | 班主任(员工ID)                                           |
| \|- subject    | number | 非必须   | 学科, 1:java, 2:前端, 3:大数据, 4:Python, 5:Go, 6:嵌入式 |
| \|- createTime | string | 必须     | 创建时间                                                 |
| \|- updateTime | string | 必须     | 更新时间                                                 |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "id": 8,
    "name": "JavaEE就业166期",
    "room": "101",
    "beginDate": "2023-06-01",
    "endDate": "2024-01-25",
    "masterId": 7,
    "subject": 1,
    "createTime": "2023-06-04T17:37:45",
    "updateTime": "2023-06-04T17:37:45"
  }
}
```







### 3.5 修改班级

#### 3.5.1 基本信息

> 请求路径：/clazzs
>
> 请求方式：PUT
>
> 接口描述：该接口用于修改班级的数据信息



#### 3.5.2 请求参数

参数格式：application/json

参数说明：

| 名称      | 类型   | 是否必须 | 备注                                                     |
| --------- | ------ | -------- | -------------------------------------------------------- |
| id        | number | 必须     | id                                                       |
| name      | string | 必须     | 班级名称                                                 |
| room      | string | 必须     | 班级教室                                                 |
| beginDate | string | 必须     | 开课时间                                                 |
| endDate   | string | 必须     | 结课时间                                                 |
| masterId  | number | 必须     | 班主任ID(员工ID)                                         |
| subject   | number | 非必须   | 学科, 1:java, 2:前端, 3:大数据, 4:Python, 5:Go, 6:嵌入式 |

请求数据样例：

```json
{
  "id": 8,
  "name": "JavaEE就业166期",
  "room": "101",
  "beginDate": "2023-06-01",
  "endDate": "2024-01-25",
  "masterId": 7,
  "subject": 1
}
```



#### 3.5.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 3.6 查询所有班级

#### 3.6.1 基本信息

> 请求路径：/clazzs/list
>
> 请求方式：GET
>
> 接口描述：该接口用于查询所有班级信息



#### 3.6.2 请求参数

无



#### 3.6.3 响应数据

参数格式：application/json

参数说明：

| 名称           | 类型     | 是否必须 | 备注                                                     |
| -------------- | -------- | -------- | -------------------------------------------------------- |
| code           | number   | 必须     | 响应码, 1 成功 , 0 失败                                  |
| msg            | string   | 非必须   | 提示信息                                                 |
| data           | object[] | 非必须   | 返回的数据                                               |
| \|- id         | number   | 非必须   | id                                                       |
| \|- name       | string   | 非必须   | 班级名称                                                 |
| \|- room       | string   | 非必须   | 班级教室                                                 |
| \|- beginDate  | string   | 非必须   | 开课时间                                                 |
| \|- endDate    | string   | 非必须   | 结课时间                                                 |
| \|- masterId   | number   | 非必须   | 班主任(员工ID)                                           |
| \|- subject    | number   | 非必须   | 学科, 1:java, 2:前端, 3:大数据, 4:Python, 5:Go, 6:嵌入式 |
| \|- createTime | string   | 非必须   | 创建时间                                                 |
| \|- updateTime | string   | 非必须   | 更新时间                                                 |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data":[
      {
        "id": 7,
        "name": "黄埔四期",
        "room": "209",
        "beginDate": "2023-08-01",
        "endDate": "2024-02-15",
        "masterId": 7,
        "subject": 1,
        "createTime": "2023-06-01T17:51:21",
        "updateTime": "2023-06-01T17:51:21"
      },
      {
        "id": 6,
        "name": "JavaEE就业166期",
        "room": "105",
        "beginDate": "2023-07-20",
        "endDate": "2024-02-20",
        "masterId": 20,
        "subject": 1,
        "createTime": "2023-06-01T17:46:10",
        "updateTime": "2023-06-01T17:46:10"
      }
    ]
}
```









## 4. 学员管理

### 4.1 学员列表查询

#### 4.1.1 基本信息

> 请求路径：/students
>
> 请求方式：GET
>
> 接口描述：该接口用于学员列表数据的条件分页查询



#### 4.1.2 请求参数

参数格式：queryString

参数说明：

| 参数名称 | 是否必须 | 示例 | 备注                                            |
| -------- | -------- | ---- | ----------------------------------------------- |
| name     | 否       | 张三 | 学员姓名                                        |
| degree   | 否       | 1    | 学历(1:初中,2:高中,3:大专,4:本科,5:硕士,6:博士) |
| clazzId  | 否       | 2    | 班级ID                                          |
| page     | 是       | 1    | 分页查询的页码，如果未指定，默认为1             |
| pageSize | 是       | 10   | 分页查询的每页记录数，如果未指定，默认为10      |

请求数据样例：

```shell
/students?name=张三&degree=1&clazzId=2&page=1&pageSize=5
```





#### 4.1.3 响应数据

参数格式：application/json

参数说明：

| 名称               | 类型      | 是否必须 | 备注                                            |
| ------------------ | --------- | -------- | ----------------------------------------------- |
| code               | number    | 必须     | 响应码, 1 成功 , 0 失败                         |
| msg                | string    | 非必须   | 提示信息                                        |
| data               | object    | 必须     | 返回的数据                                      |
| \|- total          | number    | 必须     | 总记录数                                        |
| \|- rows           | object [] | 必须     | 数据列表                                        |
| \|- id             | number    | 非必须   | id                                              |
| \|- name           | string    | 非必须   | 姓名                                            |
| \|- no             | string    | 非必须   | 学号                                            |
| \|- gender         | number    | 非必须   | 性别(1: 男 , 2: 女)                             |
| \|- phone          | string    | 非必须   | 手机号                                          |
| \|- degree         | number    | 非必须   | 学历(1:初中,2:高中,3:大专,4:本科,5:硕士,6:博士) |
| \|- idCard         | string    | 非必须   | 身份证号                                        |
| \|- isCollege      | number    | 非必须   | 是否是院校学生 (1: 是, 0: 否)                   |
| \|- address        | string    | 非必须   | 联系地址                                        |
| \|- graduationDate | string    | 非必须   | 毕业时间                                        |
| \|- violationCount | number    | 非必须   | 违纪次数                                        |
| \|- violationScore | number    | 非必须   | 违纪扣分                                        |
| \|- clazzId        | number    | 非必须   | 班级ID                                          |
| \|- clazzName      | string    | 非必须   | 班级名称                                        |
| \|- createTime     | string    | 非必须   | 创建时间                                        |
| \|- updateTime     | string    | 非必须   | 更新时间                                        |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "total": 5,
    "rows": [
      {
        "id": 3,
        "name": "Lily",
        "no": "2023001003",
        "gender": 2,
        "phone": "13309230912",
        "degree": 4,
        "idCard": "110090110090110090",
        "isCollege": 0,
        "address": "回龙观东大街110号",
        "graduationDate": "2020-07-01",
        "violationCount": 2,
        "violationScore": 5,
        "clazzId": 1,
        "createTime": "2023-06-01T18:35:23",
        "updateTime": "2023-06-01T19:37:42",
        "clazzName": "黄埔班一期"
      },
      {
        "id": 4,
        "name": "Jerry",
        "no": "2023001004",
        "gender": 1,
        "phone": "15309232323",
        "degree": 4,
        "idCard": "110090110090110090",
        "isCollege": 0,
        "address": "回龙观东大街110号",
        "graduationDate": "2020-07-01",
        "violationCount": 1,
        "violationScore": 2,
        "clazzId": 1,
        "createTime": "2023-06-01T18:35:48",
        "updateTime": "2023-06-01T19:37:35",
        "clazzName": "黄埔班一期"
      }
    ]
  }
}
```







### 4.2 删除学员

#### 4.2.1 基本信息

> 请求路径：/students/{ids}
>
> 请求方式：DELETE
>
> 接口描述：该接口用于批量删除学员信息



#### 4.2.2 请求参数

参数格式：路径参数

参数说明：

| 参数名 | 类型 | 示例 | 是否必须 | 备注         |
| ------ | ---- | ---- | -------- | ------------ |
| ids    | 数组 | 1    | 必须     | 学员的ID数组 |

请求参数样例：

```
/students/1,2,3
```



#### 4.2.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 4.3 添加学员

#### 4.3.1 基本信息

> 请求路径：/students
>
> 请求方式：POST
>
> 接口描述：该接口用于添加学员信息



#### 4.3.2 请求参数

参数格式：application/json

参数说明：

| 名称           | 类型   | 是否必须 | 备注                                            |
| -------------- | ------ | -------- | ----------------------------------------------- |
| name           | string | 必须     | 姓名                                            |
| no             | string | 必须     | 学号                                            |
| gender         | number | 必须     | 性别                                            |
| phone          | string | 必须     | 手机号                                          |
| degree         | number | 必须     | 学历(1:初中,2:高中,3:大专,4:本科,5:硕士,6:博士) |
| clazzId        | number | 必须     | 班级ID                                          |
| idCard         | string | 非必须   | 身份证号                                        |
| isCollege      | number | 非必须   | 是否是院校学生 (1: 是, 0: 否)                   |
| address        | string | 非必须   | 联系地址                                        |
| graduationDate | string | 非必须   | 毕业时间                                        |

请求数据样例：

```json
{
	"name": "阿大",
	"no": "2024010801",
	"gender": 1,
	"phone": "15909091235",
	"idCard": "159090912351590909",
	"isCollege": 1,
	"address": "昌平回龙观",
	"degree": 4,
	"graduationDate": "2024-01-01",
	"clazzId": 9
}
```





#### 4.3.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





### 4.4 根据ID查询

#### 4.4.1 基本信息

> 请求路径：/students/{id}
>
> 请求方式：GET
>
> 接口描述：该接口用于根据主键ID查询学员的信息



#### 4.4.2 请求参数

参数格式：路径参数

参数说明：

| 参数名 | 类型   | 是否必须 | 备注   |
| ------ | ------ | -------- | ------ |
| id     | number | 必须     | 学员ID |

请求参数样例：

```
/students/8
```



#### 4.4.3 响应数据

参数格式：application/json

参数说明：

| 名称               | 类型   | 是否必须 | 备注                                            |
| ------------------ | ------ | -------- | ----------------------------------------------- |
| code               | number | 必须     | 响应码, 1 成功 , 0 失败                         |
| msg                | string | 非必须   | 提示信息                                        |
| data               | object | 必须     | 返回的数据                                      |
| \|- id             | number | 必须     | id                                              |
| \|- name           | string | 必须     | 姓名                                            |
| \|- no             | string | 必须     | 学号                                            |
| \|- phone          | string | 必须     | 手机号                                          |
| \|- gender         | string | 必须     | 性别(1:男, 2:女)                                |
| \|- degree         | number | 必须     | 学历(1:初中,2:高中,3:大专,4:本科,5:硕士,6:博士) |
| \|- idCard         | string | 非必须   | 身份证号                                        |
| \|- isCollege      | number | 非必须   | 是否是院校学生 (1: 是, 0: 否)                   |
| \|- address        | string | 非必须   | 联系地址                                        |
| \|- graduationDate | string | 非必须   | 毕业时间                                        |
| \|- violationCount | number | 必须     | 违纪次数                                        |
| \|- violationScore | number | 必须     | 违纪扣分                                        |
| \|- clazzId        | number | 必须     | 班级ID                                          |
| \|- createTime     | string | 必须     | 创建时间                                        |
| \|- updateTime     | string | 必须     | 更新时间                                        |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "id": 7,
    "name": "Locos",
    "no": "2023001010",
    "gender": 1,
    "phone": "13712345678",
    "degree": 5,
    "idCard": "110090110090110090",
    "isCollege": 0,
    "address": "回龙观东大街110号",
    "graduationDate": "2020-07-01",
    "violationCount": 0,
    "violationScore": 0,
    "clazzId": 2,
    "createTime": "2023-06-04T18:27:27",
    "updateTime": "2023-06-04T18:27:27"
  }
}
```







### 4.5 修改学员

#### 4.5.1 基本信息

> 请求路径：/students
>
> 请求方式：PUT
>
> 接口描述：该接口用于修改学员的数据信息



#### 4.5.2 请求参数

参数格式：application/json

参数说明：

| 名称           | 类型   | 是否必须 | 备注                                            |
| -------------- | ------ | -------- | ----------------------------------------------- |
| id             | number | 必须     | id                                              |
| name           | string | 必须     | 姓名                                            |
| no             | string | 必须     | 学号                                            |
| phone          | string | 必须     | 手机号                                          |
| gender         | string | 必须     | 性别(1:男, 2:女)                                |
| degree         | number | 必须     | 学历(1:初中,2:高中,3:大专,4:本科,5:硕士,6:博士) |
| idCard         | string | 非必须   | 身份证号                                        |
| isCollege      | number | 非必须   | 是否是院校学生 (1: 是, 0: 否)                   |
| address        | string | 非必须   | 联系地址                                        |
| graduationDate | string | 非必须   | 毕业时间                                        |
| violationCount | number | 必须     | 违纪次数                                        |
| violationScore | number | 必须     | 违纪扣分                                        |
| clazzId        | number | 必须     | 班级ID                                          |

请求数据样例：

```json
{
  "id": 7,
  "name": "Locos",
  "no": "2023001010",
  "gender": 1,
  "phone": "13712345678",
  "degree": 5,
  "idCard": "110090110090110090",
  "isCollege": 0,
  "address": "回龙观东大街110号",
  "graduationDate": "2020-07-01",
  "violationCount": 0,
  "violationScore": 0,
  "clazzId": 2
}
```



#### 4.5.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```







### 4.6 违纪处理

#### 4.6.1 基本信息

> 请求路径：/students/violation/{id}/{score}
>
> 请求方式：PUT
>
> 接口描述：该接口用于修改学员的数据信息



#### 4.6.2 请求参数

参数格式：路径参数

参数说明：

| 名称  | 类型   | 是否必须 | 备注     |
| ----- | ------ | -------- | -------- |
| id    | number | 必须     | 学员ID   |
| score | number | 必须     | 扣除分数 |



#### 4.6.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据                     |

响应数据样例：

```json
{
    "code":1,
    "msg":"success",
    "data":null
}
```





## 5. 数据统计

### 5.1 员工性别统计

#### 5.1.1 基本信息

> 请求路径：/report/empGenderData
>
> 请求方式：GET
>
> 接口描述：统计员工性别信息



#### 5.1.2 请求参数

无



#### 5.1.3 响应数据

参数格式：application/json

参数说明：

| 参数名    | 类型     | 是否必须 | 备注                           |
| --------- | -------- | -------- | ------------------------------ |
| code      | number   | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg       | string   | 非必须   | 提示信息                       |
| data      | object[] | 非必须   | 返回的数据                     |
| \|- name  | string   | 非必须   | 性别                           |
| \|- value | number   | 非必须   | 人数                           |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": [
    {"name": "男性员工","value": 5},
    {"name": "女性员工","value": 6}
  ]
}
```







### 5.2 员工职位人数统计

#### 5.2.1 基本信息

> 请求路径：/report/empJobData
>
> 请求方式：GET
>
> 接口描述：统计各个职位的员工人数



#### 5.2.2 请求参数

无



#### 5.2.3 响应数据

参数格式：application/json

参数说明：

| 参数名       | 类型     | 是否必须 | 备注                           |
| ------------ | -------- | -------- | ------------------------------ |
| code         | number   | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg          | string   | 非必须   | 提示信息                       |
| data         | object   | 非必须   | 返回的数据                     |
| \|- jobList  | string[] | 必须     | 职位列表                       |
| \|- dataList | number[] | 必须     | 人数列表                       |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "jobList": ["教研主管","学工主管","其他","班主任","咨询师","讲师"],
    "dataList": [1,1,2,6,8,13]
  }
}
```







### 5.3 学员学历统计

#### 5.3.1 基本信息

> 请求路径：/report/studentDegreeData
>
> 请求方式：GET
>
> 接口描述：统计学员的学历信息



#### 5.3.2 请求参数

无



#### 5.3.3 响应数据

参数格式：application/json

参数说明：

| 参数名    | 类型      | 是否必须 | 备注                           |
| --------- | --------- | -------- | ------------------------------ |
| code      | number    | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg       | string    | 非必须   | 提示信息                       |
| data      | object[ ] | 非必须   | 返回的数据                     |
| \|- name  | string    | 非必须   | 学历列表                       |
| \|- value | number    | 非必须   | 人数                           |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": [
    {
      "name": "初中",
      "value": 5
    },
    {
      "name": "高中",
      "value": 6
    },
    {
      "name": "大专",
      "value": 126
    },
    {
      "name": "本科",
      "value": 182
    },
    {
      "name": "硕士",
      "value": 6
    }
  ]
}
```









### 5.4 班级人数统计

#### 5.4.1 基本信息

> 请求路径：/report/studentCountData
>
> 请求方式：GET
>
> 接口描述：统计每一个班级的人数



#### 5.4.2 请求参数

无



#### 5.4.3 响应数据

参数格式：application/json

参数说明：

| 参数名        | 类型     | 是否必须 | 备注                           |
| ------------- | -------- | -------- | ------------------------------ |
| code          | number   | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg           | string   | 非必须   | 提示信息                       |
| data          | object   | 非必须   | 返回的数据                     |
| \|- clazzList | string[] | 必须     | 班级列表                       |
| \|- dataList  | number[] | 必须     | 每一个班级的人数列表           |

响应数据样例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "clazzList": ["Java就业100期","Java就业101期","Java就业102期","Java就业103期","Java就业104期"],
    "dataList": [77,82,70,80,90]
  }
}
```











### 5.5 日志列表查询

#### 5.5.1 基本信息

> 请求路径：/log/page
>
> 请求方式：GET
>
> 接口描述：该接口用于日志信息的分页查询



#### 5.5.2 请求参数

参数格式：queryString

参数说明：

| 参数名称 | 是否必须 | 示例 | 备注                                       |
| -------- | -------- | ---- | ------------------------------------------ |
| page     | 是       | 1    | 分页查询的页码，如果未指定，默认为1        |
| pageSize | 是       | 10   | 分页查询的每页记录数，如果未指定，默认为10 |

请求数据样例：

```shell
/log/page?page=1&pageSize=10
```





#### 5.5.3 响应数据

参数格式：application/json

参数说明：

| 名称               | 类型      | 是否必须 | 备注                    |
| ------------------ | --------- | -------- | ----------------------- |
| code               | number    | 必须     | 响应码, 1 成功 , 0 失败 |
| msg                | string    | 非必须   | 提示信息                |
| data               | object    | 必须     | 返回的数据              |
| \|- total          | number    | 必须     | 总记录数                |
| \|- rows           | object [] | 必须     | 数据列表                |
| \|- id             | number    | 非必须   | id                      |
| \|- operateEmpId   | number    | 非必须   | 操作人ID                |
| \|- operateTime    | string    | 非必须   | 操作时间                |
| \|- className      | string    | 非必须   | 类名                    |
| \|- methodName     | string    | 非必须   | 方法名                  |
| \|- methodParams   | string    | 非必须   | 方法请求参数            |
| \|- returnValue    | string    | 非必须   | 返回值                  |
| \|- costTime       | number    | 非必须   | 执行耗时, 单位ms        |
| \|- operateEmpName | string    | 非必须   | 操作人姓名              |

响应数据样例：

```json
{
    "code": 1,
    "msg": null,
    "data": {
        "total": 15,
        "rows": [
            {
                "id": 15,
                "operateEmpId": 2,
                "operateTime": "2023-12-18T17:37:15",
                "className": "com.itheima.controller.DeptController",
                "methodName": "add",
                "methodParams": "[Dept(id=null, name=投资部, createTime=null, updateTime=null)]",
                "returnValue": "Result(code=1, msg=null, data=null)",
                "costTime": 8,
                "operateEmpName": "宋江"
            },
            {
                "id": 14,
                "operateEmpId": 2,
                "operateTime": "2023-12-18T17:37:07",
                "className": "com.itheima.controller.DeptController",
                "methodName": "add",
                "methodParams": "[Dept(id=null, name=市场部, createTime=null, updateTime=null)]",
                "returnValue": "Result(code=1, msg=null, data=null)",
                "costTime": 4,
                "operateEmpName": "宋江"
            }
        ]
    }
}
```









## 6. 其他接口

### 6.1 登录
#### 6.1.1 基本信息

> 请求路径：/login
>
> 请求方式：POST
>
> 接口描述：该接口用于员工登录Tlias智能学习辅助系统，登录完毕后，系统下发JWT令牌。 



#### 6.1.2 请求参数

参数格式：application/json

参数说明：

| 名称     | 类型   | 是否必须 | 备注   |
| -------- | ------ | -------- | ------ |
| username | string | 必须     | 用户名 |
| password | string | 必须     | 密码   |

请求数据样例：

```json
{
	"username": "jinyong",
    "password": "123456"
}
```



#### 6.1.3 响应数据

参数格式：application/json

参数说明：

| 名称         | 类型   | 是否必须 | 备注                     |
| ------------ | ------ | -------- | ------------------------ |
| code         | number | 必须     | 响应码, 1 成功 ; 0  失败 |
| msg          | string | 非必须   | 提示信息                 |
| data         | object | 必须     | 返回的数据               |
| \|- id       | number | 必须     | 员工ID                   |
| \|- username | string | 必须     | 用户名                   |
| \|- name     | string | 必须     | 姓名                     |
| \|- token    | string | 必须     | 令牌                     |



响应数据样例：

```json
{
    "code": 1,
    "msg": "success",
    "data": {
        "id": 2,
        "username": "songjiang",
        "name": "宋江",
        "token": "eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MiwidXNlcm5hbWUiOiJzb25namlhbmciLCJleHAiOjE2OTg3MDE3NjJ9.w06EkRXTep6SrvMns3w5RKe79nxauDe7fdMhBLK-MKY"
    }
}
```





#### 6.1.4 备注说明

> 用户登录成功后，系统会自动下发JWT令牌，然后在后续的每次请求中，都需要在请求头header中携带到服务端，请求头的名称为 `token` ，值为 登录时下发的JWT令牌。
>
> 如果检测到用户未登录，则直接响应 401 状态码 。
>











### 6.2 文件上传

#### 6.2.1 基本信息

> 请求路径：/upload
>
> 请求方式：POST
>
> 接口描述：上传图片接口



#### 6.2.2 请求参数

参数格式：multipart/form-data

参数说明：

| 参数名称 | 参数类型 | 是否必须 | 示例 | 备注 |
| -------- | -------- | -------- | ---- | ---- |
| file     | file     | 是       |      |      |



#### 6.2.3 响应数据

参数格式：application/json

参数说明：

| 参数名 | 类型   | 是否必须 | 备注                           |
| ------ | ------ | -------- | ------------------------------ |
| code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
| msg    | string | 非必须   | 提示信息                       |
| data   | object | 非必须   | 返回的数据，上传图片的访问路径 |

响应数据样例：

```json
{
    "code": 1,
    "msg": "success",
    "data": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-0400.jpg"
}
```







​            