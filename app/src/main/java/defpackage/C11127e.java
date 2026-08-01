package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11127e extends AbstractC10947e {
    public final String ad;
    public final C2443e vip;

    public C11127e(String str, C2443e c2443e) {
        this.ad = str;
        this.vip = c2443e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.vip != C2443e.f6250e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11127e)) {
            return false;
        }
        C11127e c11127e = (C11127e) obj;
        return c11127e.ad.equals(this.ad) && c11127e.vip.equals(this.vip);
    }

    public final int hashCode() {
        return Objects.hash(C11127e.class, this.ad, this.vip);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.ad + ", variant: " + this.vip + ")";
    }
}
