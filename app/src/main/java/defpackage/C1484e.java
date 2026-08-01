package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۧۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1484e {
    public static final C1484e ad = new Object();
    public static final ReferenceQueue vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؒۧۚ, java.lang.Object] */
    static {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        vip = referenceQueue;
        Thread thread = new Thread(new RunnableC12991e(10, referenceQueue));
        thread.setName("RealmFinalizingDaemon");
        thread.setDaemon(true);
        thread.setPriority(5);
        thread.start();
    }
}
