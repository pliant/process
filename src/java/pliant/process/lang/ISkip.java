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
 * Defines a type {@link IContinue} interface that provides the ability to skip a future layer if desired.
 * 
 * @author Daniel Rugg
 */
public interface ISkip extends IContinue {

	/**
	 * Checks if a layer function should be skipped or not.
	 * @param layer
	 * @return
	 */
	boolean skip(ILayer layer);
}
