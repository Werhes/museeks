package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3089e {
    public final int ad;
    public final int vip;

    public C3089e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3089e)) {
            return false;
        }
        C3089e c3089e = (C3089e) obj;
        return this.ad == c3089e.ad && this.vip == c3089e.vip;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.vip), Integer.valueOf(this.ad));
    }
}
