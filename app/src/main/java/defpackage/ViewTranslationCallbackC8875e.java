package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTranslationCallbackC8875e implements ViewTranslationCallback {
    public static final ViewTranslationCallbackC8875e ad = new Object();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        ViewOnAttachStateChangeListenerC5346e contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f11470e = 1;
        AbstractC16167e metrica = contentCaptureManager$ui.metrica();
        Object[] objArr = metrica.metrica;
        long[] jArr = metrica.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C0583e c0583e = ((C3993e) objArr[(i << 3) + i3]).ad.license.f2578e;
                            Object billing = c0583e.billing(AbstractC9058e.firebase);
                            if (billing == null) {
                                billing = null;
                            }
                            if (billing != null) {
                                Object billing2 = c0583e.billing(AbstractC10789e.amazon);
                                C10591e c10591e = (C10591e) (billing2 != null ? billing2 : null);
                                if (c10591e != null && (function0 = (Function0) c10591e.vip) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        ViewOnAttachStateChangeListenerC5346e contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f11470e = 1;
        AbstractC16167e metrica = contentCaptureManager$ui.metrica();
        Object[] objArr = metrica.metrica;
        long[] jArr = metrica.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C0583e c0583e = ((C3993e) objArr[(i << 3) + i3]).ad.license.f2578e;
                            Object billing = c0583e.billing(AbstractC9058e.firebase);
                            if (billing == null) {
                                billing = null;
                            }
                            if (AbstractC7890e.billing(billing, Boolean.TRUE)) {
                                Object billing2 = c0583e.billing(AbstractC10789e.smaato);
                                C10591e c10591e = (C10591e) (billing2 != null ? billing2 : null);
                                if (c10591e != null && (function1 = (Function1) c10591e.vip) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        ViewOnAttachStateChangeListenerC5346e contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f11470e = 2;
        AbstractC16167e metrica = contentCaptureManager$ui.metrica();
        Object[] objArr = metrica.metrica;
        long[] jArr = metrica.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C0583e c0583e = ((C3993e) objArr[(i << 3) + i3]).ad.license.f2578e;
                        Object billing = c0583e.billing(AbstractC9058e.firebase);
                        if (billing == null) {
                            billing = null;
                        }
                        if (AbstractC7890e.billing(billing, Boolean.FALSE)) {
                            Object billing2 = c0583e.billing(AbstractC10789e.smaato);
                            C10591e c10591e = (C10591e) (billing2 != null ? billing2 : null);
                            if (c10591e != null && (function1 = (Function1) c10591e.vip) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
