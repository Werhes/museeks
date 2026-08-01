package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3469e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14398e f7717e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7718e;

    public /* synthetic */ C3469e(C14398e c14398e, int i) {
        this.f7718e = i;
        this.f7717e = c14398e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f7718e) {
            case 0:
                bool.getClass();
                C14398e c14398e = this.f7717e;
                c14398e.f28472e.setValue(bool);
                AbstractC16524e.smaato.vip(bool);
                AbstractC6232e.billing(C16716e.ad, AbstractC4608e.metrica(c14398e.vip()));
                return Unit.INSTANCE;
            default:
                bool.booleanValue();
                C14398e c14398e2 = this.f7717e;
                C0576e c0576e = c14398e2.f28476e;
                c0576e.setValue(bool);
                C8063e c8063e = AbstractC16524e.loadAd;
                Boolean bool2 = (Boolean) c0576e.getValue();
                bool2.booleanValue();
                c8063e.vip(bool2);
                AbstractC6232e.billing(C16716e.ad, AbstractC4608e.metrica(c14398e2.vip()));
                return Unit.INSTANCE;
        }
    }
}
