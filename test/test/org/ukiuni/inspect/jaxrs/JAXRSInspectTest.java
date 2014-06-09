package test.org.ukiuni.inspect.jaxrs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.ukiuni.inspect.jaxrs.IndexAction;

public class JAXRSInspectTest {

	@Test
	public void test() {
		IndexAction indexAction = new IndexAction();
		assertEquals(3, indexAction.loadList().size());
	}

}
