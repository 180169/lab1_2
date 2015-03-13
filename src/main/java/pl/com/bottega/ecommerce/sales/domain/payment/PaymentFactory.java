/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 *
 * @author Godzio
 */
public class PaymentFactory {
    public static Payment createPayment(Id aggregateId, ClientData clientData, Money amount){
        return new Payment(aggregateId, clientData, amount);
    }
}
