package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.custom.EmptyException;
import com.wolken.wolkenapp.custom.IDException;
import com.wolken.wolkenapp.custom.PlayersException;
import com.wolken.wolkenapp.custom.StringException;
import com.wolken.wolkenapp.dao.TeamDAO;
import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamDAO teamDAO;

	Logger logger = Logger.getLogger(TeamDTO.class);

	public int validateAndAdd(TeamDTO teamDTO) {

		int rows = 0;

		try {
			if (teamDTO != null) {

				if (teamDTO.getTeamID() < 0) {
					throw new IDException();
				}

				if (teamDTO.getTeamName().length() <= 1 || teamDTO.getTeamSport().length() <= 1) {
					throw new StringException();
				}

				if (teamDTO.getTeamPlayers() <= 1) {
					throw new PlayersException();
				}

				else {
					rows = teamDAO.addTeam(teamDTO);

					if (rows > 0) {
						logger.info("Registration completed");
					} else {
						logger.warn("Registration failed");
					}
				}

			} else {
				rows = 0;
				logger.warn("Object Passed is Null");
			}
		} catch (IDException | StringException | PlayersException e) {
			rows = 0;
			logger.info(e.toString());
			logger.error("Team not registered");
		}

		return rows;
	}

	public List<TeamDTO> validateAndDisplay() {

		List<TeamDTO> teamsList = teamDAO.displayTeams();

		try {
			if (teamsList.isEmpty()) {
				throw new EmptyException();
			}
		} catch (EmptyException e) {
			logger.info(e.toString());
			logger.error("No teams have been registered");
			teamsList = null;
		}
		return teamsList;
	}

	public int validateAndUpdateByID(TeamDTO teamDTO) {

		int rows = 0;

		try {
			if (teamDTO != null) {

				if (teamDTO.getTeamID() < 0) {
					throw new IDException();
				}

				if (teamDTO.getTeamName().length() <= 1 || teamDTO.getTeamSport().length() <= 1) {
					throw new StringException();
				}

				if (teamDTO.getTeamPlayers() < 1) {
					throw new PlayersException();
				}

				else {
					rows = teamDAO.updateByID(teamDTO);

					if (rows > 0) {
						logger.info("Updated "+rows+" row(s)");
					} else {
						logger.warn("Update failed");
					}
				}
			} else {
				rows = 0;
				logger.warn("Object Passed is Null");
			}
		} catch (IDException | StringException | PlayersException e) {
			rows = 0;
			logger.info(e.toString());
			logger.error("Update failed");
		}

		return rows;
	}

	public int validateAndUpdateByName(String teamName, String teamSport, int teamPlayers) {

		int rows = 0;

		try {
			if (teamName.length() <= 1 || teamSport.length() <= 1) {
				throw new StringException();
			}
			if (teamPlayers <= 1) {
				throw new PlayersException();
			} else {
				rows = teamDAO.updateByName(teamName, teamSport, teamPlayers);

				if (rows > 0) {
					logger.info("Updated "+rows+" row(s)");
				} else {
					logger.warn("Update failed");
				}
			}
		} catch (StringException | PlayersException e) {
			rows = 0;
			logger.info(e.toString());
			logger.error("Update failed");
		}

		return rows;
	}

	public int validateAndDeleteByID(int teamID) {

		int rows = 0;

		try {
			if (teamID < 0) {
				throw new IDException();
			} else {
				rows = teamDAO.deleteByID(teamID);

				if (rows > 0) {
					logger.info("Deleted " + rows + " row(s)");
				} else {
					logger.warn("Could not perform delete");
				}
			}
		} catch (IDException e) {
			rows = 0;
			logger.info(e.toString());
			logger.warn("Delete failed");
		}

		return rows;
	}

	public int validateAndDeleteByName(String teamName) {

		int rows = 0;

		try {
			if (teamName.length() <= 1) {
				throw new StringException();
			} else {
				rows = teamDAO.deleteByName(teamName);

				if (rows > 0) {
					logger.info("Deleted " + rows + " row(s)");
				} else {
					logger.warn("Could not perform delete");
				}
			}
		} catch (StringException e) {
			rows = 0;
			logger.info(e.toString());
			logger.warn("Delete failed");
		}

		return rows;
	}
}