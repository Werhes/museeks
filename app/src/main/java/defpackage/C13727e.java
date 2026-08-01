package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13727e {
    public final float ad;
    public final int appmetrica;
    public final float license;
    public final float metrica;
    public final float vip;

    public C13727e(Context context, XmlResourceParser xmlResourceParser) {
        this.ad = Float.NaN;
        this.vip = Float.NaN;
        this.metrica = Float.NaN;
        this.license = Float.NaN;
        this.appmetrica = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC15320e.adcel);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.appmetrica);
                this.appmetrica = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C16732e().vip((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.license = obtainStyledAttributes.getDimension(index, this.license);
            } else if (index == 2) {
                this.vip = obtainStyledAttributes.getDimension(index, this.vip);
            } else if (index == 3) {
                this.metrica = obtainStyledAttributes.getDimension(index, this.metrica);
            } else if (index == 4) {
                this.ad = obtainStyledAttributes.getDimension(index, this.ad);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
