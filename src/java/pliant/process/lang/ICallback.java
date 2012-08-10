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

/**
 * Defines a type {@link IContinue} interface that allows for a callback function to be executed after the 
 * rest of the stack of layers have been evaluated.
 * 
 * @author Daniel Rugg
 */
public interface ICallback extends IContinue{

	/**
	 * Invokes the internal function that is stored in the callback.
	 * @param formerReturnValue The return value from the last executed layer or ICallback.
	 * @return The return value of the internal function.
	 */
	Object invoke(final Object formerReturnValue);
}
