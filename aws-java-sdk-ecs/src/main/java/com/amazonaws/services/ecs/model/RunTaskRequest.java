/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#runTask(RunTaskRequest) RunTask operation}.
 * <p>
 * Start a task using random placement and the default Amazon ECS
 * scheduler. To use your own scheduler or place a task on a specific
 * container instance, use <code>StartTask</code> instead.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The count parameter is limited to 10 tasks per call.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#runTask(RunTaskRequest)
 */
public class RunTaskRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster on
     * which to run your task. If you do not specify a cluster, the default
     * cluster is assumed..
     */
    private String cluster;

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run. If a <code>revision</code> is not
     * specified, the latest <code>ACTIVE</code> revision is used.
     */
    private String taskDefinition;

    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the overrides it
     * should receive. You can override the default command for a container
     * (that is specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing
     * environment variables (that are specified in the task definition or
     * Docker image) on a container or add new environment variables to it
     * with an <code>environment</code> override. <note> <p>A total of 8192
     * characters are allowed for overrides. This limit includes the JSON
     * formatting characters of the override structure. </note>
     */
    private TaskOverride overrides;

    /**
     * The number of instantiations of the specified task to place on your
     * cluster. <important> <p>The <code>count</code> parameter is limited to
     * 10 tasks per call. </important>
     */
    private Integer count;

    /**
     * An optional tag specified when a task is started. For example if you
     * automatically trigger a task to run a batch process job, you could
     * apply a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. <p>If a task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     */
    private String startedBy;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster on
     * which to run your task. If you do not specify a cluster, the default
     * cluster is assumed..
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster on
     *         which to run your task. If you do not specify a cluster, the default
     *         cluster is assumed..
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster on
     * which to run your task. If you do not specify a cluster, the default
     * cluster is assumed..
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster on
     *         which to run your task. If you do not specify a cluster, the default
     *         cluster is assumed..
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster on
     * which to run your task. If you do not specify a cluster, the default
     * cluster is assumed..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster on
     *         which to run your task. If you do not specify a cluster, the default
     *         cluster is assumed..
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunTaskRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run. If a <code>revision</code> is not
     * specified, the latest <code>ACTIVE</code> revision is used.
     *
     * @return The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition to run. If a <code>revision</code> is not
     *         specified, the latest <code>ACTIVE</code> revision is used.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run. If a <code>revision</code> is not
     * specified, the latest <code>ACTIVE</code> revision is used.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition to run. If a <code>revision</code> is not
     *         specified, the latest <code>ACTIVE</code> revision is used.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition to run. If a <code>revision</code> is not
     * specified, the latest <code>ACTIVE</code> revision is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition to run. If a <code>revision</code> is not
     *         specified, the latest <code>ACTIVE</code> revision is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunTaskRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the overrides it
     * should receive. You can override the default command for a container
     * (that is specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing
     * environment variables (that are specified in the task definition or
     * Docker image) on a container or add new environment variables to it
     * with an <code>environment</code> override. <note> <p>A total of 8192
     * characters are allowed for overrides. This limit includes the JSON
     * formatting characters of the override structure. </note>
     *
     * @return A list of container overrides in JSON format that specify the name of
     *         a container in the specified task definition and the overrides it
     *         should receive. You can override the default command for a container
     *         (that is specified in the task definition or Docker image) with a
     *         <code>command</code> override. You can also override existing
     *         environment variables (that are specified in the task definition or
     *         Docker image) on a container or add new environment variables to it
     *         with an <code>environment</code> override. <note> <p>A total of 8192
     *         characters are allowed for overrides. This limit includes the JSON
     *         formatting characters of the override structure. </note>
     */
    public TaskOverride getOverrides() {
        return overrides;
    }
    
    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the overrides it
     * should receive. You can override the default command for a container
     * (that is specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing
     * environment variables (that are specified in the task definition or
     * Docker image) on a container or add new environment variables to it
     * with an <code>environment</code> override. <note> <p>A total of 8192
     * characters are allowed for overrides. This limit includes the JSON
     * formatting characters of the override structure. </note>
     *
     * @param overrides A list of container overrides in JSON format that specify the name of
     *         a container in the specified task definition and the overrides it
     *         should receive. You can override the default command for a container
     *         (that is specified in the task definition or Docker image) with a
     *         <code>command</code> override. You can also override existing
     *         environment variables (that are specified in the task definition or
     *         Docker image) on a container or add new environment variables to it
     *         with an <code>environment</code> override. <note> <p>A total of 8192
     *         characters are allowed for overrides. This limit includes the JSON
     *         formatting characters of the override structure. </note>
     */
    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }
    
    /**
     * A list of container overrides in JSON format that specify the name of
     * a container in the specified task definition and the overrides it
     * should receive. You can override the default command for a container
     * (that is specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing
     * environment variables (that are specified in the task definition or
     * Docker image) on a container or add new environment variables to it
     * with an <code>environment</code> override. <note> <p>A total of 8192
     * characters are allowed for overrides. This limit includes the JSON
     * formatting characters of the override structure. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param overrides A list of container overrides in JSON format that specify the name of
     *         a container in the specified task definition and the overrides it
     *         should receive. You can override the default command for a container
     *         (that is specified in the task definition or Docker image) with a
     *         <code>command</code> override. You can also override existing
     *         environment variables (that are specified in the task definition or
     *         Docker image) on a container or add new environment variables to it
     *         with an <code>environment</code> override. <note> <p>A total of 8192
     *         characters are allowed for overrides. This limit includes the JSON
     *         formatting characters of the override structure. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunTaskRequest withOverrides(TaskOverride overrides) {
        this.overrides = overrides;
        return this;
    }

    /**
     * The number of instantiations of the specified task to place on your
     * cluster. <important> <p>The <code>count</code> parameter is limited to
     * 10 tasks per call. </important>
     *
     * @return The number of instantiations of the specified task to place on your
     *         cluster. <important> <p>The <code>count</code> parameter is limited to
     *         10 tasks per call. </important>
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * The number of instantiations of the specified task to place on your
     * cluster. <important> <p>The <code>count</code> parameter is limited to
     * 10 tasks per call. </important>
     *
     * @param count The number of instantiations of the specified task to place on your
     *         cluster. <important> <p>The <code>count</code> parameter is limited to
     *         10 tasks per call. </important>
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * The number of instantiations of the specified task to place on your
     * cluster. <important> <p>The <code>count</code> parameter is limited to
     * 10 tasks per call. </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The number of instantiations of the specified task to place on your
     *         cluster. <important> <p>The <code>count</code> parameter is limited to
     *         10 tasks per call. </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunTaskRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * An optional tag specified when a task is started. For example if you
     * automatically trigger a task to run a batch process job, you could
     * apply a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. <p>If a task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     *
     * @return An optional tag specified when a task is started. For example if you
     *         automatically trigger a task to run a batch process job, you could
     *         apply a unique identifier for that job to your task with the
     *         <code>startedBy</code> parameter. You can then identify which tasks
     *         belong to that job by filtering the results of a <a>ListTasks</a> call
     *         with the <code>startedBy</code> value. <p>If a task is started by an
     *         Amazon ECS service, then the <code>startedBy</code> parameter contains
     *         the deployment ID of the service that starts it.
     */
    public String getStartedBy() {
        return startedBy;
    }
    
    /**
     * An optional tag specified when a task is started. For example if you
     * automatically trigger a task to run a batch process job, you could
     * apply a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. <p>If a task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     *
     * @param startedBy An optional tag specified when a task is started. For example if you
     *         automatically trigger a task to run a batch process job, you could
     *         apply a unique identifier for that job to your task with the
     *         <code>startedBy</code> parameter. You can then identify which tasks
     *         belong to that job by filtering the results of a <a>ListTasks</a> call
     *         with the <code>startedBy</code> value. <p>If a task is started by an
     *         Amazon ECS service, then the <code>startedBy</code> parameter contains
     *         the deployment ID of the service that starts it.
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }
    
    /**
     * An optional tag specified when a task is started. For example if you
     * automatically trigger a task to run a batch process job, you could
     * apply a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. <p>If a task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedBy An optional tag specified when a task is started. For example if you
     *         automatically trigger a task to run a batch process job, you could
     *         apply a unique identifier for that job to your task with the
     *         <code>startedBy</code> parameter. You can then identify which tasks
     *         belong to that job by filtering the results of a <a>ListTasks</a> call
     *         with the <code>startedBy</code> value. <p>If a task is started by an
     *         Amazon ECS service, then the <code>startedBy</code> parameter contains
     *         the deployment ID of the service that starts it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunTaskRequest withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getOverrides() != null) sb.append("Overrides: " + getOverrides() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() + ",");
        if (getStartedBy() != null) sb.append("StartedBy: " + getStartedBy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RunTaskRequest == false) return false;
        RunTaskRequest other = (RunTaskRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        if (other.getOverrides() == null ^ this.getOverrides() == null) return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getStartedBy() == null ^ this.getStartedBy() == null) return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false) return false; 
        return true;
    }
    
    @Override
    public RunTaskRequest clone() {
        
            return (RunTaskRequest) super.clone();
    }

}
    