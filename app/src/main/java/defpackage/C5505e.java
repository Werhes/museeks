package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5505e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3229e f11785e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11786e;

    public /* synthetic */ C5505e(C3229e c3229e, int i) {
        this.f11786e = i;
        this.f11785e = c3229e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11786e) {
            case 0:
                return Boolean.valueOf(((EnumC8613e) this.f11785e.appmetrica.getValue()) != EnumC8613e.f17430e);
            default:
                C3229e c3229e = this.f11785e;
                C14995e c14995e = c3229e.purchase;
                if (((C0576e) c14995e.appmetrica).getValue() != null) {
                    return (EnumC8613e) ((C6656e) c14995e.billing).getValue();
                }
                float purchase = ((C2616e) c14995e.startapp).purchase();
                if (Float.isNaN(purchase)) {
                    return c3229e.license();
                }
                float purchase2 = c14995e.startapp().purchase(c3229e.license());
                if (Float.isNaN(purchase2) || purchase == purchase2) {
                    return c3229e.license();
                }
                EnumC8613e enumC8613e = (EnumC8613e) c14995e.startapp().ad(purchase);
                return enumC8613e == null ? c3229e.license() : enumC8613e;
        }
    }
}
