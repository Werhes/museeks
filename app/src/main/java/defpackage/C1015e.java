package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1015e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f3465e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f3466e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f3467e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1719e f3468e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3469e;

    public /* synthetic */ C1015e(float f, C15096e c15096e, InterfaceC1719e interfaceC1719e, Function1 function1, int i) {
        this.f3469e = i;
        this.f3467e = f;
        this.f3466e = c15096e;
        this.f3468e = interfaceC1719e;
        this.f3465e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        switch (this.f3469e) {
            case 0:
                C17142e c17142e = (C17142e) obj;
                C0576e c0576e = c17142e.appmetrica;
                float abs = Math.abs(((Number) c0576e.getValue()).floatValue());
                float f2 = this.f3467e;
                float abs2 = Math.abs(f2);
                C15096e c15096e = this.f3466e;
                InterfaceC1719e interfaceC1719e = this.f3468e;
                Function1 function1 = this.f3465e;
                if (abs >= abs2) {
                    float license = AbstractC2650e.license(((Number) c0576e.getValue()).floatValue(), f2);
                    AbstractC2650e.metrica(c17142e, interfaceC1719e, function1, license - c15096e.f29883e);
                    c17142e.ad();
                    c15096e.f29883e = license;
                } else {
                    AbstractC2650e.metrica(c17142e, interfaceC1719e, function1, ((Number) c0576e.getValue()).floatValue() - c15096e.f29883e);
                    c15096e.f29883e = ((Number) c0576e.getValue()).floatValue();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC1719e interfaceC1719e2 = this.f3468e;
                C17142e c17142e2 = (C17142e) obj;
                float license2 = AbstractC2650e.license(((Number) c17142e2.appmetrica.getValue()).floatValue(), this.f3467e);
                C15096e c15096e2 = this.f3466e;
                float f3 = license2 - c15096e2.f29883e;
                try {
                    f = interfaceC1719e2.ad(f3);
                } catch (CancellationException unused) {
                    c17142e2.ad();
                    f = 0.0f;
                }
                this.f3465e.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || license2 != ((Number) c17142e2.appmetrica.getValue()).floatValue()) {
                    c17142e2.ad();
                }
                c15096e2.f29883e += f;
                return Unit.INSTANCE;
        }
    }
}
