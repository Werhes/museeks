package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5258e implements InterfaceC15834e {
    public final C2435e ad;
    public byte[] metrica;
    public final C9344e vip;

    public C5258e(InterfaceC9660e interfaceC9660e, C2435e c2435e) {
        C6913e.billing.getAndIncrement();
        this.ad = c2435e;
        this.vip = new C9344e(interfaceC9660e);
    }

    @Override // defpackage.InterfaceC15834e
    public final void ad() {
        C9344e c9344e = this.vip;
        c9344e.f18615e = 0L;
        try {
            c9344e.metrica(this.ad);
            int i = 0;
            while (i != -1) {
                int i2 = (int) c9344e.f18615e;
                byte[] bArr = this.metrica;
                if (bArr == null) {
                    this.metrica = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.metrica = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.metrica;
                i = c9344e.read(bArr2, i2, bArr2.length - i2);
            }
            AbstractC16136e.license(c9344e);
        } catch (Throwable th) {
            AbstractC16136e.license(c9344e);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC15834e
    public final void vip() {
    }
}
