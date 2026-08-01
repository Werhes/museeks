package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13258e extends AbstractC16082e {
    public C7850e billing;
    public static final Logger yandex = Logger.getLogger(AbstractC13258e.class.getName());
    public static final boolean startapp = AbstractC5314e.appmetrica;

    public static int adcel(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int appmetrica(int i, AbstractC10498e abstractC10498e) {
        int startapp2 = startapp(i);
        int size = abstractC10498e.size();
        return adcel(size) + size + startapp2;
    }

    public static int billing(long j) {
        return mopub((j >> 63) ^ (j << 1));
    }

    public static int mopub(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int purchase(int i) {
        return adcel((i >> 31) ^ (i << 1));
    }

    public static int startapp(int i) {
        return adcel(i << 3);
    }

    public static int yandex(String str) {
        int length;
        try {
            length = AbstractC18226e.vip(str);
        } catch (C8300e unused) {
            length = str.getBytes(AbstractC10546e.ad).length;
        }
        return adcel(length) + length;
    }

    public abstract void Signature(int i, int i2);

    public abstract void admob(int i);

    public abstract void ads(long j);

    public final void advert(String str, C8300e c8300e) {
        yandex.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c8300e);
        byte[] bytes = str.getBytes(AbstractC10546e.ad);
        try {
            isPro(bytes.length);
            license(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(e);
        }
    }

    public abstract void amazon(int i, boolean z);

    public abstract void applovin(int i, long j);

    public abstract void inmobi(int i, int i2);

    public abstract void isPro(int i);

    public abstract void isVip(int i, int i2);

    public abstract void loadAd(int i, AbstractC10498e abstractC10498e);

    public abstract void pro(int i, int i2);

    public abstract void remoteconfig(long j);

    public abstract void signatures(int i);

    public abstract void smaato(byte b);

    public abstract void subscription(int i, long j);

    public abstract void tapsense(int i, String str);
}
