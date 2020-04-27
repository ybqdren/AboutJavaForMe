package top.wenzhao18.www.web.jdbctry;

import java.io.IOException;
import java.util.Properties;

public class PropInfoGet {
	private static Properties properties;

	static {
		properties = new Properties();
	}

	public Properties getProp() throws IOException {
		properties.load(this.getClass().getResourceAsStream("jdbc.properties"));
		return properties;
	}

}
