package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.loadAd;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C8274e extends ViewGroup.MarginLayoutParams {
    public loadAd ad;
    public boolean license;
    public boolean metrica;
    public final Rect vip;

    public C8274e(int i, int i2) {
        super(i, i2);
        this.vip = new Rect();
        this.metrica = true;
        this.license = false;
    }

    public C8274e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.vip = new Rect();
        this.metrica = true;
        this.license = false;
    }

    public C8274e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.vip = new Rect();
        this.metrica = true;
        this.license = false;
    }

    public C8274e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.vip = new Rect();
        this.metrica = true;
        this.license = false;
    }

    public C8274e(C8274e c8274e) {
        super((ViewGroup.LayoutParams) c8274e);
        this.vip = new Rect();
        this.metrica = true;
        this.license = false;
    }
}
