import com.jcabi.aspects.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber(){
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISBN :" + isbn);
        return isbn;
    }
}
