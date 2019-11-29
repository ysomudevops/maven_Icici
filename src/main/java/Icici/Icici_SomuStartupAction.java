package Icici;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;

/**
 * @author somu
 */
public class Icici_SomuStartupAction extends SimpleAction {

	@Override
	public void run(String[] lifecycleEventIds) throws ActionException {
		for (String eventId : lifecycleEventIds) {
			System.out.println("Startup event ID " + eventId);
		}
	}

}