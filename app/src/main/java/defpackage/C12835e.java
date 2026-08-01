package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12835e extends AbstractC0301e {
    public final C13903e ad;
    public final C5709e license;
    public final C1062e metrica;
    public final C5031e vip;

    public C12835e(C13903e c13903e, C5031e c5031e, C1062e c1062e, C5709e c5709e) {
        this.ad = c13903e;
        this.vip = c5031e;
        this.metrica = c1062e;
        this.license = c5709e;
    }

    public static C11106e vip() {
        C11106e c11106e = new C11106e(11, false);
        c11106e.f22008e = null;
        c11106e.f22007e = null;
        c11106e.f22009e = null;
        c11106e.f22006e = C5709e.license;
        return c11106e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.license != C5709e.license;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12835e)) {
            return false;
        }
        C12835e c12835e = (C12835e) obj;
        return this.ad == c12835e.ad && this.vip == c12835e.vip && this.metrica == c12835e.metrica && this.license == c12835e.license;
    }

    public final int hashCode() {
        return Objects.hash(C12835e.class, this.ad, this.vip, this.metrica, this.license);
    }

    public final String toString() {
        return "HPKE Parameters (Variant: " + this.license + ", KemId: " + this.ad + ", KdfId: " + this.vip + ", AeadId: " + this.metrica + ")";
    }
}
