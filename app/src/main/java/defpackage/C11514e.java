package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11514e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3655e f23143e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23144e;

    public /* synthetic */ C11514e(AbstractC3655e abstractC3655e, int i) {
        this.f23144e = i;
        this.f23143e = abstractC3655e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23144e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    AbstractC3655e abstractC3655e = this.f23143e;
                    InterfaceC4977e interfaceC4977e = (InterfaceC4977e) abstractC3655e.f8236e.getValue();
                    boolean booleanValue = ((Boolean) abstractC3655e.f8229e.getValue()).booleanValue();
                    boolean yandex = c13770e.yandex(abstractC3655e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6349e(abstractC3655e, 2);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC11906e.ad(interfaceC4977e, (Function0) m3681throw, c7913e, booleanValue, c13770e, 384, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC6022e.vip(null, AbstractC16653e.license(-1767887446, new C11514e(this.f23143e, 0), c13770e2), c13770e2, 48, 1);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
