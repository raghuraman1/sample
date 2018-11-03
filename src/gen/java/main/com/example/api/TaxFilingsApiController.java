package com.example.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;

@Controller
@RequestMapping("${openapi.Test API.base-path:}")
public class TaxFilingsApiController implements TaxFilingsApi {

    private final TaxFilingsApiDelegate delegate;

    public TaxFilingsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TaxFilingsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TaxFilingsApiDelegate() {});
    }

    @Override
    public TaxFilingsApiDelegate getDelegate() {
        return delegate;
    }

}
