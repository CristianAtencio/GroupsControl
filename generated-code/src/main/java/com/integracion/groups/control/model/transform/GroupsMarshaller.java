/**
 * null
 */
package com.integracion.groups.control.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.integracion.groups.control.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GroupsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GroupsMarshaller {

    private static final MarshallingInfo<String> GROUPS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("groups").build();

    private static final GroupsMarshaller instance = new GroupsMarshaller();

    public static GroupsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Groups groups, ProtocolMarshaller protocolMarshaller) {

        if (groups == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(groups.getGroups(), GROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
