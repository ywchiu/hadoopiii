package hdfsop;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class WriteHDFSFile {
	public static void main(String[] args) throws Exception {

		Configuration configuration = new Configuration();
		configuration.addResource(new Path(
				"/usr/local/hadoop/etc/hadoop/core-site.xml"));
		configuration.addResource(new Path(
				"/usr/local/hadoop/etc/hadoop/hdfs-site.xml"));
		configuration.set("fs.hdfs.impl",
				org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
		FileSystem fs = FileSystem.get(configuration);
		Path pt = new Path("hdfs://localhost:9000/data/tibame.txt");
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(
				fs.create(pt, true)));
		String line;
		line = "Tibame Hadoop\n";
		System.out.println(line);
		br.write(line);
		br.close();
	}
}
