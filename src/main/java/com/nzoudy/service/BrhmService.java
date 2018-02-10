package com.nzoudy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzoudy.InvalidInputException;
import com.nzoudy.entities.Contract;
import com.nzoudy.entities.Identity;
import com.nzoudy.entities.Profile;
import com.nzoudy.entities.Role;
import com.nzoudy.repository.ContractRepository;
import com.nzoudy.repository.IdentityRepository;
import com.nzoudy.repository.ProfileRepository;
import com.nzoudy.repository.RoleRepository;
import com.nzoudy.service.model.ContractWS;
import com.nzoudy.service.model.IdentityWS;
import com.nzoudy.service.model.ProfileWS;
import com.nzoudy.service.model.RoleWS;

@Service
public class BrhmService {

	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private IdentityRepository identityRepository;
	
	@Autowired private ContractRepository contractRepository;

	public List<ProfileWS> getProfiles(String nameRole) throws InvalidInputException {
		ProfileWS profileWS = new ProfileWS();
		List<ProfileWS> profilesWS = new ArrayList<>();
		
		List<Profile> profiles = new ArrayList<>();
		
		Role role = null;
		// comment faire pour savoir si le role n'existe pas . Query en base
		if("P_EGIDE_ADMINISTRER_DES_ROLES".equals(nameRole)){
			role = roleRepository.findOne(nameRole);
			if(role.getProfiles().size() > 0){
				for (Profile profile : role.getProfiles()) {
					if (profile != null) {
						profiles.add(profileRepository.findOne(profile.getNameProfile()));
					}
				}
			}
			
			for (Profile profile : profiles) {
				if(profile != null){
					profileWS.setNameProfile(profile.getNameProfile());
					profilesWS.add(profileWS);
				}
			}
		}else{
			throw new InvalidInputException("Le rôle indiqué n'existe pas", nameRole + " n'est pas un rôle valide"); // le role n'est pas dans le scope du demandeur
		}
		
		
		return profilesWS;
	}

	public IdentityWS getIdentity(String nni) {
		Identity identityFromDB = identityRepository.findOne(nni);
		
		IdentityWS identityWS = new IdentityWS();
		ContractWS contractWS = new ContractWS();
		RoleWS roleWS = new RoleWS();
		
		identityWS.setNni(identityFromDB.getNni());
		identityWS.setFirstname(identityFromDB.getFirstname());
		identityWS.setLastname(identityFromDB.getLastname());
		identityWS.setSex(identityFromDB.getSex());
		identityWS.setE("E");
		
		List<ContractWS> contractsWS = new ArrayList<>();
		if(identityFromDB.getAgentEDF()==0 && identityFromDB.getContracts()==null){
			identityFromDB.setContracts(contractRepository.findAll());
			
			for (Contract contract : identityFromDB.getContracts()) {
				if(contract != null){
					contractWS.setIdContract(contract.getIdContract());
					contractWS.setCompany(contract.getCompany());
					contractWS.setEndDate(contract.getEndDate());
					contractWS.setNniReferent(contract.getNniReferent());
					contractWS.setStartDate(contract.getStartDate());
					contractWS.setOrganization(contract.getOrganization());
					contractsWS.add(contractWS);
				}
			}
		}
		
		List<RoleWS> rolesWS = new ArrayList<>();
		for (Role role : identityFromDB.getRoles()) {
			if(role != null){
				roleWS.setEndDate(role.getEndDate());
				roleWS.setNameRole(role.getNameRole());
				roleWS.setStartDate(role.getStartDate());
				rolesWS.add(roleWS);
			}
		}
		
		identityWS.setContractWS(contractsWS);
		identityWS.setRoleWS(rolesWS);
		
		return identityWS;
	
	}

	public Identity saveIdentity(IdentityWS idt) {
		Identity identityOncoming = new Identity();

		// agent
		if (idt.getAgentEDF() == 1) {
			
		}
		// extern
		if (idt.getAgentEDF() == 0) {

		}

		return identityOncoming;
	}

}
