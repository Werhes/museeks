package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11897e extends AbstractC10947e {
    public final int ad;
    public final C15400e appmetrica;
    public final int license;
    public final int metrica;
    public final C6325e purchase;
    public final int vip;

    public C11897e(int i, int i2, int i3, int i4, C15400e c15400e, C6325e c6325e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = c15400e;
        this.purchase = c6325e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِّؔ] */
    public static C2532e vip() {
        ?? obj = new Object();
        obj.f6388e = null;
        obj.f6386e = null;
        obj.f6385e = null;
        obj.f6387e = null;
        obj.f6384e = null;
        obj.f6389e = C15400e.f30386e;
        return obj;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.appmetrica != C15400e.f30386e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11897e)) {
            return false;
        }
        C11897e c11897e = (C11897e) obj;
        return c11897e.ad == this.ad && c11897e.vip == this.vip && c11897e.metrica == this.metrica && c11897e.license == this.license && c11897e.appmetrica == this.appmetrica && c11897e.purchase == this.purchase;
    }

    public final int hashCode() {
        return Objects.hash(C11897e.class, Integer.valueOf(this.ad), Integer.valueOf(this.vip), Integer.valueOf(this.metrica), Integer.valueOf(this.license), this.appmetrica, this.purchase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.appmetrica);
        sb.append(", hashType: ");
        sb.append(this.purchase);
        sb.append(", ");
        sb.append(this.metrica);
        sb.append("-byte IV, and ");
        sb.append(this.license);
        sb.append("-byte tags, and ");
        sb.append(this.ad);
        sb.append("-byte AES key, and ");
        return AbstractC17861e.smaato(this.vip, "-byte HMAC key)", sb);
    }
}
