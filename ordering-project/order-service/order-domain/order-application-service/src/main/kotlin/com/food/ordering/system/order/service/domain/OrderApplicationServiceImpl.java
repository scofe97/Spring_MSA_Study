package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.port.input.service.OrderApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderCreateCommonHandler orderCreateCommonHandler;
    private final OrderTrackCommonHandler orderTrackCommonHandler;

    public OrderApplicationServiceImpl(OrderCreateCommonHandler orderCreateCommonHandler, OrderTrackCommonHandler orderTrackCommonHandler) {
        this.orderCreateCommonHandler = orderCreateCommonHandler;
        this.orderTrackCommonHandler = orderTrackCommonHandler;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        return orderCreateCommonHandler.createOrder(createOrderCommand);
    }

    @Override
    public TrackOrderResponse trackOrder(TrackOrderQuery trackOrderQuery) {
        return orderTrackCommonHandler.trackOrder(trackOrderQuery);
    }

}
