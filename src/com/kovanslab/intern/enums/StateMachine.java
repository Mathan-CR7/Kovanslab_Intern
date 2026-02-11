package com.kovanslab.intern.enums;
enum OrderState {

    NEW {
        public OrderState nextState() {
            return PROCESSING;
        }
    },

    PROCESSING {
        public OrderState nextState() {
            return SHIPPED;
        }
    },

    SHIPPED {
        public OrderState nextState() {
            return DELIVERED;
        }
    },

    DELIVERED {
        public OrderState nextState() {
            throw new IllegalStateException("Order already delivered. No further transitions allowed.");
        }
    };

    public abstract OrderState nextState();
}

class Order
{
    private OrderState state;

    public Order()
    {
        this.state=OrderState.NEW;
    }
    public void advancedState()
    {
        System.out.println("Current State : " + state);
        state =state.nextState();
        System.out.println("Next State : "+state);
    }

    public OrderState getState() {
        return state;
    }
}

public class StateMachine
{
    public static void main(String[] args)
    {
        Order o =new Order();
        o.advancedState();
        o.advancedState();
        o.advancedState();
        o.advancedState();
    }
}
