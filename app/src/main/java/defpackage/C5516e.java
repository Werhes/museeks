package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5516e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4031e f11789e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11790e;

    public /* synthetic */ C5516e(C4031e c4031e, int i) {
        this.f11790e = i;
        this.f11789e = c4031e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C17213e c17213e = (C17213e) obj;
        switch (this.f11790e) {
            case 0:
                C4031e c4031e = this.f11789e;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(15924158, true, new C0443e(c4031e, 1)), 3);
                AbstractC5087e.premium(c17213e, null, null, new C2892e(639484775, true, new C0443e(c4031e, 2)), 3);
                C6571e m1449finally = c4031e.m1449finally();
                List list = m1449finally != null ? (List) m1449finally.f13544e : null;
                if (list != null && !list.isEmpty()) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(1688595907, true, new C0443e(c4031e, 3)), 3);
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-1354893780, true, new C0443e(c4031e, 4)), 3);
                }
                C6571e m1449finally2 = c4031e.m1449finally();
                List list2 = m1449finally2 != null ? (List) m1449finally2.f13543e : null;
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(1759266860, true, new C0443e(c4031e, 5)), 3);
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(1838406229, true, new C0443e(c4031e, 6)), 3);
                }
                return Unit.INSTANCE;
            case 1:
                c17213e.mopub(EnumC7808e.f15819e.subs(), null, new C3801e(11), new C2892e(802480018, true, new C4057e(this.f11789e, 1)));
                AbstractC5087e.premium(c17213e, null, null, AbstractC5336e.yandex, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC5336e.startapp, 3);
                return Unit.INSTANCE;
            case 2:
                C4031e c4031e2 = this.f11789e;
                C6571e m1449finally3 = c4031e2.m1449finally();
                List list3 = m1449finally3 != null ? (List) m1449finally3.f13544e : null;
                if (list3 == null) {
                    list3 = C13664e.f27089e;
                }
                c17213e.mopub(list3.size(), null, new C7976e(list3, 28, false), new C2892e(802480018, true, new C16925e(list3, c4031e2, 0)));
                return Unit.INSTANCE;
            default:
                C4031e c4031e3 = this.f11789e;
                C6571e m1449finally4 = c4031e3.m1449finally();
                List list4 = m1449finally4 != null ? (List) m1449finally4.f13543e : null;
                if (list4 == null) {
                    list4 = C13664e.f27089e;
                }
                c17213e.mopub(list4.size(), null, new C7976e(list4, 29, false), new C2892e(802480018, true, new C16925e(list4, c4031e3, 1)));
                return Unit.INSTANCE;
        }
    }
}
