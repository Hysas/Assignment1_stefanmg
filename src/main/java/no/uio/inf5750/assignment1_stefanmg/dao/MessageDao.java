package no.uio.inf5750.assignment1_stefanmg.dao;

import no.uio.inf5750.assignment1_stefanmg.model.Message;

public interface MessageDao {
	int save(Message message);
	Message get(int id);
	Message getLast();
}