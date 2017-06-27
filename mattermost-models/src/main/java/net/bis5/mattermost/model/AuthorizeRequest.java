/*
 * @(#) net.bis5.mattermost.model.AuthorizeRequest
 * Copyright (c) 2017 Maruyama Takayuki <bis5.wsys@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * TODO 型の説明
 * 
 * @author Maruyama Takayuki
 * @since 2017/06/07
 */
@Data
public class AuthorizeRequest {

	@JsonProperty("response_type")
	private String responseType;
	@JsonProperty("client_id")
	private String clientId;
	@JsonProperty("redirect_url")
	private String redirectUrl;
	@JsonProperty("scope")
	private String scope;
	@JsonProperty("state")
	private String state;

}
