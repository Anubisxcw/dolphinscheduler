/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.dao.entity;

import org.apache.dolphinscheduler.common.enums.TaskGroupQueueStatus;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_ds_task_group_queue")
public class TaskGroupQueue implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private int taskId;

    private String taskName;

    @TableField(exist = false)
    private String projectName;

    @TableField(exist = false)
    private String projectCode;

    @TableField(exist = false)
    private String workflowInstanceName;

    private int groupId;

    private Integer workflowInstanceId;

    private int priority;

    /**
     * is force start
     * 0 NO ,1 YES
     */
    private int forceStart;

    /**
     * ready to get the queue by other task finish
     * 0 NO ,1 YES
     */
    private int inQueue;

    private TaskGroupQueueStatus status;

    private Date createTime;

    private Date updateTime;
}
