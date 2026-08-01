package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1629e implements InterfaceC12369e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile boolean f4551e = false;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ConcurrentHashMap f4550e = new ConcurrentHashMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final LinkedBlockingQueue f4549e = new LinkedBlockingQueue();

    @Override // defpackage.InterfaceC12369e
    public final synchronized InterfaceC4911e appmetrica(String str) {
        C16033e c16033e;
        c16033e = (C16033e) this.f4550e.get(str);
        if (c16033e == null) {
            c16033e = new C16033e(str, this.f4549e, this.f4551e);
            this.f4550e.put(str, c16033e);
        }
        return c16033e;
    }
}
