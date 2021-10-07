package com.groups.groupscontrol;

import java.util.HashMap;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaMethodHandler implements RequestHandler<LambdaBodyRequest, HashMap>{

	public HashMap handleRequest(LambdaBodyRequest request, Context context) {
		
		LambdaBodyResponse generateResponse = new LambdaBodyResponse();
		int[] parts = request.getGroupsList();
		int numberPeople = 0;
		int majorAmountPeople = parts[parts.length-1];
		String response = "";
		
		for (int s: parts) {           
			numberPeople += s; 
		}
		
		System.out.print("Number people: " + numberPeople);
		
		for(int i = 1 ; i <= numberPeople ; i++){
	        if(numberPeople%i == 0){
	            System.out.println("Posible " + i);
	            if(i >= majorAmountPeople) {
	            	response = (String) (response.equals("") ? Integer.toString(i) : response + "," + Integer.toString(i));
	            }
	        }
	    }
		
		System.out.print("Number Responses: " + response);
		generateResponse.setGroupsSizes(response);
		
		return generateResponse.getReponse();
	}

}
