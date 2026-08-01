package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.view.View;
import java.util.LinkedHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15428e {
    public static final String[] ad = {"standard", "accelerate", "decelerate", "linear"};

    public static final C14326e ad(CaptureRequest.Key key) {
        return new C14326e("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final void appmetrica(View view, InterfaceC10998e interfaceC10998e) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC10998e);
    }

    public static InterfaceC12864e license(InterfaceC12864e interfaceC12864e, C8933e c8933e) {
        return AbstractC14783e.license(interfaceC12864e, new C14904e(new C11476e(1, c8933e, C8933e.class, "onPull", "onPull$material(F)F", 0, 0, 29), new C9786e(2, c8933e, C8933e.class, "onRelease", "onRelease$material(F)F", 4, 1), 0), null);
    }

    public static Rational metrica(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static final LinkedHashMap purchase(InterfaceC12330e interfaceC12330e) {
        Object subscription;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C14326e c14326e : interfaceC12330e.admob()) {
            Object obj = c14326e.metrica;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (subscription = interfaceC12330e.subscription(c14326e)) != null) {
                linkedHashMap.put(key, subscription);
            }
        }
        return linkedHashMap;
    }

    public static final InterfaceC10998e vip(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC10998e interfaceC10998e = tag instanceof InterfaceC10998e ? (InterfaceC10998e) tag : null;
            if (interfaceC10998e != null) {
                return interfaceC10998e;
            }
            Object appmetrica = AbstractC9110e.appmetrica(view);
            view = appmetrica instanceof View ? (View) appmetrica : null;
        }
        return null;
    }
}
