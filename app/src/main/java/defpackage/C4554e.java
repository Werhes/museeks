package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4554e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f9846e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f9847e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3997e f9848e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9849e = 0;

    public /* synthetic */ C4554e(InterfaceC3997e interfaceC3997e, long j, Function2 function2, int i) {
        this.f9848e = interfaceC3997e;
        this.f9846e = j;
        this.f9847e = function2;
    }

    public /* synthetic */ C4554e(Function2 function2, long j, InterfaceC3997e interfaceC3997e) {
        this.f9847e = function2;
        this.f9846e = j;
        this.f9848e = interfaceC3997e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9849e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5418e.ad(AbstractC5190e.advert(1), this.f9846e, (C13770e) obj, this.f9848e, this.f9847e);
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c13770e.ads()) {
                    c13770e.m3659default();
                } else {
                    Object m3681throw = c13770e.m3681throw();
                    if (m3681throw == C2987e.ad) {
                        m3681throw = C13054e.f25983e;
                        c13770e.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
                    c13770e.m3672private(-683746039);
                    c13770e.m3672private(-548224868);
                    if (!(c13770e.ad instanceof C9626e)) {
                        AbstractC5546e.purchase();
                        throw null;
                    }
                    c13770e.m3677super();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(function0);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, new C16109e(this.f9846e), new C14151e((byte) 0, 6));
                    AbstractC2270e.yandex(c13770e, this.f9848e, new C14151e((byte) 0, 7));
                    this.f9847e.invoke(c13770e, 0);
                    AbstractC1786e.isPro(c13770e, true, false, false);
                }
                return Unit.INSTANCE;
        }
    }
}
