package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17236e implements InterfaceC17348e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f33764e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17236e f33765e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Function0 f33766e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC16046e f33767e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC16232e f33768e;

    public /* synthetic */ C17236e(AbstractC16232e abstractC16232e, C3410e c3410e, InterfaceC16046e interfaceC16046e, int i) {
        this(abstractC16232e, (i & 2) != 0 ? null : c3410e, (C17236e) null, (i & 8) != 0 ? null : interfaceC16046e);
    }

    public C17236e(AbstractC16232e abstractC16232e, Function0 function0, C17236e c17236e, InterfaceC16046e interfaceC16046e) {
        this.f33768e = abstractC16232e;
        this.f33766e = function0;
        this.f33765e = c17236e;
        this.f33767e = interfaceC16046e;
        this.f33764e = AbstractC18039e.appmetrica(2, new C17197e(4, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC5021e
    public final Collection ad() {
        List list = (List) this.f33764e.getValue();
        return list == null ? C13664e.f27089e : list;
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        return null;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        return this.f33768e.vip().loadAd().amazon();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17236e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17236e c17236e = (C17236e) obj;
        C17236e c17236e2 = this.f33765e;
        if (c17236e2 == null) {
            c17236e2 = this;
        }
        C17236e c17236e3 = c17236e.f33765e;
        if (c17236e3 != null) {
            obj = c17236e3;
        }
        return c17236e2 == obj;
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        C17236e c17236e = this.f33765e;
        return c17236e != null ? c17236e.hashCode() : super.hashCode();
    }

    @Override // defpackage.InterfaceC17348e
    public final AbstractC16232e isPro() {
        return this.f33768e;
    }

    public final String toString() {
        return "CapturedType(" + this.f33768e + ')';
    }
}
