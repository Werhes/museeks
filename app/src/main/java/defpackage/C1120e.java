package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120e {
    public static final String appmetrica;
    public static final String license;
    public static final C1120e metrica = new C1120e(false, false);
    public final boolean ad;
    public final boolean vip;

    static {
        String str = AbstractC9413e.ad;
        license = Integer.toString(0, 36);
        appmetrica = Integer.toString(1, 36);
    }

    public C1120e(boolean z, boolean z2) {
        this.ad = z;
        this.vip = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1120e)) {
            return false;
        }
        C1120e c1120e = (C1120e) obj;
        return this.ad == c1120e.ad && this.vip == c1120e.vip;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.ad), Boolean.valueOf(this.vip));
    }
}
