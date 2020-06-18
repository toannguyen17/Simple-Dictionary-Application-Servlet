import java.util.HashMap;
import java.util.Map;

public class Translate {
	private static Translate instance;

	private static Map<String, String> data;

	private Translate(){
		data = new HashMap<>();
		data.put("home", "Nhà");
		data.put("hello", "Xin chào");
		data.put("dictionary", "từ điển");
		data.put("how",   "Thế nào");
		data.put("book",   "Quyển vở");
		data.put("computer", "Máy tính");
	}

	public static Translate getInstance(){
		if (instance == null) {
			instance = new Translate();
		}
		return instance;
	}

	public String find(String find){
		return data.get(find);
	};
}
