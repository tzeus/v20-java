package com.oanda.v20;

import com.oanda.v20.OrderState;
import com.oanda.v20.OrderType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderPositionFill;
import com.oanda.v20.OrderTriggerCondition;
import com.google.gson.annotations.SerializedName;

/**
 * A MarketIfTouchedOrder is an order that is created with a price threshold,
 * and will only be filled by a market price that is touches or crosses the
 * threshold.
 * <p>
 * {units} units of {instrument} @ {price}
 */
public class MarketIfTouchedOrder implements Order {

    @SerializedName("id") private OrderID id;

    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see OrderID
     */
    public MarketIfTouchedOrder setId(String id) {
        this.id = new OrderID(id);
        return this;
    }

    /**
     * Get the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public String getId() {
        return this.id.getOrderID();
    }

    @SerializedName("createTime") private DateTime createTime;

    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see DateTime
     */
    public MarketIfTouchedOrder setCreateTime(String createTime) {
        this.createTime = new DateTime(createTime);
        return this;
    }

    /**
     * Get the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @return the Create Time
     * @see DateTime
     */
    public String getCreateTime() {
        return this.createTime.getDateTime();
    }

    @SerializedName("state") private OrderState state;

    /**
     * Set the State
     * <p>
     * The current state of the Order.
     * <p>
     * @param state the State
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see OrderState
     */
    public MarketIfTouchedOrder setState(OrderState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the State
     * <p>
     * The current state of the Order.
     * <p>
     * @return the State
     * @see OrderState
     */
    public OrderState getState() {
        return this.state;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions of the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions of the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    @SerializedName("type") private OrderType type = OrderType.MARKET_IF_TOUCHED;

    /**
     * Get the Type
     * <p>
     * The type of the Order. Always set to "MARKET_IF_TOUCHED" for Market If
     * Touched Orders.
     * <p>
     * @return the Type
     * @see OrderType
     */
    public OrderType getType() {
        return this.type;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see InstrumentName
     */
    public MarketIfTouchedOrder setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrder setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see PriceValue
     */
    public MarketIfTouchedOrder setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see PriceValue
     */
    public MarketIfTouchedOrder setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    /**
     * Get the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @return the Price Value
     * @see PriceValue
     */
    public double getPriceBound() {
        return this.priceBound.getPriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TimeInForce
     */
    public MarketIfTouchedOrder setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see DateTime
     */
    public MarketIfTouchedOrder setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public String getGtdTime() {
        return this.gtdTime.getDateTime();
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see OrderPositionFill
     */
    public MarketIfTouchedOrder setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    /**
     * Get the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @return the Position Fill
     * @see OrderPositionFill
     */
    public OrderPositionFill getPositionFill() {
        return this.positionFill;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @param triggerCondition the Trigger Condition
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see OrderTriggerCondition
     */
    public MarketIfTouchedOrder setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    /**
     * Get the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @return the Trigger Condition
     * @see OrderTriggerCondition
     */
    public OrderTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    @SerializedName("initialMarketPrice") private PriceValue initialMarketPrice;

    /**
     * Set the Initial Market Price
     * <p>
     * The Market price at the time when the MarketIfTouched Order was created.
     * <p>
     * @param initialMarketPrice the Initial Market Price
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see PriceValue
     */
    public MarketIfTouchedOrder setInitialMarketPrice(double initialMarketPrice) {
        this.initialMarketPrice = new PriceValue(initialMarketPrice);
        return this;
    }

    /**
     * Get the Initial Market Price
     * <p>
     * The Market price at the time when the MarketIfTouched Order was created.
     * <p>
     * @return the Initial Market Price
     * @see PriceValue
     */
    public double getInitialMarketPrice() {
        return this.initialMarketPrice.getPriceValue();
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails takeProfitOnFill;

    /**
     * Set the Take Profit On Fill
     * <p>
     * TakeProfitDetails specifies the details of a Take Profit Order to be
     * created on behalf of a client. This may happen when an Order is filled
     * that opens a Trade requiring a Take Profit, or when a Trade's dependent
     * Take Profit Order is modified directly through the Trade.
     * <p>
     * @param takeProfitOnFill the Take Profit On Fill
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TakeProfitDetails
     */
    public MarketIfTouchedOrder setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
        this.takeProfitOnFill = takeProfitOnFill;
        return this;
    }

    /**
     * Get the Take Profit On Fill
     * <p>
     * TakeProfitDetails specifies the details of a Take Profit Order to be
     * created on behalf of a client. This may happen when an Order is filled
     * that opens a Trade requiring a Take Profit, or when a Trade's dependent
     * Take Profit Order is modified directly through the Trade.
     * <p>
     * @return the Take Profit On Fill
     * @see TakeProfitDetails
     */
    public TakeProfitDetails getTakeProfitOnFill() {
        return this.takeProfitOnFill;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails stopLossOnFill;

    /**
     * Set the Stop Loss On Fill
     * <p>
     * StopLossDetails specifies the details of a Stop Loss Order to be created
     * on behalf of a client. This may happen when an Order is filled that
     * opens a Trade requiring a Stop Loss, or when a Trade's dependent Stop
     * Loss Order is modified directly through the Trade.
     * <p>
     * @param stopLossOnFill the Stop Loss On Fill
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see StopLossDetails
     */
    public MarketIfTouchedOrder setStopLossOnFill(StopLossDetails stopLossOnFill) {
        this.stopLossOnFill = stopLossOnFill;
        return this;
    }

    /**
     * Get the Stop Loss On Fill
     * <p>
     * StopLossDetails specifies the details of a Stop Loss Order to be created
     * on behalf of a client. This may happen when an Order is filled that
     * opens a Trade requiring a Stop Loss, or when a Trade's dependent Stop
     * Loss Order is modified directly through the Trade.
     * <p>
     * @return the Stop Loss On Fill
     * @see StopLossDetails
     */
    public StopLossDetails getStopLossOnFill() {
        return this.stopLossOnFill;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails trailingStopLossOnFill;

    /**
     * Set the Trailing Stop Loss On Fill
     * <p>
     * TrailingStopLossDetails specifies the details of a Trailing Stop Loss
     * Order to be created on behalf of a client. This may happen when an Order
     * is filled that opens a Trade requiring a Trailing Stop Loss, or when a
     * Trade's dependent Trailing Stop Loss Order is modified directly through
     * the Trade.
     * <p>
     * @param trailingStopLossOnFill the Trailing Stop Loss On Fill
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TrailingStopLossDetails
     */
    public MarketIfTouchedOrder setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
        this.trailingStopLossOnFill = trailingStopLossOnFill;
        return this;
    }

    /**
     * Get the Trailing Stop Loss On Fill
     * <p>
     * TrailingStopLossDetails specifies the details of a Trailing Stop Loss
     * Order to be created on behalf of a client. This may happen when an Order
     * is filled that opens a Trade requiring a Trailing Stop Loss, or when a
     * Trade's dependent Trailing Stop Loss Order is modified directly through
     * the Trade.
     * <p>
     * @return the Trailing Stop Loss On Fill
     * @see TrailingStopLossDetails
     */
    public TrailingStopLossDetails getTrailingStopLossOnFill() {
        return this.trailingStopLossOnFill;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;

    /**
     * Set the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created). Do not set, modify, or delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @param tradeClientExtensions the Trade Client Extensions
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrder setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    /**
     * Get the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created). Do not set, modify, or delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @return the Trade Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensions() {
        return this.tradeClientExtensions;
    }

    @SerializedName("fillingTransactionID") private TransactionID fillingTransactionID;

    /**
     * Set the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @param fillingTransactionID the Filling Transaction ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TransactionID
     */
    public MarketIfTouchedOrder setFillingTransactionID(String fillingTransactionID) {
        this.fillingTransactionID = new TransactionID(fillingTransactionID);
        return this;
    }

    /**
     * Get the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @return the Filling Transaction ID
     * @see TransactionID
     */
    public String getFillingTransactionID() {
        return this.fillingTransactionID.getTransactionID();
    }

    @SerializedName("filledTime") private DateTime filledTime;

    /**
     * Set the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @param filledTime the Filled Time
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see DateTime
     */
    public MarketIfTouchedOrder setFilledTime(String filledTime) {
        this.filledTime = new DateTime(filledTime);
        return this;
    }

    /**
     * Get the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @return the Filled Time
     * @see DateTime
     */
    public String getFilledTime() {
        return this.filledTime.getDateTime();
    }

    @SerializedName("tradeOpenedID") private TradeID tradeOpenedID;

    /**
     * Set the Trade Opened ID
     * <p>
     * Trade ID of Trade opened when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was opened as a result of the
     * fill)
     * <p>
     * @param tradeOpenedID the Trade Opened ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TradeID
     */
    public MarketIfTouchedOrder setTradeOpenedID(String tradeOpenedID) {
        this.tradeOpenedID = new TradeID(tradeOpenedID);
        return this;
    }

    /**
     * Get the Trade Opened ID
     * <p>
     * Trade ID of Trade opened when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was opened as a result of the
     * fill)
     * <p>
     * @return the Trade Opened ID
     * @see TradeID
     */
    public String getTradeOpenedID() {
        return this.tradeOpenedID.getTradeID();
    }

    @SerializedName("tradeReducedID") private TradeID tradeReducedID;

    /**
     * Set the Trade Reduced ID
     * <p>
     * Trade ID of Trade reduced when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was reduced as a result of the
     * fill)
     * <p>
     * @param tradeReducedID the Trade Reduced ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TradeID
     */
    public MarketIfTouchedOrder setTradeReducedID(String tradeReducedID) {
        this.tradeReducedID = new TradeID(tradeReducedID);
        return this;
    }

    /**
     * Get the Trade Reduced ID
     * <p>
     * Trade ID of Trade reduced when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was reduced as a result of the
     * fill)
     * <p>
     * @return the Trade Reduced ID
     * @see TradeID
     */
    public String getTradeReducedID() {
        return this.tradeReducedID.getTradeID();
    }

    @SerializedName("tradeClosedIDs") private TradeID[] tradeClosedIDs;

    /**
     * Set the Trade Closed IDs
     * <p>
     * Trade IDs of Trades closed when the Order was filled (only provided when
     * the Order's state is FILLED and one or more Trades were closed as a
     * result of the fill)
     * <p>
     * @param tradeClosedIDs the Trade Closed IDs
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TradeID
     */
    public MarketIfTouchedOrder setTradeClosedIDs(TradeID[] tradeClosedIDs) {
        this.tradeClosedIDs = tradeClosedIDs;
        return this;
    }

    /**
     * Get the Trade Closed IDs
     * <p>
     * Trade IDs of Trades closed when the Order was filled (only provided when
     * the Order's state is FILLED and one or more Trades were closed as a
     * result of the fill)
     * <p>
     * @return the Trade Closed IDs
     * @see TradeID
     */
    public TradeID[] getTradeClosedIDs() {
        return this.tradeClosedIDs;
    }

    @SerializedName("cancellingTransactionID") private TransactionID cancellingTransactionID;

    /**
     * Set the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @param cancellingTransactionID the Cancelling Transction ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see TransactionID
     */
    public MarketIfTouchedOrder setCancellingTransactionID(String cancellingTransactionID) {
        this.cancellingTransactionID = new TransactionID(cancellingTransactionID);
        return this;
    }

    /**
     * Get the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @return the Cancelling Transction ID
     * @see TransactionID
     */
    public String getCancellingTransactionID() {
        return this.cancellingTransactionID.getTransactionID();
    }

    @SerializedName("cancelledTime") private DateTime cancelledTime;

    /**
     * Set the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @param cancelledTime the Cancelled Time
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see DateTime
     */
    public MarketIfTouchedOrder setCancelledTime(String cancelledTime) {
        this.cancelledTime = new DateTime(cancelledTime);
        return this;
    }

    /**
     * Get the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @return the Cancelled Time
     * @see DateTime
     */
    public String getCancelledTime() {
        return this.cancelledTime.getDateTime();
    }

    @SerializedName("replacesOrderID") private OrderID replacesOrderID;

    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @param replacesOrderID the Replaces Order ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see OrderID
     */
    public MarketIfTouchedOrder setReplacesOrderID(String replacesOrderID) {
        this.replacesOrderID = new OrderID(replacesOrderID);
        return this;
    }

    /**
     * Get the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @return the Replaces Order ID
     * @see OrderID
     */
    public String getReplacesOrderID() {
        return this.replacesOrderID.getOrderID();
    }

    @SerializedName("replacedByOrderID") private OrderID replacedByOrderID;

    /**
     * Set the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @param replacedByOrderID the Replaced by Order ID
     * @return {@link MarketIfTouchedOrder MarketIfTouchedOrder}
     * @see OrderID
     */
    public MarketIfTouchedOrder setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    /**
     * Get the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @return the Replaced by Order ID
     * @see OrderID
     */
    public String getReplacedByOrderID() {
        return this.replacedByOrderID.getOrderID();
    }
}
