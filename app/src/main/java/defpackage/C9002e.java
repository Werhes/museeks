package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9002e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0567e f18069e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18070e;

    public /* synthetic */ C9002e(C0567e c0567e, int i) {
        this.f18070e = i;
        this.f18069e = c0567e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18070e) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                C6977e c6977e = this.f18069e.f11121e;
                if (c6977e == null) {
                    c6977e = null;
                }
                c6977e.setCurrentItem(intValue, true);
                return Unit.INSTANCE;
            case 1:
                C0567e c0567e = this.f18069e;
                C1615e c1615e = c0567e.f2744e;
                c1615e.getClass();
                c1615e.smaato(null, BuildConfig.FLAVOR);
                c0567e.f2743e.advert((String) obj);
                c0567e.f2742e.mo1388instanceof();
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                if (!AbstractC5304e.m1866native(str)) {
                    C7831e.f15835e.getClass();
                    C7831e.vip(str);
                }
                this.f18069e.m375package(str, false);
                return Unit.INSTANCE;
        }
    }
}
