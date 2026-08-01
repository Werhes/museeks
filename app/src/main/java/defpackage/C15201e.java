package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15201e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2809e f30108e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30109e;

    public /* synthetic */ C15201e(C2809e c2809e, int i) {
        this.f30109e = i;
        this.f30108e = c2809e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30109e) {
            case 0:
                C2809e c2809e = this.f30108e;
                return Boolean.valueOf(c2809e != null ? ((Boolean) new C15201e(c2809e, 2).invoke()).booleanValue() : false);
            case 1:
                C2809e c2809e2 = this.f30108e;
                return Boolean.valueOf(c2809e2 != null ? ((Boolean) new C15201e(c2809e2, 2).invoke()).booleanValue() : false);
            default:
                C2809e c2809e3 = this.f30108e;
                C10566e c10566e = c2809e3.vip;
                C12476e c12476e = (C12476e) c2809e3.ad.getValue();
                return Boolean.valueOf(AbstractC7890e.billing(c10566e, c12476e != null ? c12476e.ad.ad : null));
        }
    }
}
