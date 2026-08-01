package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2428e extends AbstractC10947e {
    public final int ad;
    public final C15780e vip;

    public C2428e(int i, C15780e c15780e) {
        this.ad = i;
        this.vip = c15780e;
    }

    public static C13391e vip() {
        C13391e c13391e = new C13391e(3, false);
        c13391e.f26645e = null;
        c13391e.f26644e = C15780e.f31085e;
        return c13391e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.vip != C15780e.f31085e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2428e)) {
            return false;
        }
        C2428e c2428e = (C2428e) obj;
        return c2428e.ad == this.ad && c2428e.vip == this.vip;
    }

    public final int hashCode() {
        return Objects.hash(C2428e.class, Integer.valueOf(this.ad), this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.vip);
        sb.append(", ");
        return AbstractC17861e.smaato(this.ad, "-byte key)", sb);
    }
}
