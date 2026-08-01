package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18395e implements InterfaceC13242e, InterfaceC7138e {
    public final Executor metrica;
    public final HashMap ad = new HashMap();
    public ArrayDeque vip = new ArrayDeque();

    public C18395e(Executor executor) {
        this.metrica = executor;
    }

    public final synchronized void ad(Executor executor, InterfaceC2156e interfaceC2156e) {
        try {
            executor.getClass();
            if (!this.ad.containsKey(AbstractC9464e.class)) {
                this.ad.put(AbstractC9464e.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.ad.get(AbstractC9464e.class)).put(interfaceC2156e, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
