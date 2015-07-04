
### 設定Hadoop

- wget http://ftp.twaren.net/Unix/Web/apache/hadoop/common/hadoop-2.6.0/hadoop-2.6.0.tar.gz

- tar -zxvf hadoop-2.6.0.tar.gz


### 將Hadoop 2.6.0 搬移到 /usr/local
- sudo mv hadoop-2.6.0 /usr/local/hadoop

### 編輯.bashrc
- $ vim ~/.bashrc
- export JAVA_HOME=/usr/java/jdk1.7.0_67-cloudera/
- export PATH=$PATH:$JAVA_HOME
- export HADOOP_PREFIX=/usr/local/hadoop 
- export HADOOP_COMMON_HOME=$HADOOP_PREFIX 
- export HADOOP_HDFS_HOME=$HADOOP_PREFIX 
- export HADOOP_MAPRED_HOME=$HADOOP_PREFIX 
- export HADOOP_YARN_HOME=$HADOOP_PREFIX 
- export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_PREFIX/lib/native
- export HADOOP_OPTS="-Djava.library.path=$HADOOP_PREFIX/lib"
- export HADOOP_CONF_DIR=$HADOOP_PREFIX/etc/hadoop 
- export PATH=$PATH:$HADOOP_PREFIX/bin:$HADOOP_PREFIX/sbin

### 更新變數
$ source ~/.bashrc

### 嘗試是否可以無密碼登入
- ssh localhost

### 修改/etc/ssh/sshd_config
- sudo vi /etc/ssh/sshd_config
- 將PasswordAuthentication?變更為no
- sudo service sshd restart

### 設置無密碼登入
- ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa
- cat ~/.ssh/id_dsa.pub >> ~/.ssh/authorized_keys
- chmod 700 ~/.ssh
- chmod 600  ~/.ssh/authorized_keys

### 修改設定檔
- pseudo-distribution.xml

### 格式化HDFS
- /usr/local/hadoop/bin/hdfs namenode -format

### 找出原本的jps
- sudo jps
- 找到 DataNode, NameNode, SecondaryNameNode, Resource Manager, Node Manager PID
- sudo kill -9 <pid>

### 啟用HDFS及YARN
- start-dfs.sh
- start-yarn.sh
