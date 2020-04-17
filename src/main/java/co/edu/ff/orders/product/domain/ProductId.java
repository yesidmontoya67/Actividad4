package co.edu.ff.orders.product.domain;

import co.edu.ff.orders.common.Preconditions;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

@Value(staticConstructor = "of")
public class ProductId {
    Long value;

    private ProductId(Long value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value> 1L);
        this.value = value;
    }

}
