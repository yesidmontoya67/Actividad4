package co.edu.ff.orders.product.domain;

import co.edu.ff.orders.common.Preconditions;
import lombok.Value;
import org.apache.commons.lang3.StringUtils;

@Value(staticConstructor = "of")
public class Description {
    String value;

    private Description(String value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(StringUtils.isNoneBlank(value));
        Preconditions.checkArgument(value.length() <= 280);
        this.value = value;
    }


}
