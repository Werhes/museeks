package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11404e implements InterfaceC9660e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22926e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2593e f22927e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f22928e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f22929e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9660e f22930e;

    public C11404e(InterfaceC9660e interfaceC9660e, int i, C2593e c2593e) {
        AbstractC2301e.billing(i > 0);
        this.f22930e = interfaceC9660e;
        this.f22928e = i;
        this.f22927e = c2593e;
        this.f22929e = new byte[1];
        this.f22926e = i;
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return this.f22930e.advert();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f22930e.license(interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f22930e.loadAd();
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f22926e;
        InterfaceC9660e interfaceC9660e = this.f22930e;
        if (i3 == 0) {
            byte[] bArr2 = this.f22929e;
            int i4 = 0;
            if (interfaceC9660e.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = interfaceC9660e.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        C1292e c1292e = new C1292e(i5, bArr3);
                        C2593e c2593e = this.f22927e;
                        long max = !c2593e.advert ? c2593e.startapp : Math.max(c2593e.smaato.isPro(true), c2593e.startapp);
                        int ad = c1292e.ad();
                        InterfaceC18147e interfaceC18147e = c2593e.mopub;
                        interfaceC18147e.getClass();
                        interfaceC18147e.appmetrica(ad, c1292e);
                        interfaceC18147e.ad(max, 1, ad, 0, null);
                        c2593e.advert = true;
                    }
                }
                this.f22926e = this.f22928e;
            }
            return -1;
        }
        int read2 = interfaceC9660e.read(bArr, i, Math.min(this.f22926e, i2));
        if (read2 != -1) {
            this.f22926e -= read2;
        }
        return read2;
    }
}
