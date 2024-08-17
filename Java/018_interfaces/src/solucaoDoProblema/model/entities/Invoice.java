package solucaoDoProblema.model.entities;

public class Invoice {
    private final double basicPayment;
    private final double tax;

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public double getTotalPayment() {
        return this.getBasicPayment() + this.getTax();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FATURA:").append("\n");
        sb.append("Pagamento básico: ").append(this.getBasicPayment()).append("\n");
        sb.append("Imposto: ").append(this.getTax()).append("\n");
        sb.append("Pagamento total: ").append(this.getTotalPayment());

        return sb.toString();
    }


}
