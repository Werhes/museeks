package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16754e extends AbstractC16275e {
    public C13935e vip;
    public static final Logger metrica = Logger.getLogger(AbstractC16754e.class.getName());
    public static final boolean license = AbstractC14352e.appmetrica;

    public static int adcel(int i) {
        return mopub(i << 3);
    }

    public static int advert(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int billing(int i) {
        return mopub((i >> 31) ^ (i << 1));
    }

    public static int mopub(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int purchase(int i, AbstractC4002e abstractC4002e) {
        int adcel = adcel(i);
        int size = abstractC4002e.size();
        return mopub(size) + size + adcel;
    }

    public static int startapp(String str) {
        int length;
        try {
            length = AbstractC15375e.vip(str);
        } catch (C4035e unused) {
            length = str.getBytes(AbstractC0352e.ad).length;
        }
        return mopub(length) + length;
    }

    public static int yandex(long j) {
        return advert((j >> 63) ^ (j << 1));
    }

    public abstract void Signature(int i, AbstractC4002e abstractC4002e);

    public abstract void admob(int i, int i2);

    public abstract void ads(int i);

    public abstract void amazon(byte b);

    public abstract void applovin(int i, int i2);

    public abstract void inmobi(int i, String str);

    public abstract void isPro(int i, int i2);

    public abstract void isVip(int i, AbstractC6866e abstractC6866e, InterfaceC3028e interfaceC3028e);

    public abstract void loadAd(int i, boolean z);

    public abstract void premium(int i, long j);

    public abstract void pro(long j);

    public abstract void remoteconfig(int i, long j);

    public abstract void signatures(int i, int i2);

    public final void smaato(String str, C4035e c4035e) {
        metrica.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c4035e);
        byte[] bytes = str.getBytes(AbstractC0352e.ad);
        try {
            ads(bytes.length);
            appmetrica(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C13593e(e);
        }
    }

    public abstract void subs(long j);

    public abstract void subscription(int i);

    public abstract void tapsense(int i);
}
