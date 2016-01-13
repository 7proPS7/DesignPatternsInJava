package com.pablos.pattern.objectdataaccess;

import java.util.ArrayList;

public interface WorkerDAO {
	
	public ArrayList<Worker> getAllWorkers();
	public Worker getWorker(int rollNo);
	public void updateWorker(Worker worker);
	public void deleteWorker(Worker worker);

}
