package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.google.gson.annotations.SerializedName;

/**
 * A CreateTransaction represents the creation of an Account.
 * <p>
 * Create Account {accountID}
 */
public class CreateTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionID
     */
    public CreateTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public String getId() {
        return this.id.getTransactionID();
    }

    @SerializedName("time") private DateTime time;

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time
     * @return {@link CreateTransaction CreateTransaction}
     * @see DateTime
     */
    public CreateTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setUserID(int userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public int getUserID() {
        return this.userID;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID
     * @return {@link CreateTransaction CreateTransaction}
     * @see AccountID
     */
    public CreateTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public String getAccountID() {
        return this.accountID.getAccountID();
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionID
     */
    public CreateTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public String getBatchID() {
        return this.batchID.getTransactionID();
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the Account Control Request which generated the
     * transaction (only provided for Transactions created by a Client request)
     * <p>
     * @param requestID the Request ID
     * @return {@link CreateTransaction CreateTransaction}
     * @see RequestID
     */
    public CreateTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the Account Control Request which generated the
     * transaction (only provided for Transactions created by a Client request)
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public String getRequestID() {
        return this.requestID.getRequestID();
    }

    @SerializedName("type") private TransactionType type = TransactionType.CREATE;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "CREATE" in a
     * CreateTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("divisionID") private Integer divisionID;

    /**
     * Set the Division ID
     * <p>
     * The ID of the Division that the Account is in
     * <p>
     * @param divisionID the Division ID
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setDivisionID(int divisionID) {
        this.divisionID = divisionID;
        return this;
    }

    /**
     * Get the Division ID
     * <p>
     * The ID of the Division that the Account is in
     * <p>
     * @return the Division ID
     */
    public int getDivisionID() {
        return this.divisionID;
    }

    @SerializedName("siteID") private Integer siteID;

    /**
     * Set the Site ID
     * <p>
     * The ID of the Site that the Account was created at
     * <p>
     * @param siteID the Site ID
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setSiteID(int siteID) {
        this.siteID = siteID;
        return this;
    }

    /**
     * Get the Site ID
     * <p>
     * The ID of the Site that the Account was created at
     * <p>
     * @return the Site ID
     */
    public int getSiteID() {
        return this.siteID;
    }

    @SerializedName("accountUserID") private Integer accountUserID;

    /**
     * Set the Account User ID
     * <p>
     * The ID of the user that the Account was created for
     * <p>
     * @param accountUserID the Account User ID
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setAccountUserID(int accountUserID) {
        this.accountUserID = accountUserID;
        return this;
    }

    /**
     * Get the Account User ID
     * <p>
     * The ID of the user that the Account was created for
     * <p>
     * @return the Account User ID
     */
    public int getAccountUserID() {
        return this.accountUserID;
    }

    @SerializedName("accountNumber") private Integer accountNumber;

    /**
     * Set the Account Number
     * <p>
     * The number of the Account within the site/division/user
     * <p>
     * @param accountNumber the Account Number
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Get the Account Number
     * <p>
     * The number of the Account within the site/division/user
     * <p>
     * @return the Account Number
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @SerializedName("homeCurrency") private Currency homeCurrency;

    /**
     * Set the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @param homeCurrency the Home Currency
     * @return {@link CreateTransaction CreateTransaction}
     * @see Currency
     */
    public CreateTransaction setHomeCurrency(String homeCurrency) {
        this.homeCurrency = new Currency(homeCurrency);
        return this;
    }

    /**
     * Get the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @return the Home Currency
     * @see Currency
     */
    public String getHomeCurrency() {
        return this.homeCurrency.getCurrency();
    }
}
