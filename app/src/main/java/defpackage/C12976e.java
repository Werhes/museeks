package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12976e implements InterfaceC4595e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7576e f25861e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12976e f25862e;

    public C12976e(C12976e c12976e, C7576e c7576e) {
        this.f25862e = c12976e;
        this.f25861e = c7576e;
    }

    public final void ad(InterfaceC8018e interfaceC8018e) {
        if (this.f25861e == interfaceC8018e) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        C12976e c12976e = this.f25862e;
        if (c12976e != null) {
            c12976e.ad(interfaceC8018e);
        }
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        return AbstractC5797e.vip(this, interfaceC8850e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final /* bridge */ InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.appmetrica(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        return C12575e.f25221e;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final /* bridge */ InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.vip(this, interfaceC1598e);
    }
}
