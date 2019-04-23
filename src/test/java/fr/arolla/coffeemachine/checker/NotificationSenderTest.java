package fr.arolla.coffeemachine.checker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import fr.arolla.coffeemachine.interfaces.BeverageQuantityChecker;
import fr.arolla.coffeemachine.interfaces.EmailNotifier;
import fr.arolla.orders.service.NotificationSender;
import fr.arolla.orders.util.Drinks;
import fr.arolla.orders.util.Order;

public class NotificationSenderTest {

	@Test
	public void testSendNotification() {
		BeverageQuantityChecker quantityChecker = Mockito.mock(BeverageQuantityChecker.class);
		EmailNotifier emailNotifier = Mockito.mock(EmailNotifier.class);
		Order orderHotCoffee = new Order(Drinks.HOT_COFFEE, "0", 0.6);

		// if empty...
		Mockito.when(quantityChecker.isEmpty(orderHotCoffee.getDrink().getAcronym())).thenReturn(true);
		NotificationSender notifSender = new NotificationSender(quantityChecker, emailNotifier);
		
		assertEquals("M:The chosen drink is empty.\nM:A notification has been sent.", notifSender.sendNotification(orderHotCoffee));
		
		// if not empty...
		Mockito.when(quantityChecker.isEmpty(orderHotCoffee.getDrink().getAcronym())).thenReturn(false);
		assertEquals("Ch::", notifSender.sendNotification(orderHotCoffee));
	}
}
