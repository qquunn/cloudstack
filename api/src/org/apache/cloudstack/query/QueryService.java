// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.cloudstack.query;

import java.util.List;

import org.apache.cloudstack.api.command.admin.host.ListHostsCmd;
import org.apache.cloudstack.api.command.admin.router.ListRoutersCmd;
import org.apache.cloudstack.api.command.admin.user.ListUsersCmd;
import org.apache.cloudstack.api.command.user.account.ListAccountsCmd;
import org.apache.cloudstack.api.command.user.account.ListProjectAccountsCmd;
import org.apache.cloudstack.api.command.user.event.ListEventsCmd;
import org.apache.cloudstack.api.command.user.job.ListAsyncJobsCmd;
import org.apache.cloudstack.api.command.user.project.ListProjectInvitationsCmd;
import org.apache.cloudstack.api.command.user.project.ListProjectsCmd;
import org.apache.cloudstack.api.command.user.securitygroup.ListSecurityGroupsCmd;
import org.apache.cloudstack.api.command.user.tag.ListTagsCmd;
import org.apache.cloudstack.api.command.user.vm.ListVMsCmd;
import org.apache.cloudstack.api.command.user.vmgroup.ListVMGroupsCmd;
import org.apache.cloudstack.api.command.user.volume.ListVolumesCmd;
import org.apache.cloudstack.api.response.AccountResponse;
import org.apache.cloudstack.api.response.AsyncJobResponse;
import org.apache.cloudstack.api.response.DomainRouterResponse;
import org.apache.cloudstack.api.response.EventResponse;
import org.apache.cloudstack.api.response.HostResponse;
import org.apache.cloudstack.api.response.InstanceGroupResponse;
import org.apache.cloudstack.api.response.ListResponse;
import org.apache.cloudstack.api.response.ProjectAccountResponse;
import org.apache.cloudstack.api.response.ProjectInvitationResponse;
import org.apache.cloudstack.api.response.ProjectResponse;
import org.apache.cloudstack.api.response.ResourceTagResponse;
import org.apache.cloudstack.api.response.SecurityGroupResponse;
import org.apache.cloudstack.api.response.UserResponse;
import org.apache.cloudstack.api.response.UserVmResponse;
import org.apache.cloudstack.api.response.VolumeResponse;



import com.cloud.async.AsyncJob;
import com.cloud.exception.PermissionDeniedException;
import com.cloud.utils.Pair;

/**
 * Service used for list api query.
 * @author minc
 *
 */
public interface QueryService {

    public ListResponse<UserResponse> searchForUsers(ListUsersCmd cmd) throws PermissionDeniedException;

    public ListResponse<EventResponse> searchForEvents(ListEventsCmd cmd);

    public ListResponse<ResourceTagResponse> listTags(ListTagsCmd cmd);

    public ListResponse<InstanceGroupResponse> searchForVmGroups(ListVMGroupsCmd cmd);

    public ListResponse<UserVmResponse> searchForUserVMs(ListVMsCmd cmd);

    public ListResponse<SecurityGroupResponse> searchForSecurityGroups(ListSecurityGroupsCmd cmd);

    public ListResponse<DomainRouterResponse> searchForRouters(ListRoutersCmd cmd);

    public ListResponse<ProjectInvitationResponse> listProjectInvitations(ListProjectInvitationsCmd cmd);

    public ListResponse<ProjectResponse> listProjects(ListProjectsCmd cmd);

    public ListResponse<ProjectAccountResponse> listProjectAccounts(ListProjectAccountsCmd cmd);

    public ListResponse<HostResponse> searchForServers(ListHostsCmd cmd);

    public ListResponse<VolumeResponse> searchForVolumes(ListVolumesCmd cmd);

    public ListResponse<AccountResponse> searchForAccounts(ListAccountsCmd cmd);

    public ListResponse<AsyncJobResponse>  searchForAsyncJobs(ListAsyncJobsCmd cmd);
}
