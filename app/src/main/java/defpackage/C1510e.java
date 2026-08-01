package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1510e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4379e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4380e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4381e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f4382e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4383e = 1;

    public /* synthetic */ C1510e(C8823e c8823e, InterfaceC1908e interfaceC1908e, C13330e c13330e, boolean z) {
        this.f4380e = c8823e;
        this.f4382e = interfaceC1908e;
        this.f4379e = c13330e;
        this.f4381e = z;
    }

    public /* synthetic */ C1510e(Function0 function0, boolean z, C1362e c1362e, C2815e c2815e) {
        this.f4380e = function0;
        this.f4381e = z;
        this.f4382e = c1362e;
        this.f4379e = c2815e;
    }

    public /* synthetic */ C1510e(boolean z, Function0 function0, Function0 function02, Function1 function1) {
        this.f4381e = z;
        this.f4380e = function0;
        this.f4382e = function02;
        this.f4379e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C8915e c8915e;
        int i = this.f4383e;
        boolean z = this.f4381e;
        Object obj2 = this.f4379e;
        Object obj3 = this.f4382e;
        Object obj4 = this.f4380e;
        switch (i) {
            case 0:
                C1362e c1362e = (C1362e) obj3;
                C2815e c2815e = (C2815e) obj2;
                C4017e c4017e = (C4017e) obj;
                c4017e.ad();
                C14434e c14434e = c4017e.f8940e;
                if (!((Boolean) ((Function0) obj4).invoke()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (z) {
                    long mo779e = c14434e.mo779e();
                    C18478e c18478e = c14434e.f28537e;
                    long m4560try = c18478e.m4560try();
                    c18478e.m4557this().billing();
                    try {
                        ((C5389e) c18478e.f36228e).firebase(-1.0f, 1.0f, mo779e);
                        AbstractC4653e.smaato(c4017e, c1362e, 0L, 0.0f, c2815e, 0, 46);
                    } finally {
                        AbstractC0054e.m224this(c18478e, m4560try);
                    }
                } else {
                    AbstractC4653e.smaato(c4017e, c1362e, 0L, 0.0f, c2815e, 0, 46);
                }
                return Unit.INSTANCE;
            case 1:
                C8823e c8823e = (C8823e) obj4;
                InterfaceC1908e interfaceC1908e = (InterfaceC1908e) obj3;
                C13330e c13330e = (C13330e) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if (AbstractC9464e.admob()) {
                        Log.w("CXCP", "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                    }
                    c8823e.m2503e(th);
                } else {
                    C4405e c4405e = (C4405e) interfaceC1908e.isVip();
                    if (AbstractC9464e.smaato("CXCP")) {
                        Log.d("CXCP", "propagateToFocusMeteringResultDeferred: result3A = " + c4405e);
                    }
                    int i2 = c4405e.ad;
                    if (i2 == 4) {
                        AbstractC17861e.isPro("Camera is not active.", c8823e);
                    } else {
                        boolean z2 = false;
                        if (i2 == 2) {
                            c8823e.m2175import(new C8915e(false));
                        } else {
                            c13330e.getClass();
                            int i3 = c4405e.ad;
                            C10224e c10224e = c4405e.vip;
                            if (i3 == 0) {
                                Integer num = c10224e != null ? (Integer) c10224e.f20233e.get(CaptureResult.CONTROL_AF_STATE) : null;
                                if (z) {
                                    List list = C2548e.vip;
                                    ArrayList arrayList = c13330e.smaato;
                                    if (!(arrayList == null ? false : arrayList.contains(new C2548e(1))) || (c10224e != null && (num == null || num.intValue() == 4))) {
                                        z2 = true;
                                    }
                                }
                                c8915e = new C8915e(z2);
                            } else {
                                c8915e = new C8915e(false);
                            }
                            c8823e.m2175import(c8915e);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj4;
                Function0 function02 = (Function0) obj3;
                Function1 function1 = (Function1) obj2;
                EnumC8613e enumC8613e = (EnumC8613e) obj;
                boolean z3 = this.f4381e;
                if (z3 && enumC8613e == EnumC8613e.f17427e) {
                    enumC8613e = EnumC8613e.f17428e;
                }
                return new C3229e(z3, function0, function02, enumC8613e, function1);
        }
    }
}
