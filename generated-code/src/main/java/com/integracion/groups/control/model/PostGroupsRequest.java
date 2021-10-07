/**
 * null
 */
package com.integracion.groups.control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/g0gi25918d-2021-10-07T08:20:09Z/PostGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostGroupsRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private Groups groups;

    /**
     * @param groups
     */

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    /**
     * @return
     */

    public Groups getGroups() {
        return this.groups;
    }

    /**
     * @param groups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostGroupsRequest groups(Groups groups) {
        setGroups(groups);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostGroupsRequest == false)
            return false;
        PostGroupsRequest other = (PostGroupsRequest) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public PostGroupsRequest clone() {
        return (PostGroupsRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostGroupsRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
