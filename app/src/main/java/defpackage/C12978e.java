package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12978e implements InterfaceC9660e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f25866e = false;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public long f25867e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public InterfaceC9660e f25868e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C3009e f25869e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C2435e f25870e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f25871e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f25872e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC9660e f25873e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f25874e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f25875e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C7747e f25876e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C12582e f25877e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C2435e f25878e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public long f25879e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC9660e f25880e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Uri f25881e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5482e f25882e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f25883e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f25884e;

    public C12978e(InterfaceC5482e interfaceC5482e, InterfaceC9660e interfaceC9660e, InterfaceC9660e interfaceC9660e2, C1705e c1705e, int i, C12582e c12582e) {
        this.f25882e = interfaceC5482e;
        this.f25873e = interfaceC9660e2;
        this.f25884e = (i & 2) != 0;
        this.f25883e = false;
        if (interfaceC9660e != null) {
            this.f25880e = interfaceC9660e;
            this.f25869e = c1705e != null ? new C3009e(interfaceC9660e, c1705e) : null;
        } else {
            this.f25880e = C3360e.f7565e;
            this.f25869e = null;
        }
        this.f25877e = c12582e;
    }

    public final void Signature(C2435e c2435e, boolean z) {
        C7747e amazon;
        C2435e ad;
        InterfaceC9660e interfaceC9660e;
        String str = c2435e.yandex;
        String str2 = AbstractC9413e.ad;
        if (this.f25872e) {
            amazon = null;
        } else if (this.f25866e) {
            try {
                InterfaceC5482e interfaceC5482e = this.f25882e;
                long j = this.f25871e;
                long j2 = this.f25875e;
                C8531e c8531e = (C8531e) interfaceC5482e;
                synchronized (c8531e) {
                    c8531e.license();
                    while (true) {
                        amazon = c8531e.amazon(str, j, j2);
                        if (amazon != null) {
                            break;
                        } else {
                            c8531e.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            amazon = ((C8531e) this.f25882e).amazon(str, this.f25871e, this.f25875e);
        }
        if (amazon == null) {
            interfaceC9660e = this.f25880e;
            C11537e ad2 = c2435e.ad();
            ad2.purchase = this.f25871e;
            ad2.billing = this.f25875e;
            ad = ad2.ad();
        } else if (amazon.f6201e) {
            Uri fromFile = Uri.fromFile(amazon.f6198e);
            long j3 = amazon.f6200e;
            long j4 = this.f25871e - j3;
            long j5 = amazon.f6199e - j4;
            long j6 = this.f25875e;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            C11537e ad3 = c2435e.ad();
            ad3.ad = fromFile;
            ad3.vip = j3;
            ad3.purchase = j4;
            ad3.billing = j5;
            ad = ad3.ad();
            interfaceC9660e = this.f25873e;
        } else {
            long j7 = amazon.f6199e;
            if (j7 == -1) {
                j7 = this.f25875e;
            } else {
                long j8 = this.f25875e;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            C11537e ad4 = c2435e.ad();
            ad4.purchase = this.f25871e;
            ad4.billing = j7;
            ad = ad4.ad();
            interfaceC9660e = this.f25869e;
            if (interfaceC9660e == null) {
                interfaceC9660e = this.f25880e;
                ((C8531e) this.f25882e).mopub(amazon);
                amazon = null;
            }
        }
        this.f25879e = (this.f25872e || interfaceC9660e != this.f25880e) ? Long.MAX_VALUE : this.f25871e + 102400;
        if (z) {
            AbstractC2301e.subscription(this.f25868e == this.f25880e);
            if (interfaceC9660e == this.f25880e) {
                return;
            }
            try {
                mopub();
            } catch (Throwable th) {
                if (!amazon.f6201e) {
                    ((C8531e) this.f25882e).mopub(amazon);
                }
                throw th;
            }
        }
        if (amazon != null && !amazon.f6201e) {
            this.f25876e = amazon;
        }
        this.f25868e = interfaceC9660e;
        this.f25878e = ad;
        this.f25867e = 0L;
        long metrica = interfaceC9660e.metrica(ad);
        C18540e c18540e = new C18540e(12);
        if (ad.billing == -1 && metrica != -1) {
            this.f25875e = metrica;
            c18540e.inmobi(Long.valueOf(this.f25871e + metrica), "exo_len");
        }
        if (!(this.f25868e == this.f25873e)) {
            Uri loadAd = interfaceC9660e.loadAd();
            this.f25881e = loadAd;
            Uri uri = c2435e.ad.equals(loadAd) ? null : this.f25881e;
            if (uri == null) {
                ((ArrayList) c18540e.f36382e).add("exo_redir");
                ((HashMap) c18540e.f36383e).remove("exo_redir");
            } else {
                c18540e.inmobi(uri.toString(), "exo_redir");
            }
        }
        if (this.f25868e == this.f25869e) {
            ((C8531e) this.f25882e).metrica(str, c18540e);
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        return !(this.f25868e == this.f25873e) ? this.f25880e.advert() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f25870e = null;
        this.f25881e = null;
        this.f25871e = 0L;
        try {
            mopub();
        } catch (Throwable th) {
            if (this.f25868e == this.f25873e || (th instanceof C17349e)) {
                this.f25874e = true;
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f25873e.license(interfaceC4407e);
        this.f25880e.license(interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f25881e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:3:0x0007, B:6:0x0012, B:7:0x0016, B:9:0x0038, B:14:0x004b, B:16:0x0056, B:20:0x0083, B:22:0x0089, B:25:0x00b6, B:28:0x00c2, B:29:0x00be, B:30:0x00c4, B:37:0x00d4, B:39:0x00ce, B:40:0x0090, B:42:0x00a2, B:45:0x00aa, B:46:0x00b1, B:47:0x005b, B:52:0x0064, B:54:0x0068, B:56:0x0074, B:59:0x0044), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:3:0x0007, B:6:0x0012, B:7:0x0016, B:9:0x0038, B:14:0x004b, B:16:0x0056, B:20:0x0083, B:22:0x0089, B:25:0x00b6, B:28:0x00c2, B:29:0x00be, B:30:0x00c4, B:37:0x00d4, B:39:0x00ce, B:40:0x0090, B:42:0x00a2, B:45:0x00aa, B:46:0x00b1, B:47:0x005b, B:52:0x0064, B:54:0x0068, B:56:0x0074, B:59:0x0044), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {all -> 0x008e, blocks: (B:3:0x0007, B:6:0x0012, B:7:0x0016, B:9:0x0038, B:14:0x004b, B:16:0x0056, B:20:0x0083, B:22:0x0089, B:25:0x00b6, B:28:0x00c2, B:29:0x00be, B:30:0x00c4, B:37:0x00d4, B:39:0x00ce, B:40:0x0090, B:42:0x00a2, B:45:0x00aa, B:46:0x00b1, B:47:0x005b, B:52:0x0064, B:54:0x0068, B:56:0x0074, B:59:0x0044), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:3:0x0007, B:6:0x0012, B:7:0x0016, B:9:0x0038, B:14:0x004b, B:16:0x0056, B:20:0x0083, B:22:0x0089, B:25:0x00b6, B:28:0x00c2, B:29:0x00be, B:30:0x00c4, B:37:0x00d4, B:39:0x00ce, B:40:0x0090, B:42:0x00a2, B:45:0x00aa, B:46:0x00b1, B:47:0x005b, B:52:0x0064, B:54:0x0068, B:56:0x0074, B:59:0x0044), top: B:2:0x0007 }] */
    @Override // defpackage.InterfaceC9660e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long metrica(defpackage.C2435e r20) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12978e.metrica(eؚؔۜ):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mopub() {
        InterfaceC5482e interfaceC5482e = this.f25882e;
        InterfaceC9660e interfaceC9660e = this.f25868e;
        if (interfaceC9660e == null) {
            return;
        }
        try {
            interfaceC9660e.close();
        } finally {
            this.f25878e = null;
            this.f25868e = null;
            C7747e c7747e = this.f25876e;
            if (c7747e != null) {
                ((C8531e) interfaceC5482e).mopub(c7747e);
                this.f25876e = null;
            }
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        InterfaceC9660e interfaceC9660e = this.f25873e;
        if (i2 == 0) {
            return 0;
        }
        if (this.f25875e == 0) {
            return -1;
        }
        C2435e c2435e = this.f25870e;
        c2435e.getClass();
        C2435e c2435e2 = this.f25878e;
        c2435e2.getClass();
        try {
            if (this.f25871e >= this.f25879e) {
                Signature(c2435e, true);
            }
            InterfaceC9660e interfaceC9660e2 = this.f25868e;
            interfaceC9660e2.getClass();
            int read = interfaceC9660e2.read(bArr, i, i2);
            if (read != -1) {
                long j2 = read;
                this.f25871e += j2;
                this.f25867e += j2;
                long j3 = this.f25875e;
                if (j3 == -1) {
                    return read;
                }
                this.f25875e = j3 - j2;
                return read;
            }
            InterfaceC9660e interfaceC9660e3 = this.f25868e;
            if (!(interfaceC9660e3 == interfaceC9660e)) {
                j = -1;
                long j4 = c2435e2.billing;
                if (j4 != -1) {
                    i3 = read;
                    if (this.f25867e < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = c2435e.yandex;
                String str2 = AbstractC9413e.ad;
                this.f25875e = 0L;
                if (!(interfaceC9660e3 == this.f25869e)) {
                    return i3;
                }
                C18540e c18540e = new C18540e(12);
                c18540e.inmobi(Long.valueOf(this.f25871e), "exo_len");
                ((C8531e) this.f25882e).metrica(str, c18540e);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.f25875e;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            mopub();
            Signature(c2435e, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.f25868e == interfaceC9660e || (th instanceof C17349e)) {
                this.f25874e = true;
            }
            throw th;
        }
    }
}
