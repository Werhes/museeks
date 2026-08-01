package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0268e extends View {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f2259e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Context f2260e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f2261e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC14215e f2262e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int[] f2263e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public HashMap f2264e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f2265e;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f2260e
            if (r6 == 0) goto L9c
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto L9c
        Lc:
            if (r0 != 0) goto L10
            goto L9c
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L24
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L25
        L24:
            r1 = r2
        L25:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L50
            if (r1 == 0) goto L50
            boolean r3 = defpackage.AbstractC0869e.premium(r6)
            if (r3 == 0) goto L44
            java.util.HashMap r3 = r1.f350e
            if (r3 == 0) goto L44
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L44
            java.util.HashMap r3 = r1.f350e
            java.lang.Object r3 = r3.get(r6)
            goto L45
        L44:
            r3 = r2
        L45:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L50
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 != 0) goto L59
            if (r1 == 0) goto L59
            int r3 = r5.purchase(r1, r6)
        L59:
            if (r3 != 0) goto L65
            java.lang.Class<eؘؚۡ> r1 = defpackage.AbstractC7515e.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L65
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L65
        L65:
            if (r3 != 0) goto L75
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L75:
            if (r3 == 0) goto L84
            java.util.HashMap r0 = r5.f2264e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.vip(r3)
            goto L9c
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0268e.ad(java.lang.String):void");
    }

    public void appmetrica(ConstraintLayout constraintLayout) {
    }

    public void billing(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC15320e.vip);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2259e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2265e = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2263e, this.f2261e);
    }

    public final void license(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2261e; i++) {
            View view = (View) constraintLayout.f361e.get(this.f2263e[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void metrica(String str) {
        if (str == null || str.length() == 0 || this.f2260e == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C3579e) && trim.equals(((C3579e) layoutParams).f8093strictfp)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    vip(childAt.getId());
                }
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2259e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2265e;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final int purchase(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f2260e.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void setIds(String str) {
        this.f2259e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2261e = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                ad(str.substring(i));
                return;
            } else {
                ad(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2265e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2261e = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                metrica(str.substring(i));
                return;
            } else {
                metrica(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2259e = null;
        this.f2261e = 0;
        for (int i : iArr) {
            vip(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2259e == null) {
            vip(i);
        }
    }

    public final void startapp() {
        if (this.f2262e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C3579e) {
            ((C3579e) layoutParams).f8090public = this.f2262e;
        }
    }

    public final void vip(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2261e + 1;
        int[] iArr = this.f2263e;
        if (i2 > iArr.length) {
            this.f2263e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2263e;
        int i3 = this.f2261e;
        iArr2[i3] = i;
        this.f2261e = i3 + 1;
    }

    public abstract void yandex(C11325e c11325e, boolean z);
}
