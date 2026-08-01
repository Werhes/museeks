package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16866e extends MaterialToolbar {

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public ActionMenuView f33041e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public TextView f33042e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public TextView f33043e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public Field f33044e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public Field f33045e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public Field f33046e;

    public ActionMenuView getCachedMenuView() {
        if (this.f33041e == null) {
            try {
                this.f33041e = (ActionMenuView) this.f33044e.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return this.f33041e;
    }

    public TextView getSubtitleView() {
        return this.f33042e;
    }

    public TextView getTitleView() {
        return this.f33043e;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        super.setSubtitle(charSequence);
        try {
            this.f33042e = (TextView) this.f33046e.get(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        try {
            this.f33043e = (TextView) this.f33045e.get(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
