echo �ű�ɱ��ԭ����
taskkill /f /im A1javaw.exe
echo �ȴ�5����������Ŀ��ȷ��������ֹͣ
timeout /t 5
del/f/s/q D:\jenkins\jenkins\workspace\shop-0.0.1-SNAPSHOT.jar
echo ԭjarɾ���ɹ�
copy D:\jenkins\jenkins\workspace\bootCloud-base\target\boot-0.0.1-SNAPSHOT.jar D:\jenkins\jenkins\workspace\shop-0.0.1-SNAPSHOT.jar
echo ��jar���Ƴɹ�
start A1javaw -jar D:\jenkins\jenkins\workspace\shop-0.0.1-SNAPSHOT.jar
