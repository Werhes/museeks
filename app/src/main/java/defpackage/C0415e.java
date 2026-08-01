package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0415e extends LayoutInflater {
    public final LayoutInflater ad;

    public C0415e(Context context, LayoutInflater layoutInflater) {
        super(layoutInflater, context);
        this.ad = layoutInflater;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C0415e(context, this.ad);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        int i2 = AbstractC10532e.metrica.get(i, i);
        if (!AbstractC10532e.appmetrica.contains(Integer.valueOf(i2))) {
            AbstractC10532e.license(i2);
        }
        if (i2 != 0) {
            View inflate = this.ad.inflate(i2, viewGroup, z);
            AbstractC10532e.metrica(inflate, (SparseArray) AbstractC10532e.license.get(i2));
            AbstractC10532e.vip(inflate);
            return inflate;
        }
        TextView textView = new TextView(AbstractC10532e.ad);
        textView.setTextSize(16.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setPadding(42, 42, 42, 42);
        textView.setTextColor(AbstractC15933e.ad(R.attr.textColorPrimary));
        return textView;
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1406842887:
                if (str.equals("WebView")) {
                    c = 0;
                    break;
                }
                break;
            case -1013307840:
                if (str.equals("TextureView")) {
                    c = 1;
                    break;
                }
                break;
            case 2666181:
                if (str.equals("View")) {
                    c = 2;
                    break;
                }
                break;
            case 265037010:
                if (str.equals("SurfaceView")) {
                    c = 3;
                    break;
                }
                break;
            case 1260470547:
                if (str.equals("ViewStub")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return createView(str, "android.webkit.", attributeSet);
            case 1:
            case 2:
            case 3:
            case 4:
                return createView(str, "android.view.", attributeSet);
            default:
                return super.onCreateView(str, attributeSet);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        super.setFactory(factory);
        this.ad.setFactory(factory);
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        super.setFactory2(factory2);
        LayoutInflater layoutInflater = this.ad;
        if (layoutInflater.getFactory2() == null) {
            layoutInflater.setFactory2(new LayoutInflaterFactory2C12133e(1, factory2));
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFilter(LayoutInflater.Filter filter) {
        super.setFilter(filter);
        LayoutInflater layoutInflater = this.ad;
        if (layoutInflater != null) {
            layoutInflater.setFilter(filter);
        }
    }
}
