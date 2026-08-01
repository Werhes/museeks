package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1828e {
    public final float ad;
    public final boolean vip;

    public C1828e(float f, boolean z) {
        this.ad = f;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1828e)) {
            return false;
        }
        C1828e c1828e = (C1828e) obj;
        return this.vip == c1828e.vip && this.ad == c1828e.ad;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.vip), Float.valueOf(this.ad));
    }
}
