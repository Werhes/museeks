package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3697e {
    public static final C2892e ad = new C2892e(1881215219, false, new C14123e(16));

    public static Executor billing(Executor executor, AbstractC16326e abstractC16326e) {
        executor.getClass();
        return executor == EnumC3320e.f7489e ? executor : new ExecutorC17731e(executor, abstractC16326e, 0);
    }

    public static final long license(long j, EnumC15934e enumC15934e) {
        long j2;
        int ordinal = enumC15934e.ordinal();
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                throw new IllegalStateException(("Wrong unit for millisMultiplier: " + enumC15934e).toString());
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static void startapp(Status status, Object obj, C8988e c8988e) {
        if (status.billing()) {
            c8988e.ad.loadAd(obj);
        } else {
            c8988e.metrica(AbstractC9600e.vip(status));
        }
    }

    public static void yandex(Status status, Object obj, C8988e c8988e) {
        if (status.billing()) {
            c8988e.vip(obj);
        } else {
            c8988e.ad(AbstractC9600e.vip(status));
        }
    }

    public abstract boolean ad(AbstractC18423e abstractC18423e, C9934e c9934e, C9934e c9934e2);

    public abstract void appmetrica(C16839e c16839e, C16839e c16839e2);

    public abstract boolean metrica(AbstractC18423e abstractC18423e, C16839e c16839e, C16839e c16839e2);

    public abstract void purchase(C16839e c16839e, Thread thread);

    public abstract boolean vip(AbstractC18423e abstractC18423e, Object obj, Object obj2);
}
