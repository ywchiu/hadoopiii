# Big Data之處理與分析實務班
==========================

# Slides:
https://www.slideshare.net/secret/jAXKRnPCrknokG

## 移除舊的Java
yum -y remove java-*

## 下載及安裝Java
http://www.oracle.com/technetwork/java/javase/downloads/index.html

rpm -ivh jdk-8u40-linux-x64.rpm

## 使用tar 解壓縮 hadoop 2.5.2
$ tar –zxvf hadoop-2.5.2.tar.gz


## 切換成 root 使用者
$ su –

## 使用visudo 編輯權限
$ visudo 

## 給予sudo 權限 (於99行處)
tibame	ALL=(ALL)	ALL

## 新增群組hadoop
$ sudo groupadd hadoop

## 建立 hadoop 使用者並將hadoop加入hadoop 群組
$ sudo useradd -g hadoop hadoop


## 將Hadoop 2.5.2 搬移到 /usr/local
sudo mv ~/hadoop-2.5.2 /usr/local/hadoop

## 更改該目錄權限
 sudo chown –R hadoop:hadoop /usr/local/hadoop




## 設定Java ~/.bashrc
export JAVA_HOME=/usr/java/jdk1.8.0_40/

export PATH=$PATH:$JAVA_HOME


## Hadoop 環境設定
~/.bashrc

export HADOOP_PREFIX=/usr/local/hadoop 

export HADOOP_COMMON_HOME=$HADOOP_PREFIX 

export HADOOP_HDFS_HOME=$HADOOP_PREFIX 

export HADOOP_MAPRED_HOME=$HADOOP_PREFIX 

export HADOOP_YARN_HOME=$HADOOP_PREFIX 

export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_PREFIX/lib/native

export HADOOP_OPTS="-Djava.library.path=$HADOOP_PREFIX/lib"

export HADOOP_CONF_DIR=$HADOOP_PREFIX/etc/hadoop 

export PATH=$PATH:$HADOOP_PREFIX/bin:$HADOOP_PREFIX/sbin

export JAVA_HOME=/usr/java/jdk1.8.0_40/

export PATH=$PATH:$JAVA_HOME



AWS Keypair Tutorial:

https://github.com/ywchiu/rhadoopcourse


# 無密碼登入
ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa

cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys

chmod 700 ~/.ssh

chmod 600  ~/.ssh/authorized_keys


# Centos 6.6

https://drive.google.com/a/largitdata.com/file/d/0BwcmldsH2om-T3dQS2V3QklmNHM/view?usp=sharing


# 在Linux 下包裝jar 檔

- export CLASSPATH="/usr/local/hadoop/share/hadoop/common/hadoop-common-2.5.2.jar:/usr/local/hadoop/share/hadoop/common/lib/commons-collections-3.2.1.jar:/usr/local/hadoop/share/hadoop/common/lib/commons-configuration-1.6.jar:/usr/local/hadoop/share/hadoop/common/lib/commons-lang-2.6.jar:/usr/local/hadoop/share/hadoop/common/lib/commons-logging-1.1.3.jar:/usr/local/hadoop/share/hadoop/common/lib/log4j-1.2.17.jar:/usr/local/hadoop/share/hadoop/common/lib/slf4j-api-1.7.5.jar:/usr/local/hadoop/share/hadoop/common/lib/slf4j-log4j12-1.7.5.jar:/usr/local/hadoop/share/hadoop/common/lib/guava-11.0.2.jar:/usr/local/hadoop/share/hadoop/common/lib/hadoop-auth-2.5.2.jar:/usr/local/hadoop/share/hadoop/hdfs/hadoop-hdfs-2.5.2.jar:/usr/local/hadoop/share/hadoop/common/lib/commons-cli-1.2.jar:/usr/local/hadoop/share/hadoop/common/lib/protobuf-java-2.5.0.jar:/usr/local/hadoop/share/hadoop/mapreduce/hadoop-mapreduce-client-core-2.5.2.jar:$CLASSPATH"

- javac WordCount.java

- jar -cvf WordCount.jar ./WordCount*.class

- hadoop fs -mkdir /data

- hadoop fs -put input.txt /data

- hadoop jar WordCount.jar WordCount /data/input.txt /out
