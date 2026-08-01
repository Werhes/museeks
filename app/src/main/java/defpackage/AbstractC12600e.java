package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12600e {
    public static final C15492e ad = new AbstractC4455e(new C14582e(19));
    public static Boolean vip;

    public static final void ad(C10566e c10566e, C1839e c1839e, InterfaceC2141e interfaceC2141e, List list, C13770e c13770e) {
        Executor executor = (Executor) c13770e.adcel(ad);
        if (executor == null || !vip(c10566e.f20850e.length())) {
            c13770e.m3676strictfp(-517090505);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(-518737659);
            try {
                executor.execute(new RunnableC5555e(c1839e, (EnumC7792e) c13770e.adcel(AbstractC11473e.amazon), list, c10566e, (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex), interfaceC2141e, 0));
            } catch (RejectedExecutionException unused) {
            }
            c13770e.Signature(false);
        }
    }

    public static final boolean vip(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (vip == null) {
                vip = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            if (vip.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
