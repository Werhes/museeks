package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6197e extends AbstractC10732e {
    public final C12718e vip;

    public C6197e(Function0 function0) {
        super(function0);
        this.vip = new C12718e();
    }

    @Override // defpackage.AbstractC10732e
    public final Object ad() {
        Object removeLast;
        synchronized (this) {
            C12718e c12718e = this.vip;
            removeLast = c12718e.isEmpty() ? null : c12718e.removeLast();
        }
        return removeLast == null ? this.ad.invoke() : removeLast;
    }

    @Override // defpackage.AbstractC10732e
    public final void vip(Object obj) {
        synchronized (this) {
            try {
                if (this.vip.subs() < AbstractC17408e.ad) {
                    this.vip.addLast(obj);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
