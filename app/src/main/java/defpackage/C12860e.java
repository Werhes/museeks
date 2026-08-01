package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۤۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12860e extends AbstractC16397e implements InterfaceC15088e {
    public final Type ad;
    public final C13664e metrica;
    public final AbstractC16397e vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C12860e(Type type) {
        AbstractC16397e c17896e;
        AbstractC16397e abstractC16397e;
        this.ad = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    c17896e = componentType.isPrimitive() ? new C17896e(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C12860e(componentType) : componentType instanceof WildcardType ? new C13634e((WildcardType) componentType) : new C13652e(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                abstractC16397e = new C17896e(cls2);
                this.vip = abstractC16397e;
                this.metrica = C13664e.f27089e;
            }
        }
        c17896e = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C12860e(genericComponentType) : genericComponentType instanceof WildcardType ? new C13634e((WildcardType) genericComponentType) : new C13652e(genericComponentType);
        abstractC16397e = c17896e;
        this.vip = abstractC16397e;
        this.metrica = C13664e.f27089e;
    }

    @Override // defpackage.AbstractC16397e
    public final Type ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        return this.metrica;
    }
}
