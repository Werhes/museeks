package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14480e implements InterfaceC9660e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f28618e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC6269e f28619e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9660e f28620e;

    public C14480e(InterfaceC9660e interfaceC9660e, InterfaceC6269e interfaceC6269e) {
        this.f28620e = interfaceC9660e;
        this.f28619e = interfaceC6269e;
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return this.f28620e.advert();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        if (this.f28618e) {
            this.f28618e = false;
            this.f28620e.close();
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f28620e.license(interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        Uri loadAd = this.f28620e.loadAd();
        if (loadAd == null) {
            return null;
        }
        return this.f28619e.appmetrica(loadAd);
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        C2435e billing = this.f28619e.billing(c2435e);
        this.f28618e = true;
        return this.f28620e.metrica(billing);
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        return this.f28620e.read(bArr, i, i2);
    }
}
