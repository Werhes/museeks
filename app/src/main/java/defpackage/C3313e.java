package defpackage;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3313e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f7479e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10685e f7480e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f7481e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7482e = 2;

    public /* synthetic */ C3313e(InterfaceC3314e interfaceC3314e, C10685e c10685e, InterfaceC18435e interfaceC18435e) {
        this.f7479e = interfaceC3314e;
        this.f7480e = c10685e;
        this.f7481e = interfaceC18435e;
    }

    public /* synthetic */ C3313e(C10685e c10685e, InterfaceC3314e interfaceC3314e, InterfaceC18435e interfaceC18435e) {
        this.f7480e = c10685e;
        this.f7479e = interfaceC3314e;
        this.f7481e = interfaceC18435e;
    }

    public /* synthetic */ C3313e(InterfaceC18435e interfaceC18435e, C10685e c10685e, InterfaceC3314e interfaceC3314e) {
        this.f7481e = interfaceC18435e;
        this.f7480e = c10685e;
        this.f7479e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7482e;
        int i2 = 6;
        C5170e c5170e = C2987e.ad;
        InterfaceC18435e interfaceC18435e = this.f7481e;
        C10685e c10685e = this.f7480e;
        InterfaceC3314e interfaceC3314e = this.f7479e;
        int i3 = 2;
        switch (i) {
            case 0:
                boolean z = false;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (c13770e.m3673protected(intValue & 1, z)) {
                    boolean z2 = ((C3487e) interfaceC3314e.getValue()).f7757e;
                    boolean yandex = c13770e.yandex(interfaceC18435e) | c13770e.yandex(c10685e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        m3681throw = new C12439e(interfaceC18435e, c10685e, i2);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC8844e.ad(z2, (Function1) m3681throw, null, false, null, c13770e, 0, 124);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean yandex2 = c13770e2.yandex(c10685e) | c13770e2.purchase(interfaceC3314e) | c13770e2.yandex(interfaceC18435e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C10403e(c10685e, interfaceC3314e, interfaceC18435e);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.license((Function0) m3681throw2, null, ((C0398e) interfaceC3314e.getValue()).ad.f20850e.length() > 0, null, null, null, AbstractC13482e.ad, c13770e2, 805306368, 506);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e3, 6);
                    long j = c13770e3.f27286case;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e3.advert();
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i4), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
                    Object m3681throw3 = c13770e3.m3681throw();
                    if (m3681throw3 == c5170e) {
                        m3681throw3 = Integer.valueOf(Resources.getSystem().getDisplayMetrics().densityDpi);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.settings_appearance_dpi_override_hint, new Object[]{Integer.valueOf(((Number) m3681throw3).intValue())}, c13770e3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                    C0398e c0398e = (C0398e) interfaceC3314e.getValue();
                    int i5 = 3;
                    C4988e c4988e = new C4988e(3, 7, 83);
                    boolean purchase2 = c13770e3.purchase(interfaceC3314e) | c13770e3.yandex(c10685e) | c13770e3.yandex(interfaceC18435e);
                    Object m3681throw4 = c13770e3.m3681throw();
                    if (purchase2 || m3681throw4 == c5170e) {
                        m3681throw4 = new Cthrows(i5, c10685e, interfaceC3314e, interfaceC18435e);
                        c13770e3.m3682throws(m3681throw4);
                    }
                    C16636e c16636e = new C16636e((Function1) m3681throw4, null, 62);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean purchase3 = c13770e3.purchase(interfaceC3314e);
                    Object m3681throw5 = c13770e3.m3681throw();
                    if (purchase3 || m3681throw5 == c5170e) {
                        m3681throw5 = new C9214e(interfaceC3314e, i3);
                        c13770e3.m3682throws(m3681throw5);
                    }
                    AbstractC11257e.vip(c0398e, (Function1) m3681throw5, metrica, false, null, AbstractC13482e.license, null, null, c4988e, c16636e, false, 0, 0, null, null, c13770e3, 12583296, 196608, 8290168);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
