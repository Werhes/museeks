package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8635e {
    public final C2007e ad;
    public final AtomicBoolean metrica = new AtomicBoolean(true);
    public final Executor vip;

    public C8635e(C2007e c2007e, Executor executor) {
        this.ad = c2007e;
        this.vip = executor;
    }

    public final void ad(int i) {
        if (this.metrica.get()) {
            try {
                this.vip.execute(new RunnableC9766e(this, i, 11));
            } catch (RejectedExecutionException unused) {
                AbstractC9464e.remoteconfig("RotationProvider", "Failed to execute the command. Maybe the executor has been shutdown.");
            }
        }
    }
}
