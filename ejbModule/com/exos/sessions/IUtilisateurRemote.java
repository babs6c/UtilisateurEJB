package com.exos.sessions;

import java.util.List;

import javax.ejb.Remote;

import com.exos.entities.Utilisateur;



@Remote
public interface IUtilisateurRemote {

	List<Utilisateur> lister() throws DAOException ;
	Utilisateur trouver(String email, String pass) throws DAOException;
	Utilisateur trouver(String email) throws DAOException;
	void add(Utilisateur utilisateur) throws DAOException;
}
