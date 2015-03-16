# Big Data之處理與分析實務班
==========================

# Slides:
https://www.slideshare.net/secret/fwSEq9KvkbEwjq

# Hadoop 環境設定
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


# 更改yarn-site.xml

==========================

	<property>
			<name>yarn.nodemanager.aux-services</name>
			<value>mapreduce_shuffle</value>
	</property>