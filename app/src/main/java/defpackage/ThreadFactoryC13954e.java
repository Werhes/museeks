package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC13954e implements ThreadFactory {
    public final /* synthetic */ int ad;
    public final /* synthetic */ ThreadFactoryC6417e vip;

    public /* synthetic */ ThreadFactoryC13954e(int i, ThreadFactoryC6417e threadFactoryC6417e) {
        this.ad = i;
        this.vip = threadFactoryC6417e;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.ad;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            if (i >= AbstractC9744e.ad[i3]) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        Thread newThread = this.vip.newThread(new RunnableC9766e(i, runnable));
        newThread.setPriority(i2);
        return newThread;
    }
}
