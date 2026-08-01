package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6381e implements InterfaceC12088e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10479e f13236e;

    public C6381e(InterfaceC4911e interfaceC4911e) {
        this.f13236e = new C10479e(21, interfaceC4911e);
    }

    @Override // defpackage.InterfaceC12088e
    /* renamed from: break, reason: not valid java name */
    public final void mo2160break(InterfaceC8850e interfaceC8850e, Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof IOException)) {
            return;
        }
        Object obj = (C5621e) interfaceC8850e.mo397public(C5621e.f11979e);
        if (obj == null) {
            obj = interfaceC8850e.toString();
        }
        ((InterfaceC4911e) this.f13236e.f20694e).license("Unhandled exception caught for " + obj, th);
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
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.appmetrica(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        return C5170e.f11077e;
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.vip(this, interfaceC1598e);
    }
}
