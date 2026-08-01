package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15079e {
    public final Object ad;
    public final /* synthetic */ C0917e metrica;
    public int vip;

    public C15079e(C0917e c0917e, int i) {
        this.metrica = c0917e;
        this.ad = c0917e.ad[i];
        this.vip = i;
    }

    public final int ad() {
        int i = this.vip;
        Object obj = this.ad;
        C0917e c0917e = this.metrica;
        if (i == -1 || i >= c0917e.metrica || !AbstractC13328e.metrica(obj, c0917e.ad[i])) {
            this.vip = c0917e.metrica(obj);
        }
        int i2 = this.vip;
        if (i2 == -1) {
            return 0;
        }
        return c0917e.vip[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15079e) {
            C15079e c15079e = (C15079e) obj;
            if (ad() == c15079e.ad() && AbstractC13328e.metrica(this.ad, c15079e.ad)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.ad;
        return (obj == null ? 0 : obj.hashCode()) ^ ad();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.ad);
        int ad = ad();
        if (ad == 1) {
            return valueOf;
        }
        return valueOf + " x " + ad;
    }
}
