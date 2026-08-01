package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11847e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f23754e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f23755e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f23756e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f23757e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ List f23758e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23759e;

    public C11847e(List list, int i, int i2, Function1 function1, Function1 function12, InterfaceC3314e interfaceC3314e) {
        this.f23758e = list;
        this.f23756e = i;
        this.f23755e = i2;
        this.f23757e = function1;
        this.f23754e = function12;
        this.f23759e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        boolean z = true;
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            InterfaceC12391e interfaceC12391e = (InterfaceC12391e) this.f23758e.get(intValue);
            c13770e.m3676strictfp(-1125384499);
            boolean z2 = intValue == this.f23756e;
            boolean z3 = interfaceC12391e instanceof C13356e;
            InterfaceC3314e interfaceC3314e = this.f23759e;
            C0115e c0115e = C0115e.f1276e;
            Object obj5 = C2987e.ad;
            Function1 function1 = this.f23757e;
            if (z3) {
                c13770e.m3676strictfp(-1125267537);
                InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                boolean purchase = c13770e.purchase(function1);
                if ((((i & 112) ^ 48) <= 32 || !c13770e.license(intValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z4 = purchase | z;
                Object m3681throw = c13770e.m3681throw();
                if (z4 || m3681throw == obj5) {
                    m3681throw = new C8394e(function1, intValue, interfaceC3314e, 0);
                    c13770e.m3682throws(m3681throw);
                }
                AbstractC12185e.yandex(z2, this.f23755e, (Function0) m3681throw, metrica, c13770e, 24960);
                c13770e.Signature(false);
            } else {
                if (!(interfaceC12391e instanceof C16523e)) {
                    throw AbstractC1786e.loadAd(-174848136, c13770e, false);
                }
                c13770e.m3676strictfp(-1124647971);
                String str = ((C16523e) interfaceC12391e).metrica;
                InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                int i2 = (i & 112) ^ 48;
                boolean purchase2 = c13770e.purchase(function1) | ((i2 > 32 && c13770e.license(intValue)) || (i & 48) == 32);
                Object m3681throw2 = c13770e.m3681throw();
                if (purchase2 || m3681throw2 == obj5) {
                    m3681throw2 = new C8394e(function1, intValue, interfaceC3314e, 1);
                    c13770e.m3682throws(m3681throw2);
                }
                Function0 function0 = (Function0) m3681throw2;
                Function1 function12 = this.f23754e;
                boolean purchase3 = c13770e.purchase(function12);
                if ((i2 <= 32 || !c13770e.license(intValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z5 = purchase3 | z;
                Object m3681throw3 = c13770e.m3681throw();
                if (z5 || m3681throw3 == obj5) {
                    m3681throw3 = new C15199e(function12, intValue, 3);
                    c13770e.m3682throws(m3681throw3);
                }
                AbstractC12185e.startapp(str, z2, function0, (Function0) m3681throw3, metrica2, c13770e, 196656);
                c13770e = c13770e;
                c13770e.Signature(false);
            }
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
