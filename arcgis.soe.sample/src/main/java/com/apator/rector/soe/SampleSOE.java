package com.apator.rector.soe;

import java.io.IOException;

import javax.xml.ws.Service.Mode;

import com.esri.arcgis.interop.AutomationException;
import com.esri.arcgis.interop.extn.ArcGISExtension;
import com.esri.arcgis.interop.extn.ServerObjectExtProperties;
import com.esri.arcgis.server.IServerObjectExtension;
import com.esri.arcgis.server.IServerObjectHelper;
import com.esri.arcgis.system.ILog;
import com.esri.arcgis.system.ServerUtilities;

@ArcGISExtension
@ServerObjectExtProperties(displayName = "SampleSOE", description = "SampleSOE")
public class SampleSOE implements IServerObjectExtension, ISampleSOE {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ILog serverLog;

	@Override
	public void init(IServerObjectHelper soh) throws IOException, AutomationException {
		serverLog = ServerUtilities.getServerLogger();
		serverLog.addMessage(3, 200, "Initializing... " + this.getClass().getName() + " SOE.");
		this.serverLog.addMessage(3, 200, System.getProperty("java.runtime.version"));
		this.serverLog.addMessage(3, 200, System.getProperty("java.home"));
		try {
			// SOE crash here - api removed from JDK 11
			Mode mode = Mode.MESSAGE;
			serverLog.addMessage(3, 200, mode.name());

		} catch (Exception e) {
			serverLog.addMessage(1, 200, e.getMessage());
		}

		serverLog.addMessage(3, 200, "Initialized" + this.getClass().getName() + " SOE.");
	}

	@Override
	public void shutdown() throws IOException, AutomationException {
		serverLog.addMessage(3, 200, "Shutting down " + this.getClass().getName() + " SOE.");
		this.serverLog = null;
	}

	@Override
	public String sayHello() {
		return "Hello";
	}

}
