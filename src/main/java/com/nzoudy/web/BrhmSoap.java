package com.nzoudy.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nzoudy.InvalidInputException;
import com.nzoudy.service.BrhmService;
import com.nzoudy.service.model.IdentityWS;
import com.nzoudy.service.model.ProfileWS;

@WebService
@Component
public class BrhmSoap {

	@Autowired
	private BrhmService service;
	
	@WebMethod(operationName="ListerProfils")
	public List<ProfileWS> getProfilesFromOneRole(@WebParam(name="NomRole") String nameRole) throws InvalidInputException{
		return service.getProfiles(nameRole);
	}

	@WebMethod(operationName="GetIdentity")
	@WebResult(name="Identite")
	public IdentityWS getIdentity(@WebParam(name="nni") String nni) {
		return service.getIdentity(nni);
	}

}
