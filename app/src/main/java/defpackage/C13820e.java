package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13820e implements ParameterizedType, Type {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Type[] f27385e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Type f27386e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Class f27387e;

    public C13820e(Class cls, Type type, ArrayList arrayList) {
        this.f27387e = cls;
        this.f27386e = type;
        this.f27385e = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC7890e.billing(this.f27387e, parameterizedType.getRawType()) && AbstractC7890e.billing(this.f27386e, parameterizedType.getOwnerType()) && Arrays.equals(this.f27385e, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f27385e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f27386e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f27387e;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f27387e;
        Type type = this.f27386e;
        if (type != null) {
            sb.append(AbstractC9546e.ad(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC9546e.ad(cls));
        }
        Type[] typeArr = this.f27385e;
        if (typeArr.length != 0) {
            AbstractC1660e.m666class(typeArr, sb, ", ", "<", ">", C6941e.f14231e);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.f27387e.hashCode();
        Type type = this.f27386e;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f27385e);
    }

    public final String toString() {
        return getTypeName();
    }
}
