package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12382e extends C9556e {
    /* renamed from: case, reason: not valid java name */
    public final void m3338case(InterfaceC12385e interfaceC12385e) {
        Object mopub;
        InterfaceC10073e mo691synchronized = interfaceC12385e.mo691synchronized();
        InterfaceC8500e interfaceC8500e = mo691synchronized instanceof C2261e ? ((C2261e) mo691synchronized).ad : null;
        if (interfaceC8500e == null || ((interfaceC8500e.billing() != EnumC14802e.f29330e && interfaceC8500e.billing() != EnumC14802e.f29327e) || interfaceC8500e.purchase() != EnumC13761e.f27261e || interfaceC8500e.appmetrica() != EnumC11039e.f21869e)) {
            ((C2864e) this.f18969e).getClass();
            interfaceC12385e.close();
            return;
        }
        synchronized (this.f18967e) {
            try {
                mopub = ((ArrayDeque) this.f18968e).size() >= this.f18970e ? mopub() : null;
                ((ArrayDeque) this.f18968e).addFirst(interfaceC12385e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C2864e) this.f18969e) == null || mopub == null) {
            return;
        }
        ((InterfaceC12385e) mopub).close();
    }
}
