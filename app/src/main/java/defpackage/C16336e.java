package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16336e implements InterfaceC13821e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Map f32101e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f32102e;

    public C16336e(Map map, Map map2) {
        this.f32102e = map;
        this.f32101e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16336e)) {
            return false;
        }
        C16336e c16336e = (C16336e) obj;
        return this.f32102e.equals(c16336e.f32102e) && AbstractC7890e.billing(this.f32101e, c16336e.f32101e);
    }

    public final int hashCode() {
        return this.f32101e.hashCode() + (this.f32102e.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.f32102e + ", outputSurfaceMap=" + this.f32101e + ')';
    }
}
