package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؑۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724e {
    public final ConstraintLayout ad;
    public int appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public int purchase;
    public int vip;
    public final /* synthetic */ ConstraintLayout yandex;

    public C0724e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.yandex = constraintLayout;
        this.ad = constraintLayout2;
    }

    public static boolean ad(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void vip(C11325e c11325e, C10039e c10039e) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (c11325e == null) {
            return;
        }
        C9399e c9399e = c11325e.f22737extends;
        C9399e c9399e2 = c11325e.f22758this;
        if (c11325e.f22752return == 8) {
            c10039e.appmetrica = 0;
            c10039e.purchase = 0;
            c10039e.billing = 0;
            return;
        }
        if (c11325e.f22730case == null) {
            return;
        }
        C18126e c18126e = ConstraintLayout.f348e;
        int i2 = c10039e.ad;
        int i3 = c10039e.vip;
        int i4 = c10039e.metrica;
        int i5 = c10039e.license;
        int i6 = this.vip + this.metrica;
        int i7 = this.license;
        View view = c11325e.f22757synchronized;
        int m2467class = AbstractC8703e.m2467class(i2);
        if (m2467class == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (m2467class == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.purchase, i7, -2);
        } else if (m2467class == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.purchase, i7, -2);
            boolean z2 = c11325e.subscription == 1;
            int i8 = c10039e.adcel;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == c11325e.mopub();
                if (c10039e.adcel == 2 || !z2 || ((z2 && z3) || c11325e.ads())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c11325e.admob(), 1073741824);
                }
            }
        } else if (m2467class != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.purchase;
            int i10 = c9399e2 != null ? c9399e2.billing : 0;
            if (c9399e != null) {
                i10 += c9399e.billing;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int m2467class2 = AbstractC8703e.m2467class(i3);
        if (m2467class2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (m2467class2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.billing, i6, -2);
        } else if (m2467class2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.billing, i6, -2);
            boolean z4 = c11325e.remoteconfig == 1;
            int i11 = c10039e.adcel;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == c11325e.admob();
                if (c10039e.adcel == 2 || !z4 || ((z4 && z5) || c11325e.premium())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c11325e.mopub(), 1073741824);
                }
            }
        } else if (m2467class2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.billing;
            int i13 = c9399e2 != null ? c11325e.f22746native.billing : 0;
            if (c9399e != null) {
                i13 += c11325e.f22759throw.billing;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        C17688e c17688e = (C17688e) c11325e.f22730case;
        ConstraintLayout constraintLayout = this.yandex;
        if (c17688e != null && AbstractC12511e.appmetrica(constraintLayout.f360e, PSKKeyManager.MAX_KEY_LENGTH_BYTES) && view.getMeasuredWidth() == c11325e.admob() && view.getMeasuredWidth() < c17688e.admob() && view.getMeasuredHeight() == c11325e.mopub() && view.getMeasuredHeight() < c17688e.mopub() && view.getBaseline() == c11325e.f22748package && !c11325e.applovin() && ad(c11325e.f22745interface, makeMeasureSpec, c11325e.admob()) && ad(c11325e.f22741goto, makeMeasureSpec2, c11325e.mopub())) {
            c10039e.appmetrica = c11325e.admob();
            c10039e.purchase = c11325e.mopub();
            c10039e.billing = c11325e.f22748package;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && c11325e.f22755super > 0.0f;
        boolean z11 = z7 && c11325e.f22755super > 0.0f;
        if (view == null) {
            return;
        }
        C3579e c3579e = (C3579e) view.getLayoutParams();
        int i14 = c10039e.adcel;
        if (i14 != 1 && i14 != 2 && z6 && c11325e.subscription == 0 && z7 && c11325e.remoteconfig == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            max = 0;
        } else {
            if ((view instanceof AbstractC1844e) && (c11325e instanceof C4955e)) {
                ((AbstractC1844e) view).adcel((C4955e) c11325e, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c11325e.f22745interface = makeMeasureSpec;
            c11325e.f22741goto = makeMeasureSpec2;
            c11325e.billing = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = c11325e.signatures;
            int max2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = c11325e.tapsense;
            if (i16 > 0) {
                max2 = Math.min(i16, max2);
            }
            int i17 = c11325e.inmobi;
            max = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = c11325e.isPro;
            if (i19 > 0) {
                max = Math.min(i19, max);
            }
            if (!AbstractC12511e.appmetrica(constraintLayout.f360e, 1)) {
                if (z10 && z8) {
                    max2 = (int) ((max * c11325e.f22755super) + 0.5f);
                } else if (z11 && z9) {
                    max = (int) ((max2 / c11325e.f22755super) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z = false;
            } else {
                if (measuredWidth2 != max2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                c11325e.f22745interface = makeMeasureSpec;
                c11325e.f22741goto = makeMeasureSpec3;
                z = false;
                c11325e.billing = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        c10039e.startapp = (measuredWidth == c10039e.metrica && max == c10039e.license) ? z : true;
        boolean z13 = c3579e.f8082import ? true : z12;
        if (z13 && baseline != -1 && c11325e.f22748package != baseline) {
            c10039e.startapp = true;
        }
        c10039e.appmetrica = measuredWidth;
        c10039e.purchase = max;
        c10039e.yandex = z13;
        c10039e.billing = baseline;
    }
}
