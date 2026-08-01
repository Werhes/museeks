package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC8686e implements Choreographer.FrameCallback {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f17528e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C13578e f17529e;

    public ChoreographerFrameCallbackC8686e(C13578e c13578e, C4886e c4886e, Function1 function1) {
        this.f17529e = c13578e;
        this.f17528e = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c12763e;
        try {
            c12763e = this.f17528e.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        this.f17529e.billing(c12763e);
    }
}
