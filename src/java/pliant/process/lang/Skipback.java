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

import clojure.lang.IFn;
import clojure.lang.ISeq;

/**
 * Simple implementation of the {@link ICallback} and {@link ISkip} interfaces.  Will invoke the function that it is 
 * initialized with if it is valid and instruct to skip those functions it is initialized with.
 * 
 * @author Daniel Rugg
 */
public class Skipback extends Skip implements ICallback {

	final IFn function;
	
	/**
	 * @param skippedLayers
	 */
	public Skipback(IFn callback, ISeq skippedLayers) {
		super(skippedLayers);
		this.function = callback;
	}
	
	@Override
	public Object invoke(Object formerReturnValue) {
		if(function != null){
			return function.invoke(formerReturnValue);
		}
		return formerReturnValue;
	}
}
