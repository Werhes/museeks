package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3307e extends ViewGroup.MarginLayoutParams {
    public final Rect Signature;
    public AbstractC1802e ad;
    public int adcel;
    public View advert;
    public boolean amazon;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public boolean loadAd;
    public final int metrica;
    public View mopub;
    public final int purchase;
    public boolean smaato;
    public int startapp;
    public boolean vip;
    public int yandex;

    public C3307e(int i) {
        super(i, -2);
        this.vip = false;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = -1;
        this.purchase = -1;
        this.billing = 0;
        this.yandex = 0;
        this.Signature = new Rect();
    }

    public C3307e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1802e abstractC1802e;
        this.vip = false;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = -1;
        this.purchase = -1;
        this.billing = 0;
        this.yandex = 0;
        this.Signature = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17620e.vip);
        this.metrica = obtainStyledAttributes.getInteger(0, 0);
        this.purchase = obtainStyledAttributes.getResourceId(1, -1);
        this.license = obtainStyledAttributes.getInteger(2, 0);
        this.appmetrica = obtainStyledAttributes.getInteger(6, -1);
        this.billing = obtainStyledAttributes.getInt(5, 0);
        this.yandex = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.vip = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f368e;
            if (TextUtils.isEmpty(string)) {
                abstractC1802e = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f368e;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC0869e.tapsense('.', str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f365e;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f364e);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1802e = (AbstractC1802e) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC17861e.Signature("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.ad = abstractC1802e;
        }
        obtainStyledAttributes.recycle();
        AbstractC1802e abstractC1802e2 = this.ad;
        if (abstractC1802e2 != null) {
            abstractC1802e2.metrica(this);
        }
    }

    public C3307e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.vip = false;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = -1;
        this.purchase = -1;
        this.billing = 0;
        this.yandex = 0;
        this.Signature = new Rect();
    }

    public C3307e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.vip = false;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = -1;
        this.purchase = -1;
        this.billing = 0;
        this.yandex = 0;
        this.Signature = new Rect();
    }

    public C3307e(C3307e c3307e) {
        super((ViewGroup.MarginLayoutParams) c3307e);
        this.vip = false;
        this.metrica = 0;
        this.license = 0;
        this.appmetrica = -1;
        this.purchase = -1;
        this.billing = 0;
        this.yandex = 0;
        this.Signature = new Rect();
    }

    public final boolean ad(int i) {
        if (i == 0) {
            return this.smaato;
        }
        if (i != 1) {
            return false;
        }
        return this.amazon;
    }

    public final void vip(AbstractC1802e abstractC1802e) {
        AbstractC1802e abstractC1802e2 = this.ad;
        if (abstractC1802e2 != abstractC1802e) {
            if (abstractC1802e2 != null) {
                abstractC1802e2.purchase();
            }
            this.ad = abstractC1802e;
            this.vip = true;
            if (abstractC1802e != null) {
                abstractC1802e.metrica(this);
            }
        }
    }
}
