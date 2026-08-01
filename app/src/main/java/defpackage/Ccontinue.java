package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: continue, reason: invalid class name */
/* loaded from: classes.dex */
public final class Ccontinue implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Cpublic f1112e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f1113e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1114e;

    public /* synthetic */ Ccontinue(List list, Cpublic cpublic, int i) {
        this.f1114e = i;
        this.f1113e = list;
        this.f1112e = cpublic;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        switch (this.f1114e) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    C10985e c10985e = ((Cconst) this.f1113e.get(intValue)).ad;
                    c13770e.m3676strictfp(1352369929);
                    this.f1112e.m4632private(c10985e, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (c13770e2.purchase(c18055e2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    C10985e c10985e2 = ((Cconst) this.f1113e.get(intValue3)).ad;
                    c13770e2.m3676strictfp(454686849);
                    this.f1112e.m4632private(c10985e2, c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e3 = (C18055e) obj;
                int intValue5 = ((Number) obj2).intValue();
                C13770e c13770e3 = (C13770e) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = (c13770e3.purchase(c18055e3) ? 4 : 2) | intValue6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= c13770e3.license(intValue5) ? 32 : 16;
                }
                if (c13770e3.m3673protected(i3 & 1, (i3 & 147) != 146)) {
                    C10985e c10985e3 = ((Cconst) this.f1113e.get(intValue5)).ad;
                    c13770e3.m3676strictfp(-1338593494);
                    this.f1112e.m4632private(c10985e3, c13770e3, 0);
                    c13770e3.Signature(false);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
