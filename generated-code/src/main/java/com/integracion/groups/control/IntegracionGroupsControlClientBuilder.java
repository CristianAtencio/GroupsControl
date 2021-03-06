/**
 * null
 */
package com.integracion.groups.control;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.integracion.groups.control.IntegracionGroupsControl}.
 * 
 * @see com.integracion.groups.control.IntegracionGroupsControl#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class IntegracionGroupsControlClientBuilder extends SdkSyncClientBuilder<IntegracionGroupsControlClientBuilder, IntegracionGroupsControl> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("g0gi25918d.execute-api.us-east-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "us-east-1";

    /**
     * Package private constructor - builder should be created via {@link IntegracionGroupsControl#builder()}
     */
    IntegracionGroupsControlClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of IntegracionGroupsControl using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of IntegracionGroupsControl.
     */
    @Override
    protected IntegracionGroupsControl build(AwsSyncClientParams params) {
        return new IntegracionGroupsControlClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
