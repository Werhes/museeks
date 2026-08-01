package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13874e extends AbstractC6874e {
    public static final boolean metrica = AbstractC1929e.license;
    public C16089e vip;

    public static int remoteconfig(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int subscription(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract void ads(int i, String str);

    public abstract void applovin(int i, boolean z);

    /* renamed from: class */
    public abstract void mo1196class(byte b);

    public abstract void crashlytics(int i, byte[] bArr);

    /* renamed from: extends */
    public abstract void mo1197extends(long j);

    public abstract void firebase(AbstractC17836e abstractC17836e);

    /* renamed from: goto */
    public abstract void mo1198goto(int i);

    public abstract void inmobi(int i, long j);

    /* renamed from: interface */
    public abstract void mo1199interface(int i);

    public abstract void isPro(int i, long j);

    public abstract void isVip(int i, int i2);

    /* renamed from: native */
    public abstract void mo1200native(long j);

    public abstract void premium(int i, AbstractC7244e abstractC7244e);

    public abstract void pro(int i, int i2);

    public abstract void signatures(int i, int i2);

    public abstract void subs(AbstractC7244e abstractC7244e);

    public abstract void tapsense(int i, int i2);

    /* renamed from: this */
    public abstract void mo1201this(int i);

    /* renamed from: throw */
    public abstract void mo1202throw(String str);
}
