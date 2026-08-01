package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۢٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5988e implements InterfaceC16707e {
    public final float ad;
    public final C12370e metrica;
    public final C12370e vip;

    public C5988e(float f, C12370e c12370e, C12370e c12370e2) {
        this.ad = f;
        this.vip = c12370e;
        this.metrica = c12370e2;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5988e)) {
            return false;
        }
        C5988e c5988e = (C5988e) obj;
        return Float.compare(this.ad, c5988e.ad) == 0 && Objects.equals(this.vip, c5988e.vip) && Objects.equals(this.metrica, c5988e.metrica);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.ad) * 31;
        C12370e c12370e = this.vip;
        int hashCode = (floatToIntBits + (c12370e != null ? c12370e.hashCode() : 0)) * 31;
        C12370e c12370e2 = this.metrica;
        return hashCode + (c12370e2 != null ? c12370e2.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.ad + ", field 1=" + this.vip + ", field 2=" + this.metrica;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
