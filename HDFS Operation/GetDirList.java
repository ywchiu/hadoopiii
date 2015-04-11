package hdfsop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class GetDirList {
	public static void main(String[] args) throws Exception {

		Configuration configuration = new Configuration();
		configuration.addResource(new Path(
				"/usr/local/hadoop/etc/hadoop/core-site.xml"));
		configuration.addResource(new Path(
				"/usr/local/hadoop/etc/hadoop/hdfs-site.xml"));
		configuration.set("fs.hdfs.impl",org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());  
		FileSystem fs = FileSystem.get(configuration);
		FileStatus[] status = fs.listStatus(new Path("hdfs://localhost:9000/data/"));
		for (int i = 0; i < status.length; i++) {
			System.out.println(status[i].getPath());

		}
	}
}
