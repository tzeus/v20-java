package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.OrderCancelReason;
import com.google.gson.annotations.SerializedName;

/**
 * An OrderCancelTransaction represents the cancellation of an Order in the
 * client's Account.
 * <p>
 * Cancel Order {orderID}
 */
public class OrderCancelTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionID
     */
    public OrderCancelTransaction setId(String id) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see DateTime
     */
    public OrderCancelTransaction setTime(String time) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     */
    public OrderCancelTransaction setUserID(int userID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see AccountID
     */
    public OrderCancelTransaction setAccountID(String accountID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionID
     */
    public OrderCancelTransaction setBatchID(String batchID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see RequestID
     */
    public OrderCancelTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.ORDER_CANCEL;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "ORDER_CANCEL" for an
     * OrderCancelTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Set the Cancelled Order ID
     * <p>
     * The ID of the Order cancelled
     * <p>
     * @param orderID the Cancelled Order ID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    /**
     * Get the Cancelled Order ID
     * <p>
     * The ID of the Order cancelled
     * <p>
     * @return the Cancelled Order ID
     * @see OrderID
     */
    public String getOrderID() {
        return this.orderID.getOrderID();
    }

    @SerializedName("clientOrderID") private OrderID clientOrderID;

    /**
     * Set the Cancelled Client Order ID
     * <p>
     * The client ID of the Order cancelled (only provided if the Order has a
     * client Order ID).
     * <p>
     * @param clientOrderID the Cancelled Client Order ID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new OrderID(clientOrderID);
        return this;
    }

    /**
     * Get the Cancelled Client Order ID
     * <p>
     * The client ID of the Order cancelled (only provided if the Order has a
     * client Order ID).
     * <p>
     * @return the Cancelled Client Order ID
     * @see OrderID
     */
    public String getClientOrderID() {
        return this.clientOrderID.getOrderID();
    }

    @SerializedName("reason") private OrderCancelReason reason;

    /**
     * Set the Cancel Reason
     * <p>
     * The reason that the Order was cancelled.
     * <p>
     * @param reason the Cancel Reason
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderCancelReason
     */
    public OrderCancelTransaction setReason(OrderCancelReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the Cancel Reason
     * <p>
     * The reason that the Order was cancelled.
     * <p>
     * @return the Cancel Reason
     * @see OrderCancelReason
     */
    public OrderCancelReason getReason() {
        return this.reason;
    }

    @SerializedName("replacedByOrderID") private OrderID replacedByOrderID;

    /**
     * Set the Replaced By Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled for replacement).
     * <p>
     * @param replacedByOrderID the Replaced By Order ID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    /**
     * Get the Replaced By Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled for replacement).
     * <p>
     * @return the Replaced By Order ID
     * @see OrderID
     */
    public String getReplacedByOrderID() {
        return this.replacedByOrderID.getOrderID();
    }
}
