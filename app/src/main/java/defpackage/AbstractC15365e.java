package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15365e {
    public static final C4574e ad = new C4574e(0.31006f, 0.31616f);
    public static final C4574e vip = new C4574e(0.34567f, 0.3585f);
    public static final C4574e metrica = new C4574e(0.32168f, 0.33767f);
    public static final C4574e license = new C4574e(0.31271f, 0.32902f);
    public static final float[] appmetrica = {0.964212f, 1.0f, 0.825188f};

    public static boolean ad(FileChannel fileChannel) {
        long size = fileChannel.size() - fileChannel.position();
        int i = AbstractC3395e.appmetrica;
        if (size < i) {
            throw new Exception("This is not a WAV File (<12 bytes)");
        }
        ByteBuffer startapp = AbstractC1983e.startapp(fileChannel, i);
        if (!AbstractC1983e.adcel(startapp).equals("RIFF")) {
            return false;
        }
        startapp.getInt();
        return AbstractC1983e.adcel(startapp).equals("WAVE");
    }

    public static final Class license(ClassLoader classLoader, String str) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final C0661e metrica(List list) {
        int size = list.size();
        if (size == 0) {
            return new C0661e();
        }
        if (size == 1) {
            return AbstractC8116e.license(list.get(0));
        }
        C0661e c0661e = new C0661e();
        c0661e.addAll(list);
        return c0661e;
    }

    public static String vip(X509Certificate x509Certificate) {
        if (!AbstractC0869e.premium(x509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int length = encoded.length;
        AbstractC7844e.startapp(encoded.length, 0, length);
        byte[] remoteconfig = AbstractC1660e.remoteconfig(0, length, encoded);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(remoteconfig, 0, remoteconfig.length);
        return "sha256/".concat(ad.ad(messageDigest.digest(), ad.ad));
    }
}
