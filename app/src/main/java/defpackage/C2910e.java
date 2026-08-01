package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۠٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2910e implements InterfaceC5366e {
    public final int ad;
    public final int vip;

    public C2910e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    @Override // defpackage.InterfaceC5366e
    public final void ad(C11199e c11199e) {
        boolean z = c11199e.f22465e != -1;
        C9831e c9831e = (C9831e) c11199e.f22467e;
        if (z) {
            c11199e.f22465e = -1;
            c11199e.f22462e = -1;
        }
        int metrica = AbstractC3062e.metrica(this.ad, 0, c9831e.m2700interface());
        int metrica2 = AbstractC3062e.metrica(this.vip, 0, c9831e.m2700interface());
        if (metrica != metrica2) {
            if (metrica < metrica2) {
                c11199e.startapp(metrica, metrica2);
            } else {
                c11199e.startapp(metrica2, metrica);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2910e)) {
            return false;
        }
        C2910e c2910e = (C2910e) obj;
        return this.ad == c2910e.ad && this.vip == c2910e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.ad);
        sb.append(", end=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
