package com.after_sunrise.cryptocurrency.bitflyer4j.entity;

import com.after_sunrise.cryptocurrency.bitflyer4j.core.ConditionType;
import com.after_sunrise.cryptocurrency.bitflyer4j.core.SideType;
import com.after_sunrise.cryptocurrency.bitflyer4j.core.StateType;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * @author takanori.takase
 * @version 0.0.1
 */
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderList extends Entity {

    @SerializedName("product_code")
    private final String product;

    @SerializedName("child_order_state")
    private final StateType state;

    @SerializedName("child_order_id")
    private final String orderId;

    @SerializedName("child_order_acceptance_id")
    private final String acceptanceId;

    @SerializedName("parent_order_id")
    private final String parentId;

    public interface Response {

        Long getId();

        String getOrderId();

        String getProduct();

        SideType getSide();

        ConditionType getCondition();

        BigDecimal getPrice();

        BigDecimal getAveragePrice();

        BigDecimal getSize();

        StateType getState();

        ZonedDateTime getExpireDate();

        ZonedDateTime getOrderDate();

        String getAcceptanceId();

        BigDecimal getOutstandingSize();

        BigDecimal getCancelSize();

        BigDecimal getExecutedSize();

        BigDecimal getTotalCommission();

    }

}
