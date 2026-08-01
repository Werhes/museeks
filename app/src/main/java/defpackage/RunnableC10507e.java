package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC10507e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8320e f20732e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f20733e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20734e;

    public RunnableC10507e(C8320e c8320e, long j, int i) {
        this.f20734e = i;
        switch (i) {
            case 1:
                this.f20733e = j;
                this.f20732e = c8320e;
                return;
            default:
                this.f20733e = j;
                Objects.requireNonNull(c8320e);
                this.f20732e = c8320e;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20734e) {
            case 0:
                C6936e c6936e = (C6936e) this.f20732e.f36443e;
                C1195e c1195e = c6936e.f14198e;
                C6936e.purchase(c1195e);
                C5982e c5982e = c1195e.f3801e;
                long j = this.f20733e;
                c5982e.license(j);
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27496e.vip(Long.valueOf(j), "Session timeout duration set");
                return;
            default:
                C8320e c8320e = this.f20732e;
                c8320e.mo2250e();
                c8320e.m1411e();
                C6936e c6936e2 = (C6936e) c8320e.f36443e;
                C13879e c13879e2 = c6936e2.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27496e.ad("Resetting analytics data (FE)");
                C2285e c2285e = c6936e2.f14212e;
                C6936e.billing(c2285e);
                c2285e.mo2250e();
                C18524e c18524e = c2285e.f5789e;
                ((C9940e) c18524e.f36317e).metrica();
                ((C6936e) ((C2285e) c18524e.f36316e).f36443e).f14215e.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c18524e.f36318e = elapsedRealtime;
                c18524e.f36319e = elapsedRealtime;
                c6936e2.smaato().m3390e();
                boolean z = !c6936e2.ad();
                C1195e c1195e2 = c6936e2.f14198e;
                C6936e.purchase(c1195e2);
                c1195e2.f3819e.license(this.f20733e);
                C6936e c6936e3 = (C6936e) c1195e2.f36443e;
                C1195e c1195e3 = c6936e3.f14198e;
                C6936e.purchase(c1195e3);
                if (!TextUtils.isEmpty(c1195e3.f3816e.tapsense())) {
                    c1195e2.f3816e.isVip(null);
                }
                c1195e2.f3806e.license(0L);
                c1195e2.f3805e.license(0L);
                if (!c6936e3.f14221e.m2818e()) {
                    c1195e2.m486e(z);
                }
                c1195e2.f3818e.isVip(null);
                c1195e2.f3812e.license(0L);
                c1195e2.f3810e.m3004const(null);
                C10640e mopub = c6936e2.mopub();
                mopub.mo2250e();
                mopub.m1411e();
                C8019e m2858e = mopub.m2858e(false);
                mopub.m2861e();
                ((C6936e) mopub.f36443e).adcel().m3535e();
                mopub.m2851e(new RunnableC11767e(mopub, m2858e, 0));
                C6936e.billing(c2285e);
                c2285e.f5790e.vip();
                c8320e.f17012e = z;
                c6936e2.mopub().m2860e(new AtomicReference());
                return;
        }
    }
}
