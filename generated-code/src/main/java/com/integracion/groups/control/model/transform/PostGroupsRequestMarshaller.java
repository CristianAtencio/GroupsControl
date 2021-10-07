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
 * PostGroupsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostGroupsRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> GROUPS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).build();

    private static final PostGroupsRequestMarshaller instance = new PostGroupsRequestMarshaller();

    public static PostGroupsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostGroupsRequest postGroupsRequest, ProtocolMarshaller protocolMarshaller) {

        if (postGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postGroupsRequest.getGroups(), GROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
