
/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.wsclient.validation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 *
 */
@WebFault(name = "DSSException", targetNamespace = "http://ws.dss.esig.europa.eu/")
public class DSSException_Exception
extends Exception
{

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 *
	 */
	private DSSException faultInfo;

	/**
	 *
	 * @param message
	 * @param faultInfo
	 */
	public DSSException_Exception(String message, DSSException faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 *
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public DSSException_Exception(String message, DSSException faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 *
	 * @return
	 *     returns fault bean: e eu.europa.esig.dss.wsclient.validation.DSSException
	 */
	public DSSException getFaultInfo() {
		return faultInfo;
	}

}