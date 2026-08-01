package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15140e implements WildcardType {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Type f29939e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Type f29940e;

    public C15140e(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC7644e.vip(typeArr[0]);
            this.f29939e = null;
            this.f29940e = AbstractC7644e.ad(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        AbstractC7644e.vip(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f29939e = AbstractC7644e.ad(typeArr2[0]);
        this.f29940e = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC18453e.metrica(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f29939e;
        return type != null ? new Type[]{type} : AbstractC7644e.vip;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f29940e};
    }

    public final int hashCode() {
        Type type = this.f29939e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f29940e.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f29939e;
        if (type != null) {
            return "? super " + AbstractC7644e.startapp(type);
        }
        Type type2 = this.f29940e;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC7644e.startapp(type2);
    }
}
