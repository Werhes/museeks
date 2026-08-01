package defpackage;

/* renamed from: eٕؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15171e extends C13391e {
    @Override // defpackage.C13391e, defpackage.InterfaceC17128e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        C14915e c14915e;
        byte[] bArr;
        if (interfaceC3894e instanceof C12219e) {
            interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
        }
        C0610e c0610e = (C0610e) interfaceC3894e;
        InterfaceC3894e interfaceC3894e2 = c0610e.f2821e;
        byte[] bArr2 = c0610e.f2822e;
        if (interfaceC3894e2 instanceof C1794e) {
            C1794e c1794e = (C1794e) interfaceC3894e2;
            c14915e = (C14915e) c1794e.f4854e;
            bArr = c1794e.f4853e;
        } else {
            c14915e = (C14915e) interfaceC3894e2;
            bArr = null;
        }
        byte[] bArr3 = c14915e.f29591e;
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int advert = AbstractC3628e.advert(i4 * 4, bArr3);
                if (((1 << i4) & bArr2[i]) != 0) {
                    i2 += advert;
                } else {
                    i3 += advert;
                }
            }
            byte[] bArr4 = new byte[8];
            AbstractC3628e.yandex(i2, 0, bArr4);
            AbstractC3628e.yandex(i3, 4, bArr4);
            C15790e c15790e = new C15790e(new C15460e());
            c15790e.init(true, new C11494e(new C1794e(new C14915e(bArr3), bArr), bArr4, 0, 8));
            c15790e.tapsense(0, 0, bArr3, bArr3);
            c15790e.tapsense(8, 8, bArr3, bArr3);
            c15790e.tapsense(16, 16, bArr3, bArr3);
            c15790e.tapsense(24, 24, bArr3, bArr3);
        }
        C14915e c14915e2 = new C14915e(bArr3);
        if (bArr != null) {
            super.init(z, new C0610e(new C1794e(c14915e2, bArr), bArr2));
        } else {
            super.init(z, new C0610e(c14915e2, bArr2));
        }
    }
}
