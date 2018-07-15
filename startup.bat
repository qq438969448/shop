echo 脚本杀死原进程
taskkill /f /im A1javaw.exe
echo 等待5秒再启动项目，确保程序以停止
timeout /t 5
del/f/s/q E:\jekens\workspace\shop-1.1.war
echo 原jar删除成功
copy E:\jekens\workspace\shop_11\target\shop-1.1.war E:\jekens\workspace\shop-1.1.war
echo 新jar复制成功
start A1javaw -jar E:\jekens\workspace\shop-1.1.war
