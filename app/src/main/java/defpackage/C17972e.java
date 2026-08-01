package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17972e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5070e f35226e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35227e;

    public /* synthetic */ C17972e(C5070e c5070e, int i) {
        this.f35227e = i;
        this.f35226e = c5070e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35227e) {
            case 0:
                float f = (int) (((C12729e) obj).ad & 4294967295L);
                C5070e c5070e = this.f35226e;
                c5070e.ad = -(f - c5070e.license.purchase());
                return Unit.INSTANCE;
            default:
                this.f35226e.metrica(((Number) ((C17142e) obj).appmetrica.getValue()).floatValue());
                return Unit.INSTANCE;
        }
    }
}
