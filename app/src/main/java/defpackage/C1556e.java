package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1556e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f4435e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4436e;

    public /* synthetic */ C1556e(C13119e c13119e, int i) {
        this.f4436e = i;
        this.f4435e = c13119e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4436e) {
            case 0:
                C13119e c13119e = this.f4435e;
                return Boolean.valueOf((AbstractC7890e.billing(c13119e.license.getValue(), c13119e.metrica()) && c13119e.billing.purchase() == Long.MIN_VALUE && !((Boolean) c13119e.yandex.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f4435e.vip());
        }
    }
}
