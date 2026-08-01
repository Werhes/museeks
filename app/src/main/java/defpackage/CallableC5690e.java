package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC5690e implements Callable {
    public final /* synthetic */ long ad;
    public final /* synthetic */ C4594e vip;

    public CallableC5690e(C4594e c4594e, long j) {
        this.vip = c4594e;
        this.ad = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.ad);
        this.vip.mopub.crashlytics(bundle);
        return null;
    }
}
