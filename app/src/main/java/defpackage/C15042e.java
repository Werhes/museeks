package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15042e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29807e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C15042e f29805e = new C15042e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C15042e f29804e = new C15042e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C15042e f29806e = new C15042e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C15042e f29803e = new C15042e(3);

    public /* synthetic */ C15042e(int i) {
        this.f29807e = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29807e) {
            case 0:
                try {
                    AbstractC8647e.m2455class((C11058e) obj2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 1:
                long j = ((C3618e) obj).ad;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.appmetrica(j) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    AbstractC17074e.ad(AbstractC16136e.vip(AbstractC18007e.metrica, C11047e.subscription(0.0f, 14, AbstractC6874e.startapp(new C3618e(j), new C3618e(AbstractC6532e.billing(C3618e.vip(0.25f, j), C3618e.vip))))), c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            default:
                return null;
        }
    }
}
