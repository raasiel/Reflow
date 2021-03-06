/*
   Copyright 2007,2008,2009,2010 Rustici Software, LLC
   Copyright 2010,2011 Kevin Glynn (kevin.glynn@twigletsoftware.com)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

   Author(s):

   Kevin Glynn (kevin.glynn@twigletsoftware.com)
*/

package CS2JNet.System;

public class ArgumentException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4437546264011007931L;
	private String param = "";
	
	/**
	 * 
	 */
	public ArgumentException() {
	}

	/**
	 * @param arg0
	 */
	public ArgumentException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public ArgumentException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0 the detail message
	 * @param arg1 the cause
	 */
	public ArgumentException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0 the detail message
	 * @param arg1 the parameter name
	 */
	public ArgumentException(String arg0, String arg1) {
		super(arg0);
		setParam(arg1);
	}

	/**
	 * @param arg0  the detail message
	 * @param p     the parameter name
	 * @param arg1  the cause
	 */
	public ArgumentException(String arg0, String p, Throwable arg1) {
		super(arg0, arg1);
		setParam(p);
	}

	/**
	 * @param param the param to set
	 */
	private void setParam(String param) {
		this.param = param;
	}

	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}

}
