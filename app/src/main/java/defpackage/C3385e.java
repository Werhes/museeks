package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3385e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10907e f7577e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7578e;

    public /* synthetic */ C3385e(C10907e c10907e, int i) {
        this.f7578e = i;
        this.f7577e = c10907e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f7578e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    InterfaceC12864e purchase = AbstractC18007e.purchase(C0115e.f1276e, 0.0f, 400, 1);
                    C10907e c10907e = this.f7577e;
                    boolean yandex = c13770e.yandex(c10907e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C2109e(11, c10907e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(purchase, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 6, 510);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C3418e c3418e = this.f7577e.f21611e.f3369e;
                    String str2 = c3418e != null ? c3418e.f7648e : null;
                    if (str2 == null) {
                        str2 = AbstractC4653e.isVip(c13770e2, 1133620377, R.string.close, c13770e2, false);
                    } else {
                        c13770e2.m3676strictfp(1133619726);
                        c13770e2.Signature(false);
                    }
                    AbstractC14489e.vip(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (m3681throw2 == C2987e.ad) {
                        C15347e c15347e = this.f7577e.f21611e.f3370e;
                        String str3 = null;
                        str3 = null;
                        if (c15347e != null && (str = c15347e.f30271e) != null) {
                            Map map = c15347e.f30270e;
                            Set<Map.Entry> entrySet = map != null ? map.entrySet() : null;
                            if (entrySet == null) {
                                entrySet = C3295e.f7451e;
                            }
                            str3 = str;
                            for (Map.Entry entry : entrySet) {
                                str3 = AbstractC6507e.subscription(str3, AbstractC4653e.applovin(new StringBuilder("$"), (String) entry.getKey(), '$'), (String) entry.getValue(), false);
                            }
                        }
                        m3681throw2 = str3 == null ? BuildConfig.FLAVOR : str3;
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC14489e.vip((String) m3681throw2, AbstractC12220e.mopub(C0115e.f1276e, 16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e3.adcel(AbstractC11785e.ad)).vip.mopub, c13770e3, 54, 0, 131068);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
