package defpackage;

import android.R;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6965e extends Resources {
    public static final int metrica;
    public static final ArrayList vip;
    public Resources ad;

    static {
        ArrayList arrayList = new ArrayList();
        vip = arrayList;
        arrayList.add(Integer.valueOf(R.attr.color));
        arrayList.add(Integer.valueOf(R.attr.tint));
        metrica = Build.VERSION.SDK_INT >= 29 ? 7 : 6;
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getAnimation(int i) {
        return this.ad.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        return this.ad.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i) {
        return this.ad.getColor(i);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i, Resources.Theme theme) {
        return this.ad.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i) {
        return this.ad.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public final ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.ad.getColorStateList(i, theme);
    }

    @Override // android.content.res.Resources
    public final Configuration getConfiguration() {
        return this.ad.getConfiguration();
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) {
        return this.ad.getDimension(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) {
        return this.ad.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) {
        return this.ad.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public final DisplayMetrics getDisplayMetrics() {
        return this.ad.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        return this.ad.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i, Resources.Theme theme) {
        return this.ad.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.ad.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.ad.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public final Typeface getFont(int i) {
        return this.ad.getFont(i);
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i, int i2, int i3) {
        return this.ad.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(String str, String str2, String str3) {
        return this.ad.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public final int[] getIntArray(int i) {
        return this.ad.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) {
        return this.ad.getInteger(i);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getLayout(int i) {
        return this.ad.getLayout(i);
    }

    @Override // android.content.res.Resources
    public final Movie getMovie(int i) {
        return this.ad.getMovie(i);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2) {
        return this.ad.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getQuantityString(int i, int i2, Object... objArr) {
        return this.ad.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public final CharSequence getQuantityText(int i, int i2) {
        return this.ad.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public final String getResourceEntryName(int i) {
        return this.ad.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceName(int i) {
        return this.ad.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourcePackageName(int i) {
        return this.ad.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public final String getResourceTypeName(int i) {
        return this.ad.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public final String getString(int i) {
        return this.ad.getString(i);
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        return this.ad.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public final String[] getStringArray(int i) {
        return this.ad.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i) {
        return this.ad.getText(i);
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        return this.ad.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        return this.ad.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.ad.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.ad.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.ad.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public final XmlResourceParser getXml(int i) {
        return this.ad.getXml(i);
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        int[] iArr2;
        TypedArray obtainAttributes = this.ad.obtainAttributes(attributeSet, iArr);
        try {
            iArr2 = (int[]) AbstractC5812e.ad.get(obtainAttributes);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            iArr2 = new int[0];
        }
        for (int i = 0; i < iArr.length; i++) {
            try {
                if (vip.contains(Integer.valueOf(iArr[i]))) {
                    int i2 = metrica * i;
                    if (iArr2[i2] == 2) {
                        int i3 = i2 + 1;
                        int ad = AbstractC15933e.ad(iArr2[i3]);
                        iArr2[i2] = 28;
                        iArr2[i3] = ad;
                        iArr2[i2 + 2] = 0;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return obtainAttributes;
    }

    @Override // android.content.res.Resources
    public final TypedArray obtainTypedArray(int i) {
        return this.ad.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i) {
        return this.ad.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public final InputStream openRawResource(int i, TypedValue typedValue) {
        return this.ad.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public final AssetFileDescriptor openRawResourceFd(int i) {
        return this.ad.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.ad.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.ad.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        Resources resources = this.ad;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
