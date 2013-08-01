/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.amqp.config;

import org.mule.transport.amqp.AmqpConnector;
import org.mule.transport.amqp.AmqpsConnector;

/**
 * Registers a Bean Definition Parser for handling <code><amqps:connector></code> elements and
 * supporting endpoint elements.
 */
public class AmqpsNamespaceHandler extends AmqpNamespaceHandler
{
    @Override
    public void init()
    {
        super.init();

        // add standard key and trust store config
    }

    @Override
    protected Class<? extends AmqpConnector> getConnectorClass()
    {
        return AmqpsConnector.class;
    }

    @Override
    protected String getConnectorProtocol()
    {
        return AmqpsConnector.AMQPS;
    }
}