package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3723e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14875e f8304e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8305e;

    public /* synthetic */ C3723e(C14875e c14875e, int i) {
        this.f8305e = i;
        this.f8304e = c14875e;
    }

    public /* synthetic */ C3723e(C14875e c14875e, int i, int i2) {
        this.f8305e = i2;
        this.f8304e = c14875e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i;
        int i2;
        switch (this.f8305e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    Object m3681throw = c13770e.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = this.f8304e.f29468e.getVip();
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC6401e.metrica((String) m3681throw, null, 0L, 0L, null, c13770e, 54, 28);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (m3681throw2 == C2987e.ad) {
                        m3681throw2 = this.f8304e.f29468e.getMetrica();
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC14489e.vip((String) m3681throw2, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 6, 24960, 241662);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                this.f8304e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                this.f8304e.isPro((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C14875e c14875e = this.f8304e;
                    long purchase = c14875e.f29470e.purchase();
                    if (purchase == 0) {
                        i = -987540401;
                        i2 = R.string.library_remove_cache_toggle_not_downloaded;
                    } else if (purchase == -1) {
                        i = -987537333;
                        i2 = R.string.library_remove_cache_toggle_processing;
                    } else if (purchase == -2) {
                        i = -987534388;
                        i2 = R.string.library_remove_cache_toggle_unavailable;
                    } else {
                        c13770e3.m3676strictfp(-987531431);
                        c13770e3.Signature(false);
                        str = (String) c14875e.f29466e.getValue();
                        AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                    }
                    str = AbstractC4653e.isVip(c13770e3, i, i2, c13770e3, false);
                    AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
