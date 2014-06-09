package org.ukiuni.inspect.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ukiuni.inspect.jaxrs.entity.MyData;

@Path("/")
public class IndexAction {
	@GET
	@Path("/loadMessages")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MyData> loadList() {
		List<MyData> datas = new ArrayList<MyData>();
		datas.add(new MyData(1, "test1"));
		datas.add(new MyData(2, "test2"));
		datas.add(new MyData(3, "test3"));
		return datas;
	}

	@POST
	@Path("/putMessage")
	@Produces(MediaType.APPLICATION_JSON)
	public void put(@FormParam("message") String message) {
		MyData myData = new MyData();
		myData.setMessage(message);
		System.out.println("message = " + message);
		// put Message
	}
}
