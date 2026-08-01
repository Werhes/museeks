package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۛ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4383e {
    public final float ad;
    public final long appmetrica;
    public final float billing;
    public final int license;
    public final long metrica;
    public final AbstractC4457e purchase;
    public final float vip;

    public C4383e(float f, float f2, long j, long j2, AbstractC4457e abstractC4457e, float f3, int i) {
        this.ad = f;
        this.vip = f2;
        this.metrica = j;
        this.license = i;
        if (abstractC4457e instanceof C18466e) {
            this.appmetrica = ((C18466e) abstractC4457e).ad;
            this.purchase = null;
        } else {
            this.appmetrica = j2;
            this.purchase = abstractC4457e;
        }
        this.billing = AbstractC3062e.vip(f3, 0.0f, 1.0f);
    }

    public final C4383e ad() {
        long j = C3618e.startapp;
        if (j == 16) {
            j = C3618e.vip;
        }
        return new C4383e(this.ad, this.vip, this.metrica, j, null, this.billing, this.license);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4383e) {
            C4383e c4383e = (C4383e) obj;
            if (C15765e.vip(this.ad, c4383e.ad) && C15765e.vip(this.vip, c4383e.vip) && this.metrica == c4383e.metrica && this.billing == c4383e.billing && this.license == c4383e.license && C3618e.metrica(this.appmetrica, c4383e.appmetrica) && AbstractC7890e.billing(this.purchase, c4383e.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int license = AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31);
        long j = this.metrica;
        int license2 = (AbstractC1414e.license((((int) (j ^ (j >>> 32))) + license) * 31, this.billing, 31) + this.license) * 31;
        int i = C3618e.mopub;
        int m1744class = AbstractC5087e.m1744class(license2, this.appmetrica, 31);
        AbstractC4457e abstractC4457e = this.purchase;
        return m1744class + (abstractC4457e != null ? abstractC4457e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        AbstractC10257e.admob(this.ad, sb, ", spread=");
        AbstractC10257e.admob(this.vip, sb, ", offset=");
        sb.append((Object) C8163e.metrica(this.metrica));
        sb.append(", alpha=");
        sb.append(this.billing);
        sb.append(", blendMode=");
        sb.append((Object) C8738e.billing(this.license));
        sb.append(", color=");
        AbstractC5087e.m1754try(this.appmetrica, ", brush=", sb);
        sb.append(this.purchase);
        sb.append(')');
        return sb.toString();
    }
}
