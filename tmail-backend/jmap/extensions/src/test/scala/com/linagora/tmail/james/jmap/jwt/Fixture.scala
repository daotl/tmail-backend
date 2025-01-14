package com.linagora.tmail.james.jmap.jwt

object Fixture {
  /**
   * Key pair generation used for this example:
   *
   * ``
   * $ openssl req \
   *    -subj "/C=FR/ST=French/L=Paris/O=Apache/CN=localhost" \
   *    -new -x509 -sha256 -newkey rsa:2048 -nodes \
   *    -keyout private_key \
   *    -days 365 \
   *    -out cert
   *
   * $ openssl rsa \
   *    -in private_key \
   *    -pubout > public_key
   * ``
   */

  lazy val validPrivateKey: String =
    """
      |-----BEGIN PRIVATE KEY-----
      |MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDEV3BhLSBHuApH
      |GNlquIczzcvDOc0HoqczATsM7CeRp2SUicioxlItL2q6tKGTsK1zCcM+uKw1ydxd
      |AGDxpBD6kqIel/Quu/dRd8H6P/f4Hr0OOxGCgc78FYvjY6gcbPtaOmD9u/RMRqP6
      |95s/DriPxPDYzA58yRH7NlhzJymthoZEtwIL/SuZ6e2huqnJdC11wEJgkwwkKO3x
      |01Y84V2y2EdRCvb5j9EOkCC5C4TGpjvSffD/4mcj+Z2VNTxQV0KdrlNxhBwwFEbL
      |TQ2B5hIkH2INDP6ubkxJeXmZ3iXyw+iNKtBUef9ZavIk4lZLKYNjZWX2eBg2cokT
      |p759oRoHAgMBAAECggEAdmyrCuH2C2wVPubdFIKygeuKEHnHkehoYtpGLLgv8al+
      |gB1PG4VrQXfNL0oN/w/cvntP+X/X1yWnNa0py/YCi7Bv+nX6wUl8lfXe2TtGLLEV
      |pQS5vfbfyqqQUpnkZyjQvo5hvAlnA67D73bze6g8Z/MItir2PgvlPZl85g/kEpX3
      |zt1yDTUFe+L8Ur+8Lied/0w2M53lUlebIYtsa2W7I05YzUBAVXkCIffnaIt3QtTC
      |tppBcVZXUacRtqULBMcUE2zc/yUKNqHzBjlkBv4VQ7nQDOjjUfW+VtccnTr+mLnl
      |R7VDy+POuZQ5u0gA8IwJNJFd5qdIm7l4tG7xa69rMQKBgQDmX1FF5Zty0Q7Acp1n
      |G9TZBOTTehzQPYsJwMynLR/b8mUAL+FTCh7Q7OJkGhcBxVDgc34OVPvc9wlFSUuU
      |ac0C0GtcD3BidatEfwMqVdpwcDnSEK47N13oSmaAL21mgC6/0ypV5TBgbkMRcxSb
      |h1GdeBWEG1RluVx6n1TflSvw6QKBgQDaLvj3fNbcIfJubx5oP2kmA1rw5jcSShK4
      |UgM4Ifj98LOmsiB6qfY+36p6D78XINV0KpS3THi8rWzf31OuTN1BoZ5UpcyOOrDb
      |2pNnfGpC1VBP4rfWJMNpcGstj3YUNEV5pLyd5Cd6/gV8nRgiQ9ccEDJ1I5GXVWfV
      |+2a7/zddbwKBgHqWWi8xoWiVqp3p36yQeNEK86E9J7wAI86K09xZ/MwTzn8s+2Au
      |0HsossfFwlxk3Uay7m899dB9fGdsO1W8fyVyNs8EQC+EoiCO3eZXTSfr8DjCO5Sz
      |P7tua+DmW/bhWv8kpTCUBwwpYHMWo+6nMVz0G67yxBRlcLqnsohPXtSRAoGBAMMD
      |MxJ6Kc1OJlMgzKve6YvJefJRwq19Oag33ZrBerz29IwtMCyTV36xCb3Z7zGr7j3L
      |hWskVdJGrEaZZUEogKaV31/HZcNGoCeSASiBIrUj1ongmfI0n9jRW2q4jJDYe7ST
      |UudJMySSgbL08spFmrIBpCfhJ9N8ybeP4i5smj7PAoGBANSfn+DzQPICp2rldw7y
      |rPSCywIM6LzdoyykRMmX04sQAFVKgJwPei+oLrg8HcUjCZ1t8KJ4tHsvqFkQ0O4s
      |q8eh2eli5Qppg/Qmx1zT1W7+JYxlPsiXfmViBcY2+yNjNOHQPzyJyE+pvybW0DC+
      |k9EJZv81OGrKInhjB/Ep6C76
      |-----END PRIVATE KEY-----""".stripMargin

  lazy val validPublicKey: String =
    """
      |-----BEGIN PUBLIC KEY-----
      |MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxFdwYS0gR7gKRxjZariH
      |M83LwznNB6KnMwE7DOwnkadklInIqMZSLS9qurShk7CtcwnDPrisNcncXQBg8aQQ
      |+pKiHpf0Lrv3UXfB+j/3+B69DjsRgoHO/BWL42OoHGz7Wjpg/bv0TEaj+vebPw64
      |j8Tw2MwOfMkR+zZYcycprYaGRLcCC/0rmentobqpyXQtdcBCYJMMJCjt8dNWPOFd
      |sthHUQr2+Y/RDpAguQuExqY70n3w/+JnI/mdlTU8UFdCna5TcYQcMBRGy00NgeYS
      |JB9iDQz+rm5MSXl5md4l8sPojSrQVHn/WWryJOJWSymDY2Vl9ngYNnKJE6e+faEa
      |BwIDAQAB
      |-----END PUBLIC KEY-----""".stripMargin
}
