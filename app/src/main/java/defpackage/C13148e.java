package defpackage;

import java.security.SecureRandom;

/* renamed from: eٌْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13148e implements InterfaceC6610e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C4577e f26132e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public SecureRandom f26133e;

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public final C17424e mo3419appmetrica() {
        AbstractC7629e vip = this.f26132e.vip.vip();
        int i = vip.ad;
        byte[] bArr = new byte[i];
        this.f26133e.nextBytes(bArr);
        byte[] bArr2 = new byte[i];
        this.f26133e.nextBytes(bArr2);
        byte[] bArr3 = new byte[i];
        this.f26133e.nextBytes(bArr3);
        C7358e c7358e = new C7358e(bArr, bArr2);
        vip.billing(bArr3);
        C11883e c11883e = new C11883e(bArr3, (byte[]) new C18464e(vip, bArr, bArr3).f36194e, 7);
        C4577e c4577e = this.f26132e;
        return new C17424e(new C1061e(c4577e, c11883e), new C12222e(c4577e, c7358e, c11883e), false, 5);
    }

    @Override // defpackage.InterfaceC6610e
    public final void loadAd(C13572e c13572e) {
        this.f26133e = (SecureRandom) c13572e.f26878e;
        this.f26132e = ((C1007e) c13572e).f3458e;
    }
}
