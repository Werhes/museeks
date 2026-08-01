package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۟۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2897e implements ParameterizedType {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Type[] f6888e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Type f6889e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Type f6890e;

    public C2897e(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC18453e.appmetrica(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f6890e = type == null ? null : AbstractC7644e.ad(type);
        this.f6889e = AbstractC7644e.ad(type2);
        this.f6888e = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f6888e;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            AbstractC7644e.vip(this.f6888e[i]);
            Type[] typeArr3 = this.f6888e;
            typeArr3[i] = AbstractC7644e.ad(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC18453e.metrica(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f6888e.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f6890e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f6889e;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f6888e) ^ this.f6889e.hashCode();
        Set set = AbstractC7644e.ad;
        Type type = this.f6890e;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f6888e;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC7644e.startapp(this.f6889e));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(AbstractC7644e.startapp(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC7644e.startapp(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
