package co.edu.ff.orders.product.domain;

import co.edu.ff.orders.common.Preconditions;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

@Value(staticConstructor = "of")
public class Name {
    String value;

    private Name(String value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(StringUtils.isNoneBlank(value));
        Preconditions.checkArgument(value.length() <= 100);
        this.value = value;
    }
}
