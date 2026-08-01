package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؑۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3069e implements GenericArrayType {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Type f7139e;

    public C3069e(Type type) {
        this.f7139e = AbstractC7644e.ad(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC18453e.metrica(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f7139e;
    }

    public final int hashCode() {
        return this.f7139e.hashCode();
    }

    public final String toString() {
        return AbstractC7644e.startapp(this.f7139e) + "[]";
    }
}
