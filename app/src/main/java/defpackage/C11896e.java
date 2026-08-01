package defpackage;

import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11896e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2567e f23833e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23834e;

    public /* synthetic */ C11896e(C2567e c2567e, int i) {
        this.f23834e = i;
        this.f23833e = c2567e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23834e;
        C2567e c2567e = this.f23833e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(c2567e.purchase, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    EnumC8272e enumC8272e = c2567e.metrica;
                    int i2 = c2567e.license;
                    C15669e c15669e = c2567e.ad;
                    EnumC8272e enumC8272e2 = EnumC8272e.f16948e;
                    C5170e c5170e = C2987e.ad;
                    if (enumC8272e == enumC8272e2) {
                        c13770e2.m3676strictfp(1406790725);
                        boolean license = c13770e2.license(c15669e.ad) | c13770e2.license(i2);
                        Object m3681throw = c13770e2.m3681throw();
                        if (license || m3681throw == c5170e) {
                            DecimalFormat decimalFormat = C5575e.ad;
                            m3681throw = AbstractC15920e.subs(c15669e.ad - i2, false);
                            c13770e2.m3682throws(m3681throw);
                        }
                        AbstractC14489e.vip(AbstractC5297e.license(R.string.book_left, new Object[]{(String) m3681throw}, c13770e2), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(1407119542);
                        boolean license2 = c13770e2.license(c15669e.ad);
                        Object m3681throw2 = c13770e2.m3681throw();
                        if (license2 || m3681throw2 == c5170e) {
                            DecimalFormat decimalFormat2 = C5575e.ad;
                            m3681throw2 = AbstractC15920e.subs(c15669e.ad, false);
                            c13770e2.m3682throws(m3681throw2);
                        }
                        AbstractC14489e.vip((String) m3681throw2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                        c13770e2.Signature(false);
                    }
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    int ordinal = c2567e.metrica.ordinal();
                    if (ordinal == 0) {
                        c13770e3.m3676strictfp(-1029829194);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e3), null, null, 0L, c13770e3, 56, 12);
                        c13770e3.Signature(false);
                    } else if (ordinal == 1) {
                        c13770e3.m3676strictfp(-1029593997);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_timer_24, 0, c13770e3), null, null, 0L, c13770e3, 56, 12);
                        c13770e3.Signature(false);
                    } else {
                        if (ordinal != 2) {
                            throw AbstractC1786e.loadAd(659513282, c13770e3, false);
                        }
                        c13770e3.m3676strictfp(-1029365527);
                        c13770e3.Signature(false);
                    }
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
