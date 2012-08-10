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

/**
 * Simple implementation of the {@link ICallback} interface.  Will invoke the function that it is 
 * initialized with if it is valid.
 * 
 * @author Daniel Rugg
 */
public class Callback implements ICallback {

	final IFn function;
	
	public Callback(IFn function){
		this.function = function;
	}
	
	@Override
	public Object invoke(Object formerReturnValue) {
		if(function != null){
			return function.invoke(formerReturnValue);
		}
		return formerReturnValue;
	}
}
