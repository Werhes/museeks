package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7761e {
    public final Throwable ad;

    public C7761e(Throwable th) {
        this.ad = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable ad(Function1 function1) {
        Throwable th = this.ad;
        if (th == 0) {
            return null;
        }
        return th instanceof InterfaceC13853e ? ((InterfaceC13853e) th).ad() : th instanceof CancellationException ? AbstractC7070e.ad(((CancellationException) th).getMessage(), th) : (Throwable) function1.invoke(th);
    }
}
