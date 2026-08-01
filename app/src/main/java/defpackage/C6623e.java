package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6623e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C6943e f13656e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11210e f13657e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13658e = 0;

    public /* synthetic */ C6623e(C6943e c6943e, C11210e c11210e) {
        this.f13656e = c6943e;
        this.f13657e = c11210e;
    }

    public /* synthetic */ C6623e(C11210e c11210e, C6943e c6943e) {
        this.f13657e = c11210e;
        this.f13656e = c6943e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f13658e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    String str = this.f13656e.vip;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    long j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2);
                    C11210e c11210e = this.f13657e;
                    boolean yandex = c13770e.yandex(c11210e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6518e(c11210e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC14489e.vip(str, AbstractC9546e.license(smaato, false, null, (Function0) m3681throw, 15), j, 0L, null, null, null, 0L, null, 0L, 2, false, 4, 0, null, c13770e, 0, 24960, 241656);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f = 16;
                    this.f13657e.m3063private(AbstractC5297e.appmetrica(c13770e2, R.string.book_chapters), this.f13656e.license.size(), AbstractC12220e.amazon(C0115e.f1276e, f, f, f, 8), c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
