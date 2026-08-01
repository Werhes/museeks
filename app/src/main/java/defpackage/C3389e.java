package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3389e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13578e f7602e;

    public C3389e(C13578e c13578e) {
        super(false);
        this.f7602e = c13578e;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f7602e.billing(new C12763e(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f7602e.billing(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
