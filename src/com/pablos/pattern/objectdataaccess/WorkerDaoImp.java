package com.pablos.pattern.objectdataaccess;

import java.util.ArrayList;

public class WorkerDaoImp implements WorkerDAO {
	ArrayList<Worker> workers;

	public WorkerDaoImp() {
		workers = new ArrayList<Worker>();
		Worker worker1 = new Worker("Pawel", 0);
		Worker worker2 = new Worker("John", 1);
		workers.add(worker1);
		workers.add(worker2);
	}

	@Override
	public ArrayList<Worker> getAllWorkers() {
		return workers;
	}

	@Override
	public Worker getWorker(int rollNo) {
		return workers.get(rollNo);
	}

	@Override
	public void updateWorker(Worker worker) {
		workers.get(worker.getRollNo()).setName(worker.getName());
		System.out.println("Student: Roll No " + worker.getRollNo() + ", update in database!");

	}

	@Override
	public void deleteWorker(Worker worker) {
		workers.remove(worker.getRollNo());
		System.out.println("Student: Roll No " + worker.getRollNo() + ", delete from database!");
	}

}
