package com.groups.groupscontrol;

import java.util.Arrays;

public class LambdaBodyRequest {
	private String groups;

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}
	
	public int[] getGroupsList() {
		String[] parts = this.groups.split(",");
		int[] intParts = new int[parts.length];
		for(int i = 0; i < parts.length; i++){
			intParts[i] = Integer.parseInt(parts[i]);
		}
		Arrays.sort(intParts);
		return intParts;
	}
}
