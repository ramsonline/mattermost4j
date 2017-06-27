/*
 * @(#) net.bis5.mattermost.model.CompliancePost
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

import lombok.Data;

/**
 * TODO 型の説明
 * 
 * @author Maruyama Takayuki
 * @since 2017/06/07
 */
@Data
public class CompliancePost {

	// From Team
	private String teamName;
	private String teamDisplayName;

	// From Channel
	private String channelName;
	private String channelDisplayName;

	// From User
	private String userUserName;
	private String userEmail;
	private String userNickname;

	// From Post
	private String postId;
	private long postCreateAt;
	private long postUpdateAt;
	private long postDeleteAt;
	private String postRootId;
	private String postParentId;
	private String postOriginalId;
	private String postMessage;
	private String postType; // XXX shuld be enum
	private String postProps;
	private String postHashtags;
	private String postFileIds;

}
