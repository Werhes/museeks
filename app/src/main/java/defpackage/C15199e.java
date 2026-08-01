package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: eٕؓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15199e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f30105e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f30106e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30107e;

    public /* synthetic */ C15199e(Object obj, int i, int i2) {
        this.f30107e = i2;
        this.f30105e = obj;
        this.f30106e = i;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.List, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30107e) {
            case 0:
                AbstractC8761e abstractC8761e = (AbstractC8761e) ((Function0) this.f30105e).invoke();
                InterfaceC3477e appmetrica = AbstractC18039e.appmetrica(2, new C3411e(7, abstractC8761e));
                C13475e c13475e = abstractC8761e.f17665e;
                Type type = c13475e != null ? (Type) c13475e.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    return cls.isArray() ? cls.getComponentType() : Object.class;
                }
                boolean z = type instanceof GenericArrayType;
                int i = this.f30106e;
                if (z) {
                    if (i == 0) {
                        return ((GenericArrayType) type).getGenericComponentType();
                    }
                    throw new Error("Array type has been queried for a non-0th argument: " + abstractC8761e);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new Error("Non-generic type has been queried for arguments: " + abstractC8761e);
                }
                Type type2 = (Type) ((List) appmetrica.getValue()).get(i);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type type3 = (Type) AbstractC1660e.ads(wildcardType.getLowerBounds());
                return type3 == null ? (Type) AbstractC1660e.applovin(wildcardType.getUpperBounds()) : type3;
            case 1:
                return (InterfaceC12132e) ((InterfaceC0390e) this.f30105e).mo330e().get(this.f30106e);
            case 2:
                return (InterfaceC12132e) this.f30105e.get(this.f30106e);
            case 3:
                ((Function1) this.f30105e).invoke(Integer.valueOf(this.f30106e));
                return Unit.INSTANCE;
            default:
                C7855e c7855e = (C7855e) this.f30105e;
                C12742e c12742e = c7855e.f15903e;
                C12742e c12742e2 = c7855e.f15903e;
                int i2 = this.f30106e;
                if (c12742e.contains(Integer.valueOf(i2))) {
                    c12742e2.remove(Integer.valueOf(i2));
                } else {
                    c12742e2.add(Integer.valueOf(i2));
                }
                return Unit.INSTANCE;
        }
    }
}
