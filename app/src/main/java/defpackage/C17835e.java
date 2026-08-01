package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17835e extends ViewGroup {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f34941e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f34942e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f34943e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C3168e f34944e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f34945e;

    public C17835e(Context context) {
        super(context);
        this.f34945e = 5;
        ArrayList arrayList = new ArrayList();
        this.f34943e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f34942e = arrayList2;
        this.f34944e = new C3168e(11);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f34941e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
