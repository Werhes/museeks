package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۜۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11286e implements LineHeightSpan {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f22671e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f22672e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f22673e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f22675e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f22677e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f22678e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f22680e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f22682e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f22681e = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f22676e = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f22679e = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f22674e = RecyclerView.UNDEFINED_DURATION;

    public C11286e(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f22680e = f;
        this.f22675e = i;
        this.f22673e = z;
        this.f22678e = z2;
        this.f22671e = f2;
        this.f22682e = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            AbstractC5525e.vip("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f22675e;
        int i7 = this.f22682e;
        boolean z3 = this.f22678e;
        boolean z4 = this.f22673e;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f22681e == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.f22680e);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.f22671e;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.f22679e = i11;
                int i12 = i11 - ceil;
                this.f22676e = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.f22681e = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.f22674e = i11;
                    this.f22677e = fontMetricsInt.ascent - i12;
                    this.f22672e = i11 - i10;
                } else if (i7 == 2) {
                    this.f22681e = z4 ? Math.max(fontMetricsInt.ascent, i12) : Math.min(fontMetricsInt.ascent, i12);
                    this.f22674e = z3 ? Math.min(fontMetricsInt.descent, this.f22679e) : Math.max(fontMetricsInt.descent, this.f22679e);
                    this.f22677e = 0;
                    this.f22672e = 0;
                }
            } else {
                int i13 = fontMetricsInt.ascent;
                this.f22676e = i13;
                int i14 = fontMetricsInt.descent;
                this.f22679e = i14;
                this.f22681e = i13;
                this.f22674e = i14;
                this.f22677e = 0;
                this.f22672e = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f22681e : this.f22676e;
        fontMetricsInt.descent = z2 ? this.f22674e : this.f22679e;
    }
}
