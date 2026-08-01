package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2016e {
    public static WeakHashMap ad = null;
    public static boolean metrica = false;
    public static Field vip;
    public static final int[] license = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C8919e appmetrica = new Object();
    public static final ViewTreeObserverOnGlobalLayoutListenerC2700e purchase = new ViewTreeObserverOnGlobalLayoutListenerC2700e();

    public static void Signature(View view, CharSequence charSequence) {
        new C5432e(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).billing(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC2700e viewTreeObserverOnGlobalLayoutListenerC2700e = purchase;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC2700e.f6577e.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2700e);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2700e);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC2700e.f6577e.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2700e);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2700e);
            }
        }
    }

    public static void ad(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        ((View) view.getParent()).setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static C12948e adcel(View view, C12948e c12948e) {
        WindowInsets billing = c12948e.billing();
        if (billing != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(billing);
            if (!onApplyWindowInsets.equals(billing)) {
                return C12948e.yandex(view, onApplyWindowInsets);
            }
        }
        return c12948e;
    }

    public static void admob(LinearLayout linearLayout, C17974e c17974e) {
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC10751e.ad(linearLayout, (PointerIcon) c17974e.f35233e);
        }
    }

    public static void advert(View view, int i) {
        ArrayList billing = billing(view);
        for (int i2 = 0; i2 < billing.size(); i2++) {
            if (((C3614e) billing.get(i2)).ad() == i) {
                billing.remove(i2);
                return;
            }
        }
    }

    public static void amazon(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC9812e.vip(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static View.AccessibilityDelegate appmetrica(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC9812e.ad(view);
        }
        if (metrica) {
            return null;
        }
        if (vip == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                vip = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                metrica = true;
                return null;
            }
        }
        try {
            Object obj = vip.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            metrica = true;
            return null;
        }
    }

    public static ArrayList billing(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, eٟؑؐ] */
    public static boolean license(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0008e.license;
        C0008e c0008e = (C0008e) view.getTag(R.id.tag_unhandled_key_event_manager);
        C0008e c0008e2 = c0008e;
        if (c0008e == null) {
            ?? obj = new Object();
            obj.ad = null;
            obj.vip = null;
            obj.metrica = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c0008e2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0008e2.ad;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0008e.license;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0008e2.ad == null) {
                            c0008e2.ad = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0008e.license;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0008e2.ad.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0008e2.ad.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View ad2 = c0008e2.ad(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (ad2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0008e2.vip == null) {
                    c0008e2.vip = new SparseArray();
                }
                c0008e2.vip.put(keyCode, new WeakReference(ad2));
            }
        }
        return ad2 != null;
    }

    public static void loadAd(View view, C2187e c2187e) {
        if (c2187e == null && (appmetrica(view) instanceof C0195e)) {
            c2187e = new C2187e();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2187e == null ? null : c2187e.f5557e);
    }

    public static C12948e metrica(View view, C12948e c12948e) {
        WindowInsets billing = c12948e.billing();
        if (billing != null) {
            WindowInsets ad2 = Build.VERSION.SDK_INT >= 30 ? AbstractC18534e.ad(view, billing) : AbstractC1176e.ad(view, billing);
            if (!ad2.equals(billing)) {
                return C12948e.yandex(view, ad2);
            }
        }
        return c12948e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C4278e mopub(View view, C4278e c4278e) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c4278e + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC17277e.vip(view, c4278e);
        }
        C14634e c14634e = (C14634e) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC8253e interfaceC8253e = appmetrica;
        if (c14634e == null) {
            if (view instanceof InterfaceC8253e) {
                interfaceC8253e = (InterfaceC8253e) view;
            }
            return interfaceC8253e.ad(c4278e);
        }
        C4278e ad2 = c14634e.ad(view, c4278e);
        if (ad2 == null) {
            return null;
        }
        if (view instanceof InterfaceC8253e) {
            interfaceC8253e = (InterfaceC8253e) view;
        }
        return interfaceC8253e.ad(ad2);
    }

    public static CharSequence purchase(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC5226e.ad(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void smaato(View view, C3614e c3614e, InterfaceC18472e interfaceC18472e) {
        C3614e c3614e2 = new C3614e(null, c3614e.vip, null, interfaceC18472e, c3614e.metrica);
        View.AccessibilityDelegate appmetrica2 = appmetrica(view);
        C2187e c2187e = appmetrica2 == null ? null : appmetrica2 instanceof C0195e ? ((C0195e) appmetrica2).ad : new C2187e(appmetrica2);
        if (c2187e == null) {
            c2187e = new C2187e();
        }
        loadAd(view, c2187e);
        advert(view, c3614e2.ad());
        billing(view).add(c3614e2);
        startapp(view, 0);
    }

    public static void startapp(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = purchase(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(purchase(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(purchase(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void subscription(View view, AbstractC15825e abstractC15825e) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3109e.yandex(view, abstractC15825e);
            return;
        }
        PathInterpolator pathInterpolator = C15892e.appmetrica;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC5185e = abstractC15825e != null ? new ViewOnApplyWindowInsetsListenerC5185e(view, abstractC15825e) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC5185e);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC5185e);
        }
    }

    public static C14712e vip(View view) {
        if (ad == null) {
            ad = new WeakHashMap();
        }
        C14712e c14712e = (C14712e) ad.get(view);
        if (c14712e != null) {
            return c14712e;
        }
        C14712e c14712e2 = new C14712e(view);
        ad.put(view, c14712e2);
        return c14712e2;
    }

    public static String[] yandex(C6129e c6129e) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC17277e.ad(c6129e) : (String[]) c6129e.getTag(R.id.tag_on_receive_content_mime_types);
    }
}
