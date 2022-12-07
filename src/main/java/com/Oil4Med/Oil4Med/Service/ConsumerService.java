package com.Oil4Med.Oil4Med.Service;

import com.Oil4Med.Oil4Med.Model.Admin;
import com.Oil4Med.Oil4Med.Model.Consumer;

import java.util.List;

public interface ConsumerService {
    List<Consumer> getConsumers();

    Consumer getConsumersById(Long id);

    Consumer addConsumer(Consumer consumer);

    void deleteConsumer(Consumer consumer);

    void updateConsumer(Consumer consumer, Consumer newConsumer);
}
