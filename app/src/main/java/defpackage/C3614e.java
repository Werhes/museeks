package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3614e {
    public static final C3614e Signature;
    public static final C3614e adcel;
    public static final C3614e admob;
    public static final C3614e advert;
    public static final C3614e amazon;
    public static final C3614e appmetrica;
    public static final C3614e billing;
    public static final C3614e loadAd;
    public static final C3614e mopub;
    public static final C3614e purchase;
    public static final C3614e smaato;
    public static final C3614e startapp;
    public static final C3614e subscription;
    public static final C3614e yandex;
    public final Object ad;
    public final InterfaceC18472e license;
    public final Class metrica;
    public final int vip;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new C3614e(1, (String) null);
        new C3614e(2, (String) null);
        new C3614e(4, (String) null);
        new C3614e(8, (String) null);
        appmetrica = new C3614e(16, (String) null);
        new C3614e(32, (String) null);
        purchase = new C3614e(64, (String) null);
        billing = new C3614e(128, (String) null);
        new C3614e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, AbstractC1592e.class);
        new C3614e(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, AbstractC1592e.class);
        new C3614e(1024, AbstractC17562e.class);
        new C3614e(2048, AbstractC17562e.class);
        yandex = new C3614e(4096, (String) null);
        startapp = new C3614e(8192, (String) null);
        new C3614e(16384, (String) null);
        new C3614e(32768, (String) null);
        new C3614e(65536, (String) null);
        new C3614e(131072, AbstractC5050e.class);
        adcel = new C3614e(262144, (String) null);
        mopub = new C3614e(524288, (String) null);
        advert = new C3614e(1048576, (String) null);
        new C3614e(2097152, AbstractC2203e.class);
        new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        smaato = new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC10071e.class);
        amazon = new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        loadAd = new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        Signature = new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        admob = new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new C3614e(i >= 29 ? C2282e.vip() : null, R.id.accessibilityActionPageUp, null, null, null);
        new C3614e(i >= 29 ? C2282e.pro() : null, R.id.accessibilityActionPageDown, null, null, null);
        new C3614e(i >= 29 ? C2282e.startapp() : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C3614e(i >= 29 ? C2282e.adcel() : null, R.id.accessibilityActionPageRight, null, null, null);
        new C3614e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C3614e(i >= 24 ? C2282e.mopub() : null, R.id.accessibilityActionSetProgress, null, null, AbstractC8511e.class);
        new C3614e(i >= 26 ? C2282e.advert() : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC17550e.class);
        new C3614e(i >= 28 ? C2282e.appmetrica() : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C3614e(i >= 28 ? C2282e.smaato() : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C3614e(i >= 30 ? C2282e.amazon() : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C3614e(i >= 30 ? C2282e.loadAd() : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C3614e(i >= 32 ? C2282e.Signature() : null, R.id.ALT, null, null, null);
        new C3614e(i >= 32 ? C2282e.admob() : null, R.id.CTRL, null, null, null);
        new C3614e(i >= 32 ? C2282e.subscription() : null, R.id.FUNCTION, null, null, null);
        new C3614e(i >= 33 ? C2282e.remoteconfig() : null, R.id.KEYCODE_0, null, null, null);
        subscription = new C3614e(i >= 34 ? AbstractC5666e.purchase() : null, R.id.KEYCODE_3D_MODE, null, null, null);
        int i2 = AbstractC12711e.ad;
        if (i >= 36 && AbstractC13943e.ad() >= 3600001) {
            accessibilityAction = AbstractC11496e.ad();
        }
        new C3614e(accessibilityAction, R.id.KEYCODE_4, null, null, null);
    }

    public C3614e(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C3614e(int i, String str) {
        this(null, i, str, null, null);
    }

    public C3614e(Object obj, int i, CharSequence charSequence, InterfaceC18472e interfaceC18472e, Class cls) {
        this.vip = i;
        this.license = interfaceC18472e;
        if (obj == null) {
            this.ad = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.ad = obj;
        }
        this.metrica = cls;
    }

    public final int ad() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.ad).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3614e)) {
            return false;
        }
        Object obj2 = ((C3614e) obj).ad;
        Object obj3 = this.ad;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.ad;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String license = C8092e.license(this.vip);
        if (license.equals("ACTION_UNKNOWN")) {
            Object obj = this.ad;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                license = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(license);
        return sb.toString();
    }
}
