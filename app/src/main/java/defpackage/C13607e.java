package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13607e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7344e f26992e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26993e;

    public /* synthetic */ C13607e(C7344e c7344e, int i) {
        this.f26993e = i;
        this.f26992e = c7344e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26993e) {
            case 0:
                return Float.valueOf(this.f26992e.f15067e.vip());
            case 1:
                return Float.valueOf(this.f26992e.f15067e.appmetrica());
            default:
                C7344e c7344e = this.f26992e;
                return Float.valueOf(c7344e.f15067e.ad() - c7344e.f15067e.license());
        }
    }
}
