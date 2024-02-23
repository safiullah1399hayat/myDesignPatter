
interface Order {
    void processOrder();
}


class ElectronicOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing the electronic order.");
    }
}


class ConsumerProductOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing the consumer product order.");
    }
}


class FoodOrder implements Order {
    @Override
    public void processOrder() {
        System.out.println("Processing the food order.");
    }
}


class OrderFactory {
    public Order createOrder(String type) {
        if (type.equalsIgnoreCase("Electronic")) {
            return new ElectronicOrder();
        } else if (type.equalsIgnoreCase("ConsumerProduct")) {
            return new ConsumerProductOrder();
        } else if (type.equalsIgnoreCase("Food")) {
            return new FoodOrder();
        }
        return null;
    }
}
