## wpx1997

ssh root@
## 部署
### 依赖
- Git
- JDK
- Maven
- MySQL
### 步骤
- yum update
- yum install git
- yum install maven
- yum install mysql
- sudo rpm -Uvh http://dev.mysql.com/get/mysql-community-release-el7-5.noarch.rpm
- yum install mysql-server
- mkdir App
- cd App
- git clone https://github.com/wpx1997/carcloud.git
- mvn compile package  
- screen -r ssh(Ctrl + A + D)
- java -jar -Dspring.profiles.active=production target/carcloud-0.0.1-SNAPSHOT.jar

mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate