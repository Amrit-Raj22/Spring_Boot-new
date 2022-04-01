package com.worker.springbootjdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.worker.springbootjdbc.model.Worker;

public interface WorkerDao {
	public int add(Worker worker)
            throws SQLException;

    public int delete(int workerId)
            throws SQLException;

    public Worker getWorker(int workerId)
            throws SQLException;

    public List<Worker> getWorkers()
            throws SQLException;

    public int update(Worker emp)
            throws SQLException;
}
