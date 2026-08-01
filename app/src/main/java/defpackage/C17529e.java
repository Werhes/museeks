package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17529e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C17529e(int i) {
        this.ad = i;
    }

    public final Drawable ad(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.ad) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C17529e.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC12489e.metrica(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return C9913e.metrica(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C0497e c0497e = new C0497e(context, 0);
                    c0497e.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c0497e;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C2955e c2955e = new C2955e();
                    c2955e.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c2955e;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
    }
}
