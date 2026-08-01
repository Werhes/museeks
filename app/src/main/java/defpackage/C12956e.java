package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12956e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f25814e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25815e;

    public /* synthetic */ C12956e(C7765e c7765e, int i, int i2) {
        this.f25815e = i2;
        this.f25814e = c7765e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25815e;
        C13770e c13770e = (C13770e) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0483e.purchase(this.f25814e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                AbstractC0483e.appmetrica(this.f25814e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
