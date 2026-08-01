package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9411e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f18735e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f18736e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f18737e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f18738e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18739e;

    public /* synthetic */ C9411e(C3229e c3229e, InterfaceC18435e interfaceC18435e, C7558e c7558e, Function0 function0) {
        this.f18739e = 5;
        this.f18736e = c3229e;
        this.f18738e = interfaceC18435e;
        this.f18735e = c7558e;
        this.f18737e = function0;
    }

    public /* synthetic */ C9411e(C10620e c10620e, InterfaceC18435e interfaceC18435e, C1922e c1922e, C0764e c0764e) {
        this.f18739e = 3;
        this.f18737e = c10620e;
        this.f18738e = interfaceC18435e;
        this.f18736e = c1922e;
        this.f18735e = c0764e;
    }

    public /* synthetic */ C9411e(InterfaceC18435e interfaceC18435e, InterfaceC3314e interfaceC3314e, Object obj, Object obj2, int i) {
        this.f18739e = i;
        this.f18738e = interfaceC18435e;
        this.f18735e = interfaceC3314e;
        this.f18737e = obj;
        this.f18736e = obj2;
    }

    public /* synthetic */ C9411e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f18739e = i;
        this.f18737e = obj;
        this.f18736e = obj2;
        this.f18738e = obj3;
        this.f18735e = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f18739e;
        int i2 = 1;
        int i3 = 3;
        InterfaceC5083e interfaceC5083e = null;
        Object obj = this.f18736e;
        Object obj2 = this.f18737e;
        Object obj3 = this.f18735e;
        Object obj4 = this.f18738e;
        int i4 = 0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj2;
                C6540e c6540e = (C6540e) obj;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj4;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj3;
                if (function0 != null) {
                    function0.invoke();
                } else if (c6540e.vip()) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C9042e(c6540e, interfaceC5083e, i3), 3);
                    interfaceC3314e.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 1:
                C6797e c6797e = (C6797e) obj4;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                C7646e c7646e = new C7646e(new C2532e((Context) obj2, (C7193e) obj, (C9872e) c6797e.ad.getValue(), (C17424e) obj3, c6797e.appmetrica, c6797e.license));
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                return c7646e;
            case 2:
                C8396e c8396e = (C8396e) obj2;
                Context context = (Context) obj;
                C7193e c7193e = (C7193e) obj4;
                C11811e c11811e = (C11811e) obj3;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context ad = AbstractC7093e.ad(context);
                    C8365e c8365e = new C8365e(new ExecutorC12245e(c7193e.ad), 119);
                    C17424e c17424e = c8396e.ad;
                    C9872e ad2 = AbstractC9670e.ad(new C17526e(ad, c8365e, new C0034e((C17392e) c17424e.f34142e, (C13391e) c17424e.f34141e, c11811e)));
                    if (AbstractC9464e.smaato("CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                    }
                    return ad2;
                } finally {
                    Trace.endSection();
                }
            case 3:
                C10620e c10620e = (C10620e) obj2;
                InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) obj4;
                C1922e c1922e = (C1922e) obj;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj3;
                if (AbstractC7890e.billing(c10620e.ad, ((C16801e) interfaceC3314e2.getValue()).f32938e)) {
                    C1158e c1158e = C1158e.f3743e;
                    interfaceC3314e2.setValue(C1158e.license());
                }
                AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C2664e(c10620e, interfaceC5083e, i4), 3);
                c1922e.f5116e.setValue(null);
                return Unit.INSTANCE;
            case 4:
                Number number = (Number) obj2;
                C4298e c4298e = (C4298e) obj;
                Number number2 = (Number) obj4;
                C5043e c5043e = (C5043e) obj3;
                if (!number.equals(c4298e.f9397e) || !number2.equals(c4298e.f9393e)) {
                    c4298e.f9397e = number;
                    c4298e.f9393e = number2;
                    c4298e.f9391e = new C9260e(c5043e, c4298e.f9392e, number, number2, null);
                    c4298e.f9396e.vip.setValue(Boolean.TRUE);
                    c4298e.f9399e = false;
                    c4298e.f9398e = true;
                }
                return Unit.INSTANCE;
            case 5:
                C3229e c3229e = (C3229e) obj;
                InterfaceC18435e interfaceC18435e3 = (InterfaceC18435e) obj4;
                C7558e c7558e = (C7558e) obj3;
                Function0 function02 = (Function0) obj2;
                if (c3229e.license() == EnumC8613e.f17428e && c3229e.appmetrica()) {
                    AbstractC5336e.purchase(interfaceC18435e3, null, 0, new C13959e(c3229e, interfaceC5083e, 4), 3);
                    AbstractC5336e.purchase(interfaceC18435e3, null, 0, new C1583e(c7558e, interfaceC5083e, i2), 3);
                } else {
                    AbstractC5336e.purchase(interfaceC18435e3, null, 0, new C13959e(c3229e, interfaceC5083e, 5), 3).mo692else(new C0234e(c3229e, function02, 2));
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC5336e.purchase((InterfaceC18435e) obj4, null, 0, new C3472e((InterfaceC3314e) obj3, (InterfaceC3314e) obj2, (InterfaceC3314e) obj, (InterfaceC5083e) null), 3);
                return Unit.INSTANCE;
            default:
                ((InterfaceC3314e) obj3).setValue(Boolean.FALSE);
                AbstractC5336e.purchase((InterfaceC18435e) obj4, null, 0, new C7195e((C10985e) obj2, (C13622e) obj, interfaceC5083e, i4), 3);
                return Unit.INSTANCE;
        }
    }
}
