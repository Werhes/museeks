package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1427e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater vip = AtomicIntegerFieldUpdater.newUpdater(C1427e.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable ad;

    public C1427e(Throwable th, boolean z) {
        this.ad = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.ad + ']';
    }
}
