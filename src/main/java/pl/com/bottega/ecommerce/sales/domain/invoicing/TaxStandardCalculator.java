/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;
import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.DRUG;
import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.FOOD;
import static pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType.STANDARD;
import pl.com.bottega.ecommerce.sharedkernel.Money;

/**
 *
 * @author Godzio
 */
public class TaxStandardCalculator implements TaxCalculator {

    public Tax calculateTax(RequestItem item, Money net) {
        BigDecimal ratio = null;
        String desc = null;
        switch (item.getProductData().getType()) {
            case DRUG:
                ratio = BigDecimal.valueOf(0.05);
                desc = "5% (D)";
                break;
            case FOOD:
                ratio = BigDecimal.valueOf(0.07);
                desc = "7% (F)";
                break;
            case STANDARD:
                ratio = BigDecimal.valueOf(0.23);
                desc = "23%";
                break;

            default:
                throw new IllegalArgumentException(item.getProductData().getType() + " not handled");
        }
        Money taxValue = net.multiplyBy(ratio);

        return new Tax(taxValue, desc);
    }

}
