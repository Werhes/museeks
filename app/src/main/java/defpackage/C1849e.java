package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1849e implements Type {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f4943e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Type[] f4944e;

    public C1849e(Type[] typeArr) {
        this.f4944e = typeArr;
        this.f4943e = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1849e) {
            return Arrays.equals(this.f4944e, ((C1849e) obj).f4944e);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC1660e.m669goto(this.f4944e, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f4943e;
    }

    public final String toString() {
        return getTypeName();
    }
}
