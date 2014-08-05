package ru.itbasis.utils.core.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.itbasis.utils.core.LogMsg;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {
	private static final transient Logger LOG = LoggerFactory.getLogger(DateUtils.class.getName());

	private DateUtils() {
	}

	public static String formatAsShortDate(final Date date) {
		if (date == null) {
			return StringUtils.EMPTY;
		}
		return DateFormat.getDateInstance(DateFormat.SHORT).format(date);
	}

	public static String formatAsShortDate(final Calendar calendar) {
		if (calendar == null) {
			return StringUtils.EMPTY;
		}
		return formatAsShortDate(calendar.getTime());
	}

	public static String formatAsShortDateTime(final Date date) {
		if (date == null) {
			return StringUtils.EMPTY;
		}
		return DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(date);
	}

	public static String formatAsShortDateTime(final Calendar calendar) {
		if (calendar == null) {
			return StringUtils.EMPTY;
		}
		return formatAsShortDateTime(calendar.getTime());
	}

	public static Calendar getFirstDay(final Calendar calendar) {
		if (calendar == null) {
			return null;
		}
		final Calendar result = org.apache.commons.lang3.time.DateUtils.truncate(calendar, Calendar.MONTH);
		LOG.trace(LogMsg.VALUE, result.getTime());
		return result;
	}

	public static Calendar getLastDay(final Calendar calendar) {
		if (calendar == null) {
			return null;
		}
		final Calendar result = org.apache.commons.lang3.time.DateUtils.ceiling(calendar, Calendar.MONTH);
		result.add(Calendar.DAY_OF_MONTH, -1);
		LOG.trace(LogMsg.VALUE, result.getTime());
		return result;
	}

}
