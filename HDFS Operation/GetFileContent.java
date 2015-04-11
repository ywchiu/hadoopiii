package hdfsop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class GetFileContent {

	public static void main(String[] args) throws Exception {

		Configuration configuration = new Configuration();
		configuration.addResource(new Path(
				"/usr/local/hadoop/etc/hadoop/core-site.xml"));
		configuration.addResource(new Path(
				"/usr/local/hadoop/etc/hadoop/hdfs-site.xml"));
		configuration.set("fs.hdfs.impl",
				org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
		FileSystem fs = FileSystem.get(configuration);
		FileStatus[] status = fs.listStatus(new Path(
				"hdfs://localhost:9000/data/tibame.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(
				fs.open(status[0].getPath())));
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

	}
}
