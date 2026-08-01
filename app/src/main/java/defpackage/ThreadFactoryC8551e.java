package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC8551e implements ThreadFactory {
    public final /* synthetic */ String ad;
    public final /* synthetic */ boolean vip;

    public /* synthetic */ ThreadFactoryC8551e(String str, boolean z) {
        this.ad = str;
        this.vip = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.ad);
        thread.setDaemon(this.vip);
        return thread;
    }
}
