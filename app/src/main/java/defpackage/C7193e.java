package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7193e {
    public final Executor ad;
    public final Handler vip;

    public C7193e(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.ad = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.vip = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7193e) {
            C7193e c7193e = (C7193e) obj;
            if (this.ad.equals(c7193e.ad) && this.vip.equals(c7193e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.ad + ", schedulerHandler=" + this.vip + "}";
    }
}
