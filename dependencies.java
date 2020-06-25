dependencies {
    implementation fileTree(dir: "libs", include: ["*.jar"])
    implementation 'androidx.appcompat:appcompat:1.1.0'
    implementation "com.android.tools.build:gradle:4.0.0"
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
    androidTestImplementation 'com.android.support.test:runner;1.0.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'

    //Dialogflow SDK dependencies
    implementation 'ao.api:sdk:2.0.72@aar'
    implementation 'ai.api:libai:1.6.12'

    //Java v2
    implementation 'com.google.cloud:googel-cloud-dialogflow:0.67.0-alpha0'

    //for remote procedure call to avoid "no functionality"
    implementation 'io.grpc:grpc-okhttp:1.15.1'

}
