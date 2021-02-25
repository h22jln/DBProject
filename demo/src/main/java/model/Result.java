package model;

import java.util.List;
import java.util.Map;

public class Result {
	private List<Map<String, Object>> info;
	private int count;

	
	
	public Result(List<Map<String, Object>> info, int count) {
		super();
		this.info = info;
		this.count = count;

	}
	
	public List<Map<String, Object>> getInfo() {
		return info;
	}
	public void setInfo(List<Map<String, Object>> info) {
		this.info = info;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	
	
}
