package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0834e extends AbstractC0301e {
    public final int ad;
    public final C6594e metrica;
    public final int vip;

    public C0834e(int i, int i2, C6594e c6594e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = c6594e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚؒ, java.lang.Object] */
    public static C0909e vip() {
        ?? obj = new Object();
        obj.f3323e = null;
        obj.f3322e = null;
        obj.f3321e = C6594e.f13611e;
        return obj;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.metrica != C6594e.f13611e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0834e)) {
            return false;
        }
        C0834e c0834e = (C0834e) obj;
        return c0834e.ad == this.ad && c0834e.metrica() == metrica() && c0834e.metrica == this.metrica;
    }

    public final int hashCode() {
        return Objects.hash(C0834e.class, Integer.valueOf(this.ad), Integer.valueOf(this.vip), this.metrica);
    }

    public final int metrica() {
        C6594e c6594e = C6594e.f13611e;
        int i = this.vip;
        C6594e c6594e2 = this.metrica;
        if (c6594e2 == c6594e) {
            return i;
        }
        if (c6594e2 != C6594e.f13609e && c6594e2 != C6594e.f13606e && c6594e2 != C6594e.f13612e) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.metrica);
        sb.append(", ");
        sb.append(this.vip);
        sb.append("-byte tags, and ");
        return AbstractC17861e.smaato(this.ad, "-byte key)", sb);
    }
}
