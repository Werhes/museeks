package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9401e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15638e f18717e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18718e;

    public /* synthetic */ C9401e(AbstractC15638e abstractC15638e, int i) {
        this.f18718e = i;
        this.f18717e = abstractC15638e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18718e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, this.f18717e.mo1231package()), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC15638e abstractC15638e = this.f18717e;
                    boolean yandex = c13770e2.yandex(abstractC15638e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C6317e c6317e = new C6317e(0, abstractC15638e, AbstractC15638e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 2);
                        c13770e2.m3682throws(c6317e);
                        m3681throw = c6317e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC16653e.license(-108629938, new C9401e(abstractC15638e, 2), c13770e2), c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c13770e3.m3659default();
                } else if (this.f18717e instanceof C3119e) {
                    c13770e3.m3676strictfp(-2084055686);
                    AbstractC5647e.ad(AbstractC0607e.license(), null, null, 0L, c13770e3, 48, 12);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3676strictfp(-2083926509);
                    AbstractC5647e.ad(AbstractC13281e.license(), AbstractC5297e.appmetrica(c13770e3, R.string.talkback_back), null, 0L, c13770e3, 0, 12);
                    c13770e3.Signature(false);
                }
                return Unit.INSTANCE;
        }
    }
}
