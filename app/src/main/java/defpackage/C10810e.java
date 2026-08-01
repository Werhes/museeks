package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10810e {
    public final long ad;
    public final AbstractC4457e metrica;
    public final int vip;
    public static final C10810e license = new C10810e(C3618e.adcel, 3, null);
    public static final int appmetrica = 3;

    public C10810e(long j) {
        this(j, appmetrica, null);
    }

    public C10810e(long j, int i, AbstractC4457e abstractC4457e) {
        this.ad = j;
        this.vip = i;
        this.metrica = abstractC4457e;
    }

    public final boolean ad() {
        return (this.ad == 16 && this.metrica == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10810e)) {
            return false;
        }
        C10810e c10810e = (C10810e) obj;
        return C3618e.metrica(this.ad, c10810e.ad) && this.vip == c10810e.vip && AbstractC7890e.billing(this.metrica, c10810e.metrica);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        int ad = ((C10994e.ad(this.ad) * 31) + this.vip) * 31;
        AbstractC4457e abstractC4457e = this.metrica;
        return ad + (abstractC4457e == null ? 0 : abstractC4457e.hashCode());
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("HazeTint(color=", C3618e.startapp(this.ad), ", blendMode=", C8738e.billing(this.vip), ", brush=");
        tapsense.append(this.metrica);
        tapsense.append(")");
        return tapsense.toString();
    }
}
