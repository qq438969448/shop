echo �ű�ɱ��ԭ����
taskkill /f /im A1javaw.exe
echo �ȴ�5����������Ŀ��ȷ��������ֹͣ
timeout /t 5
del/f/s/q E:\jekens\workspace\shop-1.1.war
echo ԭjarɾ���ɹ�
copy E:\jekens\workspace\shop_11\target\shop-1.1.war E:\jekens\workspace\shop-1.1.war
echo ��jar���Ƴɹ�
start A1javaw -jar E:\jekens\workspace\shop-1.1.war
