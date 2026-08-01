package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7225e extends ArrayAdapter {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8115e f14747e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ColorStateList f14748e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ColorStateList f14749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7225e(C8115e c8115e, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f14747e = c8115e;
        ad();
    }

    public final void ad() {
        ColorStateList colorStateList;
        C8115e c8115e = this.f14747e;
        ColorStateList colorStateList2 = c8115e.f16473e;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f14748e = colorStateList;
        if (c8115e.f16476e != 0 && c8115e.f16473e != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC3898e.billing(c8115e.f16473e.getColorForState(iArr3, 0), c8115e.f16476e), AbstractC3898e.billing(c8115e.f16473e.getColorForState(iArr2, 0), c8115e.f16476e), c8115e.f16476e});
        }
        this.f14749e = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C8115e c8115e = this.f14747e;
            Drawable drawable = null;
            if (c8115e.getText().toString().contentEquals(textView.getText()) && c8115e.f16476e != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c8115e.f16476e);
                if (this.f14748e != null) {
                    colorDrawable.setTintList(this.f14749e);
                    drawable = new RippleDrawable(this.f14748e, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
