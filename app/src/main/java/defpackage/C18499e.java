package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18499e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5016e f36254e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36255e;

    public /* synthetic */ C18499e(C5016e c5016e, int i) {
        this.f36255e = i;
        this.f36254e = c5016e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f36255e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C7947e.ad.getClass();
                    C1733e c1733e = C7947e.metrica;
                    C5016e c5016e = this.f36254e;
                    boolean yandex = c13770e.yandex(c5016e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C16345e(c5016e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC17181e.yandex(c1733e, false, null, (Function1) m3681throw, c13770e, 0, 6);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C7947e.ad.getClass();
                    C1733e c1733e2 = C7947e.metrica;
                    C5016e c5016e2 = this.f36254e;
                    boolean yandex2 = c13770e.yandex(c5016e2);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C16345e(c5016e2, 1);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC17181e.yandex(c1733e2, false, null, (Function1) m3681throw2, c13770e, 0, 6);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
