package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17694e {
    public static C17694e startapp;
    public WeakHashMap ad;
    public TypedValue appmetrica;
    public C2532e billing;
    public final WeakHashMap license = new WeakHashMap(0);
    public C14338e metrica;
    public boolean purchase;
    public C17519e vip;
    public static final PorterDuff.Mode yandex = PorterDuff.Mode.SRC_IN;
    public static final C1529e adcel = new C4662e(6);

    public static void adcel(C17694e c17694e) {
        if (Build.VERSION.SDK_INT < 24) {
            c17694e.ad("vector", new C17529e(3));
            c17694e.ad("animated-vector", new C17529e(2));
            c17694e.ad("animated-selector", new C17529e(1));
            c17694e.ad("drawable", new C17529e(0));
        }
    }

    public static synchronized C17694e license() {
        C17694e c17694e;
        synchronized (C17694e.class) {
            try {
                if (startapp == null) {
                    C17694e c17694e2 = new C17694e();
                    startapp = c17694e2;
                    adcel(c17694e2);
                }
                c17694e = startapp;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17694e;
    }

    public static synchronized PorterDuffColorFilter yandex(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C17694e.class) {
            C1529e c1529e = adcel;
            c1529e.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1529e.vip(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final void ad(String str, C17529e c17529e) {
        if (this.vip == null) {
            this.vip = new C17519e(0);
        }
        this.vip.put(str, c17529e);
    }

    public final synchronized void advert(Context context) {
        C2692e c2692e = (C2692e) this.license.get(context);
        if (c2692e != null) {
            c2692e.vip();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable amazon(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17694e.amazon(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable appmetrica(Context context, long j) {
        C2692e c2692e = (C2692e) this.license.get(context);
        if (c2692e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c2692e.license(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c2692e.startapp(j);
        }
        return null;
    }

    public final synchronized Drawable billing(Context context, int i, boolean z) {
        Drawable mopub;
        try {
            if (!this.purchase) {
                this.purchase = true;
                Drawable purchase = purchase(context, R.drawable.abc_vector_test);
                if (purchase == null || (!(purchase instanceof C2955e) && !"android.graphics.drawable.VectorDrawable".equals(purchase.getClass().getName()))) {
                    this.purchase = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            mopub = mopub(context, i);
            if (mopub == null) {
                mopub = metrica(context, i);
            }
            if (mopub == null) {
                mopub = context.getDrawable(i);
            }
            if (mopub != null) {
                mopub = amazon(context, i, z, mopub);
            }
            if (mopub != null) {
                AbstractC13982e.ad(mopub);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mopub;
    }

    public final Drawable metrica(Context context, int i) {
        if (this.appmetrica == null) {
            this.appmetrica = new TypedValue();
        }
        TypedValue typedValue = this.appmetrica;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable appmetrica = appmetrica(context, j);
        if (appmetrica != null) {
            return appmetrica;
        }
        LayerDrawable layerDrawable = null;
        if (this.billing != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{purchase(context, R.drawable.abc_cab_background_internal_bg), purchase(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C2532e.m875synchronized(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C2532e.m875synchronized(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C2532e.m875synchronized(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            vip(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    public final Drawable mopub(Context context, int i) {
        int next;
        C17519e c17519e = this.vip;
        if (c17519e == null || c17519e.isEmpty()) {
            return null;
        }
        C14338e c14338e = this.metrica;
        if (c14338e != null) {
            String str = (String) c14338e.metrica(i);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.vip.get(str) == null) {
                return null;
            }
        } else {
            this.metrica = new C14338e(0);
        }
        if (this.appmetrica == null) {
            this.appmetrica = new TypedValue();
        }
        TypedValue typedValue = this.appmetrica;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable appmetrica = appmetrica(context, j);
        if (appmetrica != null) {
            return appmetrica;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.metrica.ad(i, name);
                C17529e c17529e = (C17529e) this.vip.get(name);
                if (c17529e != null) {
                    appmetrica = c17529e.ad(context, xml, asAttributeSet, context.getTheme());
                }
                if (appmetrica != null) {
                    appmetrica.setChangingConfigurations(typedValue.changingConfigurations);
                    vip(context, j, appmetrica);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (appmetrica == null) {
            this.metrica.ad(i, "appcompat_skip_skip");
        }
        return appmetrica;
    }

    public final synchronized Drawable purchase(Context context, int i) {
        return billing(context, i, false);
    }

    public final synchronized void smaato(C2532e c2532e) {
        this.billing = c2532e;
    }

    public final synchronized ColorStateList startapp(Context context, int i) {
        ColorStateList colorStateList;
        C14338e c14338e;
        WeakHashMap weakHashMap = this.ad;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c14338e = (C14338e) weakHashMap.get(context)) == null) ? null : (ColorStateList) c14338e.metrica(i);
        if (colorStateList == null) {
            C2532e c2532e = this.billing;
            if (c2532e != null) {
                colorStateList2 = c2532e.m931return(context, i);
            }
            if (colorStateList2 != null) {
                if (this.ad == null) {
                    this.ad = new WeakHashMap();
                }
                C14338e c14338e2 = (C14338e) this.ad.get(context);
                if (c14338e2 == null) {
                    c14338e2 = new C14338e(0);
                    this.ad.put(context, c14338e2);
                }
                c14338e2.ad(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized void vip(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C2692e c2692e = (C2692e) this.license.get(context);
                if (c2692e == null) {
                    c2692e = new C2692e((Object) null);
                    this.license.put(context, c2692e);
                }
                c2692e.yandex(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
