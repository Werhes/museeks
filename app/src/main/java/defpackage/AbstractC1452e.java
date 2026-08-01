package defpackage;

import java.lang.management.ManagementFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1452e {
    public static final C5363e ad = new C5363e(new C13564e(20));

    public static boolean ad() {
        return ((Boolean) ad.getValue()).booleanValue();
    }

    public static final boolean vip() {
        try {
            return AbstractC5304e.inmobi(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
