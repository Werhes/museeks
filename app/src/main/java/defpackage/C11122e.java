package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11122e {
    public final C15960e ad;
    public boolean adcel;
    public boolean amazon;
    public long billing;
    public boolean license;
    public final long metrica;
    public boolean smaato;
    public final C14347e vip;
    public int appmetrica = 0;
    public long purchase = -9223372036854775807L;
    public long yandex = -9223372036854775807L;
    public long startapp = -9223372036854775807L;
    public float mopub = 1.0f;
    public C17381e advert = C17381e.ad;
    public final boolean loadAd = true;

    public C11122e(Context context, C15960e c15960e, long j) {
        this.ad = c15960e;
        this.metrica = j;
        this.vip = new C14347e(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0178, code lost:
    
        if (r3 > 100000) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0188, code lost:
    
        if (r33 >= r37) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0086, code lost:
    
        if ((r9 == 0 ? false : r7.billing[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ad(long r31, long r33, long r35, long r37, boolean r39, boolean r40, defpackage.C18506e r41) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11122e.ad(long, long, long, long, boolean, boolean, eۦۥ):int");
    }

    public final void appmetrica(int i) {
        if (i == 0) {
            this.appmetrica = 1;
        } else if (i == 1) {
            this.appmetrica = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.appmetrica = Math.min(this.appmetrica, 2);
        }
        this.vip.vip();
    }

    public final void billing(Surface surface) {
        this.smaato = surface != null;
        this.amazon = false;
        C14347e c14347e = this.vip;
        if (c14347e.appmetrica != surface) {
            c14347e.ad();
            c14347e.appmetrica = surface;
            c14347e.license(true);
        }
        this.appmetrica = Math.min(this.appmetrica, 1);
    }

    public final void license() {
        this.license = true;
        this.advert.getClass();
        this.billing = AbstractC9413e.m2546case(SystemClock.elapsedRealtime());
        C14347e c14347e = this.vip;
        c14347e.license = true;
        c14347e.vip();
        DisplayManager displayManager = (DisplayManager) c14347e.vip.getSystemService("display");
        AbstractC17090e abstractC17090e = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                abstractC17090e = Build.VERSION.SDK_INT >= 33 ? new ChoreographerVsyncCallbackC9507e(choreographer, displayManager) : new AbstractC17090e(choreographer, displayManager);
            } catch (RuntimeException e) {
                AbstractC2803e.amazon("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        c14347e.metrica = abstractC17090e;
        if (abstractC17090e != null) {
            abstractC17090e.ad();
        }
        c14347e.license(false);
    }

    public final void metrica(boolean z) {
        long j;
        this.adcel = z;
        long j2 = this.metrica;
        if (j2 > 0) {
            this.advert.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.startapp = j;
    }

    public final void purchase(float f) {
        C14347e c14347e = this.vip;
        c14347e.purchase = f;
        C14386e c14386e = c14347e.ad;
        ((C13137e) c14386e.f28459e).metrica();
        ((C13137e) c14386e.f28456e).metrica();
        c14386e.f28457e = false;
        c14386e.f28458e = -9223372036854775807L;
        c14386e.f28460e = 0;
        c14347e.metrica();
    }

    public final boolean vip(boolean z) {
        if (z && (this.appmetrica == 3 || (this.amazon && (!this.smaato || !this.loadAd)))) {
            this.startapp = -9223372036854775807L;
            return true;
        }
        if (this.startapp == -9223372036854775807L) {
            return false;
        }
        this.advert.getClass();
        if (SystemClock.elapsedRealtime() < this.startapp) {
            return true;
        }
        this.startapp = -9223372036854775807L;
        return false;
    }

    public final void yandex(float f) {
        AbstractC2301e.billing(f > 0.0f);
        if (f == this.mopub) {
            return;
        }
        this.mopub = f;
        C14347e c14347e = this.vip;
        c14347e.startapp = f;
        c14347e.license(false);
    }
}
