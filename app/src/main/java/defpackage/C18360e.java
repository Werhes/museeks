package defpackage;

import java.security.SecureRandom;

/* renamed from: eۚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18360e implements InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public SecureRandom f36036e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C12532e f36037e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        C14154e ad = this.f36037e.ad();
        SecureRandom secureRandom = this.f36036e;
        ad.ad = secureRandom;
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr);
        ad.ad.nextBytes(bArr2);
        byte[][] vip = ad.vip(bArr, bArr2);
        return new C17424e(new C0957e(this.f36037e, vip[0], vip[1]), new C1364e(this.f36037e, vip[2], vip[3], vip[4], vip[0], vip[1], vip[5]), false, 5);
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        this.f36037e = ((C12060e) c13572e).f24168e;
        this.f36036e = (SecureRandom) c13572e.f26878e;
    }
}
