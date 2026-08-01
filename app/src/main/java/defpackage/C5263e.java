package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5263e extends AbstractC9832e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11337e = AtomicIntegerFieldUpdater.newUpdater(C5263e.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Function1 f11338e;

    public C5263e(Function1 function1) {
        this.f11338e = function1;
    }

    @Override // defpackage.AbstractC9832e
    public final void mopub(Throwable th) {
        if (f11337e.compareAndSet(this, 0, 1)) {
            this.f11338e.invoke(th);
        }
    }

    @Override // defpackage.AbstractC9832e
    public final boolean startapp() {
        return true;
    }
}
