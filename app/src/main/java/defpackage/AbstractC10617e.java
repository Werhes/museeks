package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10617e {
    public static final String ad;
    public static final long appmetrica;
    public static final int license;
    public static final int metrica;
    public static final C5170e purchase;
    public static final long vip;

    static {
        String str;
        int i = AbstractC9861e.ad;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        ad = str;
        vip = AbstractC12547e.billing("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC9861e.ad;
        if (i2 < 2) {
            i2 = 2;
        }
        metrica = AbstractC12547e.yandex(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        license = AbstractC12547e.yandex(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        appmetrica = TimeUnit.SECONDS.toNanos(AbstractC12547e.billing("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        purchase = C5170e.f11059e;
    }
}
