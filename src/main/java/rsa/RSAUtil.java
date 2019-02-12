package rsa;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * 使用私钥将明文进行签名生成秘闻串与明文一起传输。对方收到数据后通过公钥对明文与明文进行验签。
 * 若验签通过就说明第一数据没有被修改过；第二这些数据一定是持有私钥的人发送的，因为私钥自己持有，
 * 这就起到了防止抵赖的作用。
 */
public class RSAUtil {

    private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";                     //签名算法
    private static final String KEY_ALGORITHM = "RSA";        //加密算法RSA

    /**
     * 公钥验签
     *
     * @param text      原字符串
     * @param sign      签名结果
     * @param publicKey 公钥
     * @return 验签结果
     */
    public static boolean verify(String text, String sign, String publicKey) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            PublicKey key = KeyFactory.getInstance(KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decodeBase64(publicKey)));
            signature.initVerify(key);
            signature.update(text.getBytes());
            return signature.verify(Base64.decodeBase64(sign));
        } catch (Exception e) {
            System.out.println("验签失败");
        }
        return false;
    }

    /**
     * 签名字符串
     *
     * @param text       需要签名的字符串
     * @param privateKey 私钥(BASE64编码)
     * @return 签名结果(BASE64编码)
     */
    public static String sign(String text, String privateKey) {
        byte[] keyBytes = Base64.decodeBase64(privateKey);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            PrivateKey privateK = keyFactory.generatePrivate(pkcs8KeySpec);
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initSign(privateK);
            signature.update(text.getBytes());
            byte[] result = signature.sign();
            return Base64.encodeBase64String(result);
        } catch (Exception e) {
            System.out.println("签名失败");
        }
        return null;
    }

    private static final String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA9PylzfCxmrNah5LrhVJ1734ac/iRsA0MWrWyiGNLRgeuCx2gBVqqUzOV/9MUGC+u4P79g6dCrkpbWcH5EtroBYNTaOYPWfxnU8+sjpDi8wOXoH2+WSywZSLeQsaY5x6RcCp2VplPgKZk4g3mI060LbGOWteOP23fbcFMJfZWUE5bqdhEfzcyLW3EXGjdVjqPx9jl4u6ce0gky8Qgm1/6lYCM2v+yUmld+2WjyjrJ3+kJoDr4Sx6v+tsMuS6NAqz4vPoqLs8fSjiKvVM+/Ovp4xBBQsfvPhiz9U/uaYKQvbsbWqjRbxVeIAjoRrHpZfcguMOulcaS4HjWymoT8FCKcwIDAQAB";

    public static void main(String[] args) {
        String text = "encode=eyJ1c2VyRmxhZyI6IiIsInVzZXJOYW1lIjoiIiwidXNlcklkIjoiMTI5NDk2OTEwNiJ9";
        String sign = "SROYSmoUeBr43XS6ipdO67WTHr0JgFx5xdYfjCaMQzpxedYR4mwNYUcVvd738nkmyYBeevqSCo7TJ05+rngK93rgxwMcuFu9EdpWwRsMLElo6FqnfN71IseNgyn3x3RBob5288nyLSuruDXB8RADzm47cRI8QKgSYfIGGpnEMEuvzBkSynlty4hcIr2ts0nbqxTb9imbFptGz9nABoU4/88mtmArWoqpd2XrziSXUIkYE25R/oTNerY8WABP8DeOg5U77+VV0VPyislQy7vqvc4yVxPwdOYOxXFYt2QntqL39p0VJrUHxxL+5lHpQQEj4PmZTRc9EeZ8e+ComQ5Cfw==";
        boolean verify = RSAUtil.verify(text, sign, publicKey);
        System.out.println("result: " + verify);

    }
}
