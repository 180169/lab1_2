/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

/**
 *
 * @author Godzio
 */
public class InvoiceFactory {
    public static Invoice createInvoice( Id invoiceId, ClientData client ){
        return new Invoice(invoiceId, client);
    }
}
