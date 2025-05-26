# Active Context

This file tracks the project's current status, including recent changes, current goals, and open questions.
2025-05-26 14:51:48 - Log of updates made.

*

## Current Focus

*   [2025-05-26 16:04:00] - 修复 [`ReportController.java`](src/main/java/com/itheima/controller/ReportController.java) 中的编译错误。
*   [2025-05-26 16:09:31] - 移除了 [`ReportController.java`](src/main/java/com/itheima/controller/ReportController.java) 中的手动 `log` 声明，以尝试依赖 `@Slf4j`。这导致了预期的编译错误，因为用户的 Lombok 环境存在问题。

## Recent Changes

*   [2025-05-26 16:04:00] - 修改了 [`ReportController.java`](src/main/java/com/itheima/controller/ReportController.java):
    *   将 `getEmpJobData()` 方法中 `reportService.getEmpJobData()` 返回值的局部变量类型从 `List<Map<String, Object>>` 修改为 `Map<String, Object>`。
    *   将 `getStudentCountData()` 方法中 `reportService.getStudentCountData()` 返回值的局部变量类型从 `List<Map<String, Object>>` 修改为 `Map<String, Object>`。
    *   由于 `@Slf4j` 未能按预期生成 `log` 字段导致编译错误 (与已知的 Lombok 环境问题一致)，暂时恢复了手动声明的 `log` 字段以解决编译问题。用户仍需检查其 Lombok 环境配置。
*   [2025-05-26 16:00:50] - 修改了报表统计功能，以符合API文档要求的数据格式。
*   [2025-05-26 15:02:57] - Completing coding tasks: "Department Deletion Restriction", `EmpLog` POJO update, and code review/adjustments for Employee, Class, Student, and Report modules. Preparing for task completion.
*   [2025-05-26 15:02:57] - Implemented "Department Deletion Restriction" feature (Task 1):
    *   Added `countByDeptId` to [`EmpMapper.java`](src/main/java/com/itheima/mapper/EmpMapper.java:67) and [`EmpMapper.xml`](src/main/resources/com/itheima/mapper/EmpMapper.xml:109).
    *   Modified `deleteById` in [`DeptServiceImpl.java`](src/main/java/com/itheima/service/impl/DeptServiceImpl.java) to use `empMapper.countByDeptId` and throw `DeptNotEmptyException`.
    *   Confirmed [`DeptNotEmptyException.java`](src/main/java/com/itheima/exception/DeptNotEmptyException.java) and its handler in [`GlobalExceptionHandler.java`](src/main/java/com/itheima/exception/GlobalExceptionHandler.java:22) are correct.
*   [2025-05-26 15:02:57] - Updated [`EmpLog.java`](src/main/java/com/itheima/pojo/EmpLog.java) to match API documentation (Task 2).
*   [2025-05-26 15:02:57] - Adjusted [`EmpLogMapper.java`](src/main/java/com/itheima/mapper/EmpLogMapper.java:12) (SQL in `@Insert`) to match new `EmpLog` structure.
*   [2025-05-26 15:02:57] - Corrected method names in [`EmpLogService.java`](src/main/java/com/itheima/service/EmpLogService.java:7) and [`EmpLogServiceImpl.java`](src/main/java/com/itheima/service/impl/EmpLogServiceImpl.java:19) to `insert`.
*   [2025-05-26 15:02:57] - Added `deleteByEmpId` to [`EmpExprMapper.java`](src/main/java/com/itheima/mapper/EmpExprMapper.java:26) and [`EmpExprMapper.xml`](src/main/resources/com/itheima/mapper/EmpExprMapper.xml:30) for employee work experience updates.
*   [2025-05-26 15:02:57] - Reviewed and confirmed Employee, Class, and Student management modules for specified features (`exprList`, `masterName`, `status`, `clazzName`, violation handling).
*   [2025-05-26 15:02:57] - Adjusted Data Statistics module ([`ReportServiceImpl.java`](src/main/java/com/itheima/service/impl/ReportServiceImpl.java), [`ReportService.java`](src/main/java/com/itheima/service/ReportService.java), [`EmpMapper.xml`](src/main/resources/com/itheima/mapper/EmpMapper.xml:92-94)) to align return types and data keys with API documentation.
*   [2025-05-26 14:53:19] - Initialized Memory Bank (productContext.md, activeContext.md, progress.md, decisionLog.md, systemPatterns.md).
*   [2025-05-26 14:53:19] - Read API documentation ([`src/main/resources/ApiFIle/api接口文档.pdf`](src/main/resources/ApiFIle/api接口文档.pdf)).
*   [2025-05-26 14:53:19] - Updated [`productContext.md`](memory-bank/productContext.md) with Project Goal, Key Features, Overall Architecture, and API Endpoint Summary.
*   [2025-05-26 16:00:50] - 修改了 [`ReportServiceImpl.java`](src/main/java/com/itheima/service/impl/ReportServiceImpl.java) 中的 `getStudentCountData()` 和 `getEmpJobData()` 方法，将返回类型从 `List<Map<String, Object>>` 更改为 `Map<String, Object>`，并实现了数据转换逻辑以符合API文档。
*   [2025-05-26 16:00:50] - 更新了 [`ReportService.java`](src/main/java/com/itheima/service/ReportService.java) 接口中 `getStudentCountData()` 和 `getEmpJobData()` 方法的返回类型声明。


## Open Questions/Issues

*   **Lombok Compilation Issues**: Persistent compilation errors in [`EmpServiceImpl.java`](src/main/java/com/itheima/service/impl/EmpServiceImpl.java) and [`DeptServiceImpl.java`](src/main/java/com/itheima/service/impl/DeptServiceImpl.java) related to POJO getters/setters/constructors. These are highly suspected to be Lombok/IDE environment issues, as POJOs use correct annotations. User needs to verify local Lombok setup. The issue with `@Slf4j` in [`ReportController.java`](src/main/java/com/itheima/controller/ReportController.java) is also related to this.
*   **Operator Info in Logs**: [`EmpServiceImpl.java`](src/main/java/com/itheima/service/impl/EmpServiceImpl.java) log entries for delete/update use placeholders for `operateEmpId` and `operateEmpName` due to lack of direct access to authenticated user context in the service method. This needs to be addressed with a proper way to fetch operator details.
*   **Clazz List Date Filter**: The `list` query in [`ClazzMapper.xml`](src/main/resources/com/itheima/mapper/ClazzMapper.xml:17-19) filters by `end_date` using `begin` and `end` parameters. Confirm if API intends these for `begin_date` or `end_date`.
---
## Current Focus
*   [2025-05-26 15:32:00] - (🧪 测试器 TDD) Test task completion. All specified unit tests and regression tests have passed. Workarounds for Lombok issues were implemented. Preparing for `attempt_completion`.

## Recent Changes
*   [2025-05-26 15:32:00] - Ran all project tests (`mvn test`), all 14 tests passed.
*   [2025-05-26 15:32:00] - Created and passed tests for `ReportService` methods in [`ReportServiceTest.java`](src/test/java/com/itheima/service/ReportServiceTest.java).
*   [2025-05-26 15:32:00] - Manually added no-args constructor to [`EmpLog.java`](src/main/java/com/itheima/pojo/EmpLog.java) and removed `@NoArgsConstructor` to resolve test compilation errors.
*   [2025-05-26 15:32:00] - Created and passed tests for `StudentService` (listing and violation calls) in [`StudentServiceTest.java`](src/test/java/com/itheima/service/StudentServiceTest.java).
*   [2025-05-26 15:32:00] - Manually added getters/setters to [`Student.java`](src/main/java/com/itheima/pojo/Student.java).
*   [2025-05-26 15:32:00] - Created and passed tests for `ClazzService` in [`ClazzServiceTest.java`](src/test/java/com/itheima/service/ClazzServiceTest.java), adjusting for SQL-derived status.
*   [2025-05-26 15:32:00] - Manually added getters/setters to [`Clazz.java`](src/main/java/com/itheima/pojo/Clazz.java) and [`ClazzQueryParam.java`](src/main/java/com/itheima/pojo/ClazzQueryParam.java).
*   [2025-05-26 15:32:00] - Manually added/adjusted constructors and getters/setters for [`PageResult.java`](src/main/java/com/itheima/pojo/PageResult.java) to ensure main code compilation.
*   [2025-05-26 15:32:00] - Created and passed tests for `EmpService` (add/update with experiences) in [`EmpServiceTest.java`](src/test/java/com/itheima/service/EmpServiceTest.java).
*   [2025-05-26 15:32:00] - Manually added getters/setters/constructors to [`Emp.java`](src/main/java/com/itheima/pojo/Emp.java) and [`EmpExpr.java`](src/main/java/com/itheima/pojo/EmpExpr.java).
*   [2025-05-26 15:32:00] - Created and passed tests for `EmpLogService` in [`EmpLogServiceTest.java`](src/test/java/com/itheima/service/EmpLogServiceTest.java).
*   [2025-05-26 15:32:00] - Manually added getters/setters/constructors to [`EmpLog.java`](src/main/java/com/itheima/pojo/EmpLog.java).
*   [2025-05-26 15:32:00] - Created and passed tests for `DeptService` deletion restriction in [`DeptServiceTest.java`](src/test/java/com/itheima/service/DeptServiceTest.java).
*   [2025-05-26 15:32:00] - Corrected type issues in [`ReportController.java`](src/main/java/com/itheima/controller/ReportController.java) and explicitly added logger due to Lombok issues.
*   [2025-05-26 15:32:00] - Initial Memory Bank read.

## Open Questions/Issues
*   **Lombok Compilation Issues**: Resolved for testing purposes by manually adding getters/setters/constructors to affected POJOs. User needs to verify local Lombok setup for a permanent fix. The issue with `@Slf4j` in [`ReportController.java`](src/main/java/com/itheima/controller/ReportController.java) is also related to this.
*   **Operator Info in Logs**: [`EmpServiceImpl.java`](src/main/java/com/itheima/service/impl/EmpServiceImpl.java) log entries for delete/update use placeholders for `operateEmpId` and `operateEmpName`. This remains an open issue from the "自动编码器" mode.
*   **Clazz List Date Filter**: The `list` query in [`ClazzMapper.xml`](src/main/resources/com/itheima/mapper/ClazzMapper.xml:17-19) filters by `end_date` using `begin` and `end` parameters. This was not explicitly tested for correctness of date range interpretation but the query structure was noted.
*   **`EmpMapper.countByDeptId` Return Type**: Discrepancy between Java interface (`Integer`) and XML `resultType` (`Long`). This should be harmonized.
* [2025-05-26 15:44:16] - [Debug Status Update: Investigating chart display issue. SQL logs show data is fetched. Backend Java code (Controller, Service, Mapper) for empJobData and studentCountData appears to correctly return List<Map<String, Object>> with 'name' and 'value' keys, consistent with working charts and API documentation. Problem likely lies in frontend data handling for these specific charts.]