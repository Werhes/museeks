package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13634e extends AbstractC16397e implements InterfaceC15088e {
    public final WildcardType ad;

    public C13634e(WildcardType wildcardType) {
        this.ad = wildcardType;
    }

    @Override // defpackage.AbstractC16397e
    public final Type ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        return C13664e.f27089e;
    }

    public final AbstractC16397e vip() {
        WildcardType wildcardType = this.ad;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Type type = (Type) AbstractC1660e.m676try(lowerBounds);
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C17896e(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C12860e(type) : type instanceof WildcardType ? new C13634e((WildcardType) type) : new C13652e(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) AbstractC1660e.m676try(upperBounds);
        if (AbstractC7890e.billing(type2, Object.class)) {
            return null;
        }
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C17896e(cls2);
            }
        }
        return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C12860e(type2) : type2 instanceof WildcardType ? new C13634e((WildcardType) type2) : new C13652e(type2);
    }
}
