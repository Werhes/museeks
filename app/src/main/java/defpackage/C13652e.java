package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13652e extends AbstractC16397e implements InterfaceC15088e {
    public final Type ad;
    public final AbstractC18469e vip;

    public C13652e(Type type) {
        AbstractC18469e c17070e;
        this.ad = type;
        if (type instanceof Class) {
            c17070e = new C17070e((Class) type);
        } else if (type instanceof TypeVariable) {
            c17070e = new C0317e((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            c17070e = new C17070e((Class) ((ParameterizedType) type).getRawType());
        }
        this.vip = c17070e;
    }

    @Override // defpackage.AbstractC16397e
    public final Type ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC16902e
    public final Collection getAnnotations() {
        return C13664e.f27089e;
    }

    @Override // defpackage.AbstractC16397e, defpackage.InterfaceC16902e
    public final C2430e license(C12816e c12816e) {
        return null;
    }

    public final boolean metrica() {
        Type type = this.ad;
        if (type instanceof Class) {
            if (!(((Class) type).getTypeParameters().length == 0)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList vip() {
        Object c12860e;
        List<Type> metrica = AbstractC2677e.metrica(this.ad);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(metrica, 10));
        for (Type type : metrica) {
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c12860e = new C17896e(cls);
                    arrayList.add(c12860e);
                }
            }
            c12860e = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C12860e(type) : type instanceof WildcardType ? new C13634e((WildcardType) type) : new C13652e(type);
            arrayList.add(c12860e);
        }
        return arrayList;
    }
}
