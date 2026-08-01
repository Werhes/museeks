package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10693e extends AbstractC3947e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public volatile C13288e f21060e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final Object f21061e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f21062e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public volatile C13288e f21063e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C4360e f21064e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C13288e f21065e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile C13288e f21066e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public volatile boolean f21067e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ConcurrentHashMap f21068e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C13288e f21069e;

    public C10693e(C6936e c6936e) {
        super(c6936e);
        this.f21061e = new Object();
        this.f21068e = new ConcurrentHashMap();
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final String m2908e(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        C6936e c6936e = (C6936e) this.f36443e;
        int length2 = str2.length();
        c6936e.f14221e.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c6936e.f14221e.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2909e(defpackage.C13288e r20, defpackage.C13288e r21, long r22, boolean r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10693e.m2909e(eْٖۙ, eْٖۙ, long, boolean, android.os.Bundle):void");
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final void m2910e(String str, C13288e c13288e, boolean z) {
        C13288e c13288e2;
        C13288e c13288e3 = this.f21066e == null ? this.f21060e : this.f21066e;
        if (c13288e.vip == null) {
            c13288e2 = new C13288e(c13288e.ad, str != null ? m2908e(str) : null, c13288e.metrica, c13288e.appmetrica, c13288e.purchase, c13288e.billing);
        } else {
            c13288e2 = c13288e;
        }
        this.f21060e = this.f21066e;
        this.f21066e = c13288e2;
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.f14215e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2254e(new RunnableC11081e(this, c13288e2, c13288e3, elapsedRealtime, z));
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final void m2911e(C4360e c4360e, Bundle bundle) {
        Bundle bundle2;
        if (!((C6936e) this.f36443e).f14221e.m2815e() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f21068e.put(Integer.valueOf(c4360e.f9492e), new C13288e(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final C13288e m2912e(C4360e c4360e) {
        AbstractC9528e.startapp(c4360e);
        Integer valueOf = Integer.valueOf(c4360e.f9492e);
        ConcurrentHashMap concurrentHashMap = this.f21068e;
        C13288e c13288e = (C13288e) concurrentHashMap.get(valueOf);
        if (c13288e == null) {
            String m2908e = m2908e(c4360e.f9491e);
            C5240e c5240e = ((C6936e) this.f36443e).f14223e;
            C6936e.purchase(c5240e);
            C13288e c13288e2 = new C13288e(c5240e.m1827e(), null, m2908e);
            concurrentHashMap.put(valueOf, c13288e2);
            c13288e = c13288e2;
        }
        return this.f21063e != null ? this.f21063e : c13288e;
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final void m2913e(C13288e c13288e, boolean z, long j) {
        C6936e c6936e = (C6936e) this.f36443e;
        C6339e c6339e = c6936e.f14204e;
        C6936e.appmetrica(c6339e);
        c6936e.f14215e.getClass();
        c6339e.m2158e(SystemClock.elapsedRealtime());
        boolean z2 = c13288e != null && c13288e.license;
        C2285e c2285e = c6936e.f14212e;
        C6936e.billing(c2285e);
        if (!c2285e.f5789e.yandex(j, z2, z) || c13288e == null) {
            return;
        }
        c13288e.license = false;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final C13288e m2914e(boolean z) {
        m1411e();
        mo2250e();
        if (!z) {
            return this.f21069e;
        }
        C13288e c13288e = this.f21069e;
        return c13288e != null ? c13288e : this.f21065e;
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ */
    public final boolean mo803e() {
        return false;
    }
}
