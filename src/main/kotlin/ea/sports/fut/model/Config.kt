package ea.sports.fut.model

data class Config(val requestProtocol: String,
                  val authURL: String,
                  val releaseType : String,
                  val eadpConnectHost: String,
                  val eadpPortalHost: String,
                  val eadpProxyHost: String,
                  val eadpClientId: String,
                  val eadpClientSecret: String,
                  val pinURL: String,
                  val showOffURL: String,
                  val resourceRoot: String,
                  val resourceBase: String,
                  val changelist: String,
                  val requestTimeout: Int,
                  val localStorageVersion: Int,
                  val maxConsecutive500Errors: Int,
                  val settingsRefreshInterval: Int,
                  val verboseLogging: Boolean,
                  val originCss: String,
                  val originJS: String,
                  val origiHost: String,
                  val originProfile: String,
                  val originMasterTitle: String,
                  val funCaptchaPublicKey: String)