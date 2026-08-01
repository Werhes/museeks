package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14155e {
    public static final C2892e vip = new C2892e(-91331245, false, new C14498e(26));
    public final /* synthetic */ int ad;

    public /* synthetic */ C14155e(int i) {
        this.ad = i;
    }

    public static final void ad(final boolean z, final String str, final C3177e c3177e, final InterfaceC0888e interfaceC0888e, final String str2, final Function1 function1, final Function1 function12, final Function1 function13, final Function2 function2, final Function0 function0, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i) {
        View view;
        InterfaceC3314e interfaceC3314e;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-146088417);
        int i2 = i | (c13770e2.billing(z) ? 4 : 2) | (c13770e2.purchase(str) ? 32 : 16) | (c13770e2.purchase(c3177e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.yandex(interfaceC0888e) ? 2048 : 1024) | (c13770e2.purchase(str2) ? 16384 : 8192) | (c13770e2.yandex(function1) ? 131072 : 65536) | (c13770e2.yandex(function12) ? 1048576 : 524288) | (c13770e2.yandex(function13) ? 8388608 : 4194304) | (c13770e2.yandex(function2) ? 67108864 : 33554432) | (c13770e2.yandex(function0) ? 536870912 : 268435456);
        if (c13770e2.m3673protected(i2 & 1, ((i2 & 306783379) == 306783378 && ((c13770e2.purchase(interfaceC12864e) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            InterfaceC1108e ad = ((InterfaceC8018e) ((C6325e) AbstractC1831e.metrica().f22772e).f13170e).ad();
            ((C6325e) AbstractC1831e.metrica().f22772e).getClass();
            C14528e.f28724e.getClass();
            InterfaceC3314e vip2 = AbstractC4628e.vip(ad, C14528e.f28723e, c13770e2, 0);
            final C4993e ad2 = AbstractC9735e.ad(c3177e.vip, 2, c13770e2);
            Object m3681throw = c13770e2.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = AbstractC17680e.startapp(c13770e2);
                c13770e2.m3682throws(m3681throw);
            }
            final InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
            View view2 = (View) c13770e2.adcel(AbstractC2676e.purchase);
            boolean yandex = c13770e2.yandex(interfaceC0888e) | ((i2 & 234881024) == 67108864) | c13770e2.yandex(view2) | c13770e2.purchase(vip2);
            Object m3681throw2 = c13770e2.m3681throw();
            if (yandex || m3681throw2 == obj) {
                C17205e c17205e = new C17205e(interfaceC0888e, function2, view2, vip2, null);
                view = view2;
                interfaceC3314e = vip2;
                c13770e2.m3682throws(c17205e);
                m3681throw2 = c17205e;
            } else {
                view = view2;
                interfaceC3314e = vip2;
            }
            final C10743e appmetrica = AbstractC7763e.appmetrica(ad2, (Function4) m3681throw2, c13770e2);
            C7838e c7838e = VKXApplication.f36530e;
            if (c7838e == null) {
                c7838e = null;
            }
            final InterfaceC3314e license = AbstractC4628e.license((C1615e) c7838e.f15870e.f36229e, c13770e2, 0);
            Object m3681throw3 = c13770e2.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = new C2317e();
                c13770e2.m3682throws(m3681throw3);
            }
            final C2317e c2317e = (C2317e) m3681throw3;
            final String appmetrica2 = AbstractC5297e.appmetrica(c13770e2, R.string.snackbar_delete);
            final String appmetrica3 = AbstractC5297e.appmetrica(c13770e2, R.string.snackbar_delete_undo);
            C9616e c9616e = AbstractC16497e.metrica;
            C9577e c9577e = C5438e.f11672e;
            C4789e ad3 = AbstractC14801e.ad(c9616e, c9577e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            final InterfaceC3314e interfaceC3314e2 = interfaceC3314e;
            C8587e ad4 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e2, 48);
            long j2 = c13770e2.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, c0115e);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad4, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f, true);
            C4789e ad5 = AbstractC14801e.ad(c9616e, c9577e, c13770e2, 0);
            long j3 = c13770e2.f27286case;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e2.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, c5228e);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad5, c14865e);
            AbstractC2270e.yandex(c13770e2, advert3, c14865e2);
            AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
            String appmetrica4 = AbstractC5297e.appmetrica(c13770e2, R.string.np_title2);
            C15492e c15492e = AbstractC11785e.ad;
            float f = 16;
            AbstractC14489e.vip(appmetrica4, AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 131068);
            C1839e c1839e = ((C7019e) c13770e.adcel(c15492e)).vip.adcel;
            C15492e c15492e2 = AbstractC3577e.ad;
            AbstractC14489e.vip(str2, AbstractC12220e.smaato(c0115e, f, 0.0f, 2), ((C0896e) c13770e.adcel(c15492e2)).vip, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, c1839e, c13770e, ((i2 >> 12) & 14) | 48, 0, 131064);
            c13770e.Signature(true);
            AbstractC0014e.metrica(function0, null, false, null, null, null, AbstractC1328e.ad, c13770e, ((i2 >> 27) & 14) | 1572864, 62);
            c13770e.Signature(true);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 8));
            final View view3 = view;
            AbstractC13348e.ad(null, null, null, AbstractC16653e.license(629849691, new C17689e(16, c2317e), c13770e), null, 0, C3618e.startapp, ((C0896e) c13770e.adcel(c15492e2)).vip, AbstractC3338e.ad, AbstractC16653e.license(1743276516, new Function3() { // from class: eؚّٚ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    final C4993e c4993e;
                    InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj2;
                    C13770e c13770e3 = (C13770e) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= c13770e3.purchase(interfaceC12123e) ? 4 : 2;
                    }
                    if (c13770e3.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                        InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                        if (1.0f <= 0.0d) {
                            AbstractC9534e.ad("invalid weight; must be greater than zero");
                        }
                        InterfaceC12864e premium = metrica.premium(new C5228e(1.0f, true));
                        final C10743e c10743e = appmetrica;
                        boolean purchase4 = c13770e3.purchase(c10743e);
                        final C3177e c3177e2 = c3177e;
                        boolean purchase5 = purchase4 | c13770e3.purchase(c3177e2);
                        final InterfaceC18435e interfaceC18435e2 = interfaceC18435e;
                        boolean yandex2 = purchase5 | c13770e3.yandex(interfaceC18435e2);
                        final String str3 = appmetrica2;
                        boolean purchase6 = yandex2 | c13770e3.purchase(str3);
                        final String str4 = appmetrica3;
                        boolean purchase7 = purchase6 | c13770e3.purchase(str4);
                        final Function1 function14 = function13;
                        boolean purchase8 = purchase7 | c13770e3.purchase(function14);
                        C4993e c4993e2 = C4993e.this;
                        boolean purchase9 = purchase8 | c13770e3.purchase(c4993e2);
                        final View view4 = view3;
                        boolean yandex3 = purchase9 | c13770e3.yandex(view4);
                        final InterfaceC16132e interfaceC16132e = interfaceC3314e2;
                        boolean purchase10 = yandex3 | c13770e3.purchase(interfaceC16132e);
                        final Function1 function15 = function1;
                        boolean purchase11 = purchase10 | c13770e3.purchase(function15);
                        int i6 = intValue;
                        final boolean z2 = z;
                        boolean billing = purchase11 | c13770e3.billing(z2);
                        final String str5 = str;
                        boolean purchase12 = billing | c13770e3.purchase(str5);
                        final Function1 function16 = function12;
                        boolean purchase13 = purchase12 | c13770e3.purchase(function16);
                        final InterfaceC16132e interfaceC16132e2 = license;
                        boolean purchase14 = purchase13 | c13770e3.purchase(interfaceC16132e2);
                        Object m3681throw4 = c13770e3.m3681throw();
                        if (purchase14 || m3681throw4 == C2987e.ad) {
                            final C2317e c2317e2 = c2317e;
                            c4993e = c4993e2;
                            Function1 function17 = new Function1() { // from class: eؘؒۧ
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    C17213e c17213e = (C17213e) obj5;
                                    C10743e c10743e2 = c10743e;
                                    AbstractC5087e.premium(c17213e, "_synth", null, new C2892e(-1280846289, true, new C17871e(6, c10743e2)), 2);
                                    InterfaceC8346e interfaceC8346e = C3177e.this.ad;
                                    C14044e c14044e = C14044e.f27782e;
                                    c17213e.mopub(((AbstractC7674e) interfaceC8346e).subs(), new C6262e(interfaceC8346e), new C6262e(18, interfaceC8346e), new C2892e(802480018, true, new C7924e(interfaceC8346e, interfaceC18435e2, str3, str4, function14, c10743e2, c2317e2, c4993e, view4, interfaceC16132e, function15, z2, str5, function16)));
                                    if (!((Boolean) interfaceC16132e2.getValue()).booleanValue()) {
                                        AbstractC5087e.premium(c17213e, "_synth_loadPlaceholder", null, AbstractC1328e.metrica, 2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c13770e3.m3682throws(function17);
                            m3681throw4 = function17;
                        } else {
                            c4993e = c4993e2;
                        }
                        AbstractC7023e.ad(premium, c4993e, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw4, c13770e3, (i6 << 6) & 896, 504);
                    } else {
                        c13770e3.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 907545600, 55);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2(z, str, c3177e, interfaceC0888e, str2, function1, function12, function13, function2, function0, interfaceC12864e, i) { // from class: eٖؕۡ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ String f8257e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ C3177e f8258e;

                /* renamed from: eؙؔٞ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f8259e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ String f8260e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f8261e;

                /* renamed from: eٍۗۛ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f8262e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC0888e f8263e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ Function2 f8264e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ boolean f8265e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f8266e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f8267e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int advert4 = AbstractC5190e.advert(1);
                    C14155e.ad(this.f8265e, this.f8260e, this.f8258e, this.f8263e, this.f8257e, this.f8267e, this.f8266e, this.f8261e, this.f8264e, this.f8259e, this.f8262e, (C13770e) obj2, advert4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final InterfaceC15764e appmetrica(Collection collection, C2824e c2824e) {
        Iterator it = collection.iterator();
        InterfaceC15764e interfaceC15764e = null;
        while (it.hasNext()) {
            InterfaceC15764e interfaceC15764e2 = (InterfaceC15764e) it.next();
            if (AbstractC7890e.billing(interfaceC15764e2.ad(), c2824e)) {
                if (interfaceC15764e != null) {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + c2824e);
                }
                interfaceC15764e = interfaceC15764e2;
            }
        }
        if (interfaceC15764e != null) {
            return interfaceC15764e;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + c2824e);
    }

    public static final void billing(View view, boolean z) {
        if (!AbstractC7640e.vip(view.getContext()) || z) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            view.performHapticFeedback(13);
        } else {
            view.performHapticFeedback(4);
        }
    }

    public static final void license(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final void metrica(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void purchase(View view, boolean z) {
        if (!AbstractC7640e.vip(view.getContext()) || z) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            view.performHapticFeedback(25);
        } else if (i >= 30) {
            view.performHapticFeedback(12);
        } else {
            view.performHapticFeedback(4);
        }
    }

    public static final void vip(Function0 function0, Function0 function02, Function1 function1, C14609e c14609e, InterfaceC12864e interfaceC12864e, InterfaceC12864e interfaceC12864e2, C13770e c13770e, int i) {
        c13770e.m3671package(-549176269);
        int i2 = i | (c13770e.yandex(function0) ? 4 : 2) | (c13770e.yandex(function02) ? 32 : 16) | (c13770e.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(c14609e) ? 2048 : 1024) | (c13770e.purchase(interfaceC12864e) ? 16384 : 8192) | (c13770e.purchase(interfaceC12864e2) ? 131072 : 65536);
        if (c13770e.m3673protected(i2 & 1, (74899 & i2) != 74898)) {
            AbstractC6401e.vip(AbstractC16653e.license(-1778366107, new C8124e(24, function0, c14609e, function02), c13770e), AbstractC16653e.license(1476309350, new C17871e(7, c14609e), c13770e), interfaceC12864e2, AbstractC16653e.license(-604274328, new C8124e(25, c14609e, function1, interfaceC12864e), c13770e), c13770e, ((i2 >> 9) & 896) | 3126, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2779e(function0, function02, function1, c14609e, interfaceC12864e, interfaceC12864e2, i);
        }
    }
}
