package org.howard.edu.lsp.exam.problem52;

//PaymentStrategyDriver class
public class PaymentStrategyDriver {
 public static void main(String[] args) {
     // Test with Credit Card Payment
     CreditCardPayment creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
     ShoppingCart shoppingCart1 = new ShoppingCart();
     shoppingCart1.setPaymentStrategy(creditCardPayment);
     shoppingCart1.checkout(100.0);

     // Test with PayPal Payment
     PayPalPayment payPalPayment = new PayPalPayment("user@example.com");
     ShoppingCart shoppingCart2 = new ShoppingCart();
     shoppingCart2.setPaymentStrategy(payPalPayment);
     shoppingCart2.checkout(50.0);

     // Test with Bitcoin Payment
     BitcoinPayment bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
     ShoppingCart shoppingCart3 = new ShoppingCart();
     shoppingCart3.setPaymentStrategy(bitcoinPayment);
     shoppingCart3.checkout(75.0);
 }
}

