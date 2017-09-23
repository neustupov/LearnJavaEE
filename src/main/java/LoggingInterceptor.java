import com.jcabi.aspects.Loggable;

import javax.inject.Inject;
import java.util.logging.Logger;

@Interceptor
@Loggable
public class LoggingInterceptor {
    @Inject
    private Logger logger;
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        logger.entering(ic.getTarget);
    }
}
