package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16361e extends AbstractC15951e {
    public byte[] adcel;
    public byte[] advert;
    public volatile boolean mopub;

    @Override // defpackage.InterfaceC15834e
    public final void ad() {
        try {
            this.startapp.metrica(this.vip);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.mopub) {
                byte[] bArr = this.adcel;
                if (bArr.length < i2 + 16384) {
                    this.adcel = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.startapp.read(this.adcel, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.mopub) {
                this.advert = Arrays.copyOf(this.adcel, i2);
            }
            AbstractC16136e.license(this.startapp);
        } catch (Throwable th) {
            AbstractC16136e.license(this.startapp);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC15834e
    public final void vip() {
        this.mopub = true;
    }
}
