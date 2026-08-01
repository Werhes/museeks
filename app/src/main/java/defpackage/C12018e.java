package defpackage;

import java.security.SecureRandom;

/* renamed from: eِ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12018e implements InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f24038e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C3456e f24039e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        C6831e ad = this.f24039e.ad(this.f24038e);
        byte[] bArr = new byte[32];
        ad.ad.nextBytes(bArr);
        byte[][] vip = ad.vip(bArr);
        return new C17424e(new C15968e(this.f24039e, vip[0], vip[6]), new C13252e(this.f24039e, vip[0], vip[1], vip[2], vip[3], vip[4], vip[5], vip[6], vip[7]), false, 5);
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        this.f24039e = ((C4702e) c13572e).f10090e;
        this.f24038e = (SecureRandom) c13572e.f26878e;
    }
}
