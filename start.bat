@echo off
chcp 65001 >nul
echo ========================================
echo        一键启动程序
echo ========================================
echo.
echo 正在启动Java程序...
echo.

REM 编译Java文件
echo 1. 编译Java文件...
javac -cp . src/ContributionBooster/*.java
if %errorlevel% neq 0 (
    echo 编译失败，请检查Java环境
    pause
    exit /b 1
)

echo 编译成功！
echo.

REM 运行程序
echo 2. 启动程序...
echo 选择运行模式：
echo 1. 快速启动器（推荐）
echo 2. 一键生成代码并提交
echo 3. 批量执行（10次）
echo.
set /p choice="请选择 (1-3): "

if "%choice%"=="1" (
    echo 启动快速启动器...
    java -cp . ContributionBooster.QuickStart
) else if "%choice%"=="2" (
    echo 执行一键生成代码并提交...
    java -cp . ContributionBooster.OneClickCommit
) else if "%choice%"=="3" (
    echo 执行批量提交（10次）...
    java -cp . ContributionBooster.OneClickCommit batchOneClickCommit 10
) else (
    echo 无效选择，启动快速启动器...
    java -cp . ContributionBooster.QuickStart
)

echo.
echo 程序执行完成！
pause 