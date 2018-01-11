package com.exos.services;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.exos.entities.Utilisateur;
import com.exos.sessions.IUtilisateurLocal;

@Stateless
@WebService
public class UtilisateurService {
	
	@EJB(beanName="USER")
	private IUtilisateurLocal metier;
	
	@WebMethod
	public void addUser(@WebParam(name="nom")String nom,
			@WebParam(name="email")String email,
			@WebParam(name="pass")String pass)
	{
		Utilisateur user=new Utilisateur();
		user.setNom(nom);
		user.setEmail(email);
		user.setPass(pass);
		user.setPhoto("");
		user.setDateInscription(new Date());
		metier.add(user);
	}
	
	@WebMethod
	public List<Utilisateur> lister()
	{
		return metier.lister();
		
	}
}
