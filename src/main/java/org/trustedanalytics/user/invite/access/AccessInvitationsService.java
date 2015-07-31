/**
 *  Copyright (c) 2015 Intel Corporation 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.trustedanalytics.user.invite.access;

import java.util.List;
import java.util.UUID;

public interface AccessInvitationsService {

    List<UUID> getAccessInvitations(String email, AccessInvitations.AccessInvitationsType type);

    void addAccessInvitation(String email, UUID uuid, AccessInvitations.AccessInvitationsType type);

    void useAccessInvitations(String email);

    boolean getOrgCreationEligibility(String email);

    void addEligibilityToCreateOrg(String email);
}