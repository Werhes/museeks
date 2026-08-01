package defpackage;

import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1352e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4147e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4148e;

    public /* synthetic */ RunnableC1352e(int i, Object obj) {
        this.f4148e = i;
        this.f4147e = obj;
    }

    private final void ad() {
        C5609e c5609e = (C5609e) this.f4147e;
        Map map = null;
        ((AtomicReference) c5609e.f11964e).set(null);
        synchronized (c5609e) {
            try {
                if (((AtomicMarkableReference) c5609e.f11962e).isMarked()) {
                    map = ((C0620e) ((AtomicMarkableReference) c5609e.f11962e).getReference()).ad();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c5609e.f11962e;
                    atomicMarkableReference.set((C0620e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (map != null) {
            C10017e c10017e = (C10017e) c5609e.f11961e;
            ((C12389e) c10017e.f19786e).yandex((String) c10017e.f19788e, map, c5609e.f11963e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, eؕٛؓ] */
    @Override // java.lang.Runnable
    public final void run() {
        View findFocus;
        switch (this.f4148e) {
            case 0:
                ((C18100e) this.f4147e).billing();
                return;
            case 1:
                C18464e c18464e = (C18464e) this.f4147e;
                synchronized (((ArrayDeque) c18464e.f36189e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) c18464e.f36191e).edit();
                    String str = (String) c18464e.f36190e;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) c18464e.f36189e).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) c18464e.f36192e);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
            case 2:
                C0381e c0381e = (C0381e) this.f4147e;
                c0381e.metrica = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0381e.appmetrica;
                C2237e c2237e = sideSheetBehavior.startapp;
                if (c2237e != null && c2237e.purchase()) {
                    c0381e.vip(c0381e.vip);
                    return;
                } else {
                    if (sideSheetBehavior.yandex == 2) {
                        sideSheetBehavior.remoteconfig(c0381e.vip);
                        return;
                    }
                    return;
                }
            case 3:
                C17790e c17790e = (C17790e) ((C13264e) this.f4147e).vip;
                C13264e c13264e = (C13264e) c17790e.f34883e;
                C17790e c17790e2 = (C17790e) c17790e.f34878e;
                if (c13264e == null) {
                    return;
                }
                c17790e2.m4432protected(c17790e.mopub(((C13843e) c17790e2.amazon()).ad));
                return;
            case 4:
                C0679e c0679e = (C0679e) ((C11980e) this.f4147e).f23951e;
                if (c0679e != null) {
                    Iterator it2 = c0679e.values().iterator();
                    while (it2.hasNext()) {
                        ((C4753e) it2.next()).metrica();
                    }
                    return;
                }
                return;
            case 5:
                ((C9509e) this.f4147e).billing();
                return;
            case 6:
                ((C6559e) this.f4147e).advert();
                return;
            case 7:
                ((C16480e) this.f4147e).metrica();
                return;
            case 8:
                ((TextInputLayout) this.f4147e).f1006e.requestLayout();
                return;
            case 9:
                C13094e c13094e = (C13094e) this.f4147e;
                C12894e c12894e = c13094e.vip;
                Boolean bool = null;
                c13094e.amazon = null;
                C12431e c12431e = c13094e.smaato;
                View view = c13094e.ad;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    c12431e.startapp();
                    return;
                }
                Object[] objArr = c12431e.f24870e;
                int i = c12431e.f24868e;
                Boolean bool2 = null;
                for (int i2 = 0; i2 < i; i2++) {
                    EnumC7379e enumC7379e = (EnumC7379e) objArr[i2];
                    int ordinal = enumC7379e.ordinal();
                    if (ordinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = Boolean.FALSE;
                    } else {
                        if (ordinal != 2 && ordinal != 3) {
                            throw new C14803e(10);
                        }
                        if (!AbstractC7890e.billing(bool, Boolean.FALSE)) {
                            bool2 = Boolean.valueOf(enumC7379e == EnumC7379e.f15127e);
                        }
                    }
                    bool2 = bool;
                }
                c12431e.startapp();
                if (AbstractC7890e.billing(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c12894e.f25750e.getValue()).restartInput((View) c12894e.f25751e);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((C9770e) ((C2691e) c12894e.f25752e).f6570e).crashlytics();
                    } else {
                        ((C9770e) ((C2691e) c12894e.f25752e).f6570e).isVip();
                    }
                }
                if (AbstractC7890e.billing(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c12894e.f25750e.getValue()).restartInput((View) c12894e.f25751e);
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = (ArrayList) this.f4147e;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((ExecutorService) it3.next()).shutdownNow();
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((ExecutorService) it4.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
            case 11:
                HandlerThread handlerThread = (HandlerThread) this.f4147e;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            case 12:
                ExecutorService executorService = (ExecutorService) this.f4147e;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 13:
                ad();
                return;
            case 14:
                ((C16864e) this.f4147e).admob();
                return;
            case 15:
                ((C7169e) ((C2245e) this.f4147e).adcel).ad(null);
                return;
            case 16:
                r0.f33453e.postVsyncCallback((ChoreographerVsyncCallbackC9507e) this.f4147e);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17296e c17296e = (C17296e) this.f4147e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + c17296e.ad.getAction() + " finishing.");
                c17296e.vip.license(null);
                return;
            default:
                C11106e c11106e = (C11106e) this.f4147e;
                ((C2417e) ((InterfaceC1640e) c11106e.f22006e)).Signature(new C13087e(c11106e));
                return;
        }
    }
}
