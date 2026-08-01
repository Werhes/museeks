package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٝٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17894e implements InterfaceC14468e, InterfaceC10212e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f35139e;

    public C17894e(Function0 function0) {
        this.f35139e = function0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC14468e) || !(obj instanceof InterfaceC10212e)) {
            return false;
        }
        return AbstractC7890e.billing(this.f35139e, ((InterfaceC10212e) obj).vip());
    }

    public final int hashCode() {
        return this.f35139e.hashCode();
    }

    @Override // defpackage.InterfaceC14468e
    public final /* synthetic */ float invoke() {
        return ((Number) this.f35139e.invoke()).floatValue();
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        return this.f35139e;
    }
}
