package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16515e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17643e f32329e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32330e;

    public /* synthetic */ C16515e(C17643e c17643e, int i) {
        this.f32330e = i;
        this.f32329e = c17643e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32330e) {
            case 0:
                C17643e c17643e = this.f32329e;
                synchronized (C17643e.billing) {
                    C17643e.purchase.remove(((C10675e) c17643e.appmetrica.getValue()).f21024e.remoteconfig());
                }
                return Unit.INSTANCE;
            default:
                C5625e c5625e = this.f32329e.license;
                C10675e c10675e = (C10675e) c5625e.invoke();
                if (purchase.ad(c10675e) != -1) {
                    return C10215e.license(c10675e.f21024e.remoteconfig(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c5625e + ", instead got " + c10675e).toString());
        }
    }
}
