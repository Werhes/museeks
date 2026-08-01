package defpackage;

import android.os.Handler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10014e implements InterfaceC16503e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f19768e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C12431e f19769e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C0583e f19770e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC10864e f19771e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C0583e f19772e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f19773e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC5830e f19774e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f19775e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final String f19776e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C12429e f19777e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C16580e f19778e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f19779e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C14456e f19780e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13915e f19781e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0583e f19782e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0583e f19783e;

    public C10014e(C13915e c13915e, InterfaceC10864e interfaceC10864e) {
        this.f19781e = c13915e;
        this.f19771e = interfaceC10864e;
        long[] jArr = AbstractC12981e.ad;
        this.f19783e = new C0583e();
        this.f19782e = new C0583e();
        this.f19777e = new C12429e(this);
        this.f19780e = new C14456e(this);
        this.f19772e = new C0583e();
        this.f19778e = new C16580e();
        this.f19770e = new C0583e();
        this.f19769e = new C12431e(0, new Object[16]);
        this.f19776e = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void appmetrica(C5017e c5017e) {
        C12618e c12618e;
        C11844e c11844e = c5017e.purchase;
        if (c11844e != null) {
            c11844e.yandex.set(EnumC15242e.f30155e);
            C14995e c14995e = c11844e.mopub;
            if (((C12618e) c14995e.license).startapp()) {
                c12618e = (C12618e) c14995e.license;
                C12618e c12618e2 = AbstractC1710e.ad;
                c14995e.license = new C12618e();
                ((C12431e) c14995e.metrica).startapp();
            } else {
                c12618e = null;
            }
            c14995e.license();
            C17489e c17489e = c11844e.ad;
            c17489e.f34293e = null;
            if (c12618e != null) {
                c17489e.f34289e.mopub = c12618e;
                c17489e.f34301e = 2;
            }
            c5017e.purchase = null;
            C17489e c17489e2 = c5017e.metrica;
            if (c17489e2 != null) {
                c17489e2.ad();
            }
            c5017e.metrica = null;
        }
    }

    public static final void metrica(C10014e c10014e, Object obj) {
        C13915e c13915e = c10014e.f19781e;
        c10014e.yandex();
        C13915e c13915e2 = (C13915e) c10014e.f19772e.advert(obj);
        if (c13915e2 != null) {
            if (c10014e.f19775e <= 0) {
                AbstractC14070e.metrica("No pre-composed items to dispose");
            }
            int advert = ((C12431e) ((C8794e) c13915e.Signature()).f17708e).advert(c13915e2);
            if (advert < ((C12431e) ((C8794e) c13915e.Signature()).f17708e).f24868e - c10014e.f19775e) {
                AbstractC14070e.metrica("Item is not in pre-composed item range");
            }
            c10014e.f19773e++;
            c10014e.f19775e--;
            C5017e c5017e = (C5017e) c10014e.f19783e.billing(c13915e2);
            if (c5017e != null) {
                appmetrica(c5017e);
            }
            int i = (((C12431e) ((C8794e) c13915e.Signature()).f17708e).f24868e - c10014e.f19775e) - c10014e.f19773e;
            c10014e.mopub(advert, i);
            c10014e.billing(i);
        }
        if (c10014e.f19769e.adcel(obj)) {
            C13915e.m3699strictfp(c13915e, true, 6);
        }
    }

    @Override // defpackage.InterfaceC16503e
    public final void ad() {
        C17489e c17489e;
        C13915e c13915e = this.f19781e;
        c13915e.f27611e = true;
        C0583e c0583e = this.f19783e;
        Object[] objArr = c0583e.metrica;
        long[] jArr = c0583e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (c17489e = ((C5017e) objArr[(i << 3) + i3]).metrica) != null) {
                            c17489e.ad();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c13915e.m3711implements();
        Unit unit = Unit.INSTANCE;
        c13915e.f27611e = false;
        c0583e.ad();
        this.f19782e.ad();
        this.f19775e = 0;
        this.f19773e = 0;
        this.f19772e.ad();
        yandex();
    }

    public final void adcel(boolean z) {
        this.f19775e = 0;
        this.f19772e.ad();
        List Signature = this.f19781e.Signature();
        int i = ((C12431e) ((C8794e) Signature).f17708e).f24868e;
        if (this.f19773e != i) {
            this.f19773e = i;
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C13915e c13915e = (C13915e) ((C8794e) Signature).get(i2);
                    C5017e c5017e = (C5017e) this.f19783e.billing(c13915e);
                    if (c5017e != null && ((Boolean) c5017e.billing.getValue()).booleanValue()) {
                        C11874e c11874e = c13915e.f27612e;
                        c11874e.Signature.f25181e = 3;
                        C17596e c17596e = c11874e.admob;
                        if (c17596e != null) {
                            c17596e.f34460e = 3;
                        }
                        smaato(c5017e, z);
                        c5017e.ad = AbstractC9464e.ad;
                    }
                } catch (Throwable th) {
                    AbstractC12640e.Signature(adcel, smaato, appmetrica);
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            this.f19782e.ad();
        }
        yandex();
    }

    public final void advert(Object obj, Function2 function2, boolean z) {
        C13915e c13915e = this.f19781e;
        if (c13915e.m3708extends()) {
            yandex();
            if (this.f19782e.metrica(obj)) {
                return;
            }
            this.f19770e.advert(obj);
            C0583e c0583e = this.f19772e;
            Object billing = c0583e.billing(obj);
            if (billing == null) {
                billing = loadAd(obj);
                if (billing != null) {
                    mopub(((C12431e) ((C8794e) c13915e.Signature()).f17708e).advert(billing), ((C12431e) ((C8794e) c13915e.Signature()).f17708e).f24868e);
                    this.f19775e++;
                } else {
                    int i = ((C12431e) ((C8794e) c13915e.Signature()).f17708e).f24868e;
                    C13915e c13915e2 = new C13915e(2);
                    c13915e.f27611e = true;
                    c13915e.subs(i, c13915e2);
                    Unit unit = Unit.INSTANCE;
                    c13915e.f27611e = false;
                    this.f19775e++;
                    billing = c13915e2;
                }
                c0583e.amazon(obj, billing);
            }
            amazon((C13915e) billing, obj, z, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010e, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010b, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0126), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010e, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010b, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0126), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010e, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010b, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0126), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d4, B:51:0x00d8, B:52:0x010e, B:55:0x00e5, B:56:0x00f0, B:58:0x00f4, B:59:0x010b, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x011a, B:67:0x0126), top: B:36:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [eُٜؗ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void amazon(defpackage.C13915e r10, java.lang.Object r11, boolean r12, kotlin.jvm.functions.Function2 r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10014e.amazon(eِٓؔ, java.lang.Object, boolean, kotlin.jvm.functions.Function2):void");
    }

    public final void billing(int i) {
        boolean z;
        boolean z2 = false;
        this.f19773e = 0;
        List Signature = this.f19781e.Signature();
        C8794e c8794e = (C8794e) Signature;
        int i2 = (((C12431e) c8794e.f17708e).f24868e - this.f19775e) - 1;
        if (i <= i2) {
            this.f19778e.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    ((C5896e) this.f19778e.f32530e).ad(((C5017e) this.f19783e.billing((C13915e) c8794e.get(i3))).ad);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f19771e.ad(this.f19778e);
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            z = false;
            while (i2 >= i) {
                try {
                    C13915e c13915e = (C13915e) ((C8794e) Signature).get(i2);
                    C5017e c5017e = (C5017e) this.f19783e.billing(c13915e);
                    Object obj = c5017e.ad;
                    if (((C5896e) this.f19778e.f32530e).metrica(obj)) {
                        this.f19773e++;
                        if (((Boolean) c5017e.billing.getValue()).booleanValue()) {
                            C11874e c11874e = c13915e.f27612e;
                            c11874e.Signature.f25181e = 3;
                            C17596e c17596e = c11874e.admob;
                            if (c17596e != null) {
                                c17596e.f34460e = 3;
                            }
                            smaato(c5017e, false);
                            if (c5017e.yandex) {
                                z = true;
                            }
                        }
                    } else {
                        C13915e c13915e2 = this.f19781e;
                        c13915e2.f27611e = true;
                        this.f19783e.advert(c13915e);
                        C17489e c17489e = c5017e.metrica;
                        if (c17489e != null) {
                            c17489e.ad();
                        }
                        this.f19781e.m3703case(i2, 1);
                        Unit unit = Unit.INSTANCE;
                        c13915e2.f27611e = false;
                    }
                    this.f19782e.advert(obj);
                    i2--;
                } catch (Throwable th) {
                    AbstractC12640e.Signature(adcel, smaato, appmetrica);
                    throw th;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        } else {
            z = false;
        }
        if (z) {
            synchronized (AbstractC12909e.metrica) {
                C12618e c12618e = AbstractC12909e.adcel.yandex;
                if (c12618e != null) {
                    if (c12618e.startapp()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                AbstractC12909e.ad();
            }
        }
        yandex();
    }

    public final void license(C5017e c5017e, boolean z) {
        C11844e c11844e = c5017e.purchase;
        if (c11844e != null) {
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                C13915e c13915e = this.f19781e;
                c13915e.f27611e = true;
                if (z) {
                    while (!c11844e.metrica()) {
                        try {
                            c11844e.appmetrica(new C0189e(19));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c11844e.ad();
                c5017e.purchase = null;
                Unit unit = Unit.INSTANCE;
                c13915e.f27611e = false;
            } finally {
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
            }
        }
    }

    public final C13915e loadAd(Object obj) {
        C0583e c0583e;
        int i;
        if (this.f19773e == 0) {
            return null;
        }
        C8794e c8794e = (C8794e) this.f19781e.Signature();
        int i2 = ((C12431e) c8794e.f17708e).f24868e - this.f19775e;
        int i3 = i2 - this.f19773e;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            c0583e = this.f19783e;
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (AbstractC7890e.billing(((C5017e) c0583e.billing((C13915e) c8794e.get(i5))).ad, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                C5017e c5017e = (C5017e) c0583e.billing((C13915e) c8794e.get(i4));
                Object obj2 = c5017e.ad;
                if (obj2 == AbstractC9464e.ad || this.f19771e.isVip(obj, obj2)) {
                    c5017e.ad = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            mopub(i5, i3);
        }
        this.f19773e--;
        C13915e c13915e = (C13915e) c8794e.get(i3);
        C5017e c5017e2 = (C5017e) c0583e.billing(c13915e);
        c5017e2.billing = AbstractC14533e.startapp(Boolean.TRUE);
        c5017e2.appmetrica = true;
        c5017e2.license = true;
        return c13915e;
    }

    public final void mopub(int i, int i2) {
        C13915e c13915e = this.f19781e;
        c13915e.f27611e = true;
        c13915e.m3718protected(i, i2, 1);
        Unit unit = Unit.INSTANCE;
        c13915e.f27611e = false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eٖۦ, java.lang.Object] */
    public final InterfaceC16638e purchase(Object obj) {
        return !this.f19781e.m3708extends() ? new Object() : new C6657e(this, obj);
    }

    public final void smaato(C5017e c5017e, boolean z) {
        C17489e c17489e;
        if (z || !c5017e.yandex) {
            c5017e.billing = AbstractC14533e.startapp(Boolean.FALSE);
        } else {
            c5017e.billing.setValue(Boolean.FALSE);
        }
        if (c5017e.purchase != null) {
            appmetrica(c5017e);
            return;
        }
        if (z) {
            C17489e c17489e2 = c5017e.metrica;
            if (c17489e2 != null) {
                c17489e2.smaato();
                return;
            }
            return;
        }
        InterfaceC12757e m1715getOutOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(this.f19781e)).m1715getOutOfFrameExecutor();
        if (m1715getOutOfFrameExecutor == null) {
            if (c5017e.yandex || (c17489e = c5017e.metrica) == null) {
                return;
            }
            c17489e.smaato();
            return;
        }
        C17073e c17073e = new C17073e(9, c5017e);
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) m1715getOutOfFrameExecutor;
        C12718e c12718e = viewTreeObserverOnGlobalLayoutListenerC5014e.f10675e;
        boolean isEmpty = c12718e.isEmpty();
        c12718e.addLast(c17073e);
        if (isEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC5014e.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC5014e.f10620e);
        }
    }

    @Override // defpackage.InterfaceC16503e
    public final void startapp() {
        adcel(false);
    }

    @Override // defpackage.InterfaceC16503e
    public final void vip() {
        adcel(true);
    }

    public final void yandex() {
        int i = ((C12431e) ((C8794e) this.f19781e.Signature()).f17708e).f24868e;
        C0583e c0583e = this.f19783e;
        if (c0583e.appmetrica != i) {
            AbstractC14070e.ad("Inconsistency between the count of nodes tracked by the state (" + c0583e.appmetrica + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f19773e) - this.f19775e < 0) {
            StringBuilder premium = AbstractC4653e.premium("Incorrect state. Total children ", i, ". Reusable children ");
            premium.append(this.f19773e);
            premium.append(". Precomposed children ");
            premium.append(this.f19775e);
            AbstractC14070e.ad(premium.toString());
        }
        C0583e c0583e2 = this.f19772e;
        if (c0583e2.appmetrica == this.f19775e) {
            return;
        }
        AbstractC14070e.ad("Incorrect state. Precomposed children " + this.f19775e + ". Map size " + c0583e2.appmetrica);
    }
}
