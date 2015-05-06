import java.util.Date;

/**
 * A very simple timeservice just for experimentation.
 * 
 * @author ExampleAuthor
 */
public interface TimeService {
	
	/**
	 * Get the current date.
	 * 
	 * @return current date
	 */
	public Date getCurrentDate();
	
	/**
	 * Returns the number of days between to dates.
	 * 
	 * @throws IllegalArgumentException
	 *             if fromDate or toDate is not valid
	 * @param dateFrom
	 * @param dateTo
	 * @return days between dateFrom and dateTo
	 */
	public long daysBetween(Date dateFrom, Date dateTo);
	
}