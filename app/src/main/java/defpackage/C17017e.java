package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17017e extends AbstractC3995e {
    public static boolean Signature = true;
    public static boolean admob = true;
    public static boolean amazon = true;
    public static boolean loadAd = true;

    public void applovin(View view, Matrix matrix) {
        if (loadAd) {
            try {
                AbstractC14204e.m3778new(view, matrix);
            } catch (NoSuchMethodError unused) {
                loadAd = false;
            }
        }
    }

    public void inmobi(View view, int i, int i2, int i3, int i4) {
        if (Signature) {
            try {
                AbstractC14204e.m3783try(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                Signature = false;
            }
        }
    }

    public void isPro(View view, Matrix matrix) {
        if (amazon) {
            try {
                AbstractC14204e.m3780super(view, matrix);
            } catch (NoSuchMethodError unused) {
                amazon = false;
            }
        }
    }

    @Override // defpackage.AbstractC3995e
    public void tapsense(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.tapsense(view, i);
        } else if (admob) {
            try {
                AbstractC7464e.vip(view, i);
            } catch (NoSuchMethodError unused) {
                admob = false;
            }
        }
    }
}
