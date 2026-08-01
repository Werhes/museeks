package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10193e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11210e f20165e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20166e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6943e f20167e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ List f20168e;

    public C10193e(List list, boolean z, C11210e c11210e, C6943e c6943e) {
        this.f20168e = list;
        this.f20166e = z;
        this.f20165e = c11210e;
        this.f20167e = c6943e;
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
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C2567e c2567e = (C2567e) this.f20168e.get(intValue);
            c13770e.m3676strictfp(-1628279854);
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            C11210e c11210e = this.f20165e;
            boolean yandex = c13770e.yandex(c11210e);
            C6943e c6943e = this.f20167e;
            boolean yandex2 = yandex | c13770e.yandex(c6943e) | c13770e.yandex(c2567e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex2 || m3681throw == C2987e.ad) {
                m3681throw = new C7965e(1, c11210e, c6943e, c2567e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC16653e.license(-1243656430, new C11896e(c2567e, 0), c13770e), AbstractC9546e.license(metrica, this.f20166e, null, (Function0) m3681throw, 14), null, AbstractC16653e.license(1818030421, new C11896e(c2567e, 1), c13770e), null, AbstractC16653e.license(-1867468073, new C11896e(c2567e, 2), c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
