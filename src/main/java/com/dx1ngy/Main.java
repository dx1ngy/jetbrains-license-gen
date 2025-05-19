package com.dx1ngy;

import org.bouncycastle.asn1.*;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;

public class Main {
    private static final String jetbrains_root_cert = """
            -----BEGIN CERTIFICATE-----
            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
            -----END CERTIFICATE-----
            """;

    public static void main(String[] args) throws Exception {
        //1. 生成密钥对
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(4096);
        KeyPair keyPair = keyGen.generateKeyPair();
        //2. 生成自己的证书
        X500Name issuer = new X500Name("CN=JetProfile CA");
        X500Name subject = new X500Name("CN=Dx1ngy CA");
        BigInteger serial = BigInteger.valueOf(System.currentTimeMillis());
        Date notBefore = new Date(System.currentTimeMillis() - 86400000);
        Date notAfter = new Date(System.currentTimeMillis() + 3650 * 86400000L);
        X509v3CertificateBuilder certBuilder =
                new JcaX509v3CertificateBuilder(issuer, serial, notBefore, notAfter, subject, keyPair.getPublic());
        ContentSigner signer = new JcaContentSignerBuilder("SHA256WithRSA")
                .build(keyPair.getPrivate());
        X509CertificateHolder certHolder = certBuilder.build(signer);
        X509Certificate cert = new JcaX509CertificateConverter().getCertificate(certHolder);
        //3. 生成license
        String licenseId = "00000000";
        String licensePart = "{\"licenseId\":\"00000000\",\"licenseeName\":\"dx1ngy\",\"assigneeName\":\"dx1ngy\",\"assigneeEmail\":\"\",\"licenseRestriction\":\"\",\"checkConcurrentUse\":false,\"products\":[{\"code\":\"YTD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDGO\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"MF\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DG\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QA\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"IIE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"YTWE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FLS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DLE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RFU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PPS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCWMP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"II\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"TCC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FLIJ\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"TBA\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"SPP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDCLD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"SPA\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DMCLP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PSW\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"GW\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PSI\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"IIU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DMU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PWS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"HB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"WS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"KT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DCCLT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSCLT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"WRS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RRD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"TC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"IIC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDPY\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPK\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PDB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPPS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDPHP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"GO\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"HCC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RDCPPP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDJVMC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DM\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CWML\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FLL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RR\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDJS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RM\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"MPS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPN\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"US\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CLN\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPCLT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSV\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"MPSIIP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDANDC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"AC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDJVM\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PRB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CWMR\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"SP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RS0\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSF\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PGO\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDPYC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PPC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"EHS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSCHB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDNET\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"JCD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false}],\"metadata\":\"0120250101AAAA000000\",\"hash\":\"0\",\"gracePeriodDays\":7,\"autoProlongated\":true,\"isAutoProlongated\":true}";
        byte[] licensePartBytes = licensePart.getBytes();
        String licensePartBase64 = Base64.getEncoder().encodeToString(licensePartBytes);
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initSign(keyPair.getPrivate());
        signature.update(licensePartBytes);
        byte[] sign = signature.sign();
        String sigResultsBase64 = Base64.getEncoder().encodeToString(sign);
        String certBase64 = Base64.getEncoder().encodeToString(cert.getEncoded());
        String key = licenseId + "-" + licensePartBase64 + "-" + sigResultsBase64 + "-" + certBase64;
        System.out.println(key);
        //4. 生成ja-netfilter配置
        //4.1 读取jetbrains的根证书
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        X509Certificate rootCert = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(jetbrains_root_cert.getBytes()));
        RSAPublicKey rootPublicKey = (RSAPublicKey) rootCert.getPublicKey();
        BigInteger m = new BigInteger(1, cert.getSignature());
        BigInteger exp = rootPublicKey.getPublicExponent();
        BigInteger n = rootPublicKey.getModulus();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(cert.getTBSCertificate());
        byte[] digest = md.digest();
        //4.2 根据自己的证书的签名编码为DER格式
        ASN1EncodableVector algId = new ASN1EncodableVector();
        algId.add(new ASN1ObjectIdentifier("2.16.840.1.101.3.4.2.1")); // SHA-256 OID
        algId.add(DERNull.INSTANCE); // 参数为 NULL
        ASN1Sequence algorithmIdentifier = new DERSequence(algId);
        ASN1EncodableVector digestInfo = new ASN1EncodableVector();
        digestInfo.add(algorithmIdentifier);
        digestInfo.add(new DEROctetString(digest)); // 摘要值
        ASN1Sequence digestInfoSeq = new DERSequence(digestInfo);
        byte[] encoded = digestInfoSeq.getEncoded(ASN1Encoding.DER);
        //4.3 使用PKCS#1 v1.5进行填充
        int modulusLength = (((RSAPublicKey) cert.getPublicKey()).getModulus().bitLength() + 7) / 8;
        byte[] padded = new byte[modulusLength];
        padded[0] = 0x00;
        padded[1] = 0x01;
        int psLength = modulusLength - 3 - encoded.length;
        Arrays.fill(padded, 2, 2 + psLength, (byte) 0xFF);
        padded[2 + psLength] = 0x00;
        System.arraycopy(encoded, 0, padded, 3 + psLength, encoded.length);
        BigInteger c = new BigInteger(1, padded);
        System.out.println("EQUAL," + m + "," + exp + "," + n + "->" + c);
    }

}