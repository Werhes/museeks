package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13523e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f26812e;

    public /* synthetic */ C13523e(Object obj) {
        this.f26812e = obj;
    }

    public static final Throwable ad(Object obj) {
        if (obj instanceof C12763e) {
            return ((C12763e) obj).f25537e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13523e) {
            return AbstractC7890e.billing(this.f26812e, ((C13523e) obj).f26812e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f26812e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f26812e;
        if (obj instanceof C12763e) {
            return ((C12763e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
