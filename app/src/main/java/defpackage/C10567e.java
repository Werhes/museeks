package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10567e {
    public final Class ad;
    public final C15768e vip;

    public C10567e(Class cls, C15768e c15768e) {
        this.ad = cls;
        this.vip = c15768e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10567e)) {
            return false;
        }
        C10567e c10567e = (C10567e) obj;
        return c10567e.ad.equals(this.ad) && c10567e.vip.equals(this.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }

    public final String toString() {
        return this.ad.getSimpleName() + ", object identifier: " + this.vip;
    }
}
