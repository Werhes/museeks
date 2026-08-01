package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eُؚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7534e implements InterfaceC6610e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C6794e f15362e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        BigInteger bigInteger = AbstractC3211e.ad;
        C6794e c6794e = this.f15362e;
        C3236e c3236e = c6794e.f14002e;
        BigInteger ad = AbstractC3211e.ad(c3236e, (SecureRandom) c6794e.f26878e);
        return new C17424e(new C2149e(c3236e.f7369e.modPow(ad, c3236e.f7367e), c3236e), new C4025e(ad, c3236e), false, 5);
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        C6794e c6794e = (C6794e) c13572e;
        this.f15362e = c6794e;
        AbstractC0259e.vip(c6794e.f14002e.f7367e);
        C3236e c3236e = this.f15362e.f14002e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
