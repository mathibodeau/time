package com.pyxis.time.nist;

import java.text.ParseException;
import java.util.Date;

public interface TimeServerDialect {
    Date translate(String serverOuput) throws ParseException;
}
