package com.groups.groupscontrol;

import java.util.HashMap;

public class LambdaBodyResponse {
	private String groupsSizes;

	public String getGroupsSizes() {
		return groupsSizes;
	}

	public void setGroupsSizes(String groupsSizes) {
		this.groupsSizes = groupsSizes;
	}
	
	public HashMap getReponse() {
		HashMap response = new HashMap();
		response.put("sizes", this.groupsSizes);
		return response;
	}
}
