package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16220e extends AbstractC12782e implements InterfaceC12088e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Handler f31869e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f31870e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ DialogC11829e f31871e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16220e(android.os.Handler r1, defpackage.DialogC11829e r2, int r3) {
        /*
            r0 = this;
            r0.f31870e = r3
            switch(r3) {
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            eٕؗۜ r3 = defpackage.C5170e.f11077e
            r0.f31869e = r1
            r0.f31871e = r2
            r0.<init>(r3)
            return
        Lf:
            eٕؗۜ r3 = defpackage.C5170e.f11077e
            r0.f31869e = r1
            r0.f31871e = r2
            r0.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16220e.<init>(android.os.Handler, eًِٚ, int):void");
    }

    @Override // defpackage.InterfaceC12088e
    /* renamed from: break */
    public final void mo2160break(InterfaceC8850e interfaceC8850e, Throwable th) {
        switch (this.f31870e) {
            case 0:
                th.printStackTrace();
                this.f31869e.removeCallbacksAndMessages(null);
                this.f31871e.dismiss();
                return;
            default:
                th.printStackTrace();
                this.f31869e.removeCallbacksAndMessages(null);
                this.f31871e.dismiss();
                return;
        }
    }
}
