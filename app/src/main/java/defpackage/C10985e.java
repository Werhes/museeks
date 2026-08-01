package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10985e implements Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f21740e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f21741e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f21742e;

    public C10985e(Object obj, Object obj2, Object obj3) {
        this.f21742e = obj;
        this.f21741e = obj2;
        this.f21740e = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10985e)) {
            return false;
        }
        C10985e c10985e = (C10985e) obj;
        return AbstractC7890e.billing(this.f21742e, c10985e.f21742e) && AbstractC7890e.billing(this.f21741e, c10985e.f21741e) && AbstractC7890e.billing(this.f21740e, c10985e.f21740e);
    }

    public final int hashCode() {
        Object obj = this.f21742e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f21741e;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f21740e;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f21742e + ", " + this.f21741e + ", " + this.f21740e + ')';
    }
}
