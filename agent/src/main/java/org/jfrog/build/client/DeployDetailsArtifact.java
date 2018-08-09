/*
 * Copyright (C) 2010 JFrog Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jfrog.build.client;

import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;

import java.io.File;


/**
 * @author Noam Y. Tenne
 */
public class DeployDetailsArtifact {

    private DeployDetails deployDetails;

    public DeployDetailsArtifact(DeployDetails deployDetails) {
        this.deployDetails = deployDetails;
    }

    public String getDeploymentPath() {
        return deployDetails.getArtifactPath();
    }

    public File getFile() {
        return deployDetails.getFile();
    }

    public DeployDetails getDeployDetails() {
        return deployDetails;
    }
}
