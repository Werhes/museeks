package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2187e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f5556e = new View.AccessibilityDelegate();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0195e f5557e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f5558e;

    public C2187e() {
        this(f5556e);
    }

    public C2187e(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5558e = accessibilityDelegate;
        this.f5557e = new C0195e(this);
    }

    public boolean ad(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5558e.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void appmetrica(View view, AccessibilityEvent accessibilityEvent) {
        this.f5558e.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean billing(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C3614e c3614e = (C3614e) list.get(i2);
            if (c3614e.ad() == i) {
                Class cls = c3614e.metrica;
                InterfaceC18472e interfaceC18472e = c3614e.license;
                if (interfaceC18472e != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = interfaceC18472e.ad(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.f5558e.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    public void license(View view, C8092e c8092e) {
        this.f5558e.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
    }

    public void metrica(View view, AccessibilityEvent accessibilityEvent) {
        this.f5558e.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean purchase(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5558e.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void startapp(View view, AccessibilityEvent accessibilityEvent) {
        this.f5558e.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C15816e vip(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5558e.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C15816e(2, accessibilityNodeProvider);
        }
        return null;
    }

    public void yandex(View view, int i) {
        this.f5558e.sendAccessibilityEvent(view, i);
    }
}
