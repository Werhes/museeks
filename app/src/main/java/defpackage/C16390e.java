package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٞۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16390e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18362e f32197e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32198e;

    public /* synthetic */ C16390e(C18362e c18362e, int i) {
        this.f32198e = i;
        this.f32197e = c18362e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32198e) {
            case 0:
                this.f32197e.ad();
                return Boolean.TRUE;
            default:
                C13578e c13578e = this.f32197e.vip;
                if (c13578e.applovin()) {
                    c13578e.billing(EnumC12766e.f25539e);
                }
                return Unit.INSTANCE;
        }
    }
}
