/**
 * null
 */
package com.integracion.groups.control.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.integracion.groups.control.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostGroupsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostGroupsResultJsonUnmarshaller implements Unmarshaller<PostGroupsResult, JsonUnmarshallerContext> {

    public PostGroupsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostGroupsResult postGroupsResult = new PostGroupsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postGroupsResult;
        }

        while (true) {
            if (token == null)
                break;

            postGroupsResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postGroupsResult;
    }

    private static PostGroupsResultJsonUnmarshaller instance;

    public static PostGroupsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostGroupsResultJsonUnmarshaller();
        return instance;
    }
}
