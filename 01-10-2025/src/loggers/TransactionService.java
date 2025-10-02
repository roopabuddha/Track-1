package loggers;

import java.util.logging.Logger;

public class TransactionService {
    private static final Logger logger = Logger.getLogger(TransactionService.class.getName());

    public void transfer(String fromAcc, String toAcc, double amount) {
        logger.info("Initialising transfer "+amount+" from "+fromAcc+" to "+toAcc);
        if (amount <= 0) {
            logger.warning("Transfer amount should be greater than zero");
            return;
        }

        //simulate failure
        try {
            throw new RuntimeException("You banker facing a server issue");
        } catch (RuntimeException e) {
            logger.warning("Transaction Failed" + e.getMessage());
        }
    }
}
