package defpackage;

import java.security.SecureRandom;

/* renamed from: eّؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12219e implements InterfaceC3894e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC3894e f24537e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final SecureRandom f24538e;

    public C12219e(InterfaceC3894e interfaceC3894e, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = AbstractC9915e.vip();
        } else {
            ThreadLocal threadLocal = AbstractC9915e.ad;
        }
        this.f24538e = secureRandom;
        this.f24537e = interfaceC3894e;
    }
}
