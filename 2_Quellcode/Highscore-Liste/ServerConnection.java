import java.io.*;
import java.net.*;


public class ServerConnection{
	{
		try {
			URL url = new URL("https://dv-projekt-2022-2048.jimdofree.com");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			DataOutputStream writer = new DataOutputStream(conn.getOutputStream());
			writer.write(1);
			writer.flush();
			writer.close();
			wait(500);
			conn.setRequestMethod("GET");
			BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuilder content = new StringBuilder();
			while((line = input.readLine()) != null)
			{
				content.append(line);
				content.append(System.lineSeparator());
			}
			conn.disconnect();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
