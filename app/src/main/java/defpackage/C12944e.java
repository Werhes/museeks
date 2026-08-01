package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12944e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f25796e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f25797e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C14718e f25798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12944e(Function1 function1, C14718e c14718e, int i) {
        super(1);
        this.f25797e = i;
        this.f25796e = function1;
        this.f25798e = c14718e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25797e) {
            case 0:
                C2401e c2401e = (C2401e) obj;
                if (!C2152e.vip(AbstractC17957e.startapp(c2401e, false), 0L)) {
                    c2401e.ad();
                }
                this.f25796e.invoke(Float.valueOf(AbstractC3062e.vip(1 - (C2152e.appmetrica(c2401e.metrica) / ((int) (this.f25798e.f29124e.f7668e >> 32))), 0.0f, 1.0f)));
                return Unit.INSTANCE;
            default:
                C2401e c2401e2 = (C2401e) obj;
                if (!C2152e.vip(AbstractC17957e.startapp(c2401e2, false), 0L)) {
                    c2401e2.ad();
                }
                float purchase = C2152e.purchase(c2401e2.metrica);
                float f = (int) (this.f25798e.f29124e.f7668e & 4294967295L);
                this.f25796e.invoke(Float.valueOf(360.0f - ((AbstractC3062e.vip(purchase, 0.0f, f) * 360.0f) / f)));
                return Unit.INSTANCE;
        }
    }
}
