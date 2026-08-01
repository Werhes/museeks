package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3770e implements InterfaceC7970e {
    public volatile Set ad;
    public volatile Set vip;

    public final synchronized void ad() {
        try {
            Iterator it = this.ad.iterator();
            while (it.hasNext()) {
                this.vip.add(((InterfaceC7970e) it.next()).get());
            }
            this.ad = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        if (this.vip == null) {
            synchronized (this) {
                try {
                    if (this.vip == null) {
                        this.vip = Collections.newSetFromMap(new ConcurrentHashMap());
                        ad();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.vip);
    }
}
