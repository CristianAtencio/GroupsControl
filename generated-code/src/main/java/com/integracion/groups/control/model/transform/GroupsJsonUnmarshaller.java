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
 * Groups JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupsJsonUnmarshaller implements Unmarshaller<Groups, JsonUnmarshallerContext> {

    public Groups unmarshall(JsonUnmarshallerContext context) throws Exception {
        Groups groups = new Groups();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("groups", targetDepth)) {
                    context.nextToken();
                    groups.setGroups(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return groups;
    }

    private static GroupsJsonUnmarshaller instance;

    public static GroupsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GroupsJsonUnmarshaller();
        return instance;
    }
}
