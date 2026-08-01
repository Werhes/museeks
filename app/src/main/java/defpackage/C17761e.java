package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17761e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1011e f34841e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34842e;

    public /* synthetic */ C17761e(C1011e c1011e, int i) {
        this.f34842e = i;
        this.f34841e = c1011e;
    }

    public /* synthetic */ C17761e(C1011e c1011e, int i, int i2) {
        this.f34842e = i2;
        this.f34841e = c1011e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        String isVip;
        int i3 = this.f34842e;
        C1011e c1011e = this.f34841e;
        switch (i3) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(1 & intValue, (intValue & 3) != 2)) {
                    if (((String) c1011e.f3460e.getValue()) != null) {
                        i = -1843034285;
                        i2 = R.string.lvm_pref;
                    } else {
                        i = -1842926746;
                        i2 = R.string.external_int_activate;
                    }
                    AbstractC14489e.vip(AbstractC4653e.isVip(c13770e, i, i2, c13770e, false), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C0576e c0576e = c1011e.f3460e;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (((String) c0576e.getValue()) != null) {
                        c13770e2.m3676strictfp(739970505);
                        String str = (String) c0576e.getValue();
                        if (str == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        isVip = AbstractC5297e.license(R.string.lvm_pref_signed, new Object[]{str}, c13770e2);
                        c13770e2.Signature(false);
                    } else {
                        isVip = AbstractC4653e.isVip(c13770e2, 740207531, R.string.lvm_pref_anon, c13770e2, false);
                    }
                    AbstractC14489e.vip(isVip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                c1011e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean yandex = c13770e3.yandex(c1011e);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C14557e(c1011e, 0);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC1513e.license((Function0) m3681throw, null, false, null, null, null, AbstractC7255e.mopub, c13770e3, 805306368, 510);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c1011e.m448strictfp((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
