package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8764e {
    public final Class ad;
    public final Class vip;

    public C8764e(Class cls, Class cls2) {
        this.ad = cls;
        this.vip = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8764e)) {
            return false;
        }
        C8764e c8764e = (C8764e) obj;
        return c8764e.ad.equals(this.ad) && c8764e.vip.equals(this.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }

    public final String toString() {
        return this.ad.getSimpleName() + " with serialization type: " + this.vip.getSimpleName();
    }
}
