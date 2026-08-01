package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16442e {
    public final C3672e ad;
    public int metrica;
    public long vip;
    public static final long license = TimeUnit.HOURS.toMillis(24);
    public static final long appmetrica = TimeUnit.MINUTES.toMillis(30);

    public C16442e() {
        if (C8455e.f17218e == null) {
            Pattern pattern = C3672e.metrica;
            C8455e.f17218e = new C8455e(10);
        }
        C8455e c8455e = C8455e.f17218e;
        if (C3672e.license == null) {
            C3672e.license = new C3672e(c8455e);
        }
        this.ad = C3672e.license;
    }

    public final synchronized long ad(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return license;
        }
        double pow = Math.pow(2.0d, this.metrica);
        this.ad.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), appmetrica);
    }

    public final synchronized void license(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            metrica();
            return;
        }
        this.metrica++;
        long ad = ad(i);
        this.ad.ad.getClass();
        this.vip = System.currentTimeMillis() + ad;
    }

    public final synchronized void metrica() {
        this.metrica = 0;
    }

    public final synchronized boolean vip() {
        boolean z;
        if (this.metrica != 0) {
            this.ad.ad.getClass();
            z = System.currentTimeMillis() > this.vip;
        }
        return z;
    }
}
