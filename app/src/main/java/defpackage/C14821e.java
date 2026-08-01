package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14821e extends AbstractC12782e implements InterfaceC12088e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f29352e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f29353e = 1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29354e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14821e(defpackage.C3344e r2, defpackage.C4652e r3) {
        /*
            r1 = this;
            r0 = 1
            r1.f29353e = r0
            eٕؗۜ r0 = defpackage.C5170e.f11077e
            r1.f29352e = r2
            r1.f29354e = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14821e.<init>(eؕٓؒ, eؗؖؗ):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14821e(defpackage.C5033e r2, java.util.ArrayList r3) {
        /*
            r1 = this;
            r0 = 0
            r1.f29353e = r0
            eٕؗۜ r0 = defpackage.C5170e.f11077e
            r1.f29352e = r2
            r1.f29354e = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14821e.<init>(eًؗٝ, java.util.ArrayList):void");
    }

    @Override // defpackage.InterfaceC12088e
    /* renamed from: break */
    public final void mo2160break(InterfaceC8850e interfaceC8850e, Throwable th) {
        switch (this.f29353e) {
            case 0:
                ((InterfaceC4911e) ((C5033e) this.f29352e).f25997e.f23070e).license("Failed to load module", th);
                ((ArrayList) this.f29354e).add(th);
                return;
            default:
                C3344e c3344e = (C3344e) this.f29352e;
                C4652e c4652e = (C4652e) this.f29354e;
                AbstractC3415e.mopub(th, new C5625e(c3344e, c4652e, 4));
                InterfaceC12088e interfaceC12088e = (InterfaceC12088e) c4652e.f9983e.mo397public(C5170e.f11077e);
                if (interfaceC12088e == null) {
                    throw th;
                }
                interfaceC12088e.mo2160break(interfaceC8850e, th);
                return;
        }
    }
}
