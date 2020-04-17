package co.edu.ff.orders.product.domain;

import co.edu.ff.orders.common.Preconditions;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

@Value(staticConstructor = "of")
public class InventoryQueantity {
    int value;

    private InventoryQueantity(int value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0);
        this.value = value;
    }


}
