package com.werhes.museeksreborn.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.AbstractC12690e;
import kotlin.Metadata;
import kotlin.Unit;
import com.werhes.museeks.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lua/itaysonlab/vkxreborn/ui/DisplayArrowPreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisplayArrowPreference extends Preference {
    public DisplayArrowPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC12690e.ad, 0, 0);
        obtainStyledAttributes.getResourceId(0, R.drawable.ic_radiowaves_left_and_right_outline_28);
        obtainStyledAttributes.getResourceId(1, R.drawable.ic_playlist_32);
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
    }
}
