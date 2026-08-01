package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12129e extends Thread {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24296e;

    public C12129e(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f24296e = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f24296e);
        super.run();
    }
}
