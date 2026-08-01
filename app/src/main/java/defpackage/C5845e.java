package defpackage;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5845e implements InterfaceC6034e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f12306e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12307e;

    public /* synthetic */ C5845e(int i, Object obj) {
        this.f12307e = i;
        this.f12306e = obj;
    }

    public C5845e(C9556e c9556e, InterfaceC18435e interfaceC18435e) {
        this.f12307e = 17;
        this.f12306e = c9556e;
    }

    public C5845e(InterfaceC18435e interfaceC18435e, C12805e c12805e) {
        this.f12307e = 10;
        this.f12306e = c12805e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ad(defpackage.AbstractC3002e r6, defpackage.InterfaceC5083e r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12306e
            eٕؗٞ r0 = (defpackage.AbstractServiceC5057e) r0
            boolean r1 = r7 instanceof defpackage.C17948e
            if (r1 == 0) goto L17
            r1 = r7
            eِ٘ۗ r1 = (defpackage.C17948e) r1
            int r2 = r1.f35196e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f35196e = r2
            goto L1c
        L17:
            eِ٘ۗ r1 = new eِ٘ۗ
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.f35195e
            int r2 = r1.f35196e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.AbstractC2003e.purchase(r7)
            goto L5c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.AbstractC2003e.purchase(r7)
            boolean r7 = r6 instanceof defpackage.C16928e
            if (r7 == 0) goto L4c
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r0.f10870e = r6
            eؘٖۢ r6 = r0.billing()
            r7 = 0
            r6.f31588e = r7
            r0.adcel()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L4c:
            r0.f10872e = r6
            r0.metrica()
            r1.f35196e = r3
            java.lang.Object r6 = r0.purchase(r6, r1)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r6 != r7) goto L5c
            return r7
        L5c:
            int r6 = r0.f10871e
            int r6 = r6 - r3
            r0.f10871e = r6
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5845e.ad(eؔۦۥ, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        Function0 function0;
        Object startapp;
        switch (this.f12307e) {
            case 0:
                C16911e c16911e = (C16911e) this.f12306e;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC14380e.firebase(c16911e.inmobi(), (View) c16911e.f33137e);
                }
                return Unit.INSTANCE;
            case 1:
                ((C0909e) this.f12306e).mo420default();
                return Unit.INSTANCE;
            case 2:
                int intValue = ((Number) obj).intValue();
                C15420e c15420e = AbstractC6731e.ad;
                Object advert = AbstractC5336e.advert(AbstractC1497e.ad.f25795e, new C15548e(intValue, (AppActivity) this.f12306e, (InterfaceC5083e) null), interfaceC5083e);
                return advert == EnumC2821e.f6782e ? advert : Unit.INSTANCE;
            case 3:
                return ad((AbstractC3002e) obj, interfaceC5083e);
            case 4:
                AbstractC8434e abstractC8434e = (AbstractC8434e) obj;
                C14246e c14246e = (C14246e) this.f12306e;
                C1615e c1615e = c14246e.f28167e;
                if (abstractC8434e instanceof C3064e) {
                    c1615e.getClass();
                    c1615e.smaato(null, abstractC8434e);
                    return Unit.INSTANCE;
                }
                if (abstractC8434e instanceof C5716e) {
                    c1615e.getClass();
                    c1615e.smaato(null, abstractC8434e);
                    return Unit.INSTANCE;
                }
                if (!(abstractC8434e instanceof C12448e)) {
                    return Unit.INSTANCE;
                }
                C5981e c5981e = c14246e.f28161e;
                Unit unit = Unit.INSTANCE;
                Object startapp2 = c5981e.startapp(unit, interfaceC5083e);
                return startapp2 == EnumC2821e.f6782e ? startapp2 : unit;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C18478e c18478e = (C18478e) this.f12306e;
                if (booleanValue) {
                    PopupWindow popupWindow = (PopupWindow) c18478e.f36229e;
                    if (popupWindow != null && popupWindow.isShowing() && (function0 = ((C3274e) c18478e.f36227e).purchase) != null) {
                        function0.invoke();
                    }
                    PopupWindow popupWindow2 = (PopupWindow) c18478e.f36229e;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                    }
                }
                return Unit.INSTANCE;
            case 6:
                C0909e c0909e = ((C13732e) this.f12306e).metrica;
                c0909e.m427try().updateCursorAnchorInfo((View) c0909e.f3323e, (CursorAnchorInfo) obj);
                return Unit.INSTANCE;
            case 7:
                C7576e c7576e = (C7576e) this.f12306e;
                return ((c7576e.startapp.signatures() instanceof C15551e) || (startapp = c7576e.startapp(true, interfaceC5083e)) != EnumC2821e.f6782e) ? Unit.INSTANCE : startapp;
            case 8:
                if (((EnumC7785e) obj).compareTo(EnumC7785e.f15777e) <= 0) {
                    C7016e c7016e = (C7016e) this.f12306e;
                    C16106e c16106e = c7016e.f14361e;
                    C16446e ad = c16106e.ad();
                    if (ad != null) {
                        ((InterfaceC2661e) AbstractC10432e.vip(c7016e, AbstractC11473e.billing)).ad(ad);
                    }
                    c16106e.purchase.setValue(null);
                }
                return Unit.INSTANCE;
            case 9:
                ((C14835e) this.f12306e).f29371e.startapp(((Number) obj).floatValue());
                return Unit.INSTANCE;
            case 10:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                C12805e c12805e = (C12805e) this.f12306e;
                if (!booleanValue2) {
                    RunnableC12991e runnableC12991e = c12805e.metrica;
                    if (runnableC12991e != null) {
                        c12805e.ad.removeCallbacks(runnableC12991e);
                    }
                    c12805e.metrica = null;
                } else if (c12805e.metrica == null) {
                    c12805e.ad();
                }
                return Unit.INSTANCE;
            case 11:
                C13034e c13034e = (C13034e) obj;
                C8436e c8436e = (C8436e) this.f12306e;
                if (c13034e.f25959e && c13034e.f25962e) {
                    r3 = true;
                }
                c8436e.invoke(Boolean.valueOf(r3), Boolean.valueOf(c13034e.f25960e));
                return Unit.INSTANCE;
            case 12:
                String str = (String) obj;
                C9261e c9261e = (C9261e) this.f12306e;
                c9261e.f18475e.appmetrica(str.length() > 0);
                Object m2532strictfp = C9261e.m2532strictfp(c9261e, str, interfaceC5083e);
                return m2532strictfp == EnumC2821e.f6782e ? m2532strictfp : Unit.INSTANCE;
            case 13:
                C4199e c4199e = (C4199e) this.f12306e;
                if (c4199e.f9251e.ad != null) {
                    ((C14911e) c4199e.f22046e).metrica("REMOVING INITIAL VERSION", new Object[0]);
                    c4199e.f9251e.ad = null;
                }
                ((C4199e) this.f12306e).f9246e.vip();
                Object startapp3 = ((C4199e) this.f12306e).f9254e.startapp(new C11993e(12), interfaceC5083e);
                return startapp3 == EnumC2821e.f6782e ? startapp3 : Unit.INSTANCE;
            case 14:
                InterfaceC13352e interfaceC13352e = (InterfaceC13352e) obj;
                C16330e c16330e = (C16330e) this.f12306e;
                if ((interfaceC13352e instanceof C17612e) || (interfaceC13352e instanceof C16906e)) {
                    c16330e.startapp(c16330e.purchase() + 1);
                } else if ((interfaceC13352e instanceof C3103e) || (interfaceC13352e instanceof C2574e) || (interfaceC13352e instanceof C1867e)) {
                    c16330e.startapp(c16330e.purchase() - 1);
                }
                return Unit.INSTANCE;
            case 15:
                C12893e c12893e = (C12893e) obj;
                C4473e c4473e = (C4473e) this.f12306e;
                c4473e.yandex = c12893e;
                if (c4473e.adcel) {
                    c4473e.adcel = false;
                    c4473e.metrica();
                }
                Object ad2 = C4473e.ad(c4473e, c12893e.ad.ad, EnumC6067e.f12744e, interfaceC5083e);
                return ad2 == EnumC2821e.f6782e ? ad2 : Unit.INSTANCE;
            case 16:
                Object purchase = ((C7558e) this.f12306e).purchase(interfaceC5083e, new Float(AbstractC0840e.ad.ad(((C0419e) obj).metrica)));
                return purchase == EnumC2821e.f6782e ? purchase : Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6442e c6442e = (C6442e) obj;
                C9556e c9556e = (C9556e) this.f12306e;
                int i = c9556e.f18970e;
                C1169e c1169e = (C1169e) c9556e.f18969e;
                ListIterator listIterator = c1169e.listIterator(0);
                boolean z = false;
                while (true) {
                    C11045e c11045e = (C11045e) listIterator;
                    if (c11045e.hasNext()) {
                        try {
                            if (((InterfaceC5387e) c11045e.next()).vip(c6442e)) {
                                z = true;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable unused) {
                        }
                    } else {
                        if (i == -1 || !z) {
                            return Unit.INSTANCE;
                        }
                        c9556e.f18970e = -1;
                        ListIterator listIterator2 = c1169e.listIterator(0);
                        while (true) {
                            C11045e c11045e2 = (C11045e) listIterator2;
                            if (!c11045e2.hasNext()) {
                                Object billing = c9556e.billing(i, interfaceC5083e);
                                return billing == EnumC2821e.f6782e ? billing : Unit.INSTANCE;
                            }
                            ((InterfaceC5387e) c11045e2.next()).release();
                        }
                    }
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C1902e) this.f12306e).f5062e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return vip(interfaceC5083e);
            case 20:
                AbstractC12314e abstractC12314e = (AbstractC12314e) obj;
                C0216e c0216e = (C0216e) this.f12306e;
                synchronized (c0216e.appmetrica) {
                    try {
                        if (abstractC12314e instanceof C15902e) {
                            C17534e c17534e = new C17534e((C13471e) ((C15902e) abstractC12314e).ad);
                            c0216e.billing = c17534e;
                            c0216e.vip(new C15902e(c17534e));
                        } else {
                            c0216e.vip(abstractC12314e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC18174e abstractC18174e = (AbstractC18174e) obj;
                if (abstractC18174e instanceof C12311e) {
                    C12311e c12311e = (C12311e) abstractC18174e;
                    ((WebView) this.f12306e).loadUrl(c12311e.ad, c12311e.vip);
                } else if (!(abstractC18174e instanceof C0079e)) {
                    throw new C14803e(10);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object vip(defpackage.InterfaceC5083e r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12306e
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r6 instanceof defpackage.C11937e
            if (r1 == 0) goto L17
            r1 = r6
            eِۘؕ r1 = (defpackage.C11937e) r1
            int r2 = r1.f23920e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f23920e = r2
            goto L1c
        L17:
            eِۘؕ r1 = new eِۘؕ
            r1.<init>(r5, r6)
        L1c:
            java.lang.Object r6 = r1.f23919e
            int r2 = r1.f23920e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.AbstractC2003e.purchase(r6)
            goto L59
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            android.content.Context r6 = r0.getContext()
            boolean r6 = defpackage.AbstractC7640e.vip(r6)
            if (r6 == 0) goto L6d
            eُۡٔ r6 = defpackage.AbstractC1831e.metrica()
            java.lang.Object r6 = r6.f22772e
            eؙُْ r6 = (defpackage.C6325e) r6
            java.lang.Object r6 = r6.f13170e
            eًٙۡ r6 = (defpackage.InterfaceC8018e) r6
            eؒٗۡ r6 = r6.ad()
            r1.f23920e = r3
            java.lang.Object r6 = defpackage.AbstractC7535e.startapp(r6, r1)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r6 != r1) goto L59
            return r1
        L59:
            eًُؗ r6 = (defpackage.C10876e) r6
            boolean r6 = r6.f21540e
            if (r6 != 0) goto L6d
            java.util.WeakHashMap r6 = defpackage.AbstractC2016e.ad
            r6 = 6
            int r6 = defpackage.AbstractC17957e.billing(r6)
            r1 = -1
            if (r6 != r1) goto L6a
            goto L6d
        L6a:
            r0.performHapticFeedback(r6, r3)
        L6d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5845e.vip(eًؗۖ):java.lang.Object");
    }
}
