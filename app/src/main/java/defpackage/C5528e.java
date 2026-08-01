package defpackage;

import java.lang.Thread;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5528e implements Thread.UncaughtExceptionHandler {
    public final String ad;
    public final /* synthetic */ C6915e vip;

    public C5528e(C6915e c6915e, String str) {
        this.vip = c6915e;
        this.ad = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        C13879e c13879e = ((C6936e) this.vip.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27502e.vip(th, this.ad);
    }
}
