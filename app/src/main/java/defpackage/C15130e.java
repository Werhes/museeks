package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15130e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f29921e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f29922e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29923e;

    public /* synthetic */ C15130e(AbstractC16904e abstractC16904e, InterfaceC18435e interfaceC18435e, int i) {
        this.f29923e = i;
        this.f29922e = abstractC16904e;
        this.f29921e = interfaceC18435e;
    }

    public /* synthetic */ C15130e(InterfaceC18435e interfaceC18435e, AbstractC16904e abstractC16904e, int i) {
        this.f29923e = i;
        this.f29921e = interfaceC18435e;
        this.f29922e = abstractC16904e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29923e) {
            case 0:
                AbstractC16904e abstractC16904e = this.f29922e;
                boolean z = false;
                if (abstractC16904e.metrica()) {
                    AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(0, null, abstractC16904e), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                AbstractC16904e abstractC16904e2 = this.f29922e;
                boolean z2 = false;
                if (abstractC16904e2.license()) {
                    AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(1, null, abstractC16904e2), 3);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                AbstractC16904e abstractC16904e3 = this.f29922e;
                boolean z3 = false;
                if (abstractC16904e3.metrica()) {
                    AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(0, null, abstractC16904e3), 3);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 3:
                AbstractC16904e abstractC16904e4 = this.f29922e;
                boolean z4 = false;
                if (abstractC16904e4.license()) {
                    AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(1, null, abstractC16904e4), 3);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 4:
                AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(4, null, this.f29922e), 3);
                return Unit.INSTANCE;
            case 5:
                AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(5, null, this.f29922e), 3);
                return Unit.INSTANCE;
            default:
                AbstractC5336e.purchase(this.f29921e, null, 0, new C8144e(3, null, this.f29922e), 3);
                return Unit.INSTANCE;
        }
    }
}
