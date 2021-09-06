package app.org.com.rmi.search;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SearchQuery extends UnicastRemoteObject implements Search, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7658137203403074070L;

	SearchQuery() throws RemoteException {
		super();
	}

	// Implementation of the query interface
	@Override
	public String query(String search) throws RemoteException {
		String result;
		if (search.equals("Reflection in Java"))
			result = "Found";
		else
			result = "Not Found";

		return result;
	}

}
