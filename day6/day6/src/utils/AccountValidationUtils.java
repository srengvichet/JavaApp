package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cust_excs.AccountHandlingException;

public class AccountValidationUtils {
	public static final double MIN_BALANCE = 500;
	public static SimpleDateFormat sdf;
	private static Date beginDate, endDate;
	static {
		sdf = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			beginDate = sdf.parse("1-apr-2016");
			endDate = sdf.parse("31-mar-2017");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	// validate bal
	public static void validateBalance(double bal) throws AccountHandlingException {
		if (bal < MIN_BALANCE)
			throw new AccountHandlingException("Insufficient Balance ");
	}

	// validate a/c type
	public static void validateType(String type) throws Exception {
		{
			switch (type) {
			case "saving":
			case "current":
			case "fd":
				return;

			default:
				throw new AccountHandlingException("Invalid a/c type...");
			}
		}
	}

	// validate date --- rets parsed n validated date inst in absence of errs
	public static Date validateDate(String date) throws Exception {
		// parse
		Date d1 = sdf.parse(date);
		// validate
		if (d1.before(beginDate) || d1.after(endDate))
			throw new AccountHandlingException("Date out of range");
		return d1;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	

}
