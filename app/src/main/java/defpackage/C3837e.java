package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3837e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ VKProfile f8472e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8473e;

    public /* synthetic */ C3837e(VKProfile vKProfile, int i) {
        this.f8473e = i;
        this.f8472e = vKProfile;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8473e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    VKProfile vKProfile = this.f8472e;
                    boolean purchase = c13770e.purchase(vKProfile);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = vKProfile.ad();
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC14489e.vip((String) m3681throw, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC8461e.vip(this.f8472e.license, null, AbstractC12447e.vip(AbstractC18007e.startapp(C0115e.f1276e, 36), AbstractC6549e.ad), new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.ads), C16477e.ad, c13770e2, 36912, 6, 31712);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
