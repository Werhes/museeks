package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9622e extends AbstractC0301e {
    public final int ad;
    public final C3700e license;
    public final C2942e metrica;
    public final int vip;

    public C9622e(int i, int i2, C2942e c2942e, C3700e c3700e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = c2942e;
        this.license = c3700e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؒۜ, java.lang.Object] */
    public static C11467e vip() {
        ?? obj = new Object();
        obj.f23072e = null;
        obj.f23070e = null;
        obj.f23069e = null;
        obj.f23071e = C2942e.appmetrica;
        return obj;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.metrica != C2942e.appmetrica;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9622e)) {
            return false;
        }
        C9622e c9622e = (C9622e) obj;
        return c9622e.ad == this.ad && c9622e.metrica() == metrica() && c9622e.metrica == this.metrica && c9622e.license == this.license;
    }

    public final int hashCode() {
        return Objects.hash(C9622e.class, Integer.valueOf(this.ad), Integer.valueOf(this.vip), this.metrica, this.license);
    }

    public final int metrica() {
        C2942e c2942e = C2942e.appmetrica;
        int i = this.vip;
        C2942e c2942e2 = this.metrica;
        if (c2942e2 == c2942e) {
            return i;
        }
        if (c2942e2 != C2942e.vip && c2942e2 != C2942e.metrica && c2942e2 != C2942e.license) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.metrica);
        sb.append(", hashType: ");
        sb.append(this.license);
        sb.append(", ");
        sb.append(this.vip);
        sb.append("-byte tags, and ");
        return AbstractC17861e.smaato(this.ad, "-byte key)", sb);
    }
}
