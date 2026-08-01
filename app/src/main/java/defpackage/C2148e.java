package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ۠۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2148e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12339e f5522e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5523e;

    public /* synthetic */ C2148e(C12339e c12339e, int i) {
        this.f5523e = i;
        this.f5522e = c12339e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        switch (this.f5523e) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                C12339e c12339e = this.f5522e;
                C3721e c3721e = c12339e.vip;
                float f = c3721e.ad;
                float f2 = c3721e.vip;
                float vip = AbstractC3062e.vip(floatValue, f, f2);
                int i2 = c12339e.ad;
                boolean z = false;
                if (i2 > 0 && (i = i2 + 1) >= 0) {
                    float f3 = vip;
                    float f4 = f3;
                    int i3 = 0;
                    while (true) {
                        float startapp = AbstractC15842e.startapp(f, f2, i3 / i);
                        float f5 = startapp - vip;
                        if (Math.abs(f5) <= f3) {
                            f3 = Math.abs(f5);
                            f4 = startapp;
                        }
                        if (i3 != i) {
                            i3++;
                        } else {
                            vip = f4;
                        }
                    }
                }
                if (vip != c12339e.license.purchase()) {
                    c12339e.appmetrica.invoke(Float.valueOf(vip));
                    Function0 function0 = c12339e.metrica;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                C12339e c12339e2 = this.f5522e;
                c12339e2.vip(0.0f);
                c12339e2.mopub.invoke();
                return Unit.INSTANCE;
        }
    }
}
