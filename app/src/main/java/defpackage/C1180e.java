package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180e extends CancellationException {
    public C1180e(long j) {
        super(AbstractC1634e.mopub(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC7111e.startapp);
        return this;
    }
}
