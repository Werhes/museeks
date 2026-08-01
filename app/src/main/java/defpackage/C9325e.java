package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9325e extends AbstractC10947e {
    public final int ad;
    public final C11594e license;
    public final int metrica;
    public final int vip;

    public C9325e(int i, int i2, int i3, C11594e c11594e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = c11594e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؒۜ, java.lang.Object] */
    public static C11467e vip() {
        ?? obj = new Object();
        obj.f23072e = null;
        obj.f23070e = null;
        obj.f23069e = null;
        obj.f23071e = C11594e.f23291e;
        return obj;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.license != C11594e.f23291e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9325e)) {
            return false;
        }
        C9325e c9325e = (C9325e) obj;
        return c9325e.ad == this.ad && c9325e.vip == this.vip && c9325e.metrica == this.metrica && c9325e.license == this.license;
    }

    public final int hashCode() {
        return Objects.hash(C9325e.class, Integer.valueOf(this.ad), Integer.valueOf(this.vip), Integer.valueOf(this.metrica), this.license);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.license);
        sb.append(", ");
        sb.append(this.vip);
        sb.append("-byte IV, ");
        sb.append(this.metrica);
        sb.append("-byte tag, and ");
        return AbstractC17861e.smaato(this.ad, "-byte key)", sb);
    }
}
