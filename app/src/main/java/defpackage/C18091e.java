package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18091e implements Map.Entry {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C18091e f35477e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f35478e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C18091e f35479e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f35480e;

    public C18091e(Object obj, Object obj2) {
        this.f35480e = obj;
        this.f35478e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18091e)) {
            return false;
        }
        C18091e c18091e = (C18091e) obj;
        return this.f35480e.equals(c18091e.f35480e) && this.f35478e.equals(c18091e.f35478e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f35480e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35478e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f35480e.hashCode() ^ this.f35478e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f35480e + "=" + this.f35478e;
    }
}
