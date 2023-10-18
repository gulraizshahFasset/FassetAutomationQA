function fn() {
  var env = karate.env; // get java system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'staging'; // a custom 'intelligent' default
  }
  var config = { // base config JSON
    environment: karate.env,
    devBaseURL: '',
    baseURL: '',
    authTokenFinal: '',
    endingUrl: '.fasset.com',
    accessTokenConfig: ''
  };

  if (env == 'dev') {
    // over-ride only those that need to be
    config.baseURL = 'https://dev-cash-api.fasset.tech';
    config.devBaseURL = '';
  }
  else if (env == 'staging') {
    config.baseURL = 'https://staging.';
    config.devBaseURL = '';
  }

  // Called once function for authentication
  //var authenticationTokenResult = karate.callSingle('authenticationTokenCallSingle.feature');
  //config.authTokenFinal = authenticationTokenResult;
  // don't waste time waiting for a connection or if servers don't respond within 5 seconds
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return config;
}