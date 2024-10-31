package sales;

//@@author sarahchow03

import java.util.Objects;

import static constants.PrintFormat.DATA_NOT_AVAILABLE;

/**
 * The Sale class represents a sales data for a manga, including the quantity sold, the unit price, and the total
 * revenue generated.
 */
public class Sale {
    private Integer quantitySold;
    private Double unitPrice;

    public Sale() {
        quantitySold = null;
        unitPrice = null;
    }

    /**
     * Constructs a new Sale object with the specified quantity sold and unit price. The total revenue is automatically
     * calculated upon creation.
     *
     * @param quantitySold the number of mangas sold
     * @param unitPrice    the price per manga sold
     */
    public Sale(Integer quantitySold, Double unitPrice) {
        this.quantitySold = quantitySold;
        this.unitPrice = unitPrice;
    }

    public Integer getQuantitySold() {
        return quantitySold;
    }

    //@@author xenthm
    public String getQuantitySoldAsString() {
        return quantitySold != null
                ? String.valueOf(quantitySold)
                : DATA_NOT_AVAILABLE;
    }

    //@@author sarahchow03
    public void setQuantitySold(Integer quantitySold) {
        this.quantitySold = quantitySold;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    //@@author xenthm
    public String getUnitPriceAsString() {
        return unitPrice != null
                ? String.format("%.2f", unitPrice)
                : DATA_NOT_AVAILABLE;
    }

    //@@author sarahchow03
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Calculates the total revenue generated by the manga by multiplying the quantity of copies sold by its unit price
     * per copy.
     *
     * @return the total revenue as a double value
     */
    public Double getTotalRevenue() {
        if (quantitySold == null || unitPrice == null) {
            return null;
        }
        return quantitySold * unitPrice;
    }

    //@@author xenthm
    public String getTotalRevenueAsString() {
        return getTotalRevenue() != null
                ? String.format("%.2f", getTotalRevenue())
                : DATA_NOT_AVAILABLE;
    }

    //@@author sarahchow03
    /**
     * Returns a string representation of the Sale object, showing the number of copies sold, unit price, and total
     * revenue.
     *
     * @return a string describing the sale
     */
    @Override
    public String toString() {
        return "[Copies sold: " + getQuantitySoldAsString() + ", Unit price: $" + getUnitPriceAsString()
                + ", Revenue: $" + getTotalRevenueAsString() + "]";
    }

    //@@author xenthm
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sale sale = (Sale) o;
        return Objects.equals(sale.quantitySold,quantitySold) && Objects.equals(sale.unitPrice,unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantitySold, unitPrice);
    }
}
