/**
 * null
 */
package com.integracion.groups.control;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.integracion.groups.control.model.*;

/**
 * Interface for accessing IntegracionGroupsControl.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface IntegracionGroupsControl {

    /**
     * @param postGroupsRequest
     * @return Result of the PostGroups operation returned by the service.
     * @sample IntegracionGroupsControl.PostGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/g0gi25918d-2021-10-07T08:20:09Z/PostGroups"
     *      target="_top">AWS API Documentation</a>
     */
    PostGroupsResult postGroups(PostGroupsRequest postGroupsRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static IntegracionGroupsControlClientBuilder builder() {
        return new IntegracionGroupsControlClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
