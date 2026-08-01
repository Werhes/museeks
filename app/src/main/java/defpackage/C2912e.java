package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۠ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2912e {
    public final C17424e ad;
    public long adcel;
    public long advert;
    public final C8034e billing;
    public C2351e mopub;
    public final C11199e purchase;
    public long startapp;
    public final C11122e vip;
    public long yandex;
    public final C18506e metrica = new C18506e();
    public final C9831e license = new C9831e();
    public final C9831e appmetrica = new C9831e();

    public C2912e(C17424e c17424e, C11122e c11122e, C8034e c8034e) {
        this.ad = c17424e;
        this.vip = c11122e;
        this.billing = c8034e;
        C11199e c11199e = new C11199e(2);
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c11199e.f22464e = 0;
        c11199e.f22463e = -1;
        c11199e.f22465e = 0;
        c11199e.f22467e = new long[highestOneBit];
        c11199e.f22462e = highestOneBit - 1;
        this.purchase = c11199e;
        this.yandex = -9223372036854775807L;
        this.mopub = C2351e.license;
        this.startapp = -9223372036854775807L;
        this.adcel = -9223372036854775807L;
    }

    public final void ad(long j, long j2) {
        final C17424e c17424e = this.ad;
        C17075e c17075e = (C17075e) c17424e.f34141e;
        while (true) {
            C11199e c11199e = this.purchase;
            int i = c11199e.f22465e;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j3 = ((long[]) c11199e.f22467e)[c11199e.f22464e];
            Long l = (Long) this.appmetrica.m2703private(j3);
            C11122e c11122e = this.vip;
            if (l != null && l.longValue() != this.advert) {
                this.advert = l.longValue();
                c11122e.appmetrica(2);
            }
            long j4 = this.advert;
            C11122e c11122e2 = this.vip;
            C18506e c18506e = this.metrica;
            int ad = c11122e2.ad(j3, j, j2, j4, false, false, c18506e);
            if (ad != 5 && ad != 4) {
                this.billing.ad(j3, c18506e.ad);
            }
            if (ad == 0 || ad == 1) {
                this.startapp = j3;
                boolean z = ad == 0;
                long billing = c11199e.billing();
                C2351e c2351e = (C2351e) this.license.m2703private(billing);
                if (c2351e != null && !c2351e.equals(C2351e.license) && !c2351e.equals(this.mopub)) {
                    this.mopub = c2351e;
                    C11445e c11445e = new C11445e();
                    c11445e.signatures = c2351e.ad;
                    c11445e.tapsense = c2351e.vip;
                    c11445e.amazon = AbstractC8542e.amazon("video/raw");
                    c17424e.f34142e = new C16975e(c11445e);
                    c17075e.startapp.execute(new RunnableC2623e(c17424e, c2351e, 5));
                }
                long nanoTime = z ? System.nanoTime() : c18506e.vip;
                boolean z2 = c11122e.appmetrica != 3;
                c11122e.appmetrica = 3;
                c11122e.advert.getClass();
                c11122e.billing = AbstractC9413e.m2546case(SystemClock.elapsedRealtime());
                if (z2 && c17075e.appmetrica != null) {
                    final int i2 = 0;
                    c17075e.startapp.execute(new Runnable() { // from class: eؒۡۛ
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ((C17075e) c17424e.f34141e).yandex.appmetrica();
                                    return;
                                default:
                                    ((C17075e) c17424e.f34141e).yandex.Signature();
                                    return;
                            }
                        }
                    });
                }
                C16975e c16975e = (C16975e) c17424e.f34142e;
                c17075e.adcel.vip(billing, nanoTime, c16975e == null ? new C16975e(new C11445e()) : c16975e, null);
                C11418e c11418e = (C11418e) c17075e.license.remove();
                c11418e.metrica.m4090e(c11418e.ad, c11418e.vip, nanoTime);
            } else if (ad == 2 || ad == 3) {
                this.startapp = j3;
                c11199e.billing();
                final int i3 = 1;
                c17075e.startapp.execute(new Runnable() { // from class: eؒۡۛ
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ((C17075e) c17424e.f34141e).yandex.appmetrica();
                                return;
                            default:
                                ((C17075e) c17424e.f34141e).yandex.Signature();
                                return;
                        }
                    }
                });
                C11418e c11418e2 = (C11418e) c17075e.license.remove();
                C15960e c15960e = c11418e2.metrica;
                InterfaceC5827e interfaceC5827e = c11418e2.ad;
                int i4 = c11418e2.vip;
                Trace.beginSection("dropVideoBuffer");
                interfaceC5827e.billing(i4);
                Trace.endSection();
                c15960e.m4081e(0, 1);
            } else {
                if (ad != 4) {
                    if (ad != 5) {
                        throw new IllegalStateException(String.valueOf(ad));
                    }
                    return;
                }
                this.startapp = j3;
            }
        }
    }
}
