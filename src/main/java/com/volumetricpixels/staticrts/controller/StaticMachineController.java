/*
 * This file is part of Static.
 *
 * Copyright (c) 2012-2012, VolumetricPixels <http://volumetricpixels.com/>
 * Static is licensed under the Public Protected License Version 1.
 *
 * We need to put a short thing here that goes at the top of every file.
 */
package com.volumetricpixels.staticrts.controller;

import org.spout.api.entity.component.Controller;
import org.spout.api.entity.component.controller.type.ControllerType;

public class StaticMachineController extends Controller implements StaticController {

	protected StaticMachineController(ControllerType type) {
	    super(type);
    }

	@Override
    public void onAttached() {
	    // TODO: onAttached stuff
    }
	
}
