package com.groups.groupscontrol;

public class Main {
	public static void main(String args[]) {
		LambdaMethodHandler lm = new LambdaMethodHandler();
		LambdaBodyRequest bodyRequest = new LambdaBodyRequest();
		bodyRequest.setGroups("1,2,1,1,1,2,1,3");
		lm.handleRequest(bodyRequest, null);
	}
}
