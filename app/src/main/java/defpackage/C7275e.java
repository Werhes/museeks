package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7275e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14873e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14874e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f14875e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14876e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f14877e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16154e f14878e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f14879e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14880e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14881e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f14882e;

    public /* synthetic */ C7275e(C0398e c0398e, boolean z, boolean z2, C2864e c2864e, C15274e c15274e, Function2 function2, Function2 function22, C17085e c17085e, InterfaceC16154e interfaceC16154e) {
        this.f14873e = c0398e;
        this.f14876e = z;
        this.f14874e = z2;
        this.f14882e = c2864e;
        this.f14881e = c15274e;
        this.f14877e = function2;
        this.f14879e = function22;
        this.f14875e = c17085e;
        this.f14878e = interfaceC16154e;
    }

    public /* synthetic */ C7275e(AbstractC16904e abstractC16904e, InterfaceC12123e interfaceC12123e, C3177e c3177e, boolean z, C13610e c13610e, InterfaceC12864e interfaceC12864e, InterfaceC6340e interfaceC6340e, InterfaceC16154e interfaceC16154e, boolean z2) {
        this.f14873e = abstractC16904e;
        this.f14882e = interfaceC12123e;
        this.f14881e = c3177e;
        this.f14876e = z;
        this.f14877e = c13610e;
        this.f14879e = interfaceC12864e;
        this.f14875e = interfaceC6340e;
        this.f14878e = interfaceC16154e;
        this.f14874e = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14880e) {
            case 0:
                final AbstractC16904e abstractC16904e = (AbstractC16904e) this.f14873e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) this.f14882e;
                final C3177e c3177e = (C3177e) this.f14881e;
                final C13610e c13610e = (C13610e) this.f14877e;
                final InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f14879e;
                final InterfaceC6340e interfaceC6340e = (InterfaceC6340e) this.f14875e;
                C14715e c14715e = (C14715e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(c14715e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    float vip = c14715e.vip();
                    InterfaceC14388e interfaceC14388e = c14715e.ad;
                    long j = c14715e.vip;
                    final boolean z = C15765e.ad(vip, C5602e.metrica(j) ? interfaceC14388e.mo496final(C5602e.billing(j)) : Float.POSITIVE_INFINITY) > 0;
                    C4524e c4524e = C4524e.f9814e;
                    C5170e c5170e = C5170e.f11068e;
                    final boolean z2 = this.f14876e;
                    final InterfaceC16154e interfaceC16154e = this.f14878e;
                    final boolean z3 = this.f14874e;
                    AbstractC16279e.vip(abstractC16904e, null, interfaceC12123e, c5170e, 0, null, null, false, null, c4524e, null, AbstractC16653e.license(-400402562, new Function4() { // from class: eؘؒۜ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            long j2;
                            int intValue2 = ((Integer) obj5).intValue();
                            C13770e c13770e2 = (C13770e) obj6;
                            int intValue3 = ((Integer) obj7).intValue();
                            C14609e c14609e = (C14609e) AbstractC13480e.m3592native(intValue2, C3177e.this.ad);
                            if (z2) {
                                c13770e2.m3676strictfp(-1268440008);
                                AbstractC5960e.ad(c14609e, c13770e2, 0);
                                c13770e2.Signature(false);
                            } else {
                                c13770e2.m3676strictfp(-1268241329);
                                C13610e c13610e2 = c13610e;
                                InterfaceC12864e interfaceC12864e2 = interfaceC12864e;
                                if (c13610e2 != null) {
                                    c13770e2.m3676strictfp(-1268205214);
                                    StringBuilder sb = new StringBuilder("artwork:");
                                    sb.append(c14609e != null ? c14609e.ad : null);
                                    interfaceC12864e2 = AbstractC0054e.m219extends(c13610e2, interfaceC12864e2, c13610e2.license(sb.toString(), c13770e2), interfaceC6340e);
                                    c13770e2.Signature(false);
                                } else {
                                    c13770e2.m3676strictfp(-1267949433);
                                    c13770e2.Signature(false);
                                }
                                InterfaceC12864e metrica = AbstractC10075e.metrica(interfaceC12864e2, z);
                                AbstractC16904e abstractC16904e2 = abstractC16904e;
                                boolean purchase = ((((intValue3 & 112) ^ 48) > 32 && c13770e2.license(intValue2)) || (intValue3 & 48) == 32) | c13770e2.purchase(abstractC16904e2);
                                Object m3681throw = c13770e2.m3681throw();
                                if (purchase || m3681throw == C2987e.ad) {
                                    m3681throw = new C17766e(abstractC16904e2, intValue2, 2);
                                    c13770e2.m3682throws(m3681throw);
                                }
                                InterfaceC12864e yandex = AbstractC12546e.yandex(metrica, (Function1) m3681throw);
                                InterfaceC16154e interfaceC16154e2 = interfaceC16154e;
                                InterfaceC12864e vip2 = AbstractC12447e.vip(yandex, interfaceC16154e2);
                                float f = 1;
                                if (z3) {
                                    c13770e2.m3676strictfp(1760257425);
                                    j2 = ((C0896e) c13770e2.adcel(AbstractC3577e.ad)).license;
                                    c13770e2.Signature(false);
                                } else {
                                    c13770e2.m3676strictfp(1760258409);
                                    c13770e2.Signature(false);
                                    j2 = C3618e.startapp;
                                }
                                AbstractC5960e.metrica(c14609e, AbstractC13201e.ad(vip2, f, j2, interfaceC16154e2), c13770e2, 0);
                                c13770e2.Signature(false);
                            }
                            return Unit.INSTANCE;
                        }
                    }, c13770e), c13770e, 199680, 24960, 12242);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C0398e c0398e = (C0398e) this.f14873e;
                C2864e c2864e = (C2864e) this.f14882e;
                C15274e c15274e = (C15274e) this.f14881e;
                Function2 function2 = (Function2) this.f14877e;
                Function2 function22 = (Function2) this.f14879e;
                C17085e c17085e = (C17085e) this.f14875e;
                Function2 function23 = (Function2) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.yandex(function23) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int i = intValue2;
                    C18121e c18121e = C18121e.ad;
                    String str = c0398e.ad.f20850e;
                    boolean z4 = this.f14876e;
                    c18121e.vip(str, function23, z4, this.f14874e, c2864e, c15274e, false, null, function2, function22, null, c17085e, null, AbstractC16653e.license(1409265477, new C6242e(z4, c15274e, c17085e, this.f14878e), c13770e2), c13770e2, (i << 3) & 112);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
