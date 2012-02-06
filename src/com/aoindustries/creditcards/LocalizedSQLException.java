package com.aoindustries.creditcards;

/*
 * Copyright 2007-2009 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
import java.sql.SQLException;
import java.util.Locale;

/**
 * Extends <code>SQLException</code> to provide exceptions with both JVM default locale and user locale error messages.
 *
 * @author  AO Industries, Inc.
 */
public class LocalizedSQLException extends SQLException {

    final private String localizedMessage;

    public LocalizedSQLException(Locale userLocale, String key) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key));
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key);
    }

    public LocalizedSQLException(Locale userLocale, String key, Object arg0) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0));
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0);
    }

    public LocalizedSQLException(Locale userLocale, String key, Object arg0, Object arg1) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0, arg1));
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0, arg1);
    }

    public LocalizedSQLException(Throwable cause, Locale userLocale, String key) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key));
        initCause(cause);
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key);
    }

    public LocalizedSQLException(Throwable cause, Locale userLocale, String key, Object arg0) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0));
        initCause(cause);
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0);
    }

    public LocalizedSQLException(Throwable cause, Locale userLocale, String key, Object arg0, Object arg1) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0, arg1));
        initCause(cause);
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0, arg1);
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }
}