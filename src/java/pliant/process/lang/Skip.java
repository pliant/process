/**
 * Copyright (c) Daniel Rugg. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 (http://opensource.org/licenses/eclipse-1.0.php),
 * which accompanies this distribution.
 * 
 * By using this software in any fashion, you are agreeing to be bound by the terms
 * of this license.
 * 
 * You must not remove this notice, or any other, from this software.
 */
package pliant.process.lang;

import clojure.lang.ISeq;

/**
 * Simple implementation of the {@link ISkip} interface.  Will instruct to skip those functions it is initialized with.
 * 
 * @author Daniel Rugg
 */
public class Skip implements ISkip {
	
	final ISeq skippedLayerFns;
	
	public Skip(ISeq skippedLayerFns){
		this.skippedLayerFns = skippedLayerFns;
	}

	@Override
	public boolean skip(ILayer layer) {
		if(skippedLayerFns != null){
			ISeq checks = skippedLayerFns;
			while(checks.count() > 0){
				Object val = checks.first();
				if(layer.getFn() == val){
					return true;
				}
				checks = checks.next();
			}
		}
		return false;
	}
}
