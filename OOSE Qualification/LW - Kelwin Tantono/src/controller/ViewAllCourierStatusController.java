package controller;

import repository.ToboyDatabase;

public class ViewAllCourierStatusController {

	public ViewAllCourierStatusController() {
		for(int i=0; i<ToboyDatabase.courier.size(); i++){
			System.out.println(ToboyDatabase.courier.get(i).getName()+" : "+ToboyDatabase.courier.get(i).getStatus());
		}
	}

}
