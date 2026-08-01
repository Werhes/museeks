package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؐۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6841e implements WildcardType, Type {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C6841e f14090e = new C6841e(null, null);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Type f14091e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Type f14092e;

    public C6841e(Type type, Type type2) {
        this.f14092e = type;
        this.f14091e = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f14091e;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f14091e;
        if (type != null) {
            return "? super " + AbstractC9546e.ad(type);
        }
        Type type2 = this.f14092e;
        if (type2 == null || AbstractC7890e.billing(type2, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC9546e.ad(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f14092e;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
