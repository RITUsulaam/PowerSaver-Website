package com.syracuse.PowerSaverHQ.services;

import com.sendgrid.SendGrid;

abstract class EmailConnections {
    public static final SendGrid sendGrid =
            new SendGrid("insertkey");
}
