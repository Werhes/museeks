package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8365e {
    public final Executor ad;

    public C8365e(ExecutorC12245e executorC12245e, int i) {
        this.ad = (i & 8) != 0 ? null : executorC12245e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8365e) && AbstractC7890e.billing(this.ad, ((C8365e) obj).ad);
    }

    public final int hashCode() {
        Executor executor = this.ad;
        return (executor == null ? 0 : executor.hashCode()) * 29791;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor=" + this.ad + ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)";
    }
}
