package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15762e implements InterfaceC6901e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C9144e f31038e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C8938e f31039e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f31040e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C18478e f31041e = new C18478e("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f31042e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f31043e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f31044e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public IOException f31045e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC9660e f31046e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f31047e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Uri f31048e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f31049e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f31050e;

    public C15762e(C8938e c8938e, Uri uri, String str) {
        this.f31039e = c8938e;
        this.f31048e = uri;
        this.f31043e = str;
        this.f31046e = ((InterfaceC15169e) c8938e.f17921e.f11540e).remoteconfig();
    }

    public final Uri ad() {
        C9144e c9144e = this.f31038e;
        Uri uri = this.f31048e;
        if (c9144e != null) {
            C2053e c2053e = c9144e.tapsense;
            if (c2053e.ad != -9223372036854775807L || c2053e.appmetrica) {
                Uri.Builder buildUpon = uri.buildUpon();
                C9144e c9144e2 = this.f31038e;
                if (c9144e2.tapsense.appmetrica) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c9144e2.mopub + c9144e2.subscription.size()));
                    C9144e c9144e3 = this.f31038e;
                    if (c9144e3.amazon != -9223372036854775807L) {
                        AbstractC17475e abstractC17475e = c9144e3.remoteconfig;
                        int size = abstractC17475e.size();
                        if (!abstractC17475e.isEmpty() && ((C12966e) AbstractC4306e.appmetrica(abstractC17475e)).f25832e) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C2053e c2053e2 = this.f31038e.tapsense;
                if (c2053e2.ad != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", c2053e2.vip ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    @Override // defpackage.InterfaceC6901e
    public final void adcel(InterfaceC15834e interfaceC15834e, long j, long j2, int i) {
        C6913e c6913e;
        C8532e c8532e = (C8532e) interfaceC15834e;
        if (i == 0) {
            long j3 = c8532e.ad;
            c6913e = new C6913e(c8532e.vip, j);
        } else {
            long j4 = c8532e.ad;
            C2435e c2435e = c8532e.vip;
            C9344e c9344e = c8532e.license;
            c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        }
        this.f31039e.f17923e.m4641break(c6913e, c8532e.metrica, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(defpackage.C9144e r73, defpackage.C6913e r74) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15762e.appmetrica(eٌۨ, eَؚؕ):void");
    }

    public final void license(Uri uri) {
        this.f31047e = 0L;
        if (this.f31042e) {
            return;
        }
        C18478e c18478e = this.f31041e;
        if (c18478e.m4529case() || ((IOException) c18478e.f36229e) != null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f31044e;
        if (elapsedRealtime >= j) {
            metrica(uri);
        } else {
            this.f31042e = true;
            this.f31039e.f17916e.postDelayed(new RunnableC2623e(this, uri, 0), j - elapsedRealtime);
        }
    }

    public final void metrica(Uri uri) {
        C8938e c8938e = this.f31039e;
        InterfaceC17431e appmetrica = c8938e.f17912e.appmetrica(c8938e.f17909e, this.f31038e);
        Map map = Collections.EMPTY_MAP;
        AbstractC2301e.amazon(uri, "The uri must be set.");
        C8532e c8532e = new C8532e(this.f31046e, new C2435e(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), appmetrica);
        this.f31041e.m4539e(c8532e, this, c8938e.f17908e.isPro(c8532e.metrica));
    }

    @Override // defpackage.InterfaceC6901e
    public final void purchase(InterfaceC15834e interfaceC15834e, long j, long j2) {
        C8532e c8532e = (C8532e) interfaceC15834e;
        AbstractC15363e abstractC15363e = (AbstractC15363e) c8532e.purchase;
        C2435e c2435e = c8532e.vip;
        C9344e c9344e = c8532e.license;
        C6913e c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        if (abstractC15363e instanceof C9144e) {
            appmetrica((C9144e) abstractC15363e, c6913e);
            this.f31039e.f17923e.m4660while(c6913e, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            C15125e vip = C15125e.vip("Loaded playlist has unexpected type.");
            this.f31045e = vip;
            this.f31039e.f17923e.m4659try(c6913e, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, vip, true);
        }
        this.f31039e.f17908e.getClass();
    }

    @Override // defpackage.InterfaceC6901e
    public final C9436e signatures(InterfaceC15834e interfaceC15834e, long j, long j2, IOException iOException, int i) {
        C9436e c9436e = C18478e.f36224e;
        C8532e c8532e = (C8532e) interfaceC15834e;
        long j3 = c8532e.ad;
        int i2 = c8532e.metrica;
        C2435e c2435e = c8532e.vip;
        C9344e c9344e = c8532e.license;
        Uri uri = c9344e.f18614e;
        C6913e c6913e = new C6913e(c2435e, uri, c9344e.f18616e, j, j2, c9344e.f18615e);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C16008e;
        Uri uri2 = this.f31048e;
        C8938e c8938e = this.f31039e;
        if (z || z2) {
            int i3 = iOException instanceof C16254e ? ((C16254e) iOException).f31932e : Alert.DURATION_SHOW_INDEFINITELY;
            if (z2 || i3 == 400 || i3 == 503) {
                this.f31044e = SystemClock.elapsedRealtime();
                license(uri2);
                Csuper csuper = c8938e.f17923e;
                String str = AbstractC9413e.ad;
                csuper.m4659try(c6913e, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c9436e;
            }
        }
        C13572e c13572e = new C13572e(iOException, i, 13);
        Iterator it = c8938e.f17905e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((InterfaceC5429e) it.next()).vip(uri2, c13572e, false);
        }
        C5401e c5401e = c8938e.f17908e;
        if (z3) {
            long applovin = c5401e.applovin(c13572e);
            c9436e = applovin != -9223372036854775807L ? new C9436e(0, applovin, false) : C18478e.f36222e;
        }
        int i4 = c9436e.f18776e;
        boolean z4 = i4 == 0 || i4 == 1;
        c8938e.f17923e.m4659try(c6913e, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z4);
        if (!z4) {
            c5401e.getClass();
        }
        return c9436e;
    }

    @Override // defpackage.InterfaceC6901e
    public final void vip(InterfaceC15834e interfaceC15834e, long j, long j2, boolean z) {
        C8532e c8532e = (C8532e) interfaceC15834e;
        long j3 = c8532e.ad;
        C2435e c2435e = c8532e.vip;
        C9344e c9344e = c8532e.license;
        C6913e c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        C8938e c8938e = this.f31039e;
        c8938e.f17908e.getClass();
        c8938e.f17923e.m4657throw(c6913e, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
