package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15694e extends AbstractC10947e {
    public final int ad;
    public final C16372e license;
    public final int metrica;
    public final int vip;

    public C15694e(int i, int i2, int i3, C16372e c16372e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = c16372e;
    }

    public static C11106e vip() {
        C11106e c11106e = new C11106e(3, false);
        c11106e.f22008e = null;
        c11106e.f22007e = null;
        c11106e.f22009e = null;
        c11106e.f22006e = C16372e.f32165e;
        return c11106e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.license != C16372e.f32165e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15694e)) {
            return false;
        }
        C15694e c15694e = (C15694e) obj;
        return c15694e.ad == this.ad && c15694e.vip == this.vip && c15694e.metrica == this.metrica && c15694e.license == this.license;
    }

    public final int hashCode() {
        return Objects.hash(C15694e.class, Integer.valueOf(this.ad), Integer.valueOf(this.vip), Integer.valueOf(this.metrica), this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.license);
        sb.append(", ");
        sb.append(this.vip);
        sb.append("-byte IV, ");
        sb.append(this.metrica);
        sb.append("-byte tag, and ");
        return AbstractC17861e.smaato(this.ad, "-byte key)", sb);
    }
}
