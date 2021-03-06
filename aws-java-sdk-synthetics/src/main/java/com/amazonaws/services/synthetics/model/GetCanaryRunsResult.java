/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanaryRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCanaryRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * </p>
     */
    private java.util.List<CanaryRun> canaryRuns;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * </p>
     * 
     * @return An array of structures. Each structure contains the details of one of the retrieved canary runs.
     */

    public java.util.List<CanaryRun> getCanaryRuns() {
        return canaryRuns;
    }

    /**
     * <p>
     * An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * </p>
     * 
     * @param canaryRuns
     *        An array of structures. Each structure contains the details of one of the retrieved canary runs.
     */

    public void setCanaryRuns(java.util.Collection<CanaryRun> canaryRuns) {
        if (canaryRuns == null) {
            this.canaryRuns = null;
            return;
        }

        this.canaryRuns = new java.util.ArrayList<CanaryRun>(canaryRuns);
    }

    /**
     * <p>
     * An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCanaryRuns(java.util.Collection)} or {@link #withCanaryRuns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param canaryRuns
     *        An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryRunsResult withCanaryRuns(CanaryRun... canaryRuns) {
        if (this.canaryRuns == null) {
            setCanaryRuns(new java.util.ArrayList<CanaryRun>(canaryRuns.length));
        }
        for (CanaryRun ele : canaryRuns) {
            this.canaryRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * </p>
     * 
     * @param canaryRuns
     *        An array of structures. Each structure contains the details of one of the retrieved canary runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryRunsResult withCanaryRuns(java.util.Collection<CanaryRun> canaryRuns) {
        setCanaryRuns(canaryRuns);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryRunsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCanaryRuns() != null)
            sb.append("CanaryRuns: ").append(getCanaryRuns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCanaryRunsResult == false)
            return false;
        GetCanaryRunsResult other = (GetCanaryRunsResult) obj;
        if (other.getCanaryRuns() == null ^ this.getCanaryRuns() == null)
            return false;
        if (other.getCanaryRuns() != null && other.getCanaryRuns().equals(this.getCanaryRuns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanaryRuns() == null) ? 0 : getCanaryRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCanaryRunsResult clone() {
        try {
            return (GetCanaryRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
