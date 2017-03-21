package com.shahbour.domain.projection;

import com.shahbour.domain.Customer;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by shahbour on 3/16/17.
 */
@Projection(name = "name",types = Customer.class)
public interface CustomerName {

	String getName();
}
