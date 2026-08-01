package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8930e implements InterfaceC5366e {
    public final int ad;
    public final int vip;

    public C8930e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    @Override // defpackage.InterfaceC5366e
    public final void ad(C11199e c11199e) {
        int metrica = AbstractC3062e.metrica(this.ad, 0, ((C9831e) c11199e.f22467e).m2700interface());
        int metrica2 = AbstractC3062e.metrica(this.vip, 0, ((C9831e) c11199e.f22467e).m2700interface());
        if (metrica < metrica2) {
            c11199e.adcel(metrica, metrica2);
        } else {
            c11199e.adcel(metrica2, metrica);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8930e)) {
            return false;
        }
        C8930e c8930e = (C8930e) obj;
        return this.ad == c8930e.ad && this.vip == c8930e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.ad);
        sb.append(", end=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
