package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketIfTouchedOrderRejectTransaction represents the rejection of the
* creation of a MarketIfTouched Order.
*/

public class MarketIfTouchedOrderRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public MarketIfTouchedOrderRejectTransaction set_id(String __id) { 
        this._id = new TransactionID(__id); 
        return this;
    }
    /**
    * The Transaction's Identifier.
    */

    public String get_id() {
        return this._id.get_TransactionID();
    }

    @SerializedName("time") private DateTime _time;
    public MarketIfTouchedOrderRejectTransaction set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Transaction was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("userID") private Integer _userID;
    public MarketIfTouchedOrderRejectTransaction set_userID(int __userID) {
        this._userID = __userID;
        return this;
    }
    /**
    * The ID of the user that initiated the creation of the Transaction.
    */

    public int get_userID() {
        return this._userID;
    }

    @SerializedName("accountID") private AccountID _accountID;
    public MarketIfTouchedOrderRejectTransaction set_accountID(String __accountID) { 
        this._accountID = new AccountID(__accountID); 
        return this;
    }
    /**
    * The ID of the Account the Transaction was created for.
    */

    public String get_accountID() {
        return this._accountID.get_AccountID();
    }

    @SerializedName("batchID") private TransactionID _batchID;
    public MarketIfTouchedOrderRejectTransaction set_batchID(String __batchID) { 
        this._batchID = new TransactionID(__batchID); 
        return this;
    }
    /**
    * The ID of the "batch" that the Transaction belongs to. Transactions in
    * the same batch are applied to the Account simultaneously.
    */

    public String get_batchID() {
        return this._batchID.get_TransactionID();
    }

    @SerializedName("requestID") private RequestID _requestID;
    public MarketIfTouchedOrderRejectTransaction set_requestID(String __requestID) { 
        this._requestID = new RequestID(__requestID); 
        return this;
    }
    /**
    * The Request ID of the Account Control Request which generated the
    * transaction (only provided for Transactions created by a Client request)
    */

    public String get_requestID() {
        return this._requestID.get_RequestID();
    }

    @SerializedName("type") private TransactionType _type = TransactionType.MARKET_IF_TOUCHED_ORDER_REJECT;
    /**
    * The Type of the Transaction. Always set to
    * "MARKET_IF_TOUCHED_ORDER_REJECT" in a
    * MarketIfTouchedOrderRejectTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public MarketIfTouchedOrderRejectTransaction set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The MarketIfTouched Order's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public MarketIfTouchedOrderRejectTransaction set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The quantity requested to be filled by the MarketIfTouched Order. A
    * posititive number of units results in a long Order, and a negative number
    * of units results in a short Order.
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public MarketIfTouchedOrderRejectTransaction set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price threshold specified for the MarketIfTouched Order. The
    * MarketIfTouched Order will only be filled by a market price that crosses
    * this price from the direction of the market price at the time when the
    * Order was created (the initialMarketPrice). Depending on the value of the
    * Order's price and initialMarketPrice, the MarketIfTouchedOrder will
    * behave like a Limit or a Stop Order.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("priceBound") private PriceValue _priceBound;
    // Numeric stored as String
    public MarketIfTouchedOrderRejectTransaction set_priceBound(double __priceBound) { 
        this._priceBound = new PriceValue(__priceBound); 
        return this;
    }
    /**
    * The worst market price that may be used to fill this MarketIfTouched
    * Order.
    */

    public double get_priceBound() {
        return this._priceBound.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public MarketIfTouchedOrderRejectTransaction set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the MarketIfTouched Order. Restricted to
    * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public MarketIfTouchedOrderRejectTransaction set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date/time when the MarketIfTouched Order will be cancelled if its
    * timeInForce is "GTD".
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("positionFill") private OrderPositionFill _positionFill = OrderPositionFill.DEFAULT;
    public MarketIfTouchedOrderRejectTransaction set_positionFill(OrderPositionFill __positionFill) { 
        this._positionFill = __positionFill;
        return this;
    }
    /**
    * Specification of how Positions in the Account are modified when the Order
    * is filled.
    */

    public OrderPositionFill get_positionFill() {
        return this._positionFill;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition _triggerCondition = OrderTriggerCondition.DEFAULT;
    public MarketIfTouchedOrderRejectTransaction set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
        this._triggerCondition = __triggerCondition;
        return this;
    }
    /**
    * Specification of what component of a price should be used for comparison
    * when determining if the Order should be filled.
    */

    public OrderTriggerCondition get_triggerCondition() {
        return this._triggerCondition;
    }

    @SerializedName("reason") private MarketIfTouchedOrderReason _reason;
    public MarketIfTouchedOrderRejectTransaction set_reason(MarketIfTouchedOrderReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that the Market-if-touched Order was initiated
    */

    public MarketIfTouchedOrderReason get_reason() {
        return this._reason;
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public MarketIfTouchedOrderRejectTransaction set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * Client Extensions to add to the Order (only provided if the Order is
    * being created with client extensions).
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails _takeProfitOnFill;
    public MarketIfTouchedOrderRejectTransaction set_takeProfitOnFill(TakeProfitDetails __takeProfitOnFill) { 
        this._takeProfitOnFill = __takeProfitOnFill;
        return this;
    }
    /**
    * The specification of the Take Profit Order that should be created for a
    * Trade opened when the Order is filled (if such a Trade is created).
    */

    public TakeProfitDetails get_takeProfitOnFill() {
        return this._takeProfitOnFill;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails _stopLossOnFill;
    public MarketIfTouchedOrderRejectTransaction set_stopLossOnFill(StopLossDetails __stopLossOnFill) { 
        this._stopLossOnFill = __stopLossOnFill;
        return this;
    }
    /**
    * The specification of the Stop Loss Order that should be created for a
    * Trade opened when the Order is filled (if such a Trade is created).
    */

    public StopLossDetails get_stopLossOnFill() {
        return this._stopLossOnFill;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails _trailingStopLossOnFill;
    public MarketIfTouchedOrderRejectTransaction set_trailingStopLossOnFill(TrailingStopLossDetails __trailingStopLossOnFill) { 
        this._trailingStopLossOnFill = __trailingStopLossOnFill;
        return this;
    }
    /**
    * The specification of the Trailing Stop Loss Order that should be created
    * for a Trade that is opened when the Order is filled (if such a Trade is
    * created).
    */

    public TrailingStopLossDetails get_trailingStopLossOnFill() {
        return this._trailingStopLossOnFill;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions _tradeClientExtensions;
    public MarketIfTouchedOrderRejectTransaction set_tradeClientExtensions(ClientExtensions __tradeClientExtensions) { 
        this._tradeClientExtensions = __tradeClientExtensions;
        return this;
    }
    /**
    * Client Extensions to add to the Trade created when the Order is filled
    * (if such a Trade is created).  Do not set, modify, delete
    * tradeClientExtensions if your account is associated with MT4.
    */

    public ClientExtensions get_tradeClientExtensions() {
        return this._tradeClientExtensions;
    }

    @SerializedName("intendedReplacesOrderID") private OrderID _intendedReplacesOrderID;
    public MarketIfTouchedOrderRejectTransaction set_intendedReplacesOrderID(String __intendedReplacesOrderID) { 
        this._intendedReplacesOrderID = new OrderID(__intendedReplacesOrderID); 
        return this;
    }
    /**
    * The ID of the Order that this Order was intended to replace (only
    * provided if this Order was intended to replace an existing Order).
    */

    public String get_intendedReplacesOrderID() {
        return this._intendedReplacesOrderID.get_OrderID();
    }

    @SerializedName("rejectReason") private TransactionRejectReason _rejectReason;
    public MarketIfTouchedOrderRejectTransaction set_rejectReason(TransactionRejectReason __rejectReason) { 
        this._rejectReason = __rejectReason;
        return this;
    }
    /**
    * The reason that the Reject Transaction was created
    */

    public TransactionRejectReason get_rejectReason() {
        return this._rejectReason;
    }
}
