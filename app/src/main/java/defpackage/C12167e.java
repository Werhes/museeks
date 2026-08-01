package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12167e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12688e f24457e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24458e;

    public /* synthetic */ C12167e(C12688e c12688e, int i) {
        this.f24458e = i;
        this.f24457e = c12688e;
    }

    public /* synthetic */ C12167e(C12688e c12688e, int i, int i2) {
        this.f24458e = i2;
        this.f24457e = c12688e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24458e;
        C5170e c5170e = C2987e.ad;
        C12688e c12688e = this.f24457e;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c12688e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C12688e c12688e2 = this.f24457e;
                    boolean yandex = c13770e.yandex(c12688e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C7755e c7755e = new C7755e(0, c12688e2, C12688e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 6);
                        c13770e.m3682throws(c7755e);
                        m3681throw = c7755e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC13461e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean yandex2 = c13770e2.yandex(c12688e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C3547e(c12688e, r5 ? 1 : 0);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.license((Function0) m3681throw2, null, false, null, null, null, AbstractC13461e.remoteconfig, c13770e2, 805306368, 510);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean yandex3 = c13770e3.yandex(c12688e);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C3547e(c12688e, i2);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC1513e.license((Function0) m3681throw3, null, false, null, null, null, AbstractC13461e.pro, c13770e3, 805306368, 510);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.oreoskip_dialog_desc, new Object[]{c12688e.f25433e}, c13770e4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c12688e.m3378strictfp((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
