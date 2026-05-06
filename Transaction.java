// Class named Transaction to transfer amount in different ways using Account Number, 
// Phone Number and QR Code as parameter into a method transferAmount() to achieve Method Overloading
class Transaction {

    void transferAmount(int accNo, double amount) {
        System.out.println("Transferred Rs." + amount +
                           " to Account No: " + accNo);
    }

    void transferAmount(long phoneNo, double amount) {
        System.out.println("Transferred Rs." + amount +
                           " to Phone No: " + phoneNo);
    }

    void transferAmount(String qrCode, double amount) {
        System.out.println("Transferred Rs." + amount +
                           " using QR Code: " + qrCode);
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.transferAmount(12345, 5000);
        t.transferAmount(9876543210L, 2500);
        t.transferAmount("QR123", 1000);
    }
}
