package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0970e extends PhantomReference {
    public static final C9770e purchase = new C9770e(16, false);
    public final C1484e ad;
    public C0970e appmetrica;
    public C0970e license;
    public final long metrica;
    public final AtomicBoolean vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0970e(LongPointerWrapper longPointerWrapper, ReferenceQueue referenceQueue) {
        super(longPointerWrapper, referenceQueue);
        C1484e c1484e = C1484e.ad;
        this.ad = c1484e;
        this.vip = longPointerWrapper.getReleased();
        this.metrica = longPointerWrapper.getPtr$cinterop_release();
        C9770e c9770e = purchase;
        synchronized (c9770e) {
            try {
                this.license = null;
                C0970e c0970e = (C0970e) c9770e.f19315e;
                this.appmetrica = c0970e;
                if (c0970e != null) {
                    c0970e.license = this;
                }
                c9770e.f19315e = this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
