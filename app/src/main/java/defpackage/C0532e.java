package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0532e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f2685e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14875e f2686e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2687e;

    public /* synthetic */ C0532e(C14875e c14875e, int i, int i2) {
        this.f2687e = i2;
        this.f2686e = c14875e;
        this.f2685e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2687e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C14875e c14875e = this.f2686e;
                    Boolean bool = (Boolean) c14875e.f29467e.getValue();
                    bool.getClass();
                    int i = this.f2685e;
                    boolean license = c13770e.license(i);
                    Object m3681throw = c13770e.m3681throw();
                    if (license || m3681throw == C2987e.ad) {
                        m3681throw = new C17028e(i, 6);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7572e.vip(bool, null, (Function1) m3681throw, null, BuildConfig.FLAVOR, null, AbstractC16653e.license(-2000221156, new C8035e(4, c14875e), c13770e), c13770e, 1597440, 42);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                this.f2686e.ads((C13770e) obj, AbstractC5190e.advert(this.f2685e | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                this.f2686e.applovin((C13770e) obj, AbstractC5190e.advert(this.f2685e | 1));
                return Unit.INSTANCE;
        }
    }
}
