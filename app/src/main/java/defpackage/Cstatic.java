package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: static, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cstatic extends CancellationException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final transient Object f36461e;

    public Cstatic(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f36461e = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
