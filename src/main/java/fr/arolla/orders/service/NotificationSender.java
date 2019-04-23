package fr.arolla.orders.service;

import fr.arolla.coffeemachine.interfaces.BeverageQuantityChecker;
import fr.arolla.coffeemachine.interfaces.EmailNotifier;
import fr.arolla.orders.util.Order;

/**
 * A class that handles the notification's dispatch.
 * 
 * @author bessaghi
 *
 */
public class NotificationSender {
	
	private static final String NOTIFICATION_MESSAGE_SENT = "A notification has been sent.";
	private static final String EMPTY_DRINK = "The chosen drink is empty.";

	private BeverageQuantityChecker quantityChecker;
	private EmailNotifier emailNotifier;
	
	public NotificationSender(BeverageQuantityChecker quantityChecker,  EmailNotifier emailNotifier) {
		super();
		this.quantityChecker = quantityChecker;
		this.emailNotifier = emailNotifier;
	}

	/**
	 * Sends the notification if the drink's order is empty, sends the order otherwise.
	 * 
	 * @param order the order.
	 * @return 
	 */
	public String sendNotification(Order order) {
		if (quantityChecker.isEmpty(order.getDrink().getAcronym())) {
			emailNotifier.notifyMissingDrink(order.getDrink().getAcronym());
			return OrdersSender.forwardMessage(EMPTY_DRINK) + "\n" + 
					OrdersSender.forwardMessage(NOTIFICATION_MESSAGE_SENT);
		}
		return OrdersSender.sendOrder(order);
	}
}
