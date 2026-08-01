package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13233e implements Map.Entry, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f26270e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f26271e;

    public C13233e(Object obj, Object obj2) {
        this.f26271e = obj;
        this.f26270e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13233e)) {
            return false;
        }
        C13233e c13233e = (C13233e) obj;
        return AbstractC7890e.billing(this.f26271e, c13233e.f26271e) && AbstractC7890e.billing(this.f26270e, c13233e.f26270e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26271e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26270e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f26271e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f26270e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f26271e + ", value=" + this.f26270e + ')';
    }
}
