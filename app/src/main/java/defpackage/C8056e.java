package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8056e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3229e f16368e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16369e;

    public /* synthetic */ C8056e(C3229e c3229e, int i) {
        this.f16369e = i;
        this.f16368e = c3229e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16369e) {
            case 0:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) this.f16368e.vip.invoke()).floatValue());
            case 1:
                C10122e c10122e = (C10122e) obj;
                C14995e c14995e = this.f16368e.purchase;
                float purchase = ((C2616e) c14995e.startapp).purchase();
                float appmetrica = c14995e.startapp().appmetrica();
                float f = purchase < appmetrica ? appmetrica - purchase : 0.0f;
                c10122e.smaato(f > 0.0f ? 1 / ((Float.intBitsToFloat((int) (c10122e.f19998e & 4294967295L)) + f) / Float.intBitsToFloat((int) (c10122e.f19998e & 4294967295L))) : 1.0f);
                c10122e.admob(AbstractC9931e.ad(0.5f, 0.0f));
                return Unit.INSTANCE;
            default:
                C10122e c10122e2 = (C10122e) obj;
                C14995e c14995e2 = this.f16368e.purchase;
                float purchase2 = ((C2616e) c14995e2.startapp).purchase();
                float appmetrica2 = c14995e2.startapp().appmetrica();
                float f2 = purchase2 < appmetrica2 ? appmetrica2 - purchase2 : 0.0f;
                c10122e2.smaato(f2 > 0.0f ? (Float.intBitsToFloat((int) (c10122e2.f19998e & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & c10122e2.f19998e)) : 1.0f);
                c10122e2.admob(AbstractC9931e.ad(0.5f, 0.0f));
                return Unit.INSTANCE;
        }
    }
}
