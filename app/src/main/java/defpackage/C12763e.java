package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12763e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Throwable f25537e;

    public C12763e(Throwable th) {
        this.f25537e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12763e) {
            return AbstractC7890e.billing(this.f25537e, ((C12763e) obj).f25537e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25537e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f25537e + ')';
    }
}
