package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3009e implements InterfaceC9660e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f7056e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1705e f7057e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f7058e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC9660e f7059e;

    public C3009e(InterfaceC9660e interfaceC9660e, C1705e c1705e) {
        interfaceC9660e.getClass();
        this.f7059e = interfaceC9660e;
        c1705e.getClass();
        this.f7057e = c1705e;
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return this.f7059e.advert();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        C1705e c1705e = this.f7057e;
        try {
            this.f7059e.close();
            if (this.f7056e) {
                this.f7056e = false;
                if (c1705e.license == null) {
                    return;
                }
                try {
                    c1705e.ad();
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        } catch (Throwable th) {
            if (this.f7056e) {
                this.f7056e = false;
                if (c1705e.license != null) {
                    try {
                        c1705e.ad();
                    } catch (IOException e2) {
                        throw new IOException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f7059e.license(interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f7059e.loadAd();
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        long metrica = this.f7059e.metrica(c2435e);
        this.f7058e = metrica;
        if (metrica == 0) {
            return 0L;
        }
        if (c2435e.billing == -1 && metrica != -1) {
            c2435e = c2435e.metrica(0L, metrica);
        }
        int i = c2435e.startapp;
        this.f7056e = true;
        C1705e c1705e = this.f7057e;
        c1705e.getClass();
        c2435e.yandex.getClass();
        if (c2435e.billing == -1 && (i & 2) == 2) {
            c1705e.license = null;
        } else {
            c1705e.license = c2435e;
            c1705e.appmetrica = (i & 4) == 4 ? c1705e.vip : Long.MAX_VALUE;
            c1705e.startapp = 0L;
            try {
                c1705e.vip(c2435e);
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        return this.f7058e;
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f7058e == 0) {
            return -1;
        }
        int read = this.f7059e.read(bArr, i, i2);
        if (read > 0) {
            C1705e c1705e = this.f7057e;
            C2435e c2435e = c1705e.license;
            if (c2435e != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (c1705e.yandex == c1705e.appmetrica) {
                            c1705e.ad();
                            c1705e.vip(c2435e);
                        }
                        int min = (int) Math.min(read - i3, c1705e.appmetrica - c1705e.yandex);
                        OutputStream outputStream = c1705e.billing;
                        String str = AbstractC9413e.ad;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        c1705e.yandex += j;
                        c1705e.startapp += j;
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
            }
            long j2 = this.f7058e;
            if (j2 != -1) {
                this.f7058e = j2 - read;
            }
        }
        return read;
    }
}
