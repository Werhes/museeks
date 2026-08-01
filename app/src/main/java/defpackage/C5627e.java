package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5627e implements InterfaceC13984e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f11996e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f11997e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC0861e f11998e;

    public C5627e(InterfaceC0861e interfaceC0861e, List list, int i) {
        this.f11998e = interfaceC0861e;
        this.f11997e = list;
        this.f11996e = i;
    }

    public final String adcel(boolean z) {
        InterfaceC0861e interfaceC0861e = this.f11998e;
        InterfaceC7227e interfaceC7227e = interfaceC0861e instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC0861e : null;
        Class subs = interfaceC7227e != null ? ((InterfaceC18155e) interfaceC7227e).subs() : null;
        String obj = subs == null ? interfaceC0861e.toString() : (this.f11996e & 4) != 0 ? "kotlin.Nothing" : subs.isArray() ? subs.equals(boolean[].class) ? "kotlin.BooleanArray" : subs.equals(char[].class) ? "kotlin.CharArray" : subs.equals(byte[].class) ? "kotlin.ByteArray" : subs.equals(short[].class) ? "kotlin.ShortArray" : subs.equals(int[].class) ? "kotlin.IntArray" : subs.equals(float[].class) ? "kotlin.FloatArray" : subs.equals(long[].class) ? "kotlin.LongArray" : subs.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && subs.isPrimitive()) ? AbstractC14437e.purchase((InterfaceC7227e) interfaceC0861e).getName() : subs.getName();
        boolean isEmpty = this.f11997e.isEmpty();
        String str = BuildConfig.FLAVOR;
        String m3608try = isEmpty ? BuildConfig.FLAVOR : AbstractC13480e.m3608try(this.f11997e, ", ", "<", ">", new C13887e(this), 24);
        if (startapp()) {
            str = "?";
        }
        return AbstractC4653e.isPro(obj, m3608try, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5627e)) {
            return false;
        }
        C5627e c5627e = (C5627e) obj;
        return AbstractC7890e.billing(this.f11998e, c5627e.f11998e) && AbstractC7890e.billing(this.f11997e, c5627e.f11997e) && this.f11996e == c5627e.f11996e;
    }

    @Override // defpackage.InterfaceC11034e
    public final List getAnnotations() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        return AbstractC17861e.billing(this.f11998e.hashCode() * 31, 31, this.f11997e) + this.f11996e;
    }

    @Override // defpackage.InterfaceC13984e
    public final InterfaceC0861e isVip() {
        return this.f11998e;
    }

    @Override // defpackage.InterfaceC13984e
    public final List signatures() {
        return this.f11997e;
    }

    @Override // defpackage.InterfaceC13984e
    public final boolean startapp() {
        return (this.f11996e & 1) != 0;
    }

    public final String toString() {
        return adcel(false) + " (Kotlin reflection is not available)";
    }
}
