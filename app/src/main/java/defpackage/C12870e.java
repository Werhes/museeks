package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12870e implements InterfaceC18133e {
    public final int ad;
    public final InterfaceC17838e metrica;
    public final int vip;

    public C12870e(int i, int i2, InterfaceC17838e interfaceC17838e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = interfaceC17838e;
    }

    public C12870e(int i, InterfaceC17838e interfaceC17838e, int i2) {
        this(i, 0, (i2 & 4) != 0 ? AbstractC5616e.ad : interfaceC17838e);
    }

    @Override // defpackage.InterfaceC18133e, defpackage.InterfaceC2869e
    public final InterfaceC0566e ad(C11139e c11139e) {
        return new C10629e(this.ad, this.vip, this.metrica);
    }

    @Override // defpackage.InterfaceC2869e
    public final InterfaceC17717e ad(C11139e c11139e) {
        return new C10629e(this.ad, this.vip, this.metrica);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12870e) {
            C12870e c12870e = (C12870e) obj;
            if (c12870e.ad == this.ad && c12870e.vip == this.vip && AbstractC7890e.billing(c12870e.metrica, this.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.metrica.hashCode() + (this.ad * 31)) * 31) + this.vip;
    }
}
