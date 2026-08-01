package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9344e implements InterfaceC9660e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Uri f18614e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f18615e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Map f18616e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9660e f18617e;

    public C9344e(InterfaceC9660e interfaceC9660e) {
        interfaceC9660e.getClass();
        this.f18617e = interfaceC9660e;
        this.f18614e = Uri.EMPTY;
        this.f18616e = Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return this.f18617e.advert();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f18617e.close();
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f18617e.license(interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f18617e.loadAd();
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        InterfaceC9660e interfaceC9660e = this.f18617e;
        this.f18614e = c2435e.ad;
        this.f18616e = Collections.EMPTY_MAP;
        try {
            return interfaceC9660e.metrica(c2435e);
        } finally {
            Uri loadAd = interfaceC9660e.loadAd();
            if (loadAd != null) {
                this.f18614e = loadAd;
            }
            this.f18616e = interfaceC9660e.advert();
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f18617e.read(bArr, i, i2);
        if (read != -1) {
            this.f18615e += read;
        }
        return read;
    }
}
