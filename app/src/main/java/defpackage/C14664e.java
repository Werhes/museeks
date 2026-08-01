package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14664e extends AbstractC12699e {
    public final int ad;
    public final C8776e vip;

    public C14664e(int i, C8776e c8776e) {
        this.ad = i;
        this.vip = c8776e;
    }

    public static C17424e vip() {
        C17424e c17424e = new C17424e(2, false);
        c17424e.f34142e = null;
        c17424e.f34141e = C8776e.license;
        return c17424e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.vip != C8776e.license;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14664e)) {
            return false;
        }
        C14664e c14664e = (C14664e) obj;
        return c14664e.ad == this.ad && c14664e.vip == this.vip;
    }

    public final int hashCode() {
        return Objects.hash(C14664e.class, Integer.valueOf(this.ad), this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
        sb.append(this.vip);
        sb.append(", ");
        return AbstractC17861e.smaato(this.ad, "-byte key)", sb);
    }
}
