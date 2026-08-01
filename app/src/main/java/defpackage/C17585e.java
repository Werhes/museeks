package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17585e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1071e f34434e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34435e;

    public /* synthetic */ C17585e(C1071e c1071e, int i) {
        this.f34435e = 0;
        this.f34434e = c1071e;
    }

    public /* synthetic */ C17585e(C1071e c1071e, int i, byte b) {
        this.f34435e = i;
        this.f34434e = c1071e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        String isVip;
        int i3 = this.f34435e;
        C1071e c1071e = this.f34434e;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                c1071e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(1 & intValue, (intValue & 3) != 2)) {
                    if (((String) c1071e.f3604e.getValue()).length() == 0) {
                        i = -545145812;
                        i2 = R.string.external_int_activate;
                    } else {
                        i = -545034119;
                        i2 = R.string.lvm_pref;
                    }
                    AbstractC14489e.vip(AbstractC4653e.isVip(c13770e, i, i2, c13770e, false), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C0576e c0576e = c1071e.f3604e;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (((String) c0576e.getValue()).length() > 0) {
                        c13770e2.m3676strictfp(-772658333);
                        isVip = AbstractC5297e.license(R.string.lvm_pref_signed, new Object[]{(String) c0576e.getValue()}, c13770e2);
                        c13770e2.Signature(false);
                    } else {
                        isVip = AbstractC4653e.isVip(c13770e2, -772540719, R.string.lvm_pref_anon, c13770e2, false);
                    }
                    AbstractC14489e.vip(isVip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
