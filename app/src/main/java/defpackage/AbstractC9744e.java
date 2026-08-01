package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9744e {
    public static final int[] ad = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory vip = Executors.defaultThreadFactory();

    public static ScheduledExecutorService ad(ThreadFactoryC13954e threadFactoryC13954e, int i) {
        if (i > 0) {
            return Executors.newScheduledThreadPool(i, threadFactoryC13954e);
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("Threads (", i, ") must be > 0").toString());
    }
}
