package com.exos.sessions;

import java.util.List;

import javax.ejb.Local;

import com.exos.entities.Utilisateur;



@Local
public interface IUtilisateurLocal {

	List<Utilisateur> lister() throws DAOException;
	Utilisateur trouver(String email, String pass) throws DAOException;
	Utilisateur trouver(String email) throws DAOException;
	void add(Utilisateur utilisateur) throws DAOException;
}
