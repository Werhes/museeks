package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4138e extends AbstractC2207e {
    public int billing;

    @Override // defpackage.InterfaceC17119e
    public final Object isVip() {
        return null;
    }

    @Override // defpackage.InterfaceC17119e
    public final int mopub() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC17119e
    public final int pro() {
        return 0;
    }

    @Override // defpackage.InterfaceC17119e
    public final void startapp(long j, long j2, long j3, List list, InterfaceC14651e[] interfaceC14651eArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (yandex(this.billing, elapsedRealtime)) {
            for (int i = this.vip - 1; i >= 0; i--) {
                if (!yandex(i, elapsedRealtime)) {
                    this.billing = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
