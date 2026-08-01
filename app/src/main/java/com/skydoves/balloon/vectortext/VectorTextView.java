package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC1619e;
import defpackage.AbstractC18275e;
import defpackage.AbstractC2137e;
import defpackage.AbstractC5400e;
import defpackage.C11227e;
import defpackage.C13272e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Leْٕ٘;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Leُؚۙ;", "value", "eٌٍٚ", "Leُؚۙ;", "getDrawableTextViewParams", "()Leُؚۙ;", "setDrawableTextViewParams", "(Leُؚۙ;)V", "drawableTextViewParams", "balloon_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorTextView extends C13272e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters and from kotlin metadata */
    public C11227e drawableTextViewParams;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2137e.ad);
            setDrawableTextViewParams(new C11227e(AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(5, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(1, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(0, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(7, RecyclerView.UNDEFINED_DURATION)), null, null, null, null, AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(3, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getColor(6, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(8, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(2, RecyclerView.UNDEFINED_DURATION)), AbstractC5400e.purchase(obtainStyledAttributes.getResourceId(4, RecyclerView.UNDEFINED_DURATION)), 8176));
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ VectorTextView(Context context, AttributeSet attributeSet, int i, AbstractC1619e abstractC1619e) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final C11227e getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(C11227e c11227e) {
        if (c11227e != null) {
            AbstractC18275e.appmetrica(this, c11227e);
        } else {
            c11227e = null;
        }
        this.drawableTextViewParams = c11227e;
    }
}
