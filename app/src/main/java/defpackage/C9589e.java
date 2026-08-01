package defpackage;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9589e implements Closeable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function1 f19023e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f19024e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Function0 f19025e = new C13630e(8);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8208e f19026e;

    public C9589e(C8208e c8208e, Object obj, Function1 function1) {
        this.f19026e = c8208e;
        this.f19024e = obj;
        this.f19023e = function1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19025e.invoke();
    }
}
