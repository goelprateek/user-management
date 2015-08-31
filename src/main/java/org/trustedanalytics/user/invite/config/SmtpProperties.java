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
package org.trustedanalytics.user.invite.config;

import java.util.Arrays;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("smtp")
public class SmtpProperties {

    @Getter @Setter
    private String host;

    @Getter @Setter
    private int port;

    @Getter @Setter
    private int sslPort;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String username;

    @Getter @Setter
    private String password;

    @Getter @Setter
    private int timeout;

    @Getter @Setter
    private boolean debug;

    @Getter @Setter
    private String emailName;

    @Getter @Setter
    private boolean useSsl;

    @Getter @Setter
    private boolean useAuth;

    @Override
    public int hashCode() {
        return Objects.hash(host, port, username, password, timeout, debug, emailName, sslPort, useSsl, useAuth);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        SmtpProperties other;
        if (obj instanceof SmtpProperties) {
            other = (SmtpProperties) obj;
            return allTrue(Objects.equals(host, other.host),
                   Objects.equals(port, other.port),
                   Objects.equals(sslPort, other.sslPort),
                   Objects.equals(useSsl, other.useSsl),
                   Objects.equals(useAuth, other.useAuth),
                   Objects.equals(username, other.username),
                   Objects.equals(password, other.password),
                   Objects.equals(timeout, other.timeout),
                   Objects.equals(debug, other.debug),
                   Objects.equals(emailName, other.emailName));
        }
        
        return false;
    }

    private boolean allTrue(Boolean... args) {
        return !Arrays.asList(args).contains(false);
    }
}
