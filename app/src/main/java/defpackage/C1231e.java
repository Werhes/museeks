package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1231e extends C2187e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C4927e f3891e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Chip f3892e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final AccessibilityManager f3893e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Chip f3896e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final Rect f3886e = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C10659e f3887e = new C10659e(0);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C7249e f3885e = new C7249e(0);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Rect f3895e = new Rect();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Rect f3888e = new Rect();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Rect f3898e = new Rect();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int[] f3897e = new int[2];

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f3894e = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f3890e = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f3889e = RecyclerView.UNDEFINED_DURATION;

    public C1231e(Chip chip, Chip chip2) {
        this.f3892e = chip;
        this.f3896e = chip2;
        this.f3893e = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    public final boolean Signature(int i) {
        int i2;
        Chip chip = this.f3896e;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f3890e) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            adcel(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3890e = i;
        if (i == 1) {
            Chip chip2 = this.f3892e;
            chip2.f842e = true;
            chip2.refreshDrawableState();
        }
        admob(i, 8);
        return true;
    }

    public final boolean adcel(int i) {
        if (this.f3890e != i) {
            return false;
        }
        this.f3890e = RecyclerView.UNDEFINED_DURATION;
        if (i == 1) {
            Chip chip = this.f3892e;
            chip.f842e = false;
            chip.refreshDrawableState();
        }
        admob(i, 8);
        return true;
    }

    public final void admob(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f3893e.isEnabled() || (parent = (view = this.f3896e).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C8092e amazon = amazon(i);
            obtain.getText().add(amazon.billing());
            AccessibilityNodeInfo accessibilityNodeInfo = amazon.ad;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public final void advert(ArrayList arrayList) {
        C15411e c15411e;
        arrayList.add(0);
        Rect rect = Chip.f839e;
        Chip chip = this.f3892e;
        if (!chip.metrica() || (c15411e = chip.f841e) == null || !c15411e.f30456e || chip.f851e == null) {
            return;
        }
        arrayList.add(1);
    }

    public final C8092e amazon(int i) {
        if (i != -1) {
            return mopub(i);
        }
        Chip chip = this.f3896e;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        C8092e c8092e = new C8092e(obtain);
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        advert(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c8092e.ad.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c8092e;
    }

    @Override // defpackage.C2187e
    public final void license(View view, C8092e c8092e) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8092e.ad;
        this.f5558e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f3892e;
        C15411e c15411e = chip.f841e;
        accessibilityNodeInfo.setCheckable(c15411e != null && c15411e.f30445e);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c8092e.mopub(chip.getAccessibilityClassName());
        c8092e.tapsense(chip.getText());
    }

    public final void loadAd(int i, C8092e c8092e) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c8092e.ad;
        CharSequence charSequence = BuildConfig.FLAVOR;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription(BuildConfig.FLAVOR);
            accessibilityNodeInfo.setBoundsInParent(Chip.f839e);
            return;
        }
        Chip chip = this.f3892e;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        c8092e.vip(C3614e.appmetrica);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    public final C8092e mopub(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C8092e c8092e = new C8092e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c8092e.mopub("android.view.View");
        Rect rect = f3886e;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        c8092e.vip = -1;
        Chip chip = this.f3896e;
        obtain.setParent(chip);
        loadAd(i, c8092e);
        if (c8092e.billing() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3888e;
        c8092e.purchase(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        c8092e.metrica = i;
        obtain.setSource(chip, i);
        if (this.f3894e == i) {
            obtain.setAccessibilityFocused(true);
            c8092e.ad(128);
        } else {
            obtain.setAccessibilityFocused(false);
            c8092e.ad(64);
        }
        boolean z = this.f3890e == i;
        if (z) {
            c8092e.ad(2);
        } else if (obtain.isFocusable()) {
            c8092e.ad(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.f3897e;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f3895e;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c8092e.purchase(rect3);
            if (c8092e.vip != -1) {
                C8092e c8092e2 = new C8092e(AccessibilityNodeInfo.obtain());
                for (int i2 = c8092e.vip; i2 != -1; i2 = c8092e2.vip) {
                    c8092e2.vip = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c8092e2.ad;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    loadAd(i2, c8092e2);
                    c8092e2.purchase(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f3898e;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c8092e.ad;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c8092e;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean smaato(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1231e.smaato(int, android.graphics.Rect):boolean");
    }

    @Override // defpackage.C2187e
    public final C15816e vip(View view) {
        if (this.f3891e == null) {
            this.f3891e = new C4927e(this, 1);
        }
        return this.f3891e;
    }
}
