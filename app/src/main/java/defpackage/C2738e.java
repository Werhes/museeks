package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2738e {
    public final Class ad;
    public final Class vip;

    public C2738e(Class cls, Class cls2) {
        this.ad = cls;
        this.vip = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2738e)) {
            return false;
        }
        C2738e c2738e = (C2738e) obj;
        return c2738e.ad.equals(this.ad) && c2738e.vip.equals(this.vip);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }

    public final String toString() {
        return this.ad.getSimpleName() + " with primitive type: " + this.vip.getSimpleName();
    }
}
