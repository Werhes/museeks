package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14799e extends AbstractC6552e {
    public final /* synthetic */ int appmetrica = 0;
    public final /* synthetic */ Object purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14799e(C16389e c16389e, String str) {
        super(str, true);
        this.purchase = c16389e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14799e(String str, boolean z, Function0 function0) {
        super(str, z);
        this.purchase = function0;
    }

    @Override // defpackage.AbstractC6552e
    public final long ad() {
        C0177e c0177e;
        switch (this.appmetrica) {
            case 0:
                C16389e c16389e = (C16389e) this.purchase;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - c16389e.f32196e) + 1;
                Iterator it = ((ConcurrentLinkedQueue) c16389e.f32195e).iterator();
                long j2 = Long.MAX_VALUE;
                int i = 0;
                int i2 = 0;
                C0177e c0177e2 = null;
                C0177e c0177e3 = null;
                while (it.hasNext()) {
                    C0177e c0177e4 = (C0177e) it.next();
                    synchronized (c0177e4) {
                        if (c16389e.vip(c0177e4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = j2;
                            long j4 = c0177e4.admob;
                            if (j4 < j) {
                                c0177e2 = c0177e4;
                                j = j4;
                            }
                            i++;
                            if (j4 < j3) {
                                c0177e3 = c0177e4;
                                j2 = j4;
                            } else {
                                j2 = j3;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                long j5 = j2;
                if (c0177e2 != null) {
                    c0177e = c0177e2;
                } else if (i > 5) {
                    c0177e = c0177e3;
                    j = j5;
                } else {
                    j = -1;
                    c0177e = null;
                }
                if (c0177e == null) {
                    if (c0177e3 != null) {
                        return (j5 + c16389e.f32196e) - nanoTime;
                    }
                    if (i2 > 0) {
                        return c16389e.f32196e;
                    }
                    return -1L;
                }
                synchronized (c0177e) {
                    if (c0177e.Signature.isEmpty() && c0177e.admob == j) {
                        c0177e.adcel = true;
                        ((ConcurrentLinkedQueue) c16389e.f32195e).remove(c0177e);
                        AbstractC16286e.metrica(c0177e.appmetrica);
                        if (((ConcurrentLinkedQueue) c16389e.f32195e).isEmpty()) {
                            ((C10497e) c16389e.f32194e).ad();
                        }
                    }
                }
                return 0L;
            default:
                ((Function0) this.purchase).invoke();
                return -1L;
        }
    }
}
