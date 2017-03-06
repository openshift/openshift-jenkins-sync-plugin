/**
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.jenkins.openshiftsync;

/**
 */
public class Constants {
  public static final String OPENSHIFT_DEFAULT_NAMESPACE = "default";

  public static final String OPENSHIFT_ANNOTATIONS_BUILD_NUMBER = "openshift.io/build.number";
  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_BUILD_URI = "openshift.io/jenkins-build-uri";
  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_LOG_URL = "openshift.io/jenkins-log-url";
  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_CONSOLE_LOG_URL = "openshift.io/jenkins-console-log-url";
  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_BLUEOCEAN_LOG_URL = "openshift.io/jenkins-blueocean-log-url";
  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_PENDING_INPUT_ACTION_JSON = "openshift.io/jenkins-pending-input-actions-json";


  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_STATUS_JSON = "openshift.io/jenkins-status-json";
  public static final String OPENSHIFT_ANNOTATIONS_JENKINS_NAMESPACE = "openshift.io/jenkins-namespace";
  public static final String OPENSHIFT_LABELS_BUILD_CONFIG_NAME = "openshift.io/build-config.name";

  public static final String OPENSHIFT_SECRETS_DATA_USERNAME = "username";
  public static final String OPENSHIFT_SECRETS_DATA_PASSWORD = "password";
  public static final String OPENSHIFT_SECRETS_DATA_SSHPRIVATEKEY = "ssh-privatekey";
  public static final String OPENSHIFT_SECRETS_TYPE_SSH = "kubernetes.io/ssh-auth";
  public static final String OPENSHIFT_SECRETS_TYPE_BASICAUTH = "kubernetes.io/basic-auth";
  public static final String OPENSHIFT_SECRETS_TYPE_OPAQUE = "Opaque";
  public static final String OPENSHIFT_BUILD_STATUS_FIELD = "status";
}
