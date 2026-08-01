package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0074e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18478e f1239e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1240e;

    public /* synthetic */ C0074e(C18478e c18478e, int i) {
        this.f1240e = i;
        this.f1239e = c18478e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1240e) {
            case 0:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (m3681throw == c5170e) {
                        m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
                        c13770e.m3682throws(m3681throw);
                    }
                    InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
                    Unit unit = Unit.INSTANCE;
                    Object m3681throw2 = c13770e.m3681throw();
                    if (m3681throw2 == c5170e) {
                        m3681throw2 = new C9843e(interfaceC3314e, null, 0);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
                    long j = 1;
                    AbstractC12640e.metrica(interfaceC10799e, ((Boolean) interfaceC3314e.getValue()).booleanValue(), null, AbstractC15869e.license(AbstractC12696e.yandex(500, 6, null), 2).ad(new C18351e(new C5761e((C15421e) null, new C1223e(new C16860e(2, C8082e.f16401e), AbstractC12696e.purchase(0.0f, 400.0f, new C11490e((j & 4294967295L) | (j << 32)), 1)), (C4980e) null, (C12395e) null, (LinkedHashMap) null, 125))), null, null, AbstractC16653e.license(-685820229, new C0074e(this.f1239e, 1), c13770e), c13770e, (intValue & 14) | 1575936, 26);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj3).intValue();
                C18478e c18478e = this.f1239e;
                c18478e.admob((C3274e) c18478e.f36227e, (C13770e) obj2, 0);
                return Unit.INSTANCE;
        }
    }
}
