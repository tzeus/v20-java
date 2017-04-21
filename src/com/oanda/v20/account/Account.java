package com.oanda.v20.account;

import java.util.Collection;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.Order;
import com.oanda.v20.position.Position;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.Currency;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeSummary;
import com.oanda.v20.transaction.TransactionID;

/**
 * The full details of a client's Account. This includes full open Trade, open
 * Position and pending Order representation.
 * <p>
 * Account {id}
 */
public class Account {

    /**
     * Default constructor.
     */
    public Account() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the Account to copy
     */
    public Account(Account other) {
        this.id = other.id;
        this.alias = other.alias;
        this.currency = other.currency;
        this.balance = other.balance;
        if (other.createdByUserID != null)
        {
            this.createdByUserID = new Integer(other.createdByUserID);
        }
        this.createdTime = other.createdTime;
        this.pl = other.pl;
        this.resettablePL = other.resettablePL;
        this.resettabledPLTime = other.resettabledPLTime;
        this.marginRate = other.marginRate;
        this.marginCallEnterTime = other.marginCallEnterTime;
        if (other.marginCallExtensionCount != null)
        {
            this.marginCallExtensionCount = new Integer(other.marginCallExtensionCount);
        }
        this.lastMarginCallExtensionTime = other.lastMarginCallExtensionTime;
        if (other.openTradeCount != null)
        {
            this.openTradeCount = new Integer(other.openTradeCount);
        }
        if (other.openPositionCount != null)
        {
            this.openPositionCount = new Integer(other.openPositionCount);
        }
        if (other.pendingOrderCount != null)
        {
            this.pendingOrderCount = new Integer(other.pendingOrderCount);
        }
        if (other.hedgingEnabled != null)
        {
            this.hedgingEnabled = new Boolean(other.hedgingEnabled);
        }
        this.unrealizedPL = other.unrealizedPL;
        this.nAV = other.nAV;
        this.marginUsed = other.marginUsed;
        this.marginAvailable = other.marginAvailable;
        this.positionValue = other.positionValue;
        this.marginCloseoutUnrealizedPL = other.marginCloseoutUnrealizedPL;
        this.marginCloseoutNAV = other.marginCloseoutNAV;
        this.marginCloseoutMarginUsed = other.marginCloseoutMarginUsed;
        this.marginCloseoutPercent = other.marginCloseoutPercent;
        this.marginCloseoutPositionValue = other.marginCloseoutPositionValue;
        this.withdrawalLimit = other.withdrawalLimit;
        this.marginCallMarginUsed = other.marginCallMarginUsed;
        this.marginCallPercent = other.marginCallPercent;
        this.lastTransactionID = other.lastTransactionID;
        if (other.trades != null)
        {
            this.trades = new ArrayList<TradeSummary>(other.trades);
        }
        if (other.positions != null)
        {
            this.positions = new ArrayList<Position>(other.positions);
        }
        if (other.orders != null)
        {
            this.orders = new ArrayList<Order>(other.orders);
        }
    }

    @SerializedName("id") private AccountID id;

    /**
     * Get the Account ID
     * <p>
     * The Account's identifier
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public AccountID getId() {
        return this.id;
    }

    /**
     * Set the Account ID
     * <p>
     * The Account's identifier
     * <p>
     * @param id the Account ID as an AccountID
     * @return {@link Account Account}
     * @see AccountID
     */
    public Account setId(AccountID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The Account's identifier
     * <p>
     * @param id the Account ID as a String
     * @return {@link Account Account}
     * @see AccountID
     */
    public Account setId(String id) {
        this.id = new AccountID(id);
        return this;
    }

    @SerializedName("alias") private String alias;

    /**
     * Get the Alias
     * <p>
     * Client-assigned alias for the Account. Only provided if the Account has
     * an alias set
     * <p>
     * @return the Alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * Set the Alias
     * <p>
     * Client-assigned alias for the Account. Only provided if the Account has
     * an alias set
     * <p>
     * @param alias the Alias as a String
     * @return {@link Account Account}
     */
    public Account setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @SerializedName("currency") private Currency currency;

    /**
     * Get the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @return the Home Currency
     * @see Currency
     */
    public Currency getCurrency() {
        return this.currency;
    }

    /**
     * Set the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @param currency the Home Currency as a Currency
     * @return {@link Account Account}
     * @see Currency
     */
    public Account setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }
    /**
     * Set the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @param currency the Home Currency as a String
     * @return {@link Account Account}
     * @see Currency
     */
    public Account setCurrency(String currency) {
        this.currency = new Currency(currency);
        return this;
    }

    @SerializedName("balance") private AccountUnits balance;

    /**
     * Get the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @return the Balance
     * @see AccountUnits
     */
    public AccountUnits getBalance() {
        return this.balance;
    }

    /**
     * Set the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param balance the Balance as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setBalance(AccountUnits balance) {
        this.balance = balance;
        return this;
    }
    /**
     * Set the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param balance the Balance as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setBalance(String balance) {
        this.balance = new AccountUnits(balance);
        return this;
    }
    /**
     * Set the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param balance the Balance as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setBalance(double balance) {
        this.balance = new AccountUnits(balance);
        return this;
    }
    /**
     * Set the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param balance the Balance as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setBalance(BigDecimal balance) {
        this.balance = new AccountUnits(balance);
        return this;
    }

    @SerializedName("createdByUserID") private Integer createdByUserID;

    /**
     * Get the Created by User ID
     * <p>
     * ID of the user that created the Account.
     * <p>
     * @return the Created by User ID
     */
    public Integer getCreatedByUserID() {
        return this.createdByUserID;
    }

    /**
     * Set the Created by User ID
     * <p>
     * ID of the user that created the Account.
     * <p>
     * @param createdByUserID the Created by User ID as an Integer
     * @return {@link Account Account}
     */
    public Account setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
        return this;
    }

    @SerializedName("createdTime") private DateTime createdTime;

    /**
     * Get the Create Time
     * <p>
     * The date/time when the Account was created.
     * <p>
     * @return the Create Time
     * @see DateTime
     */
    public DateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the Create Time
     * <p>
     * The date/time when the Account was created.
     * <p>
     * @param createdTime the Create Time as a DateTime
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    /**
     * Set the Create Time
     * <p>
     * The date/time when the Account was created.
     * <p>
     * @param createdTime the Create Time as a String
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setCreatedTime(String createdTime) {
        this.createdTime = new DateTime(createdTime);
        return this;
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Get the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getPl() {
        return this.pl;
    }

    /**
     * Set the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @param pl the Profit/Loss as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPl(AccountUnits pl) {
        this.pl = pl;
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @param pl the Profit/Loss as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPl(String pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @param pl the Profit/Loss as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @param pl the Profit/Loss as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPl(BigDecimal pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    @SerializedName("resettablePL") private AccountUnits resettablePL;

    /**
     * Get the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @return the Resettable Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getResettablePL() {
        return this.resettablePL;
    }

    /**
     * Set the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setResettablePL(AccountUnits resettablePL) {
        this.resettablePL = resettablePL;
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setResettablePL(String resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setResettablePL(double resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setResettablePL(BigDecimal resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }

    @SerializedName("resettabledPLTime") private DateTime resettabledPLTime;

    /**
     * Get the Profit/Loss Reset Time
     * <p>
     * The date/time that the Account's resettablePL was last reset.
     * <p>
     * @return the Profit/Loss Reset Time
     * @see DateTime
     */
    public DateTime getResettabledPLTime() {
        return this.resettabledPLTime;
    }

    /**
     * Set the Profit/Loss Reset Time
     * <p>
     * The date/time that the Account's resettablePL was last reset.
     * <p>
     * @param resettabledPLTime the Profit/Loss Reset Time as a DateTime
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setResettabledPLTime(DateTime resettabledPLTime) {
        this.resettabledPLTime = resettabledPLTime;
        return this;
    }
    /**
     * Set the Profit/Loss Reset Time
     * <p>
     * The date/time that the Account's resettablePL was last reset.
     * <p>
     * @param resettabledPLTime the Profit/Loss Reset Time as a String
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setResettabledPLTime(String resettabledPLTime) {
        this.resettabledPLTime = new DateTime(resettabledPLTime);
        return this;
    }

    @SerializedName("marginRate") private DecimalNumber marginRate;

    /**
     * Get the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @return the Margin Rate
     * @see DecimalNumber
     */
    public DecimalNumber getMarginRate() {
        return this.marginRate;
    }

    /**
     * Set the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @param marginRate the Margin Rate as a DecimalNumber
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginRate(DecimalNumber marginRate) {
        this.marginRate = marginRate;
        return this;
    }
    /**
     * Set the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @param marginRate the Margin Rate as a String
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginRate(String marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }
    /**
     * Set the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @param marginRate the Margin Rate as a double
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginRate(double marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }
    /**
     * Set the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @param marginRate the Margin Rate as a BigDecimal
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginRate(BigDecimal marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }

    @SerializedName("marginCallEnterTime") private DateTime marginCallEnterTime;

    /**
     * Get the Margin Call Enter Time
     * <p>
     * The date/time when the Account entered a margin call state. Only
     * provided if the Account is in a margin call.
     * <p>
     * @return the Margin Call Enter Time
     * @see DateTime
     */
    public DateTime getMarginCallEnterTime() {
        return this.marginCallEnterTime;
    }

    /**
     * Set the Margin Call Enter Time
     * <p>
     * The date/time when the Account entered a margin call state. Only
     * provided if the Account is in a margin call.
     * <p>
     * @param marginCallEnterTime the Margin Call Enter Time as a DateTime
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setMarginCallEnterTime(DateTime marginCallEnterTime) {
        this.marginCallEnterTime = marginCallEnterTime;
        return this;
    }
    /**
     * Set the Margin Call Enter Time
     * <p>
     * The date/time when the Account entered a margin call state. Only
     * provided if the Account is in a margin call.
     * <p>
     * @param marginCallEnterTime the Margin Call Enter Time as a String
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setMarginCallEnterTime(String marginCallEnterTime) {
        this.marginCallEnterTime = new DateTime(marginCallEnterTime);
        return this;
    }

    @SerializedName("marginCallExtensionCount") private Integer marginCallExtensionCount;

    /**
     * Get the Margin Call Extension Count
     * <p>
     * The number of times that the Account's current margin call was extended.
     * <p>
     * @return the Margin Call Extension Count
     */
    public Integer getMarginCallExtensionCount() {
        return this.marginCallExtensionCount;
    }

    /**
     * Set the Margin Call Extension Count
     * <p>
     * The number of times that the Account's current margin call was extended.
     * <p>
     * @param marginCallExtensionCount the Margin Call Extension Count as an
     * Integer
     * @return {@link Account Account}
     */
    public Account setMarginCallExtensionCount(Integer marginCallExtensionCount) {
        this.marginCallExtensionCount = marginCallExtensionCount;
        return this;
    }

    @SerializedName("lastMarginCallExtensionTime") private DateTime lastMarginCallExtensionTime;

    /**
     * Get the Last Margin Call Extension Time
     * <p>
     * The date/time of the Account's last margin call extension.
     * <p>
     * @return the Last Margin Call Extension Time
     * @see DateTime
     */
    public DateTime getLastMarginCallExtensionTime() {
        return this.lastMarginCallExtensionTime;
    }

    /**
     * Set the Last Margin Call Extension Time
     * <p>
     * The date/time of the Account's last margin call extension.
     * <p>
     * @param lastMarginCallExtensionTime the Last Margin Call Extension Time
     * as a DateTime
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setLastMarginCallExtensionTime(DateTime lastMarginCallExtensionTime) {
        this.lastMarginCallExtensionTime = lastMarginCallExtensionTime;
        return this;
    }
    /**
     * Set the Last Margin Call Extension Time
     * <p>
     * The date/time of the Account's last margin call extension.
     * <p>
     * @param lastMarginCallExtensionTime the Last Margin Call Extension Time
     * as a String
     * @return {@link Account Account}
     * @see DateTime
     */
    public Account setLastMarginCallExtensionTime(String lastMarginCallExtensionTime) {
        this.lastMarginCallExtensionTime = new DateTime(lastMarginCallExtensionTime);
        return this;
    }

    @SerializedName("openTradeCount") private Integer openTradeCount;

    /**
     * Get the Open Trade Count
     * <p>
     * The number of Trades currently open in the Account.
     * <p>
     * @return the Open Trade Count
     */
    public Integer getOpenTradeCount() {
        return this.openTradeCount;
    }

    /**
     * Set the Open Trade Count
     * <p>
     * The number of Trades currently open in the Account.
     * <p>
     * @param openTradeCount the Open Trade Count as an Integer
     * @return {@link Account Account}
     */
    public Account setOpenTradeCount(Integer openTradeCount) {
        this.openTradeCount = openTradeCount;
        return this;
    }

    @SerializedName("openPositionCount") private Integer openPositionCount;

    /**
     * Get the Open Position Count
     * <p>
     * The number of Positions currently open in the Account.
     * <p>
     * @return the Open Position Count
     */
    public Integer getOpenPositionCount() {
        return this.openPositionCount;
    }

    /**
     * Set the Open Position Count
     * <p>
     * The number of Positions currently open in the Account.
     * <p>
     * @param openPositionCount the Open Position Count as an Integer
     * @return {@link Account Account}
     */
    public Account setOpenPositionCount(Integer openPositionCount) {
        this.openPositionCount = openPositionCount;
        return this;
    }

    @SerializedName("pendingOrderCount") private Integer pendingOrderCount;

    /**
     * Get the Pending Order Count
     * <p>
     * The number of Orders currently pending in the Account.
     * <p>
     * @return the Pending Order Count
     */
    public Integer getPendingOrderCount() {
        return this.pendingOrderCount;
    }

    /**
     * Set the Pending Order Count
     * <p>
     * The number of Orders currently pending in the Account.
     * <p>
     * @param pendingOrderCount the Pending Order Count as an Integer
     * @return {@link Account Account}
     */
    public Account setPendingOrderCount(Integer pendingOrderCount) {
        this.pendingOrderCount = pendingOrderCount;
        return this;
    }

    @SerializedName("hedgingEnabled") private Boolean hedgingEnabled;

    /**
     * Get the Hedging Enabled
     * <p>
     * Flag indicating that the Account has hedging enabled.
     * <p>
     * @return the Hedging Enabled
     */
    public Boolean getHedgingEnabled() {
        return this.hedgingEnabled;
    }

    /**
     * Set the Hedging Enabled
     * <p>
     * Flag indicating that the Account has hedging enabled.
     * <p>
     * @param hedgingEnabled the Hedging Enabled as a Boolean
     * @return {@link Account Account}
     */
    public Account setHedgingEnabled(Boolean hedgingEnabled) {
        this.hedgingEnabled = hedgingEnabled;
        return this;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getUnrealizedPL() {
        return this.unrealizedPL;
    }

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setUnrealizedPL(AccountUnits unrealizedPL) {
        this.unrealizedPL = unrealizedPL;
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setUnrealizedPL(String unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setUnrealizedPL(BigDecimal unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    @SerializedName("NAV") private AccountUnits nAV;

    /**
     * Get the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @return the Net Asset Value
     * @see AccountUnits
     */
    public AccountUnits getNAV() {
        return this.nAV;
    }

    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @param nAV the Net Asset Value as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setNAV(AccountUnits nAV) {
        this.nAV = nAV;
        return this;
    }
    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @param nAV the Net Asset Value as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setNAV(String nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }
    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @param nAV the Net Asset Value as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setNAV(double nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }
    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @param nAV the Net Asset Value as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setNAV(BigDecimal nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }

    @SerializedName("marginUsed") private AccountUnits marginUsed;

    /**
     * Get the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @return the Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginUsed() {
        return this.marginUsed;
    }

    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginUsed the Margin Used as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginUsed(AccountUnits marginUsed) {
        this.marginUsed = marginUsed;
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginUsed the Margin Used as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginUsed(String marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginUsed the Margin Used as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginUsed(double marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginUsed the Margin Used as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginUsed(BigDecimal marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }

    @SerializedName("marginAvailable") private AccountUnits marginAvailable;

    /**
     * Get the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @return the Margin Available
     * @see AccountUnits
     */
    public AccountUnits getMarginAvailable() {
        return this.marginAvailable;
    }

    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginAvailable the Margin Available as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginAvailable(AccountUnits marginAvailable) {
        this.marginAvailable = marginAvailable;
        return this;
    }
    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginAvailable the Margin Available as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginAvailable(String marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }
    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginAvailable the Margin Available as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginAvailable(double marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }
    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginAvailable the Margin Available as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginAvailable(BigDecimal marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }

    @SerializedName("positionValue") private AccountUnits positionValue;

    /**
     * Get the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @return the Position Value
     * @see AccountUnits
     */
    public AccountUnits getPositionValue() {
        return this.positionValue;
    }

    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPositionValue(AccountUnits positionValue) {
        this.positionValue = positionValue;
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPositionValue(String positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPositionValue(double positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setPositionValue(BigDecimal positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }

    @SerializedName("marginCloseoutUnrealizedPL") private AccountUnits marginCloseoutUnrealizedPL;

    /**
     * Get the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @return the Closeout UPL
     * @see AccountUnits
     */
    public AccountUnits getMarginCloseoutUnrealizedPL() {
        return this.marginCloseoutUnrealizedPL;
    }

    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutUnrealizedPL(AccountUnits marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = marginCloseoutUnrealizedPL;
        return this;
    }
    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutUnrealizedPL(String marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }
    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutUnrealizedPL(double marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }
    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutUnrealizedPL(BigDecimal marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }

    @SerializedName("marginCloseoutNAV") private AccountUnits marginCloseoutNAV;

    /**
     * Get the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @return the Closeout NAV
     * @see AccountUnits
     */
    public AccountUnits getMarginCloseoutNAV() {
        return this.marginCloseoutNAV;
    }

    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutNAV(AccountUnits marginCloseoutNAV) {
        this.marginCloseoutNAV = marginCloseoutNAV;
        return this;
    }
    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutNAV(String marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }
    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutNAV(double marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }
    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutNAV(BigDecimal marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }

    @SerializedName("marginCloseoutMarginUsed") private AccountUnits marginCloseoutMarginUsed;

    /**
     * Get the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @return the Closeout Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginCloseoutMarginUsed() {
        return this.marginCloseoutMarginUsed;
    }

    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as an
     * AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutMarginUsed(AccountUnits marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = marginCloseoutMarginUsed;
        return this;
    }
    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutMarginUsed(String marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }
    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutMarginUsed(double marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }
    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCloseoutMarginUsed(BigDecimal marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }

    @SerializedName("marginCloseoutPercent") private DecimalNumber marginCloseoutPercent;

    /**
     * Get the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @return the Margin Closeout Percentage
     * @see DecimalNumber
     */
    public DecimalNumber getMarginCloseoutPercent() {
        return this.marginCloseoutPercent;
    }

    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a
     * DecimalNumber
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPercent(DecimalNumber marginCloseoutPercent) {
        this.marginCloseoutPercent = marginCloseoutPercent;
        return this;
    }
    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a String
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPercent(String marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }
    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a double
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPercent(double marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }
    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a
     * BigDecimal
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPercent(BigDecimal marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }

    @SerializedName("marginCloseoutPositionValue") private DecimalNumber marginCloseoutPositionValue;

    /**
     * Get the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @return the Margin Closeout Position Value
     * @see DecimalNumber
     */
    public DecimalNumber getMarginCloseoutPositionValue() {
        return this.marginCloseoutPositionValue;
    }

    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a DecimalNumber
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPositionValue(DecimalNumber marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = marginCloseoutPositionValue;
        return this;
    }
    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a String
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPositionValue(String marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }
    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a double
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPositionValue(double marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }
    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a BigDecimal
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCloseoutPositionValue(BigDecimal marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }

    @SerializedName("withdrawalLimit") private AccountUnits withdrawalLimit;

    /**
     * Get the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @return the Withdrawal Limit
     * @see AccountUnits
     */
    public AccountUnits getWithdrawalLimit() {
        return this.withdrawalLimit;
    }

    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as an AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setWithdrawalLimit(AccountUnits withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
        return this;
    }
    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setWithdrawalLimit(String withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }
    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }
    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setWithdrawalLimit(BigDecimal withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }

    @SerializedName("marginCallMarginUsed") private AccountUnits marginCallMarginUsed;

    /**
     * Get the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @return the Margin Call Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginCallMarginUsed() {
        return this.marginCallMarginUsed;
    }

    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as an
     * AccountUnits
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCallMarginUsed(AccountUnits marginCallMarginUsed) {
        this.marginCallMarginUsed = marginCallMarginUsed;
        return this;
    }
    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as a String
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCallMarginUsed(String marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }
    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as a double
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCallMarginUsed(double marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }
    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as a BigDecimal
     * @return {@link Account Account}
     * @see AccountUnits
     */
    public Account setMarginCallMarginUsed(BigDecimal marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }

    @SerializedName("marginCallPercent") private DecimalNumber marginCallPercent;

    /**
     * Get the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @return the Margin Call Percentage
     * @see DecimalNumber
     */
    public DecimalNumber getMarginCallPercent() {
        return this.marginCallPercent;
    }

    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a DecimalNumber
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCallPercent(DecimalNumber marginCallPercent) {
        this.marginCallPercent = marginCallPercent;
        return this;
    }
    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a String
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCallPercent(String marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }
    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a double
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCallPercent(double marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }
    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a BigDecimal
     * @return {@link Account Account}
     * @see DecimalNumber
     */
    public Account setMarginCallPercent(BigDecimal marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the Last Transaction ID
     * <p>
     * The ID of the last Transaction created for the Account.
     * <p>
     * @return the Last Transaction ID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }

    /**
     * Set the Last Transaction ID
     * <p>
     * The ID of the last Transaction created for the Account.
     * <p>
     * @param lastTransactionID the Last Transaction ID as a TransactionID
     * @return {@link Account Account}
     * @see TransactionID
     */
    public Account setLastTransactionID(TransactionID lastTransactionID) {
        this.lastTransactionID = lastTransactionID;
        return this;
    }
    /**
     * Set the Last Transaction ID
     * <p>
     * The ID of the last Transaction created for the Account.
     * <p>
     * @param lastTransactionID the Last Transaction ID as a String
     * @return {@link Account Account}
     * @see TransactionID
     */
    public Account setLastTransactionID(String lastTransactionID) {
        this.lastTransactionID = new TransactionID(lastTransactionID);
        return this;
    }

    @SerializedName("trades") private ArrayList<TradeSummary> trades;

    /**
     * Get the Open Trades
     * <p>
     * The details of the Trades currently open in the Account.
     * <p>
     * @return the Open Trades
     * @see TradeSummary
     */
    public List<TradeSummary> getTrades() {
        return this.trades;
    }

    /**
     * Set the Open Trades
     * <p>
     * The details of the Trades currently open in the Account.
     * <p>
     * @param trades the Open Trades
     * @return {@link Account Account}
     * @see TradeSummary
     */
    public Account setTrades(Collection<?> trades) {
        ArrayList<TradeSummary> newTrades = new ArrayList<TradeSummary>(trades.size());
        trades.forEach((item) -> {
            if (TradeSummary.class == item.getClass())
            {
                newTrades.add((TradeSummary) item);
            }
        });
        this.trades = newTrades;
        return this;
    }

    @SerializedName("positions") private ArrayList<Position> positions;

    /**
     * Get the Positions
     * <p>
     * The details all Account Positions.
     * <p>
     * @return the Positions
     * @see Position
     */
    public List<Position> getPositions() {
        return this.positions;
    }

    /**
     * Set the Positions
     * <p>
     * The details all Account Positions.
     * <p>
     * @param positions the Positions
     * @return {@link Account Account}
     * @see Position
     */
    public Account setPositions(Collection<?> positions) {
        ArrayList<Position> newPositions = new ArrayList<Position>(positions.size());
        positions.forEach((item) -> {
            if (Position.class == item.getClass())
            {
                newPositions.add((Position) item);
            }
        });
        this.positions = newPositions;
        return this;
    }

    @SerializedName("orders") private ArrayList<Order> orders;

    /**
     * Get the Pending Orders
     * <p>
     * The details of the Orders currently pending in the Account.
     * <p>
     * @return the Pending Orders
     * @see Order
     */
    public List<Order> getOrders() {
        return this.orders;
    }

    /**
     * Set the Pending Orders
     * <p>
     * The details of the Orders currently pending in the Account.
     * <p>
     * @param orders the Pending Orders
     * @return {@link Account Account}
     * @see Order
     */
    public Account setOrders(Collection<?> orders) {
        ArrayList<Order> newOrders = new ArrayList<Order>(orders.size());
        orders.forEach((item) -> {
            if (Order.class == item.getClass())
            {
                newOrders.add((Order) item);
            }
        });
        this.orders = newOrders;
        return this;
    }
}
