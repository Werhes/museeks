package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6497e implements InterfaceC6790e, InterfaceC10212e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f13415e;

    public C6497e(Function0 function0) {
        this.f13415e = function0;
    }

    @Override // defpackage.InterfaceC6790e
    public final /* synthetic */ long ad() {
        return ((C2152e) this.f13415e.invoke()).ad;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC6790e) || !(obj instanceof InterfaceC10212e)) {
            return false;
        }
        return AbstractC7890e.billing(this.f13415e, ((InterfaceC10212e) obj).vip());
    }

    public final int hashCode() {
        return this.f13415e.hashCode();
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        return this.f13415e;
    }
}
