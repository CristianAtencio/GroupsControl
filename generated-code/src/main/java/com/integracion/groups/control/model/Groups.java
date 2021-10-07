/**
 * null
 */
package com.integracion.groups.control.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/g0gi25918d-2021-10-07T08:20:09Z/Groups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Groups implements Serializable, Cloneable, StructuredPojo {

    private String groups;

    /**
     * @param groups
     */

    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * @return
     */

    public String getGroups() {
        return this.groups;
    }

    /**
     * @param groups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Groups groups(String groups) {
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

        if (obj instanceof Groups == false)
            return false;
        Groups other = (Groups) obj;
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
    public Groups clone() {
        try {
            return (Groups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.integracion.groups.control.model.transform.GroupsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
