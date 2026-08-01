package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5727e implements InterfaceC8850e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f12123e;

    public C5727e(InterfaceC8850e interfaceC8850e) {
        this.f12123e = interfaceC8850e;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        InterfaceC8850e mo394const = this.f12123e.mo394const(interfaceC8850e);
        int i = AbstractC14940e.vip;
        C15553e c15553e = AbstractC3743e.f8333e;
        AbstractC3743e abstractC3743e = (AbstractC3743e) mo397public(c15553e);
        AbstractC3743e abstractC3743e2 = (AbstractC3743e) mo394const.mo397public(c15553e);
        if ((abstractC3743e instanceof C17531e) && !abstractC3743e.equals(abstractC3743e2)) {
            ((C17531e) abstractC3743e).f34375e = 0;
        }
        return new C5727e(mo394const);
    }

    public final boolean equals(Object obj) {
        return AbstractC7890e.billing(this.f12123e, obj);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return this.f12123e.mo395e(obj, function2);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        InterfaceC8850e mo396final = this.f12123e.mo396final(interfaceC1598e);
        int i = AbstractC14940e.vip;
        C15553e c15553e = AbstractC3743e.f8333e;
        AbstractC3743e abstractC3743e = (AbstractC3743e) mo397public(c15553e);
        AbstractC3743e abstractC3743e2 = (AbstractC3743e) mo396final.mo397public(c15553e);
        if ((abstractC3743e instanceof C17531e) && !abstractC3743e.equals(abstractC3743e2)) {
            ((C17531e) abstractC3743e).f34375e = 0;
        }
        return new C5727e(mo396final);
    }

    public final int hashCode() {
        return this.f12123e.hashCode();
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return this.f12123e.mo397public(interfaceC1598e);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f12123e + ")";
    }
}
