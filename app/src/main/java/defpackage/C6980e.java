package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6980e {
    public final ArrayList ad;
    public int appmetrica;
    public int billing;
    public int license;
    public final StringBuilder metrica;
    public int purchase;
    public final ArrayList vip;
    public int yandex;

    public C6980e(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.ad = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.vip = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.metrica = sb;
        this.billing = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.license = 15;
        this.appmetrica = 0;
        this.purchase = 0;
        this.yandex = i2;
    }

    public final void ad(char c) {
        StringBuilder sb = this.metrica;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final boolean appmetrica() {
        return this.ad.isEmpty() && this.vip.isEmpty() && this.metrica.length() == 0;
    }

    public final SpannableString license() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.metrica);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.ad;
            if (i5 >= arrayList.size()) {
                break;
            }
            C0397e c0397e = (C0397e) arrayList.get(i5);
            boolean z2 = c0397e.vip;
            int i7 = c0397e.ad;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = C8751e.premium[i7];
                }
                z = z3;
            }
            int i8 = c0397e.metrica;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((C0397e) arrayList.get(i5)).metrica : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final C17817e metrica(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.vip;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) license());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.appmetrica + this.purchase;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i != Integer.MIN_VALUE ? i : (this.billing != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.billing != 2 || i4 <= 0) ? 0 : 2 : 1;
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        float f2 = f;
        int i6 = this.license;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.billing == 1) {
            i6 -= this.yandex - 1;
        }
        return new C17817e(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, RecyclerView.UNDEFINED_DURATION, f2, i5, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
    }

    public final void vip() {
        StringBuilder sb = this.metrica;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.ad;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0397e c0397e = (C0397e) arrayList.get(size);
                int i = c0397e.metrica;
                if (i != length) {
                    return;
                }
                c0397e.metrica = i - 1;
            }
        }
    }
}
