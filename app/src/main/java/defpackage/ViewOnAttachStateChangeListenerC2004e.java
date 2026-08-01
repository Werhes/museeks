package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۙ */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2004e extends C2187e implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: eٖؗۘ */
    public static final C12452e f5209e;

    /* renamed from: eّؑۛ */
    public final C11297e f5211e;

    /* renamed from: eٕؒۙ */
    public C8092e f5212e;

    /* renamed from: eٕؓۥ */
    public int f5213e;

    /* renamed from: eؙؔٞ */
    public final C4927e f5214e;

    /* renamed from: eؙؕ */
    public Integer f5215e;

    /* renamed from: eَؕ۟ */
    public C8092e f5216e;

    /* renamed from: eٍؗٚ */
    public final C14338e f5217e;

    /* renamed from: eؘؑۦ */
    public final C6029e f5218e;

    /* renamed from: eؘؖؑ */
    public final String f5219e;

    /* renamed from: eؙِۛ */
    public final C3123e f5220e;

    /* renamed from: eؚٕؒ */
    public boolean f5221e;

    /* renamed from: eؚۚۦ */
    public boolean f5222e;

    /* renamed from: eًؕۙ */
    public final C3123e f5223e;

    /* renamed from: eًۛٝ */
    public final C14768e f5224e;

    /* renamed from: eٍٍٜ */
    public C3123e f5226e;

    /* renamed from: eٍٖۥ */
    public final C16399e f5227e;

    /* renamed from: eٍۗۛ */
    public int f5228e;

    /* renamed from: eَؖٗ */
    public C15417e f5229e;

    /* renamed from: eَٕٞ */
    public final C17548e f5230e;

    /* renamed from: eَۦۥ */
    public final String f5231e;

    /* renamed from: eُِٔ */
    public C8929e f5232e;

    /* renamed from: eُٛۜ */
    public final C14768e f5233e;

    /* renamed from: eٍُٝ */
    public final C14338e f5234e;

    /* renamed from: eؘِْ */
    public final C3123e f5235e;

    /* renamed from: eؙِٖ */
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e f5236e;

    /* renamed from: eّٜۦ */
    public final C14137e f5237e;

    /* renamed from: eّٕۜ */
    public List f5238e;

    /* renamed from: eْٖٓ */
    public boolean f5239e;

    /* renamed from: eَٔٞ */
    public final C14768e f5240e;

    /* renamed from: eٖٕٚ */
    public final ArrayList f5241e;

    /* renamed from: eّٖٗ */
    public final RunnableC17584e f5242e;

    /* renamed from: eؘَٗ */
    public final AccessibilityManager f5243e;

    /* renamed from: eٗۚۖ */
    public final C11297e f5244e;

    /* renamed from: eٗۥۚ */
    public int f5245e;

    /* renamed from: eّؑؑ */
    public int f5210e = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: eٌٍٚ */
    public long f5225e = 100;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C12452e c12452e = AbstractC13570e.ad;
        C12452e c12452e2 = new C12452e(32);
        int i = c12452e2.vip;
        if (i < 0) {
            AbstractC14783e.yandex(BuildConfig.FLAVOR);
            throw null;
        }
        int i2 = i + 32;
        c12452e2.vip(i2);
        int[] iArr2 = c12452e2.ad;
        int i3 = c12452e2.vip;
        if (i != i3) {
            AbstractC1660e.advert(i2, i, iArr2, iArr2, i3);
        }
        AbstractC1660e.Signature(i, 0, iArr, iArr2, 12);
        c12452e2.vip += 32;
        f5209e = c12452e2;
    }

    public ViewOnAttachStateChangeListenerC2004e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        this.f5236e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        int i = 0;
        this.f5244e = new C11297e(this, i);
        this.f5243e = (AccessibilityManager) viewTreeObserverOnGlobalLayoutListenerC5014e.getContext().getSystemService("accessibility");
        new Handler(Looper.getMainLooper());
        this.f5214e = new C4927e(this, i);
        this.f5228e = RecyclerView.UNDEFINED_DURATION;
        this.f5213e = RecyclerView.UNDEFINED_DURATION;
        this.f5223e = new C3123e();
        this.f5220e = new C3123e();
        this.f5217e = new C14338e(0);
        this.f5234e = new C14338e(0);
        this.f5245e = -1;
        this.f5230e = new C17548e(0);
        this.f5237e = AbstractC12501e.ad(1, 0, null, 6);
        this.f5239e = true;
        C3123e c3123e = AbstractC12146e.ad;
        this.f5226e = c3123e;
        this.f5227e = new C16399e();
        this.f5233e = new C14768e();
        this.f5224e = new C14768e();
        this.f5219e = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f5231e = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f5218e = new C6029e((byte) 0, 9);
        this.f5235e = new C3123e();
        this.f5232e = new C8929e(viewTreeObserverOnGlobalLayoutListenerC5014e.getSemanticsOwner().ad(), c3123e);
        int i2 = AbstractC4349e.ad;
        this.f5240e = new C14768e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.addOnAttachStateChangeListener(this);
        this.f5242e = new RunnableC17584e(2, this);
        this.f5241e = new ArrayList();
        this.f5211e = new C11297e(this, 1);
    }

    public static final boolean applovin(C9585e c9585e) {
        Function0 function0 = c9585e.ad;
        if (((Number) function0.invoke()).floatValue() < ((Number) c9585e.vip.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    /* renamed from: break */
    public static CharSequence m742break(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    public static /* synthetic */ void firebase(ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC2004e.crashlytics(i, i2, num, null);
    }

    public static final boolean inmobi(C9585e c9585e, float f) {
        Function0 function0 = c9585e.ad;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) c9585e.vip.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean isPro(C9585e c9585e) {
        Function0 function0 = c9585e.ad;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) c9585e.vip.invoke()).floatValue();
        return false;
    }

    public static String pro(C6071e c6071e) {
        C10566e c10566e;
        if (c6071e != null) {
            C0500e c0500e = c6071e.license;
            C0583e c0583e = c0500e.f2578e;
            C16591e c16591e = AbstractC9058e.ad;
            if (c0583e.metrica(c16591e)) {
                return AbstractC17404e.ad((List) c0500e.startapp(c16591e), ",", null, 62);
            }
            C16591e c16591e2 = AbstractC9058e.f18139interface;
            if (c0583e.metrica(c16591e2)) {
                Object billing = c0583e.billing(c16591e2);
                if (billing == null) {
                    billing = null;
                }
                C10566e c10566e2 = (C10566e) billing;
                if (c10566e2 != null) {
                    return c10566e2.f20850e;
                }
            } else {
                Object billing2 = c0583e.billing(AbstractC9058e.subs);
                if (billing2 == null) {
                    billing2 = null;
                }
                List list = (List) billing2;
                if (list != null && (c10566e = (C10566e) AbstractC13480e.m3604this(list)) != null) {
                    return c10566e.f20850e;
                }
            }
        }
        return null;
    }

    /* renamed from: protected */
    public static Region m743protected(AbstractC14073e abstractC14073e, float f, float f2) {
        if (!(abstractC14073e instanceof C10435e)) {
            return null;
        }
        C10435e c10435e = (C10435e) abstractC14073e;
        C0763e smaato = c10435e.mopub().smaato(f, f2);
        Region region = new Region(new Rect((int) (smaato.ad + 0.0f), (int) (smaato.vip + 0.0f), (int) (smaato.metrica + 0.0f), (int) (smaato.license + 0.0f)));
        Region region2 = new Region();
        C17985e c17985e = c10435e.appmetrica;
        if (!(c17985e instanceof C17985e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c17985e.ad;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    /* renamed from: throw */
    public static Rect m744throw(AbstractC14073e abstractC14073e, float f, float f2) {
        if (!(abstractC14073e instanceof C14340e) && !(abstractC14073e instanceof C2904e)) {
            return null;
        }
        C0763e mopub = abstractC14073e.mopub();
        return new Rect((int) (mopub.ad + f), (int) (mopub.vip + f2), (int) (mopub.metrica + f), (int) (mopub.license + f2));
    }

    /* renamed from: try */
    public static float[] m745try(AbstractC14073e abstractC14073e) {
        if (!(abstractC14073e instanceof C2904e)) {
            return null;
        }
        C2330e c2330e = ((C2904e) abstractC14073e).appmetrica;
        long j = c2330e.yandex;
        long j2 = c2330e.billing;
        long j3 = c2330e.purchase;
        long j4 = c2330e.appmetrica;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public final AccessibilityEvent Signature(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent loadAd = loadAd(i, 8192);
        if (num != null) {
            loadAd.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            loadAd.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            loadAd.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            loadAd.getText().add(charSequence);
        }
        return loadAd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: abstract */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m746abstract() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnAttachStateChangeListenerC2004e.m746abstract():void");
    }

    public final void adcel(int i, C8092e c8092e, String str, Bundle bundle) {
        C6071e c6071e;
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c8092e.ad;
        C3993e c3993e = (C3993e) remoteconfig().vip(i);
        if (c3993e == null || (c6071e = c3993e.ad) == null) {
            return;
        }
        C13915e c13915e = c6071e.metrica;
        C0500e c0500e = c6071e.license;
        C0583e c0583e = c0500e.f2578e;
        String pro = pro(c6071e);
        if (AbstractC7890e.billing(str, this.f5219e)) {
            int license = this.f5233e.license(i, -1);
            if (license != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, license);
                return;
            }
            return;
        }
        if (AbstractC7890e.billing(str, this.f5231e)) {
            int license2 = this.f5224e.license(i, -1);
            if (license2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, license2);
                return;
            }
            return;
        }
        boolean metrica = c0583e.metrica(AbstractC10789e.ad);
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e2 = this.f5236e;
        boolean z = false;
        if (metrica && bundle != null && AbstractC7890e.billing(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (pro != null ? pro.length() : Alert.DURATION_SHOW_INDEFINITELY)) {
                    C12476e license3 = AbstractC5967e.license(c0500e);
                    if (license3 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= license3.ad.ad.f20850e.length()) {
                            arrayList.add(z);
                            viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
                        } else {
                            C0763e vip = license3.vip(i5);
                            AbstractC17732e license4 = c6071e.license();
                            long j = 0;
                            if (license4 != null) {
                                if (!license4.mo2524e().f27016e) {
                                    license4 = null;
                                }
                                if (license4 != null) {
                                    j = license4.mo211this(0L);
                                }
                            }
                            C0763e amazon = vip.amazon(j);
                            C0763e billing = c6071e.billing();
                            if ((amazon.advert(billing) ? amazon.adcel(billing) : null) != null) {
                                long signatures = viewTreeObserverOnGlobalLayoutListenerC5014e2.signatures((Float.floatToRawIntBits(r9.vip) & 4294967295L) | (Float.floatToRawIntBits(r9.ad) << 32));
                                long signatures2 = viewTreeObserverOnGlobalLayoutListenerC5014e2.signatures((Float.floatToRawIntBits(r9.metrica) << 32) | (Float.floatToRawIntBits(r9.license) & 4294967295L));
                                viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
                                int i6 = (int) (signatures >> 32);
                                int i7 = (int) (signatures2 >> 32);
                                float min = Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
                                int i8 = (int) (signatures & 4294967295L);
                                int i9 = (int) (signatures2 & 4294967295L);
                                rectF = new RectF(min, Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC5014e = viewTreeObserverOnGlobalLayoutListenerC5014e2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        viewTreeObserverOnGlobalLayoutListenerC5014e2 = viewTreeObserverOnGlobalLayoutListenerC5014e;
                        z = false;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C16591e c16591e = AbstractC9058e.ads;
        if (c0583e.metrica(c16591e) && bundle != null && AbstractC7890e.billing(str, "androidx.compose.ui.semantics.testTag")) {
            Object billing2 = c0583e.billing(c16591e);
            String str2 = (String) (billing2 == null ? null : billing2);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC7890e.billing(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c6071e.purchase);
            return;
        }
        if (AbstractC7890e.billing(str, "androidx.compose.ui.semantics.shapeType")) {
            Object billing3 = c0583e.billing(AbstractC9058e.f18138implements);
            InterfaceC16154e interfaceC16154e = (InterfaceC16154e) (billing3 == null ? null : billing3);
            if (interfaceC16154e != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                C0763e signatures3 = signatures(c6071e, rect, interfaceC16154e);
                float f = signatures3.vip;
                float f2 = signatures3.ad;
                AbstractC14073e ad = interfaceC16154e.ad(signatures3.billing(), c13915e.f27610e, viewTreeObserverOnGlobalLayoutListenerC5014e2.getDensity());
                if (ad instanceof C14340e) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m744throw(ad, f2, f));
                    return;
                } else if (ad instanceof C2904e) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m744throw(ad, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m745try(ad));
                    return;
                } else {
                    if (!(ad instanceof C10435e)) {
                        throw new C14803e(10);
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m743protected(ad, f2, f));
                    return;
                }
            }
            return;
        }
        if (AbstractC7890e.billing(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object billing4 = c0583e.billing(AbstractC9058e.f18138implements);
            InterfaceC16154e interfaceC16154e2 = (InterfaceC16154e) (billing4 == null ? null : billing4);
            if (interfaceC16154e2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                C0763e signatures4 = signatures(c6071e, rect2, interfaceC16154e2);
                Rect m744throw = m744throw(interfaceC16154e2.ad(signatures4.billing(), c13915e.f27610e, viewTreeObserverOnGlobalLayoutListenerC5014e2.getDensity()), signatures4.ad, signatures4.vip);
                if (m744throw != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m744throw);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC7890e.billing(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object billing5 = c0583e.billing(AbstractC9058e.f18138implements);
            InterfaceC16154e interfaceC16154e3 = (InterfaceC16154e) (billing5 == null ? null : billing5);
            if (interfaceC16154e3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] m745try = m745try(interfaceC16154e3.ad(signatures(c6071e, rect3, interfaceC16154e3).billing(), c13915e.f27610e, viewTreeObserverOnGlobalLayoutListenerC5014e2.getDensity()));
                if (m745try != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m745try);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC7890e.billing(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object billing6 = c0583e.billing(AbstractC9058e.f18138implements);
            InterfaceC16154e interfaceC16154e4 = (InterfaceC16154e) (billing6 == null ? null : billing6);
            if (interfaceC16154e4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                C0763e signatures5 = signatures(c6071e, rect4, interfaceC16154e4);
                Region m743protected = m743protected(interfaceC16154e4.ad(signatures5.billing(), c13915e.f27610e, viewTreeObserverOnGlobalLayoutListenerC5014e2.getDensity()), signatures5.ad, signatures5.vip);
                if (m743protected != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m743protected);
                }
            }
        }
    }

    public final int admob(C6071e c6071e) {
        C0500e c0500e = c6071e.license;
        C0500e c0500e2 = c6071e.license;
        C16591e c16591e = AbstractC9058e.ad;
        if (!c0500e.f2578e.metrica(AbstractC9058e.ad)) {
            C16591e c16591e2 = AbstractC9058e.f18137goto;
            if (c0500e2.f2578e.metrica(c16591e2)) {
                return (int) (((C12347e) c0500e2.startapp(c16591e2)).ad & 4294967295L);
            }
        }
        return this.f5245e;
    }

    public final int ads(int i) {
        if (i == this.f5236e.getSemanticsOwner().ad().purchase) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (defpackage.AbstractC16481e.vip(r7, r0) == r5) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002c, B:14:0x0057, B:20:0x0068, B:22:0x0070, B:24:0x0079, B:26:0x007e, B:28:0x008d, B:31:0x009c, B:32:0x00a3, B:40:0x0041, B:42:0x0048), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object advert(defpackage.AbstractC10731e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.C14798e
            if (r0 == 0) goto L13
            r0 = r11
            eٟٔٙ r0 = (defpackage.C14798e) r0
            int r1 = r0.f29319e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29319e = r1
            goto L18
        L13:
            eٟٔٙ r0 = new eٟٔٙ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f29322e
            int r1 = r0.f29319e
            r2 = 2
            e٘ؕۦ r3 = r10.f5230e
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3d
            if (r1 != r2) goto L35
            eٜؐ r1 = r0.f29318e
            eّٖٟ r6 = r0.f29320e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Throwable -> L32
        L2f:
            r11 = r6
            r6 = r1
            goto L57
        L32:
            r11 = move-exception
            goto Lc5
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            eٜؐ r1 = r0.f29318e
            eّٖٟ r6 = r0.f29320e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.lang.Throwable -> L32
            goto L68
        L45:
            defpackage.AbstractC2003e.purchase(r11)
            eّٖٟ r11 = new eّٖٟ     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            eٖٓٞ r1 = r10.f5237e     // Catch: java.lang.Throwable -> L32
            r1.getClass()     // Catch: java.lang.Throwable -> L32
            eٜؐ r6 = new eٜؐ     // Catch: java.lang.Throwable -> L32
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
        L57:
            r0.f29320e = r11     // Catch: java.lang.Throwable -> L32
            r0.f29318e = r6     // Catch: java.lang.Throwable -> L32
            r0.f29319e = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r6.ad(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != r5) goto L64
            goto Lbe
        L64:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L68:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L32
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto Lbf
            r1.vip()     // Catch: java.lang.Throwable -> L32
            boolean r11 = r10.tapsense()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto La3
            int r11 = r3.f34401e     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L7c:
            if (r7 >= r11) goto L8d
            java.lang.Object[] r8 = r3.f34402e     // Catch: java.lang.Throwable -> L32
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L32
            eِٓؔ r8 = (defpackage.C13915e) r8     // Catch: java.lang.Throwable -> L32
            r10.m752this(r8, r6)     // Catch: java.lang.Throwable -> L32
            r10.m751native(r8)     // Catch: java.lang.Throwable -> L32
            int r7 = r7 + 1
            goto L7c
        L8d:
            r6.vip()     // Catch: java.lang.Throwable -> L32
            eٜؗؗ r11 = r10.f5236e     // Catch: java.lang.Throwable -> L32
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.f5222e     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto La3
            if (r11 == 0) goto La3
            r10.f5222e = r4     // Catch: java.lang.Throwable -> L32
            eؘٟ٘ r7 = r10.f5242e     // Catch: java.lang.Throwable -> L32
            r11.post(r7)     // Catch: java.lang.Throwable -> L32
        La3:
            r3.clear()     // Catch: java.lang.Throwable -> L32
            eْؕؕ r11 = r10.f5223e     // Catch: java.lang.Throwable -> L32
            r11.metrica()     // Catch: java.lang.Throwable -> L32
            eْؕؕ r11 = r10.f5220e     // Catch: java.lang.Throwable -> L32
            r11.metrica()     // Catch: java.lang.Throwable -> L32
            long r7 = r10.f5225e     // Catch: java.lang.Throwable -> L32
            r0.f29320e = r6     // Catch: java.lang.Throwable -> L32
            r0.f29318e = r1     // Catch: java.lang.Throwable -> L32
            r0.f29319e = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = defpackage.AbstractC16481e.vip(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r5) goto L2f
        Lbe:
            return r5
        Lbf:
            r3.clear()
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lc5:
            r3.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnAttachStateChangeListenerC2004e.advert(eُؑ۠):java.lang.Object");
    }

    public final void amazon() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (tapsense()) {
                premium(this.f5236e.getSemanticsOwner().ad(), this.f5232e);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m749goto(remoteconfig());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m746abstract();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: class */
    public final void m747class(int i, int i2, String str) {
        AccessibilityEvent loadAd = loadAd(ads(i), 32);
        loadAd.setContentChangeTypes(i2);
        if (str != null) {
            loadAd.getText().add(str);
        }
        subs(loadAd);
    }

    public final boolean crashlytics(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !tapsense()) {
            return false;
        }
        AccessibilityEvent loadAd = loadAd(i, i2);
        if (num != null) {
            loadAd.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            loadAd.setContentDescription(AbstractC17404e.ad(list, ",", null, 62));
        }
        return subs(loadAd);
    }

    /* renamed from: extends */
    public final boolean m748extends(C6071e c6071e, int i, int i2, boolean z) {
        String pro;
        C0500e c0500e = c6071e.license;
        int i3 = c6071e.purchase;
        C16591e c16591e = AbstractC10789e.adcel;
        if (c0500e.f2578e.metrica(c16591e) && AbstractC13362e.ad(c6071e)) {
            Function3 function3 = (Function3) ((C10591e) c6071e.license.startapp(c16591e)).vip;
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f5245e) && (pro = pro(c6071e)) != null) {
            if (i < 0 || i != i2 || i2 > pro.length()) {
                i = -1;
            }
            this.f5245e = i;
            boolean z2 = pro.length() > 0;
            subs(Signature(ads(i3), z2 ? Integer.valueOf(this.f5245e) : null, z2 ? Integer.valueOf(this.f5245e) : null, z2 ? Integer.valueOf(pro.length()) : null, pro));
            m750interface(i3);
            return true;
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: goto */
    public final void m749goto(defpackage.AbstractC16167e r57) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnAttachStateChangeListenerC2004e.m749goto(eْٖؕ):void");
    }

    /* renamed from: interface */
    public final void m750interface(int i) {
        C15417e c15417e = this.f5229e;
        if (c15417e != null) {
            C6071e c6071e = c15417e.ad;
            if (i != c6071e.purchase) {
                return;
            }
            if (SystemClock.uptimeMillis() - c15417e.purchase <= 1000) {
                AccessibilityEvent loadAd = loadAd(ads(c6071e.purchase), 131072);
                loadAd.setFromIndex(c15417e.license);
                loadAd.setToIndex(c15417e.appmetrica);
                loadAd.setAction(c15417e.vip);
                loadAd.setMovementGranularity(c15417e.metrica);
                loadAd.getText().add(pro(c6071e));
                subs(loadAd);
            }
        }
        this.f5229e = null;
    }

    public final void isVip(C13915e c13915e) {
        if (this.f5230e.add(c13915e)) {
            this.f5237e.amazon(Unit.INSTANCE);
        }
    }

    public final AccessibilityEvent loadAd(int i, int i2) {
        C3993e c3993e;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f5236e;
        obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC5014e.getContext().getPackageName());
        obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC5014e, i);
        if (tapsense() && (c3993e = (C3993e) remoteconfig().vip(i)) != null) {
            C6071e c6071e = c3993e.ad;
            obtain.setPassword(c6071e.license.f2578e.metrica(AbstractC9058e.f18144try));
            Object billing = c6071e.license.f2578e.billing(AbstractC9058e.loadAd);
            if (billing == null) {
                billing = null;
            }
            boolean billing2 = AbstractC7890e.billing(billing, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC5666e.m1958interface(obtain, billing2);
            }
        }
        return obtain;
    }

    public final Rect mopub(C3993e c3993e) {
        C10163e c10163e = c3993e.vip;
        return m753while(c10163e.ad, c10163e.vip, c10163e.metrica, c10163e.license);
    }

    /* renamed from: native */
    public final void m751native(C13915e c13915e) {
        if (c13915e.m3708extends() && !this.f5236e.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c13915e)) {
            int i = c13915e.f27594e;
            C9585e c9585e = (C9585e) this.f5223e.vip(i);
            C9585e c9585e2 = (C9585e) this.f5220e.vip(i);
            if (c9585e == null && c9585e2 == null) {
                return;
            }
            AccessibilityEvent loadAd = loadAd(i, 4096);
            if (c9585e != null) {
                loadAd.setScrollX((int) ((Number) c9585e.ad.invoke()).floatValue());
                loadAd.setMaxScrollX((int) ((Number) c9585e.vip.invoke()).floatValue());
            }
            if (c9585e2 != null) {
                loadAd.setScrollY((int) ((Number) c9585e2.ad.invoke()).floatValue());
                loadAd.setMaxScrollY((int) ((Number) c9585e2.vip.invoke()).floatValue());
            }
            subs(loadAd);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f5238e = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f5238e = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f5243e;
        if (accessibilityManager.isEnabled()) {
            this.f5238e = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5236e.getHandler().removeCallbacks(this.f5242e);
        AccessibilityManager accessibilityManager = this.f5243e;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void premium(C6071e c6071e, C8929e c8929e) {
        int[] iArr = AbstractC3864e.ad;
        C16399e c16399e = new C16399e();
        List adcel = C6071e.adcel(4, c6071e);
        C13915e c13915e = c6071e.metrica;
        int size = adcel.size();
        for (int i = 0; i < size; i++) {
            C6071e c6071e2 = (C6071e) adcel.get(i);
            AbstractC16167e remoteconfig = remoteconfig();
            int i2 = c6071e2.purchase;
            if (remoteconfig.ad(i2)) {
                if (!c8929e.vip.metrica(i2)) {
                    isVip(c13915e);
                    return;
                }
                c16399e.ad(i2);
            }
        }
        C16399e c16399e2 = c8929e.vip;
        int[] iArr2 = c16399e2.vip;
        long[] jArr = c16399e2.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !c16399e.metrica(iArr2[(i3 << 3) + i5])) {
                            isVip(c13915e);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List adcel2 = C6071e.adcel(4, c6071e);
        int size2 = adcel2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C6071e c6071e3 = (C6071e) adcel2.get(i6);
            C8929e c8929e2 = (C8929e) this.f5235e.vip(c6071e3.purchase);
            if (c8929e2 != null && remoteconfig().ad(c6071e3.purchase)) {
                premium(c6071e3, c8929e2);
            }
        }
    }

    public final AbstractC16167e remoteconfig() {
        if (this.f5239e) {
            this.f5239e = false;
            ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f5236e;
            this.f5226e = AbstractC0421e.vip(viewTreeObserverOnGlobalLayoutListenerC5014e.getSemanticsOwner(), C5430e.f11653e);
            if (tapsense()) {
                C3123e c3123e = this.f5226e;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC5014e.getContext().getResources();
                C14768e c14768e = this.f5233e;
                c14768e.ad();
                C14768e c14768e2 = this.f5224e;
                c14768e2.ad();
                C3993e c3993e = (C3993e) c3123e.vip(-1);
                C6071e c6071e = c3993e != null ? c3993e.ad : null;
                ArrayList vip = AbstractC6889e.vip(c6071e, new C17097e(3, c3123e), new C17097e(4, resources), Collections.singletonList(c6071e));
                int billing = AbstractC6874e.billing(vip);
                int i = 1;
                if (1 <= billing) {
                    while (true) {
                        int i2 = ((C6071e) vip.get(i - 1)).purchase;
                        int i3 = ((C6071e) vip.get(i)).purchase;
                        c14768e.purchase(i2, i3);
                        c14768e2.purchase(i3, i2);
                        if (i == billing) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f5226e;
    }

    public final C0763e signatures(C6071e c6071e, Rect rect, InterfaceC16154e interfaceC16154e) {
        C15067e c15067e = new C15067e(interfaceC16154e);
        C13915e c13915e = c6071e.metrica;
        AbstractC13616e abstractC13616e = (AbstractC13616e) c13915e.f27592e.billing;
        InterfaceC5077e interfaceC5077e = null;
        if ((abstractC13616e.f27020e & 8) != 0) {
            loop0: while (true) {
                if (abstractC13616e == null) {
                    break;
                }
                if ((abstractC13616e.f27014e & 8) != 0) {
                    AbstractC13616e abstractC13616e2 = abstractC13616e;
                    C12431e c12431e = null;
                    while (abstractC13616e2 != null) {
                        if (abstractC13616e2 instanceof InterfaceC17453e) {
                            ((InterfaceC17453e) abstractC13616e2).adcel(c15067e);
                            if (c15067e.f29829e) {
                                interfaceC5077e = abstractC13616e2;
                                break loop0;
                            }
                        } else if ((abstractC13616e2.f27014e & 8) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                            int i = 0;
                            for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                if ((abstractC13616e3.f27014e & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC13616e2 = abstractC13616e3;
                                    } else {
                                        if (c12431e == null) {
                                            c12431e = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC13616e2 != null) {
                                            c12431e.license(abstractC13616e2);
                                            abstractC13616e2 = null;
                                        }
                                        c12431e.license(abstractC13616e3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC13616e2 = AbstractC5851e.vip(c12431e);
                    }
                }
                if ((abstractC13616e.f27020e & 8) == 0) {
                    break;
                }
                abstractC13616e = abstractC13616e.f27024e;
            }
        }
        InterfaceC5077e interfaceC5077e2 = (InterfaceC17453e) interfaceC5077e;
        if (interfaceC5077e2 == null || !((AbstractC13616e) interfaceC5077e2).f27022e.f27016e) {
            return AbstractC0890e.vip((AbstractC17732e) c13915e.f27592e.appmetrica, false);
        }
        AbstractC17732e adcel = AbstractC5851e.adcel(interfaceC5077e2);
        C0763e mo208goto = AbstractC0890e.metrica(adcel).mo208goto(adcel, false);
        Rect m753while = m753while(mo208goto.ad, mo208goto.vip, mo208goto.metrica, mo208goto.license);
        float f = m753while.left - rect.left;
        float f2 = m753while.top - rect.top;
        return new C0763e(f, f2, m753while.width() + f, m753while.height() + f2);
    }

    public final boolean smaato(int i, long j, boolean z) {
        C16591e c16591e;
        int i2;
        if (!AbstractC7890e.billing(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC16167e remoteconfig = remoteconfig();
        if (C2152e.vip(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            c16591e = AbstractC9058e.isVip;
        } else {
            if (z) {
                throw new C14803e(10);
            }
            c16591e = AbstractC9058e.tapsense;
        }
        Object[] objArr = remoteconfig.metrica;
        long[] jArr = remoteconfig.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j2) < 128) {
                        C3993e c3993e = (C3993e) objArr[(i3 << 3) + i6];
                        C10163e c10163e = c3993e.vip;
                        float f = c10163e.ad;
                        i2 = i4;
                        float f2 = c10163e.vip;
                        float f3 = c10163e.metrica;
                        float f4 = c10163e.license;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                            Object billing = c3993e.ad.license.f2578e.billing(c16591e);
                            if (billing == null) {
                                billing = null;
                            }
                            C9585e c9585e = (C9585e) billing;
                            if (c9585e != null) {
                                Function0 function0 = c9585e.ad;
                                if (i < 0) {
                                    if (((Number) function0.invoke()).floatValue() <= 0.0f) {
                                    }
                                    z2 = true;
                                } else {
                                    if (((Number) function0.invoke()).floatValue() >= ((Number) c9585e.vip.invoke()).floatValue()) {
                                    }
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
    }

    public final boolean subs(AccessibilityEvent accessibilityEvent) {
        if (!tapsense()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f5221e = true;
        }
        try {
            return ((Boolean) this.f5244e.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f5221e = false;
        }
    }

    public final int subscription(C6071e c6071e) {
        C0500e c0500e = c6071e.license;
        C0500e c0500e2 = c6071e.license;
        C16591e c16591e = AbstractC9058e.ad;
        if (!c0500e.f2578e.metrica(AbstractC9058e.ad)) {
            C16591e c16591e2 = AbstractC9058e.f18137goto;
            if (c0500e2.f2578e.metrica(c16591e2)) {
                return (int) (((C12347e) c0500e2.startapp(c16591e2)).ad >> 32);
            }
        }
        return this.f5245e;
    }

    public final boolean tapsense() {
        AccessibilityManager accessibilityManager = this.f5243e;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.f5238e;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f5238e = list;
        }
        return !list.isEmpty();
    }

    /* renamed from: this */
    public final void m752this(C13915e c13915e, C16399e c16399e) {
        C0500e inmobi;
        if (c13915e.m3708extends() && !this.f5236e.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c13915e)) {
            C13915e c13915e2 = null;
            if (!c13915e.f27592e.yandex(8)) {
                c13915e = c13915e.tapsense();
                while (true) {
                    if (c13915e == null) {
                        c13915e = null;
                        break;
                    } else if (c13915e.f27592e.yandex(8)) {
                        break;
                    } else {
                        c13915e = c13915e.tapsense();
                    }
                }
            }
            if (c13915e == null || (inmobi = c13915e.inmobi()) == null) {
                return;
            }
            if (!inmobi.f2575e) {
                C13915e tapsense = c13915e.tapsense();
                while (true) {
                    if (tapsense != null) {
                        C0500e inmobi2 = tapsense.inmobi();
                        if (inmobi2 != null && inmobi2.f2575e) {
                            c13915e2 = tapsense;
                            break;
                        }
                        tapsense = tapsense.tapsense();
                    } else {
                        break;
                    }
                }
                if (c13915e2 != null) {
                    c13915e = c13915e2;
                }
            }
            int i = c13915e.f27594e;
            if (c16399e.ad(i)) {
                firebase(this, ads(i), 2048, 1, 8);
            }
        }
    }

    @Override // defpackage.C2187e
    public final C15816e vip(View view) {
        return this.f5214e;
    }

    /* renamed from: while */
    public final Rect m753while(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f5236e;
        long signatures = viewTreeObserverOnGlobalLayoutListenerC5014e.signatures(floatToRawIntBits);
        long signatures2 = viewTreeObserverOnGlobalLayoutListenerC5014e.signatures((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (signatures >> 32);
        int i2 = (int) (signatures2 >> 32);
        int i3 = (int) (signatures & 4294967295L);
        int i4 = (int) (signatures2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }
}
