package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6880e extends C7332e {
    public final /* synthetic */ C10420e amazon;

    public C6880e(C10420e c10420e) {
        this.amazon = c10420e;
    }

    @Override // defpackage.C7332e
    public final IOException adcel(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    public final void advert() {
        if (startapp()) {
            throw adcel(null);
        }
    }

    @Override // defpackage.C7332e
    public final void mopub() {
        this.amazon.appmetrica(9);
        C10142e c10142e = this.amazon.f20597e;
        synchronized (c10142e) {
            long j = c10142e.f20062e;
            long j2 = c10142e.f20057e;
            if (j < j2) {
                return;
            }
            c10142e.f20057e = j2 + 1;
            c10142e.f20066e = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            C10497e.metrica(c10142e.f20068e, AbstractC1786e.signatures(new StringBuilder(), c10142e.f20059e, " ping"), 0L, new C12851e(3, c10142e), 6);
        }
    }
}
