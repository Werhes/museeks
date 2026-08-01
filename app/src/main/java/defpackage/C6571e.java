package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6571e implements Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f13543e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f13544e;

    public C6571e(Object obj, Object obj2) {
        this.f13544e = obj;
        this.f13543e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6571e)) {
            return false;
        }
        C6571e c6571e = (C6571e) obj;
        return AbstractC7890e.billing(this.f13544e, c6571e.f13544e) && AbstractC7890e.billing(this.f13543e, c6571e.f13543e);
    }

    public final int hashCode() {
        Object obj = this.f13544e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13543e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13544e + ", " + this.f13543e + ')';
    }
}
