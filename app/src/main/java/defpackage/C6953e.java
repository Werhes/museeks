package defpackage;

import java.security.SecureRandom;

/* renamed from: eؚؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6953e implements InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f14247e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14248e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        switch (this.f14248e) {
            case 0:
                C1694e c1694e = new C1694e(this.f14247e);
                return new C17424e(c1694e.ad(), c1694e, false, 5);
            default:
                C14061e c14061e = new C14061e(this.f14247e);
                return new C17424e(c14061e.ad(), c14061e, false, 5);
        }
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        switch (this.f14248e) {
            case 0:
                this.f14247e = (SecureRandom) c13572e.f26878e;
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
            default:
                this.f14247e = (SecureRandom) c13572e.f26878e;
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
        }
    }
}
