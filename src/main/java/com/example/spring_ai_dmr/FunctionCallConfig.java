package com.example.spring_ai_dmr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import java.util.function.Function;

@Configuration(proxyBeanMethods = false)
class FunctionCallConfig {

    @Bean
    @Description("Get the stock price")
    public Function<MockStockService.StockRequest, MockStockService.StockResponse> stockFunction() {
        return new MockStockService();
    }

    static class MockStockService implements Function<MockStockService.StockRequest, MockStockService.StockResponse> {

        public record StockRequest(String symbol) {}
        public record StockResponse(double price) {}

        @Override
        public StockResponse apply(StockRequest request) {
            double price = request.symbol().contains("AAPL") ? 198 : 114;
            return new StockResponse(price);
        }
    }
    
}
