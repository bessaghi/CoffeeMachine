package fr.arolla.orders.service;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.arolla.orders.util.Drinks;
import fr.arolla.orders.util.Order;

public class OrdersSenderTest {
	
	@Test
	public void testSendOrder() {
		// case enough money inserted
		Order orderTeaSugar = new Order(Drinks.TEA, "1", 0.4);
		assertEquals("T:1:0", OrdersSender.sendOrder(orderTeaSugar));
		
		Order orderChocolateNoSugar = new Order(Drinks.CHOCOLATE, "0", 0.5);
		assertEquals("H::", OrdersSender.sendOrder(orderChocolateNoSugar));
		
		Order orderCoffeeSugar = new Order(Drinks.COFFEE, "2", 0.6);
		assertEquals("C:2:0", OrdersSender.sendOrder(orderCoffeeSugar));
		
		Order orderJuice = new Order(Drinks.ORANGE_JUICE, "0", 0.6);
		assertEquals("O::", OrdersSender.sendOrder(orderJuice));
		
		Order orderHotCoffee = new Order(Drinks.HOT_COFFEE, "0", 0.6);
		assertEquals("Ch::", OrdersSender.sendOrder(orderHotCoffee));
		
		assertEquals("M:Preparation in progress..", OrdersSender.forwardMessage("Preparation in progress.."));
		
		// case not enough money inserted
		Order orderCoffeeSugarMoneyMissing = new Order(Drinks.COFFEE, "2", 0.3);
		assertEquals("M:Credit not sufficient, please add 0.3 to complete your order.", OrdersSender.sendOrder(orderCoffeeSugarMoneyMissing));
		
		// case more money inserted
		Order orderCoffeeSugarMoreMoney = new Order(Drinks.COFFEE, "2", 0.7);
		assertEquals("C:2:0", OrdersSender.sendOrder(orderCoffeeSugarMoreMoney));
	}
	
	@Test
	public void testCheckAmountInserted() {
		Order orderTeaRightPrice = new Order(Drinks.TEA, "0", 0.4);
		assertEquals(0, OrdersSender.checkAmountInserted(orderTeaRightPrice), 0);
	}
}
