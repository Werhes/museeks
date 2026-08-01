package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9580e implements InterfaceC16047e {
    public final C4906e ad;

    public C9580e(C4906e c4906e) {
        this.ad = c4906e;
    }

    @Override // defpackage.InterfaceC16047e
    public final int ad(C10163e c10163e, long j, int i, EnumC7792e enumC7792e) {
        int i2 = (int) (j >> 32);
        if (i < i2) {
            return AbstractC3062e.metrica(this.ad.ad(i, i2, enumC7792e), 0, i2 - i);
        }
        return AbstractC8703e.advert(1, enumC7792e != EnumC7792e.f15794e ? 0.0f * (-1) : 0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9580e) && this.ad.equals(((C9580e) obj).ad);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad.ad) * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.ad + ", margin=0)";
    }
}
