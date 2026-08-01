package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6185e extends AbstractC15654e implements InterfaceC16252e, InterfaceC3761e {
    public final Method ad;

    public C6185e(Method method) {
        this.ad = method;
    }

    @Override // defpackage.AbstractC15654e
    public final Member ad() {
        return this.ad;
    }

    public final List billing() {
        Method method = this.ad;
        return metrica(method.getGenericParameterTypes(), method.getParameterAnnotations(), method.isVarArgs());
    }

    @Override // defpackage.InterfaceC3761e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.ad.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C0317e(typeVariable));
        }
        return arrayList;
    }

    public final AbstractC16397e purchase() {
        Type genericReturnType = this.ad.getGenericReturnType();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C17896e(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C12860e(genericReturnType) : genericReturnType instanceof WildcardType ? new C13634e((WildcardType) genericReturnType) : new C13652e(genericReturnType);
    }
}
