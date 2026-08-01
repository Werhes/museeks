package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17933e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4760e f35172e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35173e;

    public /* synthetic */ C17933e(C4760e c4760e, int i) {
        this.f35173e = i;
        this.f35172e = c4760e;
    }

    private final Object ad(Object obj) {
        C4760e c4760e = this.f35172e;
        synchronized (c4760e.Signature) {
            c4760e.subscription = C9014e.amazon;
            Log.d("CXCP", c4760e + " is closed");
            Unit unit = Unit.INSTANCE;
        }
        c4760e.amazon.vip(c4760e);
        C8823e c8823e = c4760e.isVip;
        Unit unit2 = Unit.INSTANCE;
        c8823e.m2175import(unit2);
        AbstractC9743e.license(c4760e.ad, null);
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f35173e) {
            case 0:
                return ad(obj);
            default:
                C4760e c4760e = this.f35172e;
                synchronized (c4760e.Signature) {
                    z = c4760e.admob;
                }
                return Boolean.valueOf(z);
        }
    }
}
