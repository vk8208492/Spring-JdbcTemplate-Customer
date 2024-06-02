package app.domain;

import java.util.HashMap;
import java.util.Map;

public class CustomerValidator {

    public final static String PHONE_RGX = "[0-9]{3} [0-9]{3}-[0-9]{4}";

    public Map<String, String> validateData(Customer customer) {
        Map<String, String> errors = new HashMap<>();
        if (customer.getName() == null)
            errors.put("First name", "has no data");
        if (customer.getPhone() == null)
            errors.put("Last name", "has no data");
        if (customer.getAddress() == null || customer.getAddress().matches(PHONE_RGX))
            errors.put("Email", "has no data or is wrong format.");
        return errors;
    }
}
