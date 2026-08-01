package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٛؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17111e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f33469e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f33470e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33471e = 0;

    public /* synthetic */ C17111e(float f, C2892e c2892e, int i) {
        float f2 = AbstractC1981e.ad;
        this.f33470e = f;
        this.f33469e = c2892e;
    }

    public /* synthetic */ C17111e(String str, float f) {
        this.f33470e = f;
        this.f33469e = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f33471e;
        Object obj3 = this.f33469e;
        float f = this.f33470e;
        switch (i) {
            case 0:
                float f2 = AbstractC1981e.ad;
                ((Integer) obj2).getClass();
                AbstractC1981e.vip(f, (C2892e) obj3, (C13770e) obj, AbstractC5190e.advert(391));
                return Unit.INSTANCE;
            default:
                String str = (String) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(f + ' ' + str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
