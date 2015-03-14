# Big Data之處理與分析實務班
==========================

Slides:
https://www.slideshare.net/secret/fwSEq9KvkbEwjq

Hadoop EC2 Service

Username: ec2-user
password: hadoopiii

1 52.11.14.35

2 52.11.32.121

3 52.11.36.100

4 52.11.39.21

5 52.11.40.151

6 52.11.57.215

7 52.11.58.62

8 52.11.60.244

9 52.11.72.68

10 52.11.107.72

11 52.11.107.180

12 52.11.110.2

13 52.11.114.150

14 52.11.114.248

15 52.11.120.146

16 52.11.124.53

17 52.11.129.249

18 52.11.133.145

19 52.11.137.97

20 52.11.252.113

21 54.69.50.215

22 54.69.50.117

23 54.69.50.161

24 54.69.50.197

25 54.69.50.206

26 54.69.50.198

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


無密碼登入
ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa

cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys

chmod 700 ~/.ssh

chmod 600  ~/.ssh/authorized_keys



