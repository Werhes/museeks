package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۧۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3778e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f8378e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8379e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f8380e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8381e;

    public /* synthetic */ C3778e(InterfaceC16132e interfaceC16132e, boolean z, AbstractC2832e abstractC2832e) {
        this.f8381e = 1;
        this.f8378e = interfaceC16132e;
        this.f8379e = z;
        this.f8380e = abstractC2832e;
    }

    public /* synthetic */ C3778e(boolean z, Object obj, Object obj2, int i) {
        this.f8381e = i;
        this.f8379e = z;
        this.f8378e = obj;
        this.f8380e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f8381e;
        int i2 = 3;
        Object obj2 = this.f8380e;
        Object obj3 = this.f8378e;
        boolean z = this.f8379e;
        int i3 = 0;
        switch (i) {
            case 0:
                AbstractC16904e abstractC16904e = (AbstractC16904e) obj3;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj2;
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                if (z) {
                    C15130e c15130e = new C15130e(abstractC16904e, interfaceC18435e, i3);
                    InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
                    interfaceC15671e.appmetrica(AbstractC10789e.isPro, new C10591e(null, c15130e));
                    interfaceC15671e.appmetrica(AbstractC10789e.ads, new C10591e(null, new C15130e(abstractC16904e, interfaceC18435e, 1)));
                } else {
                    C15130e c15130e2 = new C15130e(abstractC16904e, interfaceC18435e, 2);
                    InterfaceC8614e[] interfaceC8614eArr2 = AbstractC14594e.ad;
                    interfaceC15671e.appmetrica(AbstractC10789e.applovin, new C10591e(null, c15130e2));
                    interfaceC15671e.appmetrica(AbstractC10789e.premium, new C10591e(null, new C15130e(abstractC16904e, interfaceC18435e, i2)));
                }
                return Unit.INSTANCE;
            case 1:
                ((AbstractC3698e) obj).billing((AbstractC2832e) obj2, 0, 0, ((Number) ((InterfaceC16132e) obj3).getValue()).floatValue() + (z ? 5.0f : 0.0f));
                return Unit.INSTANCE;
            default:
                String str = (String) obj3;
                C18362e c18362e = (C18362e) obj2;
                InterfaceC15671e interfaceC15671e2 = (InterfaceC15671e) obj;
                if (z) {
                    InterfaceC8614e[] interfaceC8614eArr3 = AbstractC14594e.ad;
                    C16591e c16591e = AbstractC9058e.mopub;
                    InterfaceC8614e interfaceC8614e = AbstractC14594e.ad[3];
                    interfaceC15671e2.appmetrica(c16591e, new C4802e(0));
                }
                C16390e c16390e = new C16390e(c18362e, 0);
                InterfaceC8614e[] interfaceC8614eArr4 = AbstractC14594e.ad;
                interfaceC15671e2.appmetrica(AbstractC10789e.tapsense, new C10591e(null, c16390e));
                AbstractC14594e.adcel(interfaceC15671e2, str);
                return Unit.INSTANCE;
        }
    }
}
