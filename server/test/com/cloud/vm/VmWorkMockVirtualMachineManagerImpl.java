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
package com.cloud.vm;

import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.naming.ConfigurationException;

import org.apache.log4j.Logger;

import org.apache.cloudstack.framework.jobs.AsyncJobConstants;
import org.apache.cloudstack.framework.messagebus.MessageBus;
import org.apache.cloudstack.storage.datastore.db.StoragePoolVO;

import com.cloud.agent.api.to.NicTO;
import com.cloud.agent.api.to.VirtualMachineTO;
import com.cloud.async.AsyncJobExecutionContext;
import com.cloud.deploy.DeployDestination;
import com.cloud.deploy.DeploymentPlan;
import com.cloud.exception.AgentUnavailableException;
import com.cloud.exception.ConcurrentOperationException;
import com.cloud.exception.InsufficientCapacityException;
import com.cloud.exception.InsufficientServerCapacityException;
import com.cloud.exception.ManagementServerException;
import com.cloud.exception.OperationTimedoutException;
import com.cloud.exception.ResourceUnavailableException;
import com.cloud.exception.VirtualMachineMigrationException;
import com.cloud.hypervisor.Hypervisor.HypervisorType;
import com.cloud.network.Network;
import com.cloud.network.dao.NetworkVO;
import com.cloud.offering.ServiceOffering;
import com.cloud.service.ServiceOfferingVO;
import com.cloud.storage.DiskOfferingVO;
import com.cloud.storage.StoragePool;
import com.cloud.storage.VMTemplateVO;
import com.cloud.storage.VolumeVO;
import com.cloud.user.Account;
import com.cloud.user.User;
import com.cloud.utils.Pair;
import com.cloud.utils.fsm.NoTransitionException;
import com.cloud.vm.VirtualMachine.Event;
import com.cloud.vm.VirtualMachine.Type;
import com.cloud.vm.VirtualMachineProfile.Param;

public class VmWorkMockVirtualMachineManagerImpl implements VirtualMachineManager {
    private static final Logger s_logger = Logger.getLogger(VmWorkMockVirtualMachineManagerImpl.class);
	
	@Inject MessageBus _msgBus;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setConfigParams(Map<String, Object> params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> getConfigParams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRunLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRunLevel(int level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean configure(String name, Map<String, Object> params)
			throws ConfigurationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public VirtualMachine allocate(String vmInstanceName, VMTemplateVO template,
			ServiceOfferingVO serviceOffering,
			Pair<? extends DiskOfferingVO, Long> rootDiskOffering,
			List<Pair<DiskOfferingVO, Long>> dataDiskOfferings,
			List<Pair<NetworkVO, NicProfile>> networks,
			Map<Param, Object> params, DeploymentPlan plan,
            HypervisorType hyperType, Account owner) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
    public VirtualMachine allocate(String vmInstanceName, VMTemplateVO template,
			ServiceOfferingVO serviceOffering,
			List<Pair<NetworkVO, NicProfile>> networkProfiles,
            DeploymentPlan plan, HypervisorType hyperType, Account owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VirtualMachine start(String vmUuid, Map<Param, Object> params,
			User caller, Account account) throws InsufficientCapacityException,
			ResourceUnavailableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VirtualMachine start(String vmUuid, Map<Param, Object> params,
			User caller, Account account, DeploymentPlan planToDeploy)
			throws InsufficientCapacityException, ResourceUnavailableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public boolean stop(String vmUuid, User caller,
            Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public boolean expunge(String vmUuid, User caller,
			Account account) throws ResourceUnavailableException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public void registerGuru(Type type, VirtualMachineGuru guru) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public Collection<VirtualMachineGuru> getRegisteredGurus() {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
    public VirtualMachineGuru getVmGuru(VirtualMachine vm) {
		// TODO Auto-generated method stub
    	return null;
    }

	@Override
	public boolean stateTransitTo(VMInstanceVO vm, Event e, Long hostId)
			throws NoTransitionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public VirtualMachine advanceStart(String vmUuid,
			Map<Param, Object> params, User caller, Account account)
			throws InsufficientCapacityException, ResourceUnavailableException,
			ConcurrentOperationException, OperationTimedoutException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VirtualMachine advanceStart(String vmUuid,
			Map<Param, Object> params, User caller, Account account,
			DeploymentPlan planToDeploy) throws InsufficientCapacityException,
			ResourceUnavailableException, ConcurrentOperationException,
			OperationTimedoutException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public boolean advanceStop(String vmUuid, boolean forced,
			User caller, Account account) throws ResourceUnavailableException,
			OperationTimedoutException, ConcurrentOperationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public boolean advanceExpunge(String vmUuid, User caller,
			Account account) throws ResourceUnavailableException,
			OperationTimedoutException, ConcurrentOperationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public boolean destroy(String vmUuid, User caller,
			Account account) throws AgentUnavailableException,
			OperationTimedoutException, ConcurrentOperationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean migrateAway(Type type, long vmid, long hostId)
			throws InsufficientServerCapacityException,
			VirtualMachineMigrationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public VirtualMachine migrate(String vmUuid, long srcHostId,
			DeployDestination dest) throws ResourceUnavailableException,
			ConcurrentOperationException, ManagementServerException,
			VirtualMachineMigrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public boolean reboot(String vmUuid,
            User caller, Account account) {
		// TODO Auto-generated method stub
        return false;
	}

	@Override
    public boolean advanceReboot(String vmUuid, User caller, Account account)
			throws InsufficientCapacityException, ResourceUnavailableException,
			ConcurrentOperationException, OperationTimedoutException {
		// TODO Auto-generated method stub
        return false;
	}

	@Override
    public VirtualMachine storageMigration(String vmUuid,
			StoragePool storagePoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkIfCanUpgrade(VirtualMachine vmInstance,
			long newServiceOfferingId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean upgradeVmDb(long vmId, long serviceOfferingId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NicProfile addVmToNetwork(VirtualMachine vm, Network network,
			NicProfile requested) throws ConcurrentOperationException,
			ResourceUnavailableException, InsufficientCapacityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeNicFromVm(VirtualMachine vm, NicVO nic)
			throws ConcurrentOperationException, ResourceUnavailableException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVmFromNetwork(VirtualMachine vm, Network network,
			URI broadcastUri) throws ConcurrentOperationException,
			ResourceUnavailableException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NicTO toNicTO(NicProfile nic, HypervisorType hypervisorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VirtualMachineTO toVmTO(
			VirtualMachineProfile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VMInstanceVO reConfigureVm(VirtualMachine vm,
			ServiceOffering newServiceOffering, boolean sameHost)
			throws ResourceUnavailableException, ConcurrentOperationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VirtualMachine findHostAndMigrate(String vmUUid,
			Long newSvcOfferingId) throws InsufficientCapacityException,
			ConcurrentOperationException, ResourceUnavailableException,
			VirtualMachineMigrationException, ManagementServerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VirtualMachine migrateForScale(String vmUuid, long srcHostId,
			DeployDestination dest, Long newSvcOfferingId)
			throws ResourceUnavailableException, ConcurrentOperationException,
			ManagementServerException, VirtualMachineMigrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public VirtualMachine processVmStartWork(String vmUuid, Map<VirtualMachineProfile.Param, Object> params, User caller, Account account, DeploymentPlan planToDeploy)
            throws InsufficientCapacityException, ConcurrentOperationException, ResourceUnavailableException {
    	
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
		}
    	
        return null;
    }

	int wakeupCount = 0;
	public void processVmStartWakeup() {
		s_logger.info("processVmStartWakeup. job-" + AsyncJobExecutionContext.getCurrentExecutionContext().getJob().getId());
		
		if(wakeupCount++ < 3) {
			AsyncJobExecutionContext.getCurrentExecutionContext().resetSyncSource();
		} else {
			AsyncJobExecutionContext.getCurrentExecutionContext().completeAsyncJob(AsyncJobConstants.STATUS_SUCCEEDED, 0, null);
		}
	}
	
	@Override
    public boolean processVmStopWork(String vmUuid, boolean forced, User user, Account account)
        throws AgentUnavailableException, OperationTimedoutException, ConcurrentOperationException {
    	return true;
    }

    @Override
    public VirtualMachine migrateWithStorage(String vmUuid, long srcId, long destId, Map<VolumeVO, StoragePoolVO> volumeToPool) throws ResourceUnavailableException,
            ConcurrentOperationException, ManagementServerException, VirtualMachineMigrationException {
        // TODO Auto-generated method stub
        return null;
    }
}