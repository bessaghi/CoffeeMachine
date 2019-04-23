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
		String theDrinkAcronym = orderHotCoffee.getDrink().getAcronym();

		Mockito.when(quantityChecker.isEmpty(theDrinkAcronym)).thenReturn(true);
		NotificationSender notifSender = new NotificationSender(quantityChecker, emailNotifier);
		
		assertEquals("M:A notification has been sent.", notifSender.sendNotification(orderHotCoffee));
	}
}
