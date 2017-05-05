import com.google.inject.spi.InjectionPoint;

import java.util.logging.Logger;

public class LoggingProducer {
    @Produces
    public Logger produceLogger(InjectionPoint injectionPoint){
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
