/**
 * This class is post interface.
 * @author Meltem TOKGOZ - 21527381
 * @version 1.0, 21 April 2017
 *
 */
import java.sql.Date;
import java.util.UUID;
public interface PostInterface {
	
	void setText(String iText);
	String getText();
	Date getDate();
	UUID getID();
}