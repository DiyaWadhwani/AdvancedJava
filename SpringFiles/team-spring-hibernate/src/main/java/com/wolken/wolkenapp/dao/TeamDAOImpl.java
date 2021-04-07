package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamDAOImpl implements TeamDAO {
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	public int addTeam(TeamDTO teamDTO) {
		
		int rows = 0;
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from TeamDTO dto");
		rows = query.executeUpdate();
		
//		session.save(teamDTO);
		transaction.commit();
		session.close();
		
		return rows;
		
	}
	
	public List<TeamDTO> displayTeams() {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from TeamDTO");
		List<TeamDTO> teamsList = query.list();
		
		session.close();
		
		return teamsList;
		
	}
	
	public int updateByID(TeamDTO teamDTO) {
		
		int rows = 0;
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update TeamDTO dto set dto.teamName =: name, dto.teamSport =: sport, dto.teamPlayersNum =: players where dto.teamID =: id");
		query.setParameter("name", teamDTO.getTeamName());
		query.setParameter("sport", teamDTO.getTeamSport());
		query.setParameter("players", teamDTO.getTeamPlayers());
		query.setParameter("id", teamDTO.getTeamID());
		
		rows = query.executeUpdate();
		
		transaction.commit();
		
		session.close();
		
		return rows;
	}
	
	public int updateByName(String teamName, String teamSport, int teamPlayers) {
		
		int rows = 0;
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update TeamDTO dto set dto.teamSport =: sport, dto.teamPlayers =: players where dto.teamName =: name");
		query.setParameter("sport", teamSport);
		query.setParameter("players", teamPlayers);
		query.setParameter("name", teamName);
		
		rows = query.executeUpdate();
		
		transaction.commit();
		
		session.close();
		
		return rows;
	}
	
	public int deleteByID(int teamID) {
		
		int rows = 0;
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from TeamDTO dto where dto.teamID =: id");
		query.setParameter("id", teamID);
		
		rows = query.executeUpdate();
		
		transaction.commit();
		session.close();
		
		return rows;
	}
	
	public int deleteByName(String teamName) {
		
		int rows = 0;
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from TeamDTO dto where dto.teamName =: name");
		query.setParameter("name", teamName);
		
		rows = query.executeUpdate();
		
		transaction.commit();
		session.close();
		
		return rows;
	}
}
