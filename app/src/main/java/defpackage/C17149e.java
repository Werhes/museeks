package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٝؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17149e {
    public static final C10914e advert = new C10914e(2);
    public static int mopub;
    public final String ad;
    public final int adcel;
    public final float appmetrica;
    public final long billing;
    public final float license;
    public final float metrica;
    public final C15515e purchase;
    public final boolean startapp;
    public final float vip;
    public final int yandex;

    public C17149e(String str, float f, float f2, float f3, float f4, C15515e c15515e, long j, int i, boolean z) {
        int i2;
        synchronized (advert) {
            i2 = mopub;
            mopub = i2 + 1;
        }
        this.ad = str;
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
        this.appmetrica = f4;
        this.purchase = c15515e;
        this.billing = j;
        this.yandex = i;
        this.startapp = z;
        this.adcel = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17149e)) {
            return false;
        }
        C17149e c17149e = (C17149e) obj;
        return AbstractC7890e.billing(this.ad, c17149e.ad) && C15765e.vip(this.vip, c17149e.vip) && C15765e.vip(this.metrica, c17149e.metrica) && this.license == c17149e.license && this.appmetrica == c17149e.appmetrica && this.purchase.equals(c17149e.purchase) && C3618e.metrica(this.billing, c17149e.billing) && this.yandex == c17149e.yandex && this.startapp == c17149e.startapp;
    }

    public final int hashCode() {
        int hashCode = (this.purchase.hashCode() + AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(this.ad.hashCode() * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31)) * 31;
        int i = C3618e.mopub;
        return ((AbstractC5087e.m1744class(hashCode, this.billing, 31) + this.yandex) * 31) + (this.startapp ? 1231 : 1237);
    }
}
