package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0097e {
    public static final byte[] ad = vip(1, 0);
    public static final byte[] adcel;
    public static final byte[] advert;
    public static final byte[] amazon;
    public static final byte[] appmetrica;
    public static final byte[] billing;
    public static final byte[] license;
    public static final byte[] loadAd;
    public static final byte[] metrica;
    public static final byte[] mopub;
    public static final byte[] purchase;
    public static final byte[] smaato;
    public static final byte[] startapp;
    public static final byte[] vip;
    public static final byte[] yandex;

    static {
        vip(1, 2);
        vip = vip(2, 32);
        metrica = vip(2, 16);
        license = vip(2, 17);
        appmetrica = vip(2, 18);
        purchase = vip(2, 1);
        billing = vip(2, 2);
        yandex = vip(2, 3);
        startapp = vip(2, 1);
        adcel = vip(2, 2);
        mopub = vip(2, 3);
        advert = new byte[0];
        Charset charset = AbstractC6336e.ad;
        smaato = "KEM".getBytes(charset);
        amazon = "HPKE".getBytes(charset);
        loadAd = "HPKE-v1".getBytes(charset);
    }

    public static int ad(C13903e c13903e) {
        if (c13903e == C13903e.billing || c13903e == C13903e.license) {
            return 32;
        }
        if (c13903e == C13903e.appmetrica) {
            return 48;
        }
        if (c13903e == C13903e.purchase) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static byte[] vip(int i, int i2) {
        if (i > 4 || i < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i * 8)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }
}
