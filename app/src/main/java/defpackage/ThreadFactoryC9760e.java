package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC9760e implements ThreadFactory {
    public final /* synthetic */ int ad;
    public final /* synthetic */ String vip;

    public /* synthetic */ ThreadFactoryC9760e(String str, int i) {
        this.ad = i;
        this.vip = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.ad) {
            case 0:
                Thread thread = new Thread(runnable, this.vip);
                thread.setPriority(10);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName(this.vip);
                thread2.setPriority(5);
                return thread2;
            default:
                return new Thread(runnable, this.vip);
        }
    }
}
