package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13898e {
    public CharSequence ad;
    public boolean adcel;
    public int license;
    public final int metrica;
    public final TextPaint vip;
    public Layout.Alignment appmetrica = Layout.Alignment.ALIGN_NORMAL;
    public int purchase = Alert.DURATION_SHOW_INDEFINITELY;
    public float billing = 1.0f;
    public int yandex = 1;
    public boolean startapp = true;
    public TextUtils.TruncateAt mopub = null;

    public C13898e(CharSequence charSequence, TextPaint textPaint, int i) {
        this.ad = charSequence;
        this.vip = textPaint;
        this.metrica = i;
        this.license = charSequence.length();
    }

    public final StaticLayout ad() {
        if (this.ad == null) {
            this.ad = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.metrica);
        CharSequence charSequence = this.ad;
        int i = this.purchase;
        TextPaint textPaint = this.vip;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.mopub);
        }
        int min = Math.min(charSequence.length(), this.license);
        this.license = min;
        if (this.adcel && this.purchase == 1) {
            this.appmetrica = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.appmetrica);
        obtain.setIncludePad(this.startapp);
        obtain.setTextDirection(this.adcel ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.mopub;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.purchase);
        float f = this.billing;
        if (f != 1.0f) {
            obtain.setLineSpacing(0.0f, f);
        }
        if (this.purchase > 1) {
            obtain.setHyphenationFrequency(this.yandex);
        }
        return obtain.build();
    }
}
