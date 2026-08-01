package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۢۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2177e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3002e f5544e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5545e;

    public /* synthetic */ C2177e(AbstractC3002e abstractC3002e, int i) {
        this.f5545e = i;
        this.f5544e = abstractC3002e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٔۛٗ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5545e) {
            case 0:
                int size = this.f5544e.metrica.size();
                ?? obj = new Object();
                obj.ad = size;
                obj.vip = 0;
                return obj;
            default:
                C2464e.appmetrica.ad(new C8003e(this.f5544e), true);
                return Unit.INSTANCE;
        }
    }
}
