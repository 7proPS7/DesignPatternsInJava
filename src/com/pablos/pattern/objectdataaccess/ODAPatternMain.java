package com.pablos.pattern.objectdataaccess;

public class ODAPatternMain {

	public static void main(String[] args) {
		WorkerDAO workerDAO = new WorkerDaoImp();

		// all workers
		for (Worker worker : workerDAO.getAllWorkers())
			System.out.println("Student: [RollNo : " + worker.getRollNo() + ", Name : " + worker.getName() + " ]");

		// update worker
		Worker worker = workerDAO.getAllWorkers().get(0);
		worker.setName("Mike");
		workerDAO.updateWorker(worker);

		// get the student
		workerDAO.getWorker(0);
		System.out.println("Student: [RollNo : " + worker.getRollNo() + ", Name : " + worker.getName() + " ]");
	}

}
