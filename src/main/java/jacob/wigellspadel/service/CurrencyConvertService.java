package jacob.wigellspadel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyConvertService {

    @Autowired
    private RestTemplate restTemplate;

    public double convertToEur(double amountInSek) {
        System.out.println("Before url");
        String url = "http://localhost:8082/convert/converttoeur";
        System.out.println("after url");
        ConversionRequest request = new ConversionRequest(amountInSek);
        System.out.println("1");
        ConversionResponse response = restTemplate.postForObject(url, request, ConversionResponse.class);

        // Return the converted amount in EUR
        return response.getAmountInEur();
    }

    public static class ConversionRequest {
        private double amountInSek;

        public ConversionRequest(double amountInSek) {
            this.amountInSek = amountInSek;
        }

        public double getAmountInSek() {
            return amountInSek;
        }

        public void setAmountInSek(double amountInSek) {
            this.amountInSek = amountInSek;
        }
    }

    public static class ConversionResponse {
        private double amountInSek;
        private double amountInEur;

        public double getAmountInSek() {
            return amountInSek;
        }

        public void setAmountInSek(double amountInSek) {
            this.amountInSek = amountInSek;
        }

        public double getAmountInEur() {
            return amountInEur;
        }

        public void setAmountInEur(double amountInEur) {
            this.amountInEur = amountInEur;
        }
    }
}
