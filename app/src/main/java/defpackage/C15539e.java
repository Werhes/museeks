package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15539e implements GenericArrayType, Type {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Type f30684e;

    public C15539e(Type type) {
        this.f30684e = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC7890e.billing(this.f30684e, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f30684e;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC9546e.ad(this.f30684e) + "[]";
    }

    public final int hashCode() {
        return this.f30684e.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
