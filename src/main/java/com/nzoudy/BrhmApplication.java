package com.nzoudy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nzoudy.entities.Contract;
import com.nzoudy.entities.Identity;
import com.nzoudy.entities.Organization;
import com.nzoudy.entities.Perimeter;
import com.nzoudy.entities.Profile;
import com.nzoudy.entities.Role;
import com.nzoudy.repository.ContractRepository;
import com.nzoudy.repository.IdentityRepository;
import com.nzoudy.repository.OrganizationRepository;
import com.nzoudy.repository.PerimeterRepository;
import com.nzoudy.repository.ProfileRepository;
import com.nzoudy.repository.RoleRepository;

@SpringBootApplication
public class BrhmApplication implements CommandLineRunner {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Autowired
	private ContractRepository contractRepository;
	
	@Autowired
	private PerimeterRepository perimeterRepository;
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private IdentityRepository identityRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BrhmApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Organization orga1 = new Organization("path1/orga1/F0001");
		Organization orga2 = new Organization("path2/orga2/F0002");
		organizationRepository.save(orga1); organizationRepository.save(orga2);
		
		
		Identity agent1 = new Identity("ouinni", "urbain", "nzouda", "Masculin", sdf.parse("12/06/1981"), "99", "nzoudy@yahoo.fr", 1);
		Identity agent2 = new Identity("nonnni", "paule", "nzeueneu", "Feminin", sdf.parse("07/11/1984"), "99", "nzeueneu@yahoo.fr", 1);
		Identity externe1 = new Identity("extnni", "garvin", "lonlack", "Masculin", sdf.parse("22/03/1981"), "99", "lonlack@yahoo.fr", 0);
		
		Contract c1 = new Contract("idContract009", sdf.parse("12/02/2018"), sdf.parse("12/02/2019"), "dotwiz", agent1.getNni(), orga1);
		contractRepository.save(c1);

		Perimeter p1 = new Perimeter("PERIMETER_P01");
		Perimeter p2 = new Perimeter("PERIMETER_P02");
		List<Perimeter> perimeters = new ArrayList<>();
		perimeters.add(p1); perimeters.add(p2);
		perimeterRepository.save(p1); perimeterRepository.save(p2);
		
		Profile pro1 = new Profile("P_APPLI1_NOM1", "shortDescription_1", "longDescription_1");
		Profile pro2 = new Profile("P_APPLI2_NOM2", "shortDescription_2", "longDescription_2");
		List<Profile> profiles = new ArrayList<>();
		profiles.add(pro1); profiles.add(pro2);
		profileRepository.save(pro1); profileRepository.save(pro2);
		
		List<Role> roles = new ArrayList<>();
		Role role = new Role("P_EGIDE_ADMINISTRER_DES_ROLES", new Date(), new Date(), "shortDescription", "longDescription", perimeters, profiles);
		roles.add(role);
		roleRepository.save(role);
		
		agent1.setRoles(roles);
		identityRepository.save(agent1); 
		identityRepository.save(agent2); identityRepository.save(externe1);
		System.out.println("Role name ===> "+ role.getNameRole());
	}
}
