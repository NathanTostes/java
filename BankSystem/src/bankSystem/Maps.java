package bankSystem;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Compiled", "Rust");
		languages.put("Interpreted", "Phyton");
		System.out.println(languages.keySet());
		System.out.println(languages.values());
	}
}