/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.hmily.admin.result;

import java.io.Serializable;

/**
 * AjaxResponse.
 *
 * @author xiaoyu
 */
public class AjaxResponse implements Serializable {
    
    private static final long serialVersionUID = -2792556188993845048L;
    
    private static final int ERROR = 500;
    
    private static final int SUCCESSFUL = 200;
    
    private int code;
    
    private String message;
    
    private Object data;
    
    /**
     * Instantiates a new Ajax response.
     *
     * @param code    the code
     * @param message the message
     * @param data    the data
     */
    public AjaxResponse(final int code, final String message, final Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    /**
     * Success ajax response.
     *
     * @return the ajax response
     */
    public static AjaxResponse success() {
        return success("");
    }
    
    /**
     * Success ajax response.
     *
     * @param msg the msg
     * @return the ajax response
     */
    public static AjaxResponse success(final String msg) {
        return success(msg, null);
    }
    
    /**
     * Success ajax response.
     *
     * @param data the data
     * @return the ajax response
     */
    public static AjaxResponse success(final Object data) {
        return success(null, data);
    }
    
    /**
     * Success ajax response.
     *
     * @param msg  the msg
     * @param data the data
     * @return the ajax response
     */
    public static AjaxResponse success(final String msg, final Object data) {
        return get(SUCCESSFUL, msg, data);
    }
    
    /**
     * Error ajax response.
     *
     * @param msg the msg
     * @return the ajax response
     */
    public static AjaxResponse error(final String msg) {
        return error(ERROR, msg);
    }
    
    /**
     * Error ajax response.
     *
     * @param code the code
     * @param msg  the msg
     * @return the ajax response
     */
    public static AjaxResponse error(final int code, final String msg) {
        return get(code, msg, null);
    }
    
    /**
     * Get ajax response.
     *
     * @param code the code
     * @param msg  the msg
     * @param data the data
     * @return the ajax response
     */
    public static AjaxResponse get(final int code, final String msg, final Object data) {
        return new AjaxResponse(code, msg, data);
    }
    
    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }
    
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Gets data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }
    
    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(final Object data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "AjaxResponse [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
    
}
