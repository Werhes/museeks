package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import android.view.inputmethod.InputConnection;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17097e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f33454e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f33455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17097e(int i, Object obj) {
        super(1);
        this.f33455e = i;
        this.f33454e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17097e(C5760e c5760e, long j) {
        super(1);
        this.f33455e = 7;
        this.f33454e = c5760e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [eْؒٔ, eؔۚؓ] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f33455e;
        EnumC9253e enumC9253e = EnumC9253e.f18468e;
        Object[] objArr = 0;
        int i2 = 0;
        Object obj2 = this.f33454e;
        switch (i) {
            case 0:
                InterfaceC1036e interfaceC1036e = (InterfaceC1036e) obj;
                C10324e c10324e = (C10324e) obj2;
                if (interfaceC1036e.amazon() != Integer.MAX_VALUE) {
                    if (interfaceC1036e.ad().vip) {
                        interfaceC1036e.crashlytics();
                    }
                    for (Map.Entry entry : interfaceC1036e.ad().startapp.entrySet()) {
                        C10324e.ad(c10324e, (AbstractC17016e) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC1036e.appmetrica());
                    }
                    for (AbstractC17732e abstractC17732e = interfaceC1036e.appmetrica().f34794e; !AbstractC7890e.billing(abstractC17732e, c10324e.ad.appmetrica()); abstractC17732e = abstractC17732e.f34794e) {
                        for (AbstractC17016e abstractC17016e : c10324e.vip(abstractC17732e).keySet()) {
                            C10324e.ad(c10324e, abstractC17016e, c10324e.metrica(abstractC17732e, abstractC17016e), abstractC17732e);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((C11795e) obj).m3237e(((C10202e) obj2).ad));
            case 2:
                C3555e c3555e = (C3555e) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = ((C16586e) obj2).f32538e;
                if (viewTreeObserverOnGlobalLayoutListenerC5014e.getInsetsListener().f15332e.purchase() > 0) {
                    C3123e c3123e = AbstractC0919e.ad;
                    long advert = c3555e.ad().advert();
                    C0583e c0583e = viewTreeObserverOnGlobalLayoutListenerC5014e.getInsetsListener().f15333e;
                    int i3 = (int) (advert >> 32);
                    int i4 = (int) (advert & 4294967295L);
                    InterfaceC11214e[] interfaceC11214eArr = AbstractC0919e.vip;
                    int length = interfaceC11214eArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        InterfaceC11214e interfaceC11214e = interfaceC11214eArr[i5];
                        C8694e c8694e = (C8694e) c0583e.billing(interfaceC11214e);
                        C3813e c3813e = (C3813e) interfaceC11214e;
                        int i6 = i3;
                        AbstractC0919e.ad(c3555e, c3813e.metrica, c8694e.yandex, i6, i4);
                        if (((Boolean) c8694e.vip.getValue()).booleanValue()) {
                            AbstractC0919e.ad(c3555e, c8694e.purchase, c8694e.adcel, i6, i4);
                            AbstractC0919e.ad(c3555e, c8694e.billing, c8694e.mopub, i6, i4);
                        }
                        AbstractC0919e.ad(c3555e, c3813e.license, c8694e.startapp, i6, i4);
                        i5++;
                        i3 = i6;
                    }
                    C12328e c12328e = viewTreeObserverOnGlobalLayoutListenerC5014e.getInsetsListener().f15329e;
                    if (c12328e.mopub()) {
                        C12742e c12742e = viewTreeObserverOnGlobalLayoutListenerC5014e.getInsetsListener().f15331e;
                        Object[] objArr2 = c12328e.ad;
                        int i7 = c12328e.vip;
                        while (i2 < i7) {
                            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) objArr2[i2];
                            C15051e c15051e = (C15051e) c12742e.get(i2);
                            Rect rect = (Rect) interfaceC3314e.getValue();
                            c3555e.metrica(c15051e.vip(), rect.left);
                            c3555e.metrica(c15051e.license(), rect.top);
                            c3555e.metrica(c15051e.metrica(), rect.right);
                            c3555e.metrica(c15051e.ad(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(((AbstractC16167e) obj2).ad(((C6071e) obj).purchase));
            case 4:
                return Boolean.valueOf(AbstractC13362e.metrica((C6071e) obj, (Resources) obj2));
            case 5:
                ((C13915e) obj2).m3713instanceof((InterfaceC14388e) obj);
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(AbstractC7890e.billing(obj, obj2));
            case 7:
                InterfaceC16490e interfaceC16490e = (InterfaceC16490e) obj;
                C5760e c5760e = (C5760e) obj2;
                if (AbstractC7890e.billing(interfaceC16490e.ad(), c5760e.f12187e.ad())) {
                    int i8 = AbstractC7572e.vip;
                } else {
                    InterfaceC16132e interfaceC16132e = (InterfaceC16132e) c5760e.f12187e.license.billing(interfaceC16490e.ad());
                    if (interfaceC16132e != null) {
                        long j = ((C12729e) interfaceC16132e.getValue()).ad;
                    }
                }
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) c5760e.f12187e.license.billing(interfaceC16490e.metrica());
                if (interfaceC16132e2 != null) {
                    long j2 = ((C12729e) interfaceC16132e2.getValue()).ad;
                }
                if (((C9539e) c5760e.f12188e.getValue()) == null) {
                    return AbstractC12696e.purchase(0.0f, 400.0f, null, 5);
                }
                long j3 = 1;
                return AbstractC12696e.purchase(0.0f, 400.0f, new C12729e((j3 << 32) | (4294967295L & j3)), 1);
            case 8:
                return ((C11120e) obj2).purchase;
            case 9:
                C0763e c0763e = (C0763e) obj;
                C0078e c0078e = (C0078e) obj2;
                if (c0078e.f27016e) {
                    AbstractC5336e.purchase(c0078e.m3623e(), null, 0, new C1853e(c0078e, c0763e, objArr == true ? 1 : 0, 9), 3);
                }
                return Unit.INSTANCE;
            case 10:
                C8683e c8683e = (C8683e) obj;
                float f = c8683e.vip;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c8683e.metrica;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c8683e.license;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c8683e.ad;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new C3618e(C3618e.ad(AbstractC6532e.ad(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C4717e.inmobi), (AbstractC14213e) obj2));
            case 11:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return Unit.INSTANCE;
            case 12:
                return new C6035e(8, (C14185e) obj2);
            case 13:
                return Boolean.valueOf(!AbstractC7890e.billing(obj, ((C13119e) obj2).license.getValue()));
            case 14:
                ((C10122e) obj).metrica(((Number) ((InterfaceC16132e) obj2).getValue()).floatValue());
                return Unit.INSTANCE;
            case 15:
                C7556e c7556e = (C7556e) obj;
                if (!c7556e.f27022e.f27016e) {
                    return EnumC9253e.f18466e;
                }
                InterfaceC13418e interfaceC13418e = c7556e.f15384e;
                if (interfaceC13418e != null) {
                    interfaceC13418e.mo2055goto((C6057e) obj2);
                }
                c7556e.f15384e = null;
                c7556e.f15386e = null;
                return enumC9253e;
            case 16:
                return new C11490e((0 << 32) | (((Number) ((C2288e) obj2).invoke(Integer.valueOf((int) (((C12729e) obj).ad & 4294967295L)))).intValue() & 4294967295L));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC9849e.vip.compareAndSet(false, true)) {
                    ((C14137e) obj2).amazon(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                C16446e c16446e = (C16446e) obj2;
                C17985e c17985e = c16446e.advert;
                if (c16446e.amazon && c16446e.isVip && c17985e != null) {
                    C18478e mo782finally = interfaceC2235e.mo782finally();
                    long m4560try = mo782finally.m4560try();
                    mo782finally.m4557this().billing();
                    try {
                        ((C18478e) ((C5389e) mo782finally.f36228e).f11540e).m4557this().smaato(c17985e);
                        c16446e.metrica(interfaceC2235e);
                    } finally {
                        AbstractC0054e.m224this(mo782finally, m4560try);
                    }
                } else {
                    c16446e.metrica(interfaceC2235e);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj;
                InterfaceC14576e m4557this = interfaceC2235e2.mo782finally().m4557this();
                Function2 function2 = ((C5048e) obj2).f10770e;
                if (function2 != null) {
                    function2.invoke(m4557this, (C16446e) interfaceC2235e2.mo782finally().f36227e);
                }
                return Unit.INSTANCE;
            case 20:
                AbstractC11290e abstractC11290e = (AbstractC11290e) obj;
                C10319e c10319e = (C10319e) obj2;
                c10319e.billing(abstractC11290e);
                Function1 function1 = c10319e.startapp;
                if (function1 != null) {
                    function1.invoke(abstractC11290e);
                }
                return Unit.INSTANCE;
            case 21:
                if (!((AbstractC12811e) obj).f25627e) {
                    return enumC9253e;
                }
                ((C9302e) obj2).f18534e = false;
                return EnumC9253e.f18465e;
            case 22:
                InputConnectionC18152e inputConnectionC18152e = (InputConnectionC18152e) obj;
                InputConnection inputConnection = inputConnectionC18152e.vip;
                if (inputConnection != null) {
                    inputConnectionC18152e.ad(inputConnection);
                    inputConnectionC18152e.vip = null;
                }
                C17497e c17497e = (C17497e) obj2;
                C12431e c12431e = c17497e.license;
                Object[] objArr3 = c12431e.f24870e;
                int i9 = c12431e.f24868e;
                while (true) {
                    if (i2 >= i9) {
                        i2 = -1;
                    } else if (!AbstractC7890e.billing((C3913e) objArr3[i2], inputConnectionC18152e)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    c12431e.amazon(i2);
                }
                if (c12431e.f24868e == 0) {
                    c17497e.vip.invoke();
                }
                return Unit.INSTANCE;
            case 23:
                Throwable th = (Throwable) obj;
                C15972e c15972e = (C15972e) obj2;
                if (th == null) {
                    if (!c15972e.f31490e.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    c15972e.f31490e.cancel(true);
                } else {
                    C6566e c6566e = c15972e.f31490e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    c6566e.adcel(th);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((ListenableFuture) obj2).cancel(false);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C12431e) obj2).license((InterfaceC8177e) obj);
                return Boolean.TRUE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                C8513e c8513e = ((C13760e) obj2).f27260e;
                (c8513e != null ? c8513e : null).invoke(motionEvent);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((InterfaceC3314e) obj2).setValue(new C2152e(((InterfaceC0043e) obj).mo211this(0L)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Boolean.valueOf(((C2164e) obj).ad() != ((C2164e) obj2).ad());
            default:
                AbstractC14594e.advert((InterfaceC15671e) obj, ((C11796e) obj2).ad);
                return Unit.INSTANCE;
        }
    }
}
