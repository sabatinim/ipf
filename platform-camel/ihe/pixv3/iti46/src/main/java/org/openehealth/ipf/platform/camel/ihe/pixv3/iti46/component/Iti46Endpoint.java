/*
 * Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.platform.camel.ihe.pixv3.iti46.component;

import java.net.URISyntaxException;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.openehealth.ipf.commons.ihe.ws.ItiClientFactory;
import org.openehealth.ipf.commons.ihe.ws.ItiServiceFactory;
import org.openehealth.ipf.platform.camel.ihe.pixv3.iti46.Iti46;
import org.openehealth.ipf.platform.camel.ihe.pixv3.iti46.service.Iti46Service;
import org.openehealth.ipf.platform.camel.ws.DefaultItiConsumer;
import org.openehealth.ipf.platform.camel.ws.DefaultItiEndpoint;

/**
 * The Camel endpoint for the ITI-46 transaction.
 */
public class Iti46Endpoint extends DefaultItiEndpoint {
    /**
     * Constructs the endpoint.
     * @param endpointUri
     *          the endpoint URI.
     * @param address
     *          the endpoint address from the URI.
     * @param iti47Component
     *          the component creating this endpoint.
     * @throws URISyntaxException
     *          if the endpoint URI was not a valid URI.
     */
    public Iti46Endpoint(
            String endpointUri, 
            String address, 
            Iti46Component iti47Component) throws URISyntaxException 
    {
        super(endpointUri, address, iti47Component);
    }

    public Producer createProducer() throws Exception {
        ItiClientFactory clientFactory = 
            Iti46.getClientFactory(isAudit(), isAllowIncompleteAudit(), getServiceUrl());
        return new Iti46Producer(this, clientFactory);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        ItiServiceFactory serviceFactory = 
            Iti46.getServiceFactory(isAudit(), isAllowIncompleteAudit(), getServiceAddress());
        Iti46Service service = serviceFactory.createService(Iti46Service.class);
        return new DefaultItiConsumer(this, processor, service);
    }
}
