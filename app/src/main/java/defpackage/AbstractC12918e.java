package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12918e {
    public static final C1343e ad;
    public static final C15601e metrica;
    public static C1343e vip;

    static {
        C6351e c6351e = new C6351e();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c6351e.inmobi = AbstractC16286e.vip(15L, timeUnit);
        c6351e.applovin = AbstractC16286e.vip(45L, timeUnit);
        c6351e.isPro = AbstractC16286e.vip(45L, timeUnit);
        ad = new C1343e(c6351e);
        metrica = new C15601e();
    }

    public static C1343e ad() {
        C1343e c1343e = vip;
        return c1343e == null ? ad : c1343e;
    }
}
