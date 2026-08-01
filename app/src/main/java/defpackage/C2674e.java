package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2674e extends C12655e {

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public boolean f6548e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final C5671e f6549e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public Function1 f6550e;

    public C2674e(boolean z, C15274e c15274e, InterfaceC17220e interfaceC17220e, boolean z2, C11796e c11796e, Function1 function1) {
        super(c15274e, interfaceC17220e, false, z2, null, c11796e, new C2221e(6, function1, z));
        this.f6548e = z;
        this.f6550e = function1;
        this.f6549e = new C5671e(22, this);
    }

    @Override // defpackage.AbstractC6102e
    /* renamed from: eٖٔۧ */
    public final void mo860e(InterfaceC15671e interfaceC15671e) {
        AbstractC14594e.loadAd(interfaceC15671e, this.f6548e ? EnumC9470e.f18811e : EnumC9470e.f18809e);
        AbstractC14594e.purchase(interfaceC15671e, C14914e.f29566e);
        C13333e advert = AbstractC11815e.advert(this.f6548e);
        if (advert != null) {
            AbstractC14594e.startapp(interfaceC15671e, advert);
        }
        AbstractC14594e.license(interfaceC15671e, new C9712e(interfaceC15671e, 1));
    }
}
